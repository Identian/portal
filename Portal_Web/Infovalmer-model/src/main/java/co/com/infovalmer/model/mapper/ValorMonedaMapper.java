package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.ValorMonedaDto;

public class ValorMonedaMapper implements RowMapper<ValorMonedaDto> {

	public ValorMonedaDto mapRow(ResultSet rs, int arg1) throws SQLException {
		
		ValorMonedaDto valorMonedaDto = new ValorMonedaDto();
		valorMonedaDto.setcTipomoneda(rs.getString(1));
		valorMonedaDto.setdFecha(rs.getDate(2));
		valorMonedaDto.seteValormoneda(rs.getBigDecimal(3));
		valorMonedaDto.seteValorMonedaAnterior(rs.getBigDecimal(4));
		
		return valorMonedaDto;
	}

}
