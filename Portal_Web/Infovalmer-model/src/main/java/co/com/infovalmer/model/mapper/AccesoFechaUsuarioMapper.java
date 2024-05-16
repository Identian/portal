package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.AccesoFechaUsuarioDto;

public class AccesoFechaUsuarioMapper implements RowMapper<AccesoFechaUsuarioDto>{
	
	public AccesoFechaUsuarioDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		AccesoFechaUsuarioDto accesoFechaUsuario = new AccesoFechaUsuarioDto();
		accesoFechaUsuario.setId(rs.getInt(1));
		accesoFechaUsuario.setIdUsuarioOpcion(rs.getInt(2));
		accesoFechaUsuario.setUltimo_mes(rs.getInt(3));
		accesoFechaUsuario.setUltimo_dia(rs.getInt(4));
		//accesoFechaUsuario.setUltima_fecha(rs.getDate(2));
		//accesoFechaUsuario.setDias_permitidos(rs.getInt(3));
		//accesoFechaUsuario.setDia_contador(rs.getInt(4));
		return accesoFechaUsuario;
	}

}
