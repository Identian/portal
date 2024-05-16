package co.com.infovalmer.dto;

import java.io.Serializable;



public class SpClaseDto implements Serializable  {
	
	private static final long serialVersionUID = 1L;

	
	private String cClase;
	private String cDescripcion;
	private String cEstado;
	private String cNombre;

	public  SpClaseDto() {
		// TODO Auto-generated constructor stub
	
	}

	public String getCClase() {
		return this.cClase;
	}

	public void setCClase(String cClase) {
		this.cClase = cClase;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}
}
