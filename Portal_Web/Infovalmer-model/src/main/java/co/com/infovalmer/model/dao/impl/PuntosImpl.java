package co.com.infovalmer.model.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.HistoricoPuntosDto;
import co.com.infovalmer.dto.PuntosDto;
import co.com.infovalmer.dto.vistas.HistoricoPuntosVista;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.PuntosDao;
import co.com.infovalmer.model.mapper.HistoricoPuntosMapper;
import co.com.infovalmer.model.mapper.PuntosMapper;

public class PuntosImpl extends ConnectionConfig implements PuntosDao {

	JdbcTemplate jdbcTemplateObject;
	
	public PuntosImpl() {
		this.jdbcTemplateObject = super.getConexion();
	} 
	
	public List<PuntosDto> consultarHistoricoPuntos(HistoricoPuntosVista historicoPuntosVista) throws Exception {
		List<PuntosDto> listaPuntos = new ArrayList<PuntosDto>();
		List<PuntosDto> listaPuntosConsulta = null;
		Object[] parametros = null;
		//int[] puntos = { 30, 61, 92, 181, 273, 365, 549, 730, 1095, 1460, 1825 };
		// String puntos = "30, 61, 92, 181, 273, 365, 549, 730, 1095, 1460,
		// 1825";
		//for (int i = 0; i < puntos.length; i++) {
			StringBuilder sql = new StringBuilder();

			sql.append(" SELECT");
			sql.append(" c_curcerocupon,");
			sql.append(" d_fecha,");
			sql.append(" i_plazodias,");
			sql.append(" e_rentabilidadops,");
			sql.append(" e_rentabilidadest,");
			sql.append(" e_te,");
			sql.append(" e_to,");
			sql.append(" e_rentabilidadanterior,");
			sql.append(" e_variacion");
			sql.append(" FROM sp_puntos");
			sql.append(" WHERE c_curcerocupon = ? ");
			sql.append(" AND d_fecha BETWEEN ? and ? ");
			//sql.append(" AND i_plazodias = ?");
			//sql.append(" ORDER BY i_plazodias, d_fecha");
			sql.append(" GROUP BY c_curcerocupon, i_plazodias, d_fecha");
			
			//parametros = new Object[] { historicoPuntosVista.getCurva(), historicoPuntosVista.getFechaInicial(),
				//	historicoPuntosVista.getFechaFinal(), puntos[i] };
			parametros = new Object[] { historicoPuntosVista.getCurva(), historicoPuntosVista.getFechaInicial(),
					historicoPuntosVista.getFechaFinal() };

			listaPuntosConsulta = jdbcTemplateObject.query(sql.toString(), parametros, new PuntosMapper());

			if (listaPuntosConsulta != null && listaPuntosConsulta.size() > 0) {
				for (PuntosDto puntosDto : listaPuntosConsulta) {
					listaPuntos.add(puntosDto);
				}
			//}
		}
		return listaPuntos;
	}

	public List<HistoricoPuntosDto> consultarHistoricoPuntosGrafica(HistoricoPuntosVista historicoPuntosVista) {
		StringBuilder sql = new StringBuilder();
		Object[] parametros = null;
		List<HistoricoPuntosDto> listaHistoricoPuntos = new ArrayList<HistoricoPuntosDto>();
		List<HistoricoPuntosDto> listaConsultaPuntos = new ArrayList<HistoricoPuntosDto>();
		int[] puntos = { 30, 61, 92, 181, 273, 365, 549, 730, 1095, 1460, 1825 };

		for (int i = 0; i < puntos.length; i++) {
			sql = new StringBuilder();
			sql.append(" SELECT puntos.i_plazodias,");

			// CONSULTA VALOR FECHA INICIAL
			sql.append(" (SELECT  e_rentabilidadest FROM sp_puntos ");
			sql.append(" WHERE c_curcerocupon = ? ");
			sql.append(" AND d_fecha BETWEEN ? ");
			sql.append(" AND ?  AND  i_plazodias = puntos.i_plazodias ");
			sql.append(" GROUP BY i_plazodias  ORDER BY d_fecha ASC LIMIT 1 ");
			sql.append(" ) AS INICIAL, ");

			// CONSULTAR VALOR MAX
			sql.append(" (SELECT MAX(e_rentabilidadest) FROM sp_puntos ");
			sql.append(" WHERE c_curcerocupon = ? ");
			sql.append(" AND d_fecha BETWEEN ? AND ? AND  i_plazodias = puntos.i_plazodias");
			sql.append(" GROUP BY i_plazodias  ORDER BY i_plazodias ASC ) AS MAX,");

			// CONSULTAR VALOR MIN
			sql.append(" (SELECT MIN(e_rentabilidadest) FROM sp_puntos");
			sql.append(" WHERE c_curcerocupon = ? AND d_fecha");
			sql.append(" BETWEEN ? AND ? AND   i_plazodias = puntos.i_plazodias");
			sql.append(" GROUP BY i_plazodias  ORDER BY i_plazodias ASC) AS MIN,");

			// CONSULTA VALOR FECHA FINAL
			sql.append(" (SELECT  e_rentabilidadest FROM sp_puntos ");
			sql.append(" WHERE c_curcerocupon = ? ");
			sql.append(" AND d_fecha BETWEEN ? AND ?");
			sql.append(" AND  i_plazodias = puntos.i_plazodias ");
			sql.append(" GROUP BY i_plazodias  ORDER BY d_fecha ASC LIMIT 1 ");
			sql.append(" ) AS FINAL ");

			sql.append(" FROM sp_puntos puntos ");
			sql.append(" WHERE puntos.i_plazodias = ?");
			sql.append(" AND d_fecha BETWEEN ? AND ?");
			sql.append(" GROUP BY puntos.i_plazodias ORDER BY puntos.i_plazodias ASC ");

			parametros = new Object[] { // VALOR FECHA INICIAL
					historicoPuntosVista.getCurva(), historicoPuntosVista.getFechaInicial(),
					historicoPuntosVista.getFechaFinal(),
					// VALOR MAXIMO
					historicoPuntosVista.getCurva(), historicoPuntosVista.getFechaInicial(),
					historicoPuntosVista.getFechaFinal(),
					// VALOR MINIMO
					historicoPuntosVista.getCurva(), historicoPuntosVista.getFechaInicial(),
					historicoPuntosVista.getFechaFinal(),
					// VALOR FECHA FINAL
					historicoPuntosVista.getCurva(), historicoPuntosVista.getFechaInicial(),
					historicoPuntosVista.getFechaFinal(),
					// PARAMETRO PLAZO DIAS
					puntos[i], historicoPuntosVista.getFechaInicial(), historicoPuntosVista.getFechaFinal() };

			listaConsultaPuntos = jdbcTemplateObject.query(sql.toString(), parametros, new HistoricoPuntosMapper());

			if (listaConsultaPuntos != null && listaConsultaPuntos.size() > 0)
				listaHistoricoPuntos.add(listaConsultaPuntos.get(0));
		}

		return listaHistoricoPuntos;

	}
}
