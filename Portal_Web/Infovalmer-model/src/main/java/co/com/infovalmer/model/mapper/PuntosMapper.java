package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.PuntosDto;

public class PuntosMapper implements RowMapper<PuntosDto> {

	public PuntosDto mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		PuntosDto puntosDto = new PuntosDto();
		puntosDto.setcCurcerocupon(rs.getString(1));
		puntosDto.setdFecha(rs.getDate(2));
		puntosDto.setiPlazodias(rs.getInt(3));
		puntosDto.seteRentabilidadops(rs.getBigDecimal(4));
		puntosDto.seteRentabilidadest(rs.getBigDecimal(5));
		puntosDto.seteTe(rs.getBigDecimal(6));
		puntosDto.seteTo(rs.getBigDecimal(7));
		puntosDto.seteRentabilidadanterior(rs.getBigDecimal(8));
		puntosDto.seteVariacion(rs.getBigDecimal(9));

		return puntosDto;
	}

}
