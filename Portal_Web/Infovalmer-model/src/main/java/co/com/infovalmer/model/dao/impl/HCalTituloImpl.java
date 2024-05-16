package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.HcaltituloDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.HCalTituloDao;
import co.com.infovalmer.model.mapper.HCalTituloMapper;

public class HCalTituloImpl extends ConnectionConfig implements HCalTituloDao {

	JdbcTemplate jdbcTemplateObject;
	
	public HCalTituloImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}	
	
	public List<HcaltituloDto> consultarCalificacionTitulo(String nemotecnico)
			throws Exception {
		Object[] arrayParam = new Object[]{};
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT ");
		sql.append(" ct.c_nemotecnico, ");
		sql.append(" ct.i_tipoplazo, ");
		sql.append(" ct.i_calificadora, ");
		sql.append(" ct.i_tipcalificaci, ");
		sql.append(" ct.d_fechaasignada, ");
		sql.append(" ct.c_calificacion, ");
		sql.append(" ct.d_fechaini, ");
		sql.append(" ct.d_fechafin, ");
		sql.append(" ct.c_vigente, ");
		sql.append(" cf.c_nombre ");
		sql.append(" FROM sp_hcaltitulo ct ");
		sql.append(" INNER JOIN sp_calificadora cf ON cf.i_calificadora = ct.i_calificadora  ");
		sql.append(" where ct.c_vigente= 'S' ");
		if(nemotecnico != null && !"".equals(nemotecnico)){
			arrayParam = new Object[] {nemotecnico};
			sql.append(" and ct.c_nemotecnico = ? ");
		}
		sql.append(" ORDER BY ct.d_fechaasignada ");
		return jdbcTemplateObject.query(sql.toString(),arrayParam, new HCalTituloMapper());
	}
	
}
