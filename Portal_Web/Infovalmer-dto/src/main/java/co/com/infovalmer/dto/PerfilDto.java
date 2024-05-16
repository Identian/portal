package co.com.infovalmer.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * The persistent class for the po_perfil database table.
 * 
 */

public class PerfilDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private int iPerfil;
	private String cCurvasOtc;
	private String cDescricpion;
	private String cDescripcion;
	private String cNombre;
	private Date dFechaCreacion;
	private Date dVigencia;
	private int iCosto;

	public PerfilDto() {
	}

	public int getIPerfil() {
		return this.iPerfil;
	}

	public void setIPerfil(int iPerfil) {
		this.iPerfil = iPerfil;
	}

	public String getCCurvasOtc() {
		return this.cCurvasOtc;
	}

	public void setCCurvasOtc(String cCurvasOtc) {
		this.cCurvasOtc = cCurvasOtc;
	}

	public String getCDescricpion() {
		return this.cDescricpion;
	}

	public void setCDescricpion(String cDescricpion) {
		this.cDescricpion = cDescricpion;
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

	public Date getDFechaCreacion() {
		return this.dFechaCreacion;
	}

	public void setDFechaCreacion(Date dFechaCreacion) {
		this.dFechaCreacion = dFechaCreacion;
	}

	public Date getDVigencia() {
		return this.dVigencia;
	}

	public void setDVigencia(Date dVigencia) {
		this.dVigencia = dVigencia;
	}

	public int getICosto() {
		return this.iCosto;
	}

	public void setICosto(int iCosto) {
		this.iCosto = iCosto;
	}

}