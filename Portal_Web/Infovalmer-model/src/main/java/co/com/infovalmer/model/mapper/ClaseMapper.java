package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.SpClaseDto;

public class ClaseMapper implements RowMapper<SpClaseDto>{

	public SpClaseDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		SpClaseDto spClase = new SpClaseDto();
		
		spClase.setCClase(rs.getString(1));
		spClase.setCNombre(rs.getString(2));
		spClase.setCEstado(rs.getString(3));
		spClase.setCDescripcion(rs.getString(4));
		
		return spClase;
	}
}
