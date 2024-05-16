package co.com.infovalmer.dto;

import java.io.Serializable;


/**
 * The persistent class for the sp_calificadora database table.
 * 
 */
public class CalificadoraDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private byte iCalificadora;

	private String cConvencion;

	private String cDescripcion;

	private String cNombre;

	public CalificadoraDto() {
	}

	public byte getICalificadora() {
		return this.iCalificadora;
	}

	public void setICalificadora(byte iCalificadora) {
		this.iCalificadora = iCalificadora;
	}

	public String getCConvencion() {
		return this.cConvencion;
	}

	public void setCConvencion(String cConvencion) {
		this.cConvencion = cConvencion;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

}