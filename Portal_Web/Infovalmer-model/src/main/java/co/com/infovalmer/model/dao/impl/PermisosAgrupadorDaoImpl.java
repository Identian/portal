package co.com.infovalmer.model.dao.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.PermisosAgrupadorDao;
import co.com.infovalmer.utilidades.LOGS;
@SuppressWarnings("deprecation")
public class PermisosAgrupadorDaoImpl  extends ConnectionConfig implements PermisosAgrupadorDao {

	JdbcTemplate jdbcTemplateObjectWP;
	JdbcTemplate jdbcTemplateObject;
	
	public PermisosAgrupadorDaoImpl() {
		this.jdbcTemplateObjectWP = super.getConexionWPS();
		this.jdbcTemplateObject = super.getConexion();
	} 
	
	
	public boolean validarUsuario(String idUser) {
		StringBuilder sql = new StringBuilder();
		Object[] parametros = null;
		sql.append("SELECT ");
		sql.append("COUNT(*)");
		sql.append("FROM ");
		sql.append("wp_users AS wu ");
		sql.append("WHERE wu.id= ?");
		parametros = new Object[] {idUser};
		
		return jdbcTemplateObjectWP.queryForInt(sql.toString(), parametros) > 0;
	}

	public boolean validarTipoCurva(String idCurva) {
		StringBuilder sql = new StringBuilder();
		Object[] parametros = null;
		sql.append("SELECT ");
		sql.append("COUNT(*)");
		sql.append("FROM ");
		sql.append("po_tipocurva AS tp ");
		sql.append("WHERE tp.i_tipocurva= ?");
		parametros = new Object[] {idCurva};
		//this.jdbcTemplateObject = super.getConexion();
		return jdbcTemplateObject.queryForInt(sql.toString(), parametros) > 0;
	}

	public boolean validarUsuarioCurva(String idUser, String idCurva) {
		StringBuilder sql = new StringBuilder();
		Object[] parametros = null;
		sql.append("SELECT ");
		sql.append("COUNT(*)");
		sql.append("FROM ");
		sql.append("po_perfil_tipocurva AS tpwu ");
		sql.append("WHERE tpwu.i_tipocurva= ? AND tpwu.i_usuario = ?");
		parametros = new Object[] {idCurva, idUser};
		//this.jdbcTemplateObject = super.getConexion();
		return jdbcTemplateObject.queryForInt(sql.toString(), parametros) > 0;
	}
	
	public int agregarPermiso(String idUser, String idCurva) {
		StringBuilder sql = new StringBuilder();
		Object[] parametros = null;
		sql.append("INSERT INTO po_perfil_tipocurva");
		sql.append("(i_perfil, i_tipocurva, i_usuario)");
		sql.append(" VALUE (0,?,?)");
		parametros = new Object[] {idCurva, idUser};
		//this.jdbcTemplateObject = super.getConexion();
		return jdbcTemplateObject.update(sql.toString(), parametros);
	}

	public List<String> aplicarPermisosAUsuarios(InputStream inputStream) {
		 BufferedReader permisosUsers = new BufferedReader(
		         new InputStreamReader(inputStream));
		List<String> permisosNoAplicado = new ArrayList<String>();
		LOGS.LOG_DEBUG.info("Se ejecuto PermisosAgrupadorDaoImpl.aplicarPermisosAUsuarios()");

		 try {
			for (String permisosUser; (permisosUser = permisosUsers.readLine()) != null; ) {
				LOGS.LOG_DEBUG.info("Linea completa (usuario+curvas): " + permisosUser);
				String usuario = permisosUser.split(";")[0].trim();
				String[] curvas = permisosUser.split(";")[1].split(",");
				LOGS.LOG_DEBUG.info("Existe el usuario: " + validarUsuario(usuario));
				if(validarUsuario(usuario)) {
					for(String permiso : curvas) {
						LOGS.LOG_DEBUG.info("Curva: " + permiso);
						if(validarTipoCurva(permiso)) {//valida si existe la curva
							if(!validarUsuarioCurva(usuario, permiso)) {
								LOGS.LOG_DEBUG.info("Existe el permiso: " + permiso);
								if(agregarPermiso(usuario,permiso) !=1 ) {
									LOGS.LOG_DEBUG.info("Error Aplicar permisos Usuario: " +usuario +" Permiso: "+ permiso );
									permisosNoAplicado.add("Usuario: " +usuario +" Permiso: "+ permiso +"  Observacion: Error al Aplicar el permiso.");
								}
							}else {
								LOGS.LOG_DEBUG.info("Error Validar Usuario Curva Usuario: " +usuario +" Permiso: "+ permiso );
								permisosNoAplicado.add("Usuario: " +usuario +" Permiso: "+ permiso +"  Observacion: Permiso anteriormente aplicado.");
							}
						}else {
							LOGS.LOG_DEBUG.info("Error Validar Tipo Curva Usuario: " +usuario +" Permiso: "+ permiso );
							permisosNoAplicado.add("Usuario: " +usuario +" Permiso: "+ permiso +"  Observacion: No existe Curva.");
						}
					}
				}else {
					LOGS.LOG_DEBUG.info("Error Usuario "+ usuario);
					permisosNoAplicado.add("Usuario: " +usuario +" Observacion: No existe Usuario.");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			permisosNoAplicado.add("NO SE PUDO LEER EL ARCHIVO; NO SE PUDO LEER EL ARCHIVO; NO SE PUDO LEER EL ARCHIVO");
		} catch (Exception e){
			e.printStackTrace();
			permisosNoAplicado.add("EL FORMATO DEL ARCHIVO ES INCORRECTO");
		}
		 LOGS.LOG_DEBUG.info("size "+ permisosNoAplicado.size() + " empty?" + permisosNoAplicado.isEmpty());
		 if(permisosNoAplicado.isEmpty()) {
			 permisosNoAplicado.add("Todos los permisos fueron aplicados sastifactoriamente");
		 }
		return permisosNoAplicado;
	}
	
	 

}
