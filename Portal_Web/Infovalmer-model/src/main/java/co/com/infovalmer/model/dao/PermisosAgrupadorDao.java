package co.com.infovalmer.model.dao;

import java.io.InputStream;
import java.util.List;

public interface PermisosAgrupadorDao {
	
	public boolean validarUsuario(String idUser);
	public boolean validarTipoCurva(String idCurva);
	public boolean validarUsuarioCurva(String idUser, String idCurva);
	public int agregarPermiso(String idUser, String idCurva);
	public List<String> aplicarPermisosAUsuarios(InputStream permisos);
	
}
