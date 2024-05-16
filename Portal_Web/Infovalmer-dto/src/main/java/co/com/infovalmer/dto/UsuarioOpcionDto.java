package co.com.infovalmer.dto;

import java.io.Serializable;

public class UsuarioOpcionDto implements Serializable{
	
	private int idUsuario;
	private int conteo;
	private int idProducto;
	private String nombreProducto;
	private int idSubProducto;
	private String nombreSubProducto;
	private String url;
	private int idUsuarioOpcion;
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getConteo() {
		return conteo;
	}
	public void setConteo(int conteo) {
		this.conteo = conteo;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getIdSubProducto() {
		return idSubProducto;
	}
	public void setIdSubProducto(int idSubProducto) {
		this.idSubProducto = idSubProducto;
	}
	public String getNombreSubProducto() {
		return nombreSubProducto;
	}
	public void setNombreSubProducto(String nombreSubProducto) {
		this.nombreSubProducto = nombreSubProducto;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getIdUsuarioOpcion() {
		return idUsuarioOpcion;
	}
	public void setIdUsuarioOpcion(int idUsuarioOpcion) {
		this.idUsuarioOpcion = idUsuarioOpcion;
	}
	
	
	

}
