package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.IndiceDto;

public class IndiceMapper implements RowMapper<IndiceDto> {
	
	public IndiceDto mapRow(ResultSet rs, int arg1) throws SQLException{
		IndiceDto indiceDto = new IndiceDto();
		indiceDto.setCIndice(rs.getString(1));
		indiceDto.setCNombre(rs.getString(2));
		indiceDto.setIDiasret(rs.getInt(3));
		indiceDto.setIMinoper(rs.getInt(4));
		indiceDto.setCTipomoneda(rs.getString(5));
		return indiceDto;
}

	
}
