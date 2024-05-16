package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.VaPrecioValoracionDto;

public class VaPrecioValoracionMapper implements
		RowMapper<VaPrecioValoracionDto> {

	public VaPrecioValoracionDto mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		VaPrecioValoracionDto vaPrecioValoracionDto = new VaPrecioValoracionDto();
		vaPrecioValoracionDto.setdFecha(rs.getDate(1));
		vaPrecioValoracionDto.setcNemotecnico(rs.getString(2));
		vaPrecioValoracionDto.setcBursatilidad(rs.getString(3));
		vaPrecioValoracionDto.setePreciopromedio(rs.getBigDecimal(4));
		vaPrecioValoracionDto.setePreciovaloracion(rs.getBigDecimal(5));
		vaPrecioValoracionDto.setePrecioanterior(rs.getBigDecimal(6));
		vaPrecioValoracionDto.seteVariacion(rs.getDouble(7));
		vaPrecioValoracionDto.setcTipoprecio(rs.getString(8));
		vaPrecioValoracionDto.setdFechainicio(rs.getDate(9));
		vaPrecioValoracionDto.setdFechafin(rs.getDate(10));
		vaPrecioValoracionDto.setcVigente(rs.getString(11));
		vaPrecioValoracionDto.setcVolumen(rs.getDouble(12));

		return vaPrecioValoracionDto;
	}
}
