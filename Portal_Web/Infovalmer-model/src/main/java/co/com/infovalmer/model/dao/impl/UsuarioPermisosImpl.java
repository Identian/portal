package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.Usuario;
import co.com.infovalmer.dto.UsuarioOpcionDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.UsuarioPermisosDao;
import co.com.infovalmer.model.mapper.PermisosUsuarioMapper;
import co.com.infovalmer.model.mapper.UsuarioMapper;

public class UsuarioPermisosImpl extends ConnectionConfig implements
		UsuarioPermisosDao {
	
	JdbcTemplate jdbcTemplateObjectWP;
	
	public UsuarioPermisosImpl() {
		this.jdbcTemplateObjectWP = super.getConexionWPS();
	}

	public UsuarioOpcionDto consultarPermisos(Usuario usuario, String url) {
		UsuarioOpcionDto usuarioOpcion = null;
		Object[] parametros;
		StringBuilder sql = new StringBuilder();

		try {
			sql.append(" SELECT WUO.idUsuario,WUO.Conteo,WP.id,WP.nombres,  ");
			sql.append(" WSP.idSubProducto,WSP.nombreSubProducto,WSP.url,WUO.idUsuarioOpcion ");
			sql.append(" FROM wp_usuario_opcion WUO ");
			sql.append(" INNER JOIN wp_subproducto WSP ON WSP.idsubproducto = WUO.idsubproducto ");
			sql.append(" INNER JOIN wp_productos WP ON WP.id = WSP.idproducto  ");
			sql.append(" WHERE WUO.idusuario= ? AND WSP.url = ? ");
			sql.append(" limit 1 ");

			parametros = new Object[] { usuario.getUserId(), url };
			usuarioOpcion = jdbcTemplateObjectWP.queryForObject(sql.toString(),
					parametros, new PermisosUsuarioMapper());

		} catch (Exception e) {
			usuarioOpcion = null;
		}
		return usuarioOpcion;
	}

	public int consultarRequierePermisos(String url) throws Exception {
		Object[] parametros;
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT requierePermisos FROM wp_subproducto where  url = ? ");
		sql.append(" limit 1 ");
		parametros = new Object[] { url };
		return jdbcTemplateObjectWP.queryForInt(sql.toString(), parametros);
	}
	
	public List<Usuario> consultarUsuarios(){
		
		return null;
	}

	public List<Usuario> consultarListaUsuarios() throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT ID,user_email FROM wp_users");

		return jdbcTemplateObjectWP.query(sql.toString(),new UsuarioMapper());
	}
}
