package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.EspecieDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.EspecieDao;
import co.com.infovalmer.model.mapper.EspecieMapper;

public class EspecieImpl extends ConnectionConfig implements EspecieDao {
	

	JdbcTemplate jdbcTemplateObject;
	
	public EspecieImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}

	public List<EspecieDto> listarNemotecnicosPorEmisorMercado(String emisor,
			String mercado) throws Exception {
		StringBuilder sql = new StringBuilder();
		List<EspecieDto> listaNemotecnicos = null;
		Object[] parametros = null;
		sql.append("SELECT  ");
		sql.append("c_nemotecnico, ");
		sql.append("c_titulo, ");
		sql.append("c_emisor, ");
		sql.append("c_codigosuper, ");
		sql.append("c_razonsocial, ");
		sql.append("d_fechainscripcion, ");
		sql.append("d_fechapatrimonial, ");
		sql.append("e_valorpatrimonial, ");
		sql.append("d_fechadividendo, ");
		sql.append("d_fechacausacion, ");
		sql.append("e_valordividendo, ");
		sql.append("d_fechanominal, ");
		sql.append("e_valornominal, ");
		sql.append("d_fechasuscripcion, ");
		sql.append("e_valorsuscripcion, ");
		sql.append("i_numacciones, ");
		sql.append("e_valorfiscal, ");
		sql.append("c_estado, ");
		sql.append("c_suspension, ");
		sql.append("dt_fecvigultestado, ");
		sql.append("e_preciobase, ");
		sql.append("e_preciominimo, ");
		sql.append("e_preciomaximo, ");
		sql.append("d_fechapreciobase, ");
		sql.append("e_precionalbase, ");
		sql.append("e_precionalminimo, ");
		sql.append("e_precionalmaximo, ");
		sql.append("i_maxnumdecimal, ");
		sql.append("c_sistnegcion, ");
		sql.append("c_suspensiones, ");
		sql.append("c_bursatilidad, ");
		sql.append("c_clase,");
		sql.append("c_suspendidahoy, ");
		sql.append("c_activaayer, ");
		sql.append("d_fechafinsusp, ");
		sql.append("t_horafinsusp, ");
		sql.append("e_precioajustsusp, ");
		sql.append("c_pertenecesector, ");
		sql.append("c_pertenececanasta, ");
		sql.append("c_codisin1, ");
		sql.append("c_codisin2, ");
		sql.append("c_sector, ");
		sql.append("c_bursatilidadanterior, ");
		sql.append("c_mgc, ");
		sql.append("c_bolsapaisorigen, ");
		sql.append("c_modenaorigen, ");
		sql.append("c_codigoric ");
		sql.append("FROM va_especie ");
		sql.append("WHERE c_mgc = ? ");

		if (emisor != null) {
			sql.append("AND c_emisor = ? ");
			parametros = new Object[] { mercado, emisor };
		} else {
			parametros = new Object[] { mercado };
		}

		sql.append("ORDER BY c_nemotecnico");

		listaNemotecnicos = jdbcTemplateObject.query(sql.toString(),
				parametros, new EspecieMapper());

		return listaNemotecnicos;
	}
	
	public List<EspecieDto> listarNemotecnicos() throws Exception{
		StringBuilder sql = new StringBuilder();
		List<EspecieDto> listaNemotecnicos = null;
		
		sql.append(" SELECT  ");
		sql.append("c_nemotecnico, ");
		sql.append("c_titulo, ");
		sql.append("c_emisor, ");
		sql.append("c_codigosuper, ");
		sql.append("c_razonsocial, ");
		sql.append("d_fechainscripcion, ");
		sql.append("d_fechapatrimonial, ");
		sql.append("e_valorpatrimonial, ");
		sql.append("d_fechadividendo, ");
		sql.append("d_fechacausacion, ");
		sql.append("e_valordividendo, ");
		sql.append("d_fechanominal, ");
		sql.append("e_valornominal, ");
		sql.append("d_fechasuscripcion, ");
		sql.append("e_valorsuscripcion, ");
		sql.append("i_numacciones, ");
		sql.append("e_valorfiscal, ");
		sql.append("c_estado, ");
		sql.append("c_suspension, ");
		sql.append("dt_fecvigultestado, ");
		sql.append("e_preciobase, ");
		sql.append("e_preciominimo, ");
		sql.append("e_preciomaximo, ");
		sql.append("d_fechapreciobase, ");
		sql.append("e_precionalbase, ");
		sql.append("e_precionalminimo, ");
		sql.append("e_precionalmaximo, ");
		sql.append("i_maxnumdecimal, ");
		sql.append("c_sistnegcion, ");
		sql.append("c_suspensiones, ");
		sql.append("c_bursatilidad, ");
		sql.append("c_clase,");
		sql.append("c_suspendidahoy, ");
		sql.append("c_activaayer, ");
		sql.append("d_fechafinsusp, ");
		sql.append("t_horafinsusp, ");
		sql.append("e_precioajustsusp, ");
		sql.append("c_pertenecesector, ");
		sql.append("c_pertenececanasta, ");
		sql.append("c_codisin1, ");
		sql.append("c_codisin2, ");
		sql.append("c_sector, ");
		sql.append("c_bursatilidadanterior, ");
		sql.append("c_mgc, ");
		sql.append("c_bolsapaisorigen, ");
		sql.append("c_modenaorigen, ");
		sql.append("c_codigoric ");
		sql.append(" FROM va_especie ");
		sql.append(" WHERE c_nemotecnico <> '' ");
		sql.append(" ORDER BY c_nemotecnico ");
		
		listaNemotecnicos = jdbcTemplateObject.query(sql.toString(), new EspecieMapper());
		
		return listaNemotecnicos;
	}

}
