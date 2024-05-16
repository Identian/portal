package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.DesarrolloDto;

public class TotalesTablaAmortizacionMapper implements RowMapper<DesarrolloDto> {

	public DesarrolloDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		DesarrolloDto desarrolloDto = new DesarrolloDto();
		desarrolloDto.setTotalNumeroCupon(rs.getBigDecimal(1));
		desarrolloDto.seteAmortizacion(rs.getBigDecimal(2));
		desarrolloDto.seteFlujototal(rs.getBigDecimal(3));
		desarrolloDto.seteInteres(rs.getBigDecimal(4));
		desarrolloDto.setdFechainivig(rs.getDate(5));
		desarrolloDto.setdFechafinvig(rs.getDate(6));
		return desarrolloDto;
	}
	
}
