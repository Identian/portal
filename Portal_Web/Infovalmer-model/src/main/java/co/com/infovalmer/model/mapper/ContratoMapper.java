package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.ContratoDto;



public class ContratoMapper implements RowMapper<ContratoDto> {

	public ContratoDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		ContratoDto contrato = new ContratoDto();
		contrato.setiIdinstrumento(rs.getInt(1));
		contrato.setcNombreinstrumento(rs.getString(2));
		contrato.setcCodcontrato(rs.getString(3));
		contrato.setcNemocontrato(rs.getString(4));
		contrato.setcTipoderivado(rs.getString(5));
		contrato.setcNemosubyacente(rs.getString(6));
		contrato.setdFechavencimiento(rs.getDate(7));
		return contrato;
	}	
}
