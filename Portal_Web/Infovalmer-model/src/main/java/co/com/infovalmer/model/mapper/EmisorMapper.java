package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.EmisorDto;

public class EmisorMapper implements RowMapper<EmisorDto> {
	StringBuilder sql = new StringBuilder();

	public EmisorDto mapRow(ResultSet rs, int arg1) throws SQLException {
		EmisorDto emisorDto = new EmisorDto();
		emisorDto.setCEmisor(rs.getString(1));
		emisorDto.setCNemotecnico(rs.getString(2));
		emisorDto.setCNombre(rs.getString(3));
		emisorDto.setCRazonsocial(rs.getString(4));
		emisorDto.setCSituacion(rs.getString(5));
		emisorDto.setDFecharegistro((Date)rs.getDate(6));
	return emisorDto;
	}
	
}
