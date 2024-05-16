package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.PropiedadesDto;

public class PropiedadesMapper implements RowMapper<PropiedadesDto> {

	public PropiedadesDto mapRow(ResultSet rs, int arg1) throws SQLException {
		PropiedadesDto propiedadesDto = new PropiedadesDto();
		propiedadesDto.setcPropiedad(rs.getString(1));
		propiedadesDto.setcDescripcion(rs.getString(2));
		propiedadesDto.setcValor(rs.getString(3));
		propiedadesDto.setcType(rs.getString(4));
		propiedadesDto.setcModulo(rs.getString(5));
		
		return propiedadesDto;
	}

}
