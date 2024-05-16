package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.NemoIsinDto;

public class IsinUnicoMapper implements RowMapper<NemoIsinDto> {
		StringBuilder sql = new StringBuilder();
		
		public NemoIsinDto mapRow(ResultSet rs, int arg1) throws SQLException{
			NemoIsinDto nemoIsinDto = new NemoIsinDto();
			nemoIsinDto.setCIsin(rs.getString(1));
			
			return nemoIsinDto;
		}
			
}
