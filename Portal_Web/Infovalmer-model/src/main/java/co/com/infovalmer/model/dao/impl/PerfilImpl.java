package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.PerfilDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.PerfilDao;
import co.com.infovalmer.model.mapper.PerfilMapper;

public class PerfilImpl extends ConnectionConfig implements PerfilDao {

	JdbcTemplate jdbcTemplateObject;
	
	public PerfilImpl() {
		this.jdbcTemplateObject = super.getConexion();
	} 
	
	public List<PerfilDto> consultaPerfiles() throws Exception {
		List<PerfilDto> perfilList = null;
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT I_PERFIL,C_NOMBRE,c_descricpion,d_vigencia,c_descripcion,i_costo,d_fecha_creacion,c_curvas_otc ");
		sql.append("FROM po_perfil ORDER BY C_NOMBRE ASC ");
		perfilList = jdbcTemplateObject.query(sql.toString(),new PerfilMapper());		
		
		return perfilList;
	}

}