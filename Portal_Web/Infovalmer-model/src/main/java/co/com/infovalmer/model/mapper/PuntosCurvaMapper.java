package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.PuntosCurvaDto;

public class PuntosCurvaMapper implements RowMapper<PuntosCurvaDto> {

	public PuntosCurvaDto mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		PuntosCurvaDto puntosCurvaDto = new PuntosCurvaDto();
		puntosCurvaDto.setFecha(rs.getDate(1));
		puntosCurvaDto.setiDias(rs.getInt(2));
		puntosCurvaDto.seteValor(rs.getDouble(3));
		puntosCurvaDto.setiCurva(rs.getInt(4));
	
		return puntosCurvaDto;
	}

}
