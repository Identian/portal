package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.ContratoDto;
import co.com.infovalmer.dto.DerivadoDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.ContratoDao;
import co.com.infovalmer.model.mapper.ContratoMapper;
import co.com.infovalmer.model.mapper.ContratoPreciosValoracionMapper;
import co.com.infovalmer.utilidades.LOGS;

public class ContratoImpl extends ConnectionConfig implements ContratoDao {
	
	JdbcTemplate jdbcTemplateObject;
	
	public ContratoImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}

	public List<ContratoDto> consultaContratosDerivados(String table,
			Object[] parametros) {
		LOGS.LOG_DEBUG.info("Datasource " +this.jdbcTemplateObject);
		String sql = "SELECT i_idinstrumento, c_nombreinstrumento, c_codcontrato, c_nemocontrato, c_tipoderivado, "
				+ "c_nemosubyacente, d_fechavencimiento FROM ";
		if (table.equalsIgnoreCase("ve"))
			sql += " ve_contratos";
		else if (table.equalsIgnoreCase("vd"))
			sql += " vd_contratos";
		List<ContratoDto> listContrato = null;
		if (parametros != null) {
			sql += " where c_nemosubyacente = ?";
			sql += " ORDER BY c_nemocontrato ";
			listContrato = this.jdbcTemplateObject.query(sql, parametros,
					new ContratoMapper());
		} else {
			sql += " ORDER BY c_nemocontrato ";
			listContrato = this.jdbcTemplateObject.query(sql, new ContratoMapper());
		}
		//this.jdbcTemplateObject = null;
		
		//LOGS.LOG_DEBUG.infoln(super.closed(jdbcTemplateObject));
		
		return listContrato;
	}

	public List<ContratoDto> preciosValoracionContratos(String table,
			DerivadoDto derivadoDTO) {
		List<ContratoDto> listContratos = null;
		Object[] parametros = null;

		if (derivadoDTO.getContrato() == null) {
			parametros = new Object[] { derivadoDTO.getNemoSubyacente(),
					derivadoDTO.getFechaInicial(), derivadoDTO.getFechaFinal() };
		} else {
			parametros = new Object[] {
					Long.valueOf(derivadoDTO.getContrato()),
					derivadoDTO.getFechaInicial(), derivadoDTO.getFechaFinal() };
		}

		String sql = "SELECT p.i_idinstrumento, p.d_fechavaloracion, p.e_preciocierre, p.e_preciomercado, p.e_precioteorico1,"
				+ " p.e_precioteorico2, p.e_precio_definitivo,p.e_variacion, p.c_nemosubyacente, p.e_preciosubyacente,"
				+ " p.e_tasadividendos, p.e_tasausd, p.e_zerocuponcontinua, c.c_nemocontrato, c.d_fechavencimiento FROM ";
		if (table.equalsIgnoreCase("ve"))
			sql += " ve_preciosvaloracion p inner join ve_contratos c on(p.i_idinstrumento = c.i_idinstrumento) ";
		else if (table.equalsIgnoreCase("vd"))
			sql += " vd_preciosvaloracion p inner join vd_contratos c on(p.i_idinstrumento = c.i_idinstrumento) ";

		if (parametros != null && derivadoDTO.getContrato() != null)
			sql += " where p.i_idinstrumento = ? and p.d_fechavaloracion between ? and ? ";
		else if (parametros != null && derivadoDTO.getContrato() == null)
			sql += " where  p.c_nemosubyacente = ? and  p.d_fechavaloracion between ? and ? ";

		sql += " order by p.d_fechavaloracion, p.c_nemosubyacente ASC ";

		listContratos = jdbcTemplateObject.query(sql, parametros,
				new ContratoPreciosValoracionMapper());

//		LOGS.LOG_DEBUG.infoln(super.closed(jdbcTemplateObject));
		return listContratos;
	}

}
