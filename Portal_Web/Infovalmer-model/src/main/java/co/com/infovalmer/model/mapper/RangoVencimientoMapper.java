package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.RangoVencimientoDto;

public class RangoVencimientoMapper implements RowMapper<RangoVencimientoDto> {
	
	public RangoVencimientoDto mapRow(ResultSet rs, int arg1) throws SQLException{
		RangoVencimientoDto vencimiento = new RangoVencimientoDto();
		vencimiento.setIRangvencimi(rs.getString(1));
		vencimiento.setIRangoinicio(rs.getInt(2));
		vencimiento.setIRangofin(rs.getInt(3));
		vencimiento.setCNombre(rs.getString(4));
		
		return vencimiento;
	}
	

}
