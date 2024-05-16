package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.PerfilDto;

public class PerfilMapper implements RowMapper<PerfilDto> {

	public PerfilDto mapRow(ResultSet rs, int rowNum) throws SQLException {
	PerfilDto perfilDTO = new PerfilDto();
	perfilDTO.setIPerfil(rs.getInt(1));
	perfilDTO.setCNombre(rs.getString(2));
	perfilDTO.setCDescricpion(rs.getString(3));
	perfilDTO.setDVigencia(rs.getDate(4));
	perfilDTO.setCDescricpion(rs.getString(5));
	perfilDTO.setICosto(rs.getInt(6));
	perfilDTO.setDFechaCreacion(rs.getDate(7));
	perfilDTO.setCCurvasOtc(rs.getString(8));
	
	return perfilDTO;
	}

}
