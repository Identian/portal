package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.EtiquetaDto;

public class EtiquetaMapper implements RowMapper<EtiquetaDto> {

	public EtiquetaDto mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		EtiquetaDto etiquetaDto = new EtiquetaDto();
		etiquetaDto.setcEtiqueta(rs.getString(1));
		etiquetaDto.setcIdioma(rs.getString(2));
		etiquetaDto.setcValor(rs.getString(3));
		
		return etiquetaDto;
	}

}
