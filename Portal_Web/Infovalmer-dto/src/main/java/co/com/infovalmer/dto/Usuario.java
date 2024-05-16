package co.com.infovalmer.dto;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombres;
	private String apellidos;
	private String entidad;
	private String cargo;
	private String pais;
	private String ciudad;
	private String nit;
	private String userId;
	private String userLogin;
	private String userEmail;
	private String rol;
	

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}


	@Override
	public String toString() {
		return "Usuario [nombres=" + nombres + ", apellidos=" + apellidos
				+ ", entidad=" + entidad + ", cargo=" + cargo + ", pais="
				+ pais + ", ciudad=" + ciudad + ", nit=" + nit + ", userId="
				+ userId + ", userLogin=" + userLogin + ", userEmail="
				+ userEmail + ", rol=" + rol + "]";
	}

}
