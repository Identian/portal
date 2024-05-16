package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.HcalemisorDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.HCalEmisorDao;
import co.com.infovalmer.model.mapper.HCalEmisorMapper;

public class HCalEmisorImpl extends ConnectionConfig implements HCalEmisorDao {

	JdbcTemplate jdbcTemplateObject;
	
	public HCalEmisorImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}
	
	public List<HcalemisorDto> consultarCalificacionEmisor(String emisor)
			throws Exception {
		Object[] arrayParam = new Object[]{};
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT ");
		sql.append(" ce.d_fechaasignada, ");
		sql.append(" ce.c_emisor, ");
		sql.append(" ce.i_tipcalificaci, ");
		sql.append(" ce.c_calificacion, ");
		sql.append(" ce.d_fechaini, ");
		sql.append(" ce.d_fechafin, ");
		sql.append(" ce.c_vigente, ");
		sql.append(" ce.i_tipoplazo, ");
		sql.append(" ce.i_calificadora, ");
		sql.append(" cf.c_nombre ");
		sql.append(" FROM sp_hcalemisor ce, sp_calificadora cf ");
		sql.append(" WHERE cf.i_calificadora = ce.i_calificadora ");
		sql.append(" AND ce.c_vigente = 'S' ");
		if(emisor != null && !"".equals(emisor)){
			arrayParam = new Object[] {emisor};
			sql.append(" AND ce.c_emisor = ? ");
		}
		sql.append(" ORDER BY ce.d_fechaasignada ");
		
		return jdbcTemplateObject.query(sql.toString(),arrayParam, new HCalEmisorMapper());
	}


}
