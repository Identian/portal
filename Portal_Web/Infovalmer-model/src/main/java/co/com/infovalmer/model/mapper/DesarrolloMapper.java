package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.DesarrolloDto;

public class DesarrolloMapper implements RowMapper<DesarrolloDto> {

	public DesarrolloDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		DesarrolloDto desarrolloDto = new DesarrolloDto();
		desarrolloDto.setcNemotecnico(rs.getString(1));
		desarrolloDto.setiNumerocupon(rs.getInt(2));
		desarrolloDto.seteAmortizacion(rs.getBigDecimal(3));
		desarrolloDto.setdFechapago(rs.getDate(4));
		desarrolloDto.seteFlujototal(rs.getBigDecimal(5));
		desarrolloDto.seteInteres(rs.getBigDecimal(6));
		desarrolloDto.seteSaldoamortizar(rs.getBigDecimal(7));
		desarrolloDto.setdFechainivig(rs.getDate(8));
		desarrolloDto.setdFechafinvig(rs.getDate(9));
	
		return desarrolloDto;
	}
}
