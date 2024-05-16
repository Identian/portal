package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.ExclusionArchivosDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.ExclusionArchivosDao;
import co.com.infovalmer.model.mapper.ExclusionArchivosMapper;
import co.com.infovalmer.utilidades.LOGS;

public class ExclusionArchivosImpl extends ConnectionConfig implements ExclusionArchivosDao{
	
	JdbcTemplate jdbcTemplateObject;
	
	public ExclusionArchivosImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}
	
public List<ExclusionArchivosDto> listArchivosExcluir() throws Exception {
	List<ExclusionArchivosDto> listArchivos = null;
		try{
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT ");
			sql.append("c_nombre_archivo, ");
			sql.append("c_extension ");
			sql.append("FROM  ");
			sql.append("po_exclusion_archivos_codi ");
			
			listArchivos = jdbcTemplateObject.query(sql.toString(), new ExclusionArchivosMapper());
		}catch(Exception e){
			LOGS.LOG_ERRORES.error(e.getMessage());
		}
		
		
		return listArchivos;
	}


}
