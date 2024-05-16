package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.ExclusionArchivosDto;

public class ExclusionArchivosMapper implements RowMapper<ExclusionArchivosDto>{
	
	public ExclusionArchivosDto mapRow(ResultSet rs, int arg1) throws SQLException {
		ExclusionArchivosDto exclusionArchivoDto = new ExclusionArchivosDto();
		exclusionArchivoDto.setcNombreArchivo(rs.getString(1));
		exclusionArchivoDto.setcExtension(rs.getString(2));		
		return exclusionArchivoDto;
	}

}
