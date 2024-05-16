package co.com.infovalmer.model.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.TipoCurvaDto;
public class TipoCurvaMapper implements RowMapper<TipoCurvaDto> {

	public TipoCurvaDto mapRow(ResultSet rs, int arg1) throws SQLException {
		TipoCurvaDto tipoCurvaDto = new TipoCurvaDto();
		tipoCurvaDto.setiTipocurva(rs.getInt(1));
		tipoCurvaDto.setcNombre(rs.getString(2));
		tipoCurvaDto.setcDescripcion(rs.getString(3));
		tipoCurvaDto.setcEjex(rs.getString(4));
		tipoCurvaDto.setcEjey(rs.getString(5));
		tipoCurvaDto.setcPrefijoArchivo(rs.getString(6));
		tipoCurvaDto.setiAgrupador(rs.getInt(7));
		tipoCurvaDto.setiOrden(rs.getInt(8));
		tipoCurvaDto.setMuestraCurva(rs.getString(9));
		return tipoCurvaDto;
	}

}
