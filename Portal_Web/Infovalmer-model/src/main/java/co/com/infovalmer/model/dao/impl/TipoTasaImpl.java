package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.TasasVistaDto;
import co.com.infovalmer.dto.TipoTasaDto;
import co.com.infovalmer.dto.ValorTasaDto;
import co.com.infovalmer.dto.enums.TipoTasaEnum;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.TipoTasaDao;
import co.com.infovalmer.model.mapper.TipoTasaMapper;
import co.com.infovalmer.model.mapper.ValorTasaMapper;

public class TipoTasaImpl extends ConnectionConfig implements TipoTasaDao {
	
	JdbcTemplate jdbcTemplateObject;
	
	public TipoTasaImpl() {
		this.jdbcTemplateObject = super.getConexion();
	} 
	
	public List<TipoTasaDto> consultaTipoTasa() throws Exception {

		List<TipoTasaDto> listTipoTasa = null;
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT ");
		sql.append("c_tipotasa, ");
		sql.append("i_grupotasa, ");
		sql.append("d_fechaini, ");
		sql.append("d_fechafin, ");
		sql.append("c_periodmodali, ");
		sql.append("c_equivalencia, ");
		sql.append("c_ctipo, ");
		sql.append("i_operador, ");
		sql.append("i_codtiptasa, ");
		sql.append("c_estado, ");
		sql.append("c_vigencia, ");
		sql.append("c_casoespecial, ");
		sql.append("c_descripcion, ");
		sql.append("c_muestra_tasa ");
		sql.append("FROM sp_tipotasa ORDER BY c_descripcion ASC ");

		listTipoTasa = jdbcTemplateObject.query(sql.toString(),
				new TipoTasaMapper());

		return listTipoTasa;

	}

	public void actualizarTasas(TipoTasaDto tipoTasaDto) throws Exception {
		StringBuilder sql = new StringBuilder();
		Object[] parametros = null;
		sql.append("UPDATE sp_tipotasa SET ");
		if (tipoTasaDto != null) {
			sql.append("i_grupotasa = ?, ");
			sql.append("d_fechaini = ?, ");
			sql.append("d_fechafin = ?, ");
			sql.append("c_periodmodali = ?, ");
			sql.append("c_equivalencia = ?, ");
			sql.append("c_ctipo = ?, ");
			sql.append("i_operador = ?, ");
			sql.append("i_codtiptasa = ?, ");
			sql.append("c_estado = ?, ");
			sql.append("c_vigencia = ?, ");
			sql.append("c_casoespecial = ?, ");
			sql.append("c_descripcion = ?, ");
			sql.append("c_muestra_tasa = ? ");
			sql.append("WHERE c_tipotasa = ?");

			parametros = new Object[] { tipoTasaDto.getiGrupotasa(),
					tipoTasaDto.getdFechaini(), tipoTasaDto.getdFechafin(),
					tipoTasaDto.getcPeriodmodali(),
					tipoTasaDto.getcEquivalencia(), tipoTasaDto.getcCtipo(),
					tipoTasaDto.getiOperador(), tipoTasaDto.getiCodtiptasa(),
					tipoTasaDto.getcEstado(), tipoTasaDto.getcVigencia(),
					tipoTasaDto.getcCasoespecial(),
					tipoTasaDto.getcDescripcion(),
					tipoTasaDto.getcMuestraTasa(), tipoTasaDto.getcTipotasa() };
		} else {
			sql.append("c_muestra_tasa = ?");
			parametros = new Object[] { TipoTasaEnum.NO_MUESTRA_TASA_PARAMETRIA
					.getValor() };
		}

		jdbcTemplateObject.update(sql.toString(), parametros);

	}

	public List<ValorTasaDto> consultarValorTasas() throws Exception {

		List<ValorTasaDto> listValorTasa = null;
		Object[] parametros = null;

		StringBuilder sql = new StringBuilder();

		sql.append(" SELECT t.c_tipotasa, v.e_valortasa, v.d_fecha ,(SELECT valor.e_valortasa");
		sql.append(" FROM sp_tipotasa tipo inner join  sp_valortasa valor");
		sql.append(" on(tipo.c_tipotasa = valor.c_tipotasa) ");
		sql.append(" WHERE tipo.c_muestra_tasa = ? ");
		sql.append(" AND valor.d_fecha = (SELECT date_sub(MAX(d_fecha), INTERVAL 1 DAY) FROM sp_valortasa) ");
		sql.append(" AND tipo.c_tipotasa = t.c_tipotasa");
		sql.append(" ORDER BY tipo.c_tipotasa) AS valor_tasa_fecha_anterior");
		sql.append(" FROM sp_tipotasa t inner join  sp_valortasa v ");
		sql.append(" on(t.c_tipotasa = v.c_tipotasa)");
		sql.append(" WHERE t.c_muestra_tasa = ? AND d_fecha = (SELECT MAX(d_fecha) FROM sp_valortasa) ");
		sql.append(" ORDER BY t.c_tipotasa;");

		String muestraTasa = TipoTasaEnum.MUESTA_TASA_PARAMETRIA.getValor();
		parametros = new Object[] { muestraTasa, muestraTasa };

		listValorTasa = jdbcTemplateObject.query(sql.toString(), parametros,
				new ValorTasaMapper());

		return listValorTasa;
	}

	public List<ValorTasaDto> consultarValorTasaPorId(
			TasasVistaDto tasasVistaDto) throws Exception {
		// TODO Auto-generated method stub
		List<ValorTasaDto> listValorTasa = null;
		Object[] parametros = null;
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT  ");
		sql.append(" c_tipotasa, e_valortasa, d_fecha, null ");
		sql.append(" FROM  sp_valortasa");
		sql.append(" WHERE  c_tipotasa = ? ");
		sql.append(" AND d_fecha BETWEEN ? AND ?");
		sql.append(" ORDER BY d_fecha ");
		parametros = new Object[] { tasasVistaDto.getTipoTasa(),
				tasasVistaDto.getFechaInicial(), tasasVistaDto.getFechaFinal() };

		listValorTasa = jdbcTemplateObject.query(sql.toString(), parametros,
				new ValorTasaMapper());
		return listValorTasa;
	}

}
