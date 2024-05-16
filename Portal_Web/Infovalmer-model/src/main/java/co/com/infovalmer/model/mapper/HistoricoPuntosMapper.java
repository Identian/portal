package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.HistoricoPuntosDto;

public class HistoricoPuntosMapper implements RowMapper<HistoricoPuntosDto> {

	public HistoricoPuntosDto mapRow(ResultSet rs, int arg1)
			throws SQLException {
		HistoricoPuntosDto historicoPuntosDto = new HistoricoPuntosDto();
		historicoPuntosDto.setiPlazodias(rs.getInt(1));
		historicoPuntosDto.setRentabilidadInicial(rs.getDouble(2));
		historicoPuntosDto.setRentabilidadMaxima(rs.getDouble(3));
		historicoPuntosDto.setRentabilidadMinima(rs.getDouble(4));
		historicoPuntosDto.setRentabilidadFinal(rs.getDouble(5));

		return historicoPuntosDto;
	}
}
