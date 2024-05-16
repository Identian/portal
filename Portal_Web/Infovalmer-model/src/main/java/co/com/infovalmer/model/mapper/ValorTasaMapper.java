package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.ValorTasaDto;

public class ValorTasaMapper implements RowMapper<ValorTasaDto> {

	public ValorTasaDto mapRow(ResultSet rs, int arg1) throws SQLException {
		ValorTasaDto valorTasaDto = new ValorTasaDto();
		valorTasaDto.setcTipotasa(rs.getString(1));
		valorTasaDto.seteValortasa(rs.getBigDecimal(2));
		valorTasaDto.setdFecha(rs.getDate(3));
		valorTasaDto.seteValorTasaAnterior(rs.getBigDecimal(4));
		return valorTasaDto;
	}

}
