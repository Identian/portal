package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.ContratoDto;
import co.com.infovalmer.dto.PreciosValoracionDto;

public class ContratoPreciosValoracionMapper implements RowMapper<ContratoDto> {
	public ContratoDto mapRow (ResultSet rs, int rowNum) throws SQLException{	
		
		ContratoDto contrato = new ContratoDto();
		
		PreciosValoracionDto preciosValoracion = new PreciosValoracionDto();
		preciosValoracion.setiIdinstrumento(rs.getLong(1));
		preciosValoracion.setdFechavaloracion(rs.getDate(2));
		preciosValoracion.setePreciocierre(rs.getBigDecimal(3));
		preciosValoracion.setePreciomercado(rs.getBigDecimal(4));
		preciosValoracion.setePrecioteorico1(rs.getBigDecimal(5));
		preciosValoracion.setePrecioteorico2(rs.getBigDecimal(6));
		preciosValoracion.setePrecioDefinitivo(rs.getBigDecimal(7));
		preciosValoracion.seteVariacion(rs.getBigDecimal(8));
		preciosValoracion.setcNemosubyacente(rs.getString(9));
		preciosValoracion.setePreciosubyacente(rs.getBigDecimal(10));
		preciosValoracion.seteTasadividendos(rs.getBigDecimal(11));
		preciosValoracion.seteTasausd(rs.getBigDecimal(12));
		preciosValoracion.seteZerocuponcontinua(rs.getBigDecimal(13));
		preciosValoracion.setcNemocontrato(rs.getString(14));
		
		contrato.setcNemocontrato(rs.getString(14));
		contrato.setdFechavencimiento(rs.getDate(15));
		
		contrato.setPreciosValoracion(preciosValoracion);
		
		return contrato;
	}
}
