package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.HcaltituloDto;

public class HCalTituloMapper implements RowMapper<HcaltituloDto> {

	public HcaltituloDto mapRow(ResultSet rs, int arg1) throws SQLException {
		HcaltituloDto hcaltituloDto = new HcaltituloDto();
		hcaltituloDto.setcNemotecnico(rs.getString(1));
		hcaltituloDto.setiTipoplazo(rs.getInt(2));
		hcaltituloDto.setiCalificadora(rs.getInt(3));
		hcaltituloDto.setiTipcalificaci(rs.getInt(4));
		hcaltituloDto.setdFechaasignada(rs.getDate(5));
		hcaltituloDto.setcCalificacion(rs.getString(6));
		hcaltituloDto.setdFechaini(rs.getDate(7));
		hcaltituloDto.setdFechafin(rs.getDate(8));
		hcaltituloDto.setcVigente(rs.getString(9));
		hcaltituloDto.setNombreCalificadora(rs.getString(10));
		return hcaltituloDto;
	}

}
