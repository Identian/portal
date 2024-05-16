package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.ParametroDto;

public class ParametroMapper implements RowMapper<ParametroDto> {

	public ParametroDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ParametroDto parametroDto = new ParametroDto();
		parametroDto.setiParametro(rs.getInt(1));
		parametroDto.setiTipodato(rs.getInt(2));
		parametroDto.setcValor(rs.getString(3));
		parametroDto.setcDescripcion(rs.getString(4));
		parametroDto.setcNombre(rs.getString(5));

		return parametroDto;
	}

}
