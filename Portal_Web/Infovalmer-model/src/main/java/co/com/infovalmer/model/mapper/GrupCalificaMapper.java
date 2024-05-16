package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.GrupCalificaDto;

public class GrupCalificaMapper implements RowMapper<GrupCalificaDto> {

	public GrupCalificaDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		GrupCalificaDto grupCalificaDto = new GrupCalificaDto();

		grupCalificaDto.setIGrupcalifica(rs.getString(1));
		grupCalificaDto.setIEscalavalor(rs.getInt(2));
		grupCalificaDto.setCNombre(rs.getString(3));
		grupCalificaDto.setCEstado(rs.getString(4));
		grupCalificaDto.setCDescripcion(rs.getString(5));

		return grupCalificaDto;

	}

}
