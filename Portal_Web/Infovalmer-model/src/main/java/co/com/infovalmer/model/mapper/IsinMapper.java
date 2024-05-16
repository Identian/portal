package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.NemoIsinDto;

public class IsinMapper implements RowMapper<NemoIsinDto> {
	StringBuilder sql = new StringBuilder();
	
	public NemoIsinDto mapRow(ResultSet rs, int arg1) throws SQLException{
		NemoIsinDto nemoIsinDto = new NemoIsinDto();
		nemoIsinDto.setCIsin(rs.getString(1));
		nemoIsinDto.setCNemotecnico(rs.getString(2));
		nemoIsinDto.setCEmisor(rs.getString(3));
		nemoIsinDto.setDFechaemision(rs.getDate(4));
		nemoIsinDto.setDFechavencimiento(rs.getDate(5));
		nemoIsinDto.setCPeriodicidad(rs.getString(6));
		nemoIsinDto.setETasa(rs.getBigDecimal(7));
		nemoIsinDto.setCTipotasa(rs.getString(8));
		nemoIsinDto.setESpread(rs.getBigDecimal(9));
		nemoIsinDto.setEBase360(rs.getString(10));
		
		
		return nemoIsinDto;
}

	
}
