package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.EspecieDto;

public class EspecieMapper implements RowMapper<EspecieDto> {

	public EspecieDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		EspecieDto especieDto = new EspecieDto();
		especieDto.setCNemotecnico(rs.getString(1));
		especieDto.setCTitulo(rs.getString(2));
		especieDto.setCEmisor(rs.getString(3));
		especieDto.setCCodigosuper(rs.getString(4));
		especieDto.setCRazonsocial(rs.getString(5));
		especieDto.setDFechainscripcion(rs.getDate(6));
		especieDto.setDFechapatrimonial(rs.getDate(7));
		especieDto.setEValorpatrimonial(rs.getBigDecimal(8));
		especieDto.setDFechadividendo(rs.getDate(9));
		especieDto.setDFechacausacion(rs.getDate(10));
		especieDto.setEValordividendo(rs.getBigDecimal(11));
		especieDto.setDFechanominal(rs.getDate(12));
		especieDto.setEValornominal(rs.getBigDecimal(13));
		especieDto.setDFechasuscripcion(rs.getDate(14));
		especieDto.setEValorsuscripcion(rs.getBigDecimal(15));
		especieDto.setINumacciones(rs.getBigDecimal(16));
		especieDto.setEValorfiscal(rs.getBigDecimal(17));
		especieDto.setCEstado(rs.getString(18));
		especieDto.setCSuspension(rs.getString(19));
		especieDto.setDtFecvigultestado(rs.getTimestamp(20));
		especieDto.setEPreciobase(rs.getBigDecimal(21));
		especieDto.setEPreciominimo(rs.getBigDecimal(22));
		especieDto.setEPreciomaximo(rs.getBigDecimal(23));
		especieDto.setDFechapreciobase(rs.getDate(24));
		especieDto.setEPrecionalbase(rs.getBigDecimal(25));
		especieDto.setEPrecionalminimo(rs.getBigDecimal(26));
		especieDto.setEPrecionalmaximo(rs.getBigDecimal(27));
		especieDto.setIMaxnumdecimal(rs.getInt(28));
		especieDto.setCSistnegcion(rs.getString(29));
		especieDto.setCSuspensiones(rs.getString(30));
		especieDto.setCBursatilidad(rs.getString(31));
		especieDto.setCClase(rs.getString(32));
		especieDto.setCSuspendidahoy(rs.getString(33));
		especieDto.setCActivaayer(rs.getString(34));
		especieDto.setDFechafinsusp(rs.getDate(35));
		especieDto.setTHorafinsusp(rs.getTime(36));
		especieDto.setEPrecioajustsusp(rs.getBigDecimal(37));
		especieDto.setCPertenecesector(rs.getString(38));
		especieDto.setCPertenececanasta(rs.getString(39));
		especieDto.setCCodisin1(rs.getString(40));
		especieDto.setCCodisin2(rs.getString(41));
		especieDto.setCSector(rs.getString(42));
		especieDto.setCBursatilidadanterior(rs.getString(43));
		especieDto.setCMgc(rs.getString(44));
		especieDto.setCBolsapaisorigen(rs.getString(45));
		especieDto.setCModenaorigen(rs.getString(46));
		especieDto.setCCodigoric(rs.getString(47));
		return especieDto;
	}

}
