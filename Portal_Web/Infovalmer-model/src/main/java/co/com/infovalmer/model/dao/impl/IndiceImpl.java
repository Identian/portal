package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.IndiceDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.IndiceDao;
import co.com.infovalmer.model.mapper.IndiceMapper;

public class IndiceImpl extends ConnectionConfig implements IndiceDao {

	JdbcTemplate jdbcTemplateObject;
	
	public IndiceImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}
	
	public List<IndiceDto> listarIndices() throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT ");
		sql.append(" c_indice, ");
		sql.append(" c_nombre, ");
		sql.append(" i_diasret, ");
		sql.append(" i_minoper, ");
		sql.append(" c_tipomoneda ");
		sql.append(" from sp_indice ");
		
		return jdbcTemplateObject.query(sql.toString(), new IndiceMapper());
	}
}
