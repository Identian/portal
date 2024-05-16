package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.ParametriaArchivoDto;
import co.com.infovalmer.dto.TipoCurvaAgrupadorDto;

public class ParametriaMapper implements RowMapper<ParametriaArchivoDto> {

	public ParametriaArchivoDto mapRow(ResultSet rs, int arg1)
			throws SQLException {
		// TODO Auto-generated method stub
		ParametriaArchivoDto objParametria = new ParametriaArchivoDto();
		objParametria.setIdParametria(rs.getLong(1));
		objParametria.setNombreProducto(rs.getString(2));
		objParametria.setRuta(rs.getString(3));
		objParametria.setDescripcion(rs.getString(4));
		objParametria.setPrefijo(rs.getString(5));

		TipoCurvaAgrupadorDto tipoCurvaDto = new TipoCurvaAgrupadorDto();
		tipoCurvaDto.setIAgrupador(rs.getInt(6));
		tipoCurvaDto.setcNombre(rs.getString(7));
		
		objParametria.setAgrupador(tipoCurvaDto);

		return objParametria;
	}

}
