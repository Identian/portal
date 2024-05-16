package co.com.infovalmer.model.dao;



import java.util.List;

import co.com.infovalmer.dto.AccesoFechaUsuarioDto;
import co.com.infovalmer.dto.Usuario;

public interface AccesoFechaUsuarioDao {

	public List<AccesoFechaUsuarioDto> consultarFechasAcceso(Usuario usuario,String url) throws Exception;
	public List<AccesoFechaUsuarioDto> consultarFechasAccesov1(Usuario usuario,String url, int mes) throws Exception;
	public Integer LimiteAccesoFecha(Usuario usuario,String url) throws Exception;
	public void registrarFechaAccesoUsuario(AccesoFechaUsuarioDto accesoFechaUsuarioDto) throws Exception;
	public void registrarFechaAccesoUsuariov1(AccesoFechaUsuarioDto accesoFechaUsuarioDto) throws Exception;
	public void updateAccesoUsuario(AccesoFechaUsuarioDto accesoFechaUsuarioDto) throws Exception;
}
