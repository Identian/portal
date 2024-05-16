package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.HistoricoAccionesDto;
import co.com.infovalmer.dto.VaIndicadores;
import co.com.infovalmer.dto.VaPrecioValoracionDto;

public class HistoricoAccionesMapper implements RowMapper<HistoricoAccionesDto> {

	public HistoricoAccionesDto mapRow(ResultSet rs, int rowNum)
			throws SQLException {

		HistoricoAccionesDto historicoAccionesDto = new HistoricoAccionesDto();
		VaPrecioValoracionDto vaPrecioValoracionDto = new VaPrecioValoracionDto();
		VaIndicadores vaIndicadores = new VaIndicadores();

		vaPrecioValoracionDto.setePreciovaloracion(rs.getBigDecimal(1));
		vaIndicadores.seteFrecuencia(rs.getBigDecimal(2));
		vaPrecioValoracionDto.setePrecioanterior(rs.getBigDecimal(3));
		vaIndicadores.seteCapitalizacion(rs.getBigDecimal(4));
		vaPrecioValoracionDto.seteVariacion(rs.getDouble(5));
		vaIndicadores.seteLiquidez(rs.getBigDecimal(6));
		vaPrecioValoracionDto.setcBursatilidad(rs.getString(7));
		vaIndicadores.seteTobin(rs.getBigDecimal(8));

		historicoAccionesDto.setUltimaMarcacion(rs.getString(9));
		historicoAccionesDto.setSector(rs.getString(10));

		vaPrecioValoracionDto.setcVolumen(rs.getDouble(11));
		vaPrecioValoracionDto.setcNemotecnico(rs.getString(12));
		vaPrecioValoracionDto.setdFecha(rs.getDate(13));

		historicoAccionesDto.setVaPrecioValoracionDto(vaPrecioValoracionDto);
		historicoAccionesDto.setVaIndicadores(vaIndicadores);

		return historicoAccionesDto;
	}

}
