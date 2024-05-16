package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.PrecioPromedioDto;

public class PrecioPromedioMapper implements RowMapper<PrecioPromedioDto> {

	public PrecioPromedioDto mapRow(ResultSet rs, int arg1) throws SQLException {
		PrecioPromedioDto precioPromedioDto = new PrecioPromedioDto();
	
		precioPromedioDto.setcNemotecnico(rs.getString(1));
		precioPromedioDto.setcIsin(rs.getString(2));
		precioPromedioDto.seteNumemision(rs.getBigDecimal(3));
		precioPromedioDto.setcEstado(rs.getString(4));
		precioPromedioDto.setdFecharegistro(rs.getDate(5));
		precioPromedioDto.setdFechaemistit(rs.getDate(6));
		precioPromedioDto.setdFechavenctit(rs.getDate(7));
		precioPromedioDto.setcPeriodmodali(rs.getString(8));
		precioPromedioDto.setiDiasvencimiento(rs.getInt(9));
		precioPromedioDto.setcMoneda(rs.getString(10));
		precioPromedioDto.setcTipotasa(rs.getString(11));
		precioPromedioDto.setcTipotasaref(rs.getString(12));
		precioPromedioDto.seteSpread(rs.getBigDecimal(13));
		precioPromedioDto.setiTipocalculo(rs.getInt(14));
		precioPromedioDto.setiBasecalculo(rs.getInt(15));
		precioPromedioDto.setePreciopromedio(rs.getBigDecimal(16));
		precioPromedioDto.setdFecultmprecio(rs.getDate(17));
		precioPromedioDto.seteUltmprecio(rs.getBigDecimal(18));
		precioPromedioDto.setePreciolimpio(rs.getBigDecimal(19));
		precioPromedioDto.setcVigente(rs.getString(20));
		precioPromedioDto.setdFechainicio(rs.getDate(21));
		precioPromedioDto.setdFechafin(rs.getDate(22));
		precioPromedioDto.setePrecioanterior(rs.getBigDecimal(23));
		precioPromedioDto.seteVariacion(rs.getBigDecimal(24));
		precioPromedioDto.setiRangovencimiento(rs.getInt(25));
		precioPromedioDto.seteMargen(rs.getBigDecimal(26));
		precioPromedioDto.seteTir(rs.getBigDecimal(27));
		precioPromedioDto.seteMargenequivalente(rs.getBigDecimal(28));
		precioPromedioDto.seteDuracion(rs.getBigDecimal(29));
		precioPromedioDto.seteDuracionmod(rs.getBigDecimal(30));
		precioPromedioDto.seteConvexidad(rs.getBigDecimal(31));
		precioPromedioDto.seteCuponcorrido(rs.getBigDecimal(32));
		precioPromedioDto.setcCalificacion(rs.getString(33));
		return precioPromedioDto;
	}

}
