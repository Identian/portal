package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.HIndiceDto;

public class HIndiceMapper implements RowMapper<HIndiceDto> {
	StringBuilder sql = new StringBuilder();
	
	public HIndiceDto mapRow(ResultSet rs, int arg1) throws SQLException{
		HIndiceDto hIndiceDto = new HIndiceDto();
		hIndiceDto.setcNombre(rs.getString(1));
		hIndiceDto.setdFechaindice(rs.getDate(2));
		hIndiceDto.seteValor(rs.getBigDecimal(3));
		hIndiceDto.setdFechavcto(rs.getDate(4));
		hIndiceDto.setcTipohcal(rs.getString(5));
		hIndiceDto.setcIndice(rs.getString(6));
		hIndiceDto.setiDiasvencimiento(rs.getInt(7));

		return hIndiceDto;
}

	
}
