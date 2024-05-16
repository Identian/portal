package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.TiposubyacenteDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.TiposubyacenteDao;
import co.com.infovalmer.model.mapper.TiposubyacenteMapper;

public class TiposubyacenteDaoImpl extends ConnectionConfig implements
		TiposubyacenteDao {
	JdbcTemplate jdbcTemplateObject;
	
	public TiposubyacenteDaoImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}


	public List<TiposubyacenteDto> consultaTipSubyanceteDerivados(String table) {

		String sql = " SELECT c_nemosubyacente, c_nombre, i_gruposubyacente, i_lastingdate FROM ";
		if (table.equalsIgnoreCase("ve"))
			sql += " ve_tiposubyacente";
		else if (table.equalsIgnoreCase("vd"))
			sql += " vd_tiposubyacente";
		sql += " ORDER BY c_nombre";
		List<TiposubyacenteDto> listTipoSubyacente = jdbcTemplateObject.query(sql,new TiposubyacenteMapper());
		//LOGS.LOG_DEBUG.info(super.closed(jdbcTemplateObject));
		return listTipoSubyacente;
	}

}
