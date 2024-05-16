package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.TituloDto;

public class NemotecnicosMapper  implements RowMapper<TituloDto>{

	StringBuilder sql = new StringBuilder();

	public TituloDto mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		TituloDto tituloDto = new TituloDto();
		tituloDto.setcNemotecnico(rs.getString(1));
		return tituloDto;
	}
}
