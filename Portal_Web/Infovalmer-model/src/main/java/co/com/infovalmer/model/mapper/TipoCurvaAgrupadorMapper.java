package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.TipoCurvaAgrupadorDto;

public class TipoCurvaAgrupadorMapper implements RowMapper<TipoCurvaAgrupadorDto>{

	public TipoCurvaAgrupadorDto mapRow(ResultSet rs, int arg1)throws SQLException {
		
		TipoCurvaAgrupadorDto tipocurvaAgrupadorDto = new TipoCurvaAgrupadorDto();
		tipocurvaAgrupadorDto.setIAgrupador(rs.getInt(1));
		tipocurvaAgrupadorDto.setcNombre(rs.getString(2));
		tipocurvaAgrupadorDto.setCEtiqueta(rs.getString(3));
		tipocurvaAgrupadorDto.setCDirectorio(rs.getString(4));
	
		return tipocurvaAgrupadorDto;
	}
	
}
