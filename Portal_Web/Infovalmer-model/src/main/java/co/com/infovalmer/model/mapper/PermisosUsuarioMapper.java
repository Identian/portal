package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.UsuarioOpcionDto;

public class PermisosUsuarioMapper implements RowMapper<UsuarioOpcionDto>{

	public UsuarioOpcionDto mapRow(ResultSet rs, int rowNum) throws SQLException{
		UsuarioOpcionDto usuarioOpcionDto = new UsuarioOpcionDto();
		usuarioOpcionDto.setIdUsuario(rs.getInt(1));
		usuarioOpcionDto.setConteo(rs.getInt(2));
		usuarioOpcionDto.setIdProducto(rs.getInt(3));
		usuarioOpcionDto.setNombreProducto(rs.getString(4));
		usuarioOpcionDto.setIdSubProducto(rs.getInt(5));
		usuarioOpcionDto.setNombreProducto(rs.getString(6));
		usuarioOpcionDto.setUrl(rs.getString(7));
		usuarioOpcionDto.setIdUsuarioOpcion(rs.getInt(8));
		return usuarioOpcionDto;
	}

}
