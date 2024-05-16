package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.TipoMonedaDto;

public class MonedaMapper implements RowMapper<TipoMonedaDto> {

	public TipoMonedaDto mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		TipoMonedaDto tipoMonedaDto = new TipoMonedaDto();
		tipoMonedaDto.setcTipomoneda(rs.getString(1));
		tipoMonedaDto.setiGrupomoneda(rs.getInt(2));
		tipoMonedaDto.setcNombre(rs.getString(3));
		tipoMonedaDto.setdFechaini(rs.getDate(4));
		tipoMonedaDto.setdFechafin(rs.getDate(5));
		tipoMonedaDto.setcEstado(rs.getString(6));
		tipoMonedaDto.setcVigencia(rs.getString(7));
		tipoMonedaDto.setcCasoespecial(rs.getString(8));
		tipoMonedaDto.setcDescripcion(rs.getString(9));
		tipoMonedaDto.setcMuestramoneda(rs.getString(10));
		return tipoMonedaDto;
	}

}
