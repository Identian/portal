package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.Usuario;
import co.com.infovalmer.dto.UsuarioOpcionDto;

public interface UsuarioPermisosDao {

	public UsuarioOpcionDto consultarPermisos(Usuario usuario,String url) throws Exception;
	public int consultarRequierePermisos(String url) throws Exception;
	public List<Usuario> consultarListaUsuarios() throws Exception;
}
