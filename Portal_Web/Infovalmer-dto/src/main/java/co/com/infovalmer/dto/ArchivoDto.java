package co.com.infovalmer.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArchivoDto implements Serializable, Comparable<ArchivoDto> {

	private static final long serialVersionUID = 1L;
	private String nombre;
	private String nombreMostar;
	private String ruta;
	private String prefijo;
	private Date fecha;
	private long tamano;
	private String usuario;

	private List<EtiquetaDto> rutas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}

	public String getNombreMostar() {
		return nombreMostar;
	}

	public void setNombreMostar(String nombreMostar) {
		this.nombreMostar = nombreMostar;
	}

	public List<EtiquetaDto> getRutas() {
		return rutas;
	}

	public void setRutas(List<EtiquetaDto> listRutas) {
		this.rutas = listRutas;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int compareTo(ArchivoDto o) {
		if (fecha.before(o.fecha)) {
			return -1;
		} else {
			return 1;
		}
	}

	public long getTamano() {
		return tamano;
	}

	public void setTamano(long tamano) {
		this.tamano = tamano;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
