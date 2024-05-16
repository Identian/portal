package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.Usuario;

public class UsuarioMapper implements RowMapper<Usuario>{

	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		Usuario usuario = new Usuario();
		usuario.setUserId(rs.getString(1));
		usuario.setNombres(rs.getString(2));		
		return usuario;		
		
	}
}
