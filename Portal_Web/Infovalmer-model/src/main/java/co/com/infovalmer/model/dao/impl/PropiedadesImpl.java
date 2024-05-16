package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.PropiedadesDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.PropiedadesDao;
import co.com.infovalmer.model.mapper.PropiedadesMapper;

public class PropiedadesImpl extends ConnectionConfig implements PropiedadesDao {

	JdbcTemplate jdbcTemplateObject;
	
	public PropiedadesImpl() {
		this.jdbcTemplateObject = super.getConexion();
	} 
	
	public List<PropiedadesDto> listPropiedadesSistema() throws Exception {
		
		List<PropiedadesDto> listPropiedades = null;
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT ");
		sql.append("c_propiedad, ");
		sql.append("c_descripcion, ");
		sql.append("c_valor, ");
		sql.append("c_type, ");
		sql.append("c_modulo ");
		sql.append("FROM  ");
		sql.append("po_propiedades ");
		
		listPropiedades = jdbcTemplateObject.query(sql.toString(), new PropiedadesMapper());
		
		return listPropiedades;
	}
	
public List<PropiedadesDto> listPropiedadesSistemaId(String idPropiedad) throws Exception {
		
		List<PropiedadesDto> listPropiedades = null;
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT ");
		sql.append("c_propiedad, ");
		sql.append("c_descripcion, ");
		sql.append("c_valor, ");
		sql.append("c_type, ");
		sql.append("c_modulo ");
		sql.append("FROM  ");
		sql.append("po_propiedades ");
		sql.append(" WHERE c_propiedad = ?");
		
		Object[] parametros = null;
		
		parametros = new Object[]{idPropiedad};
		
		listPropiedades = jdbcTemplateObject.query(sql.toString(),parametros, new PropiedadesMapper());
		
		return listPropiedades;
	}

}
