package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.ParametroDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.ParametroDao;
import co.com.infovalmer.model.mapper.ParametroMapper;

public class ParametroImpl extends ConnectionConfig implements ParametroDao {

	JdbcTemplate jdbcTemplateObject;
	
	public ParametroImpl() {
		this.jdbcTemplateObject = super.getConexion();
	} 
	
	public List<ParametroDto> consultarParametroId(Integer idParametro)
			throws Exception {
		StringBuilder sql = new StringBuilder();
		List<ParametroDto> listParametro = null;
		Object[] parametros = null;
		sql.append("SELECT ");
		sql.append("i_parametro, ");
		sql.append("i_tipodato, ");
		sql.append("c_valor, ");
		sql.append("c_descripcion, ");
		sql.append("c_nombre ");
		sql.append("FROM sp_parametro ");
		sql.append("WHERE i_parametro = ? ");

		parametros = new Object[] { idParametro };

		listParametro = jdbcTemplateObject.query(sql.toString(), parametros,new ParametroMapper());

		return listParametro;
	}
}
