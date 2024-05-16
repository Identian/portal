package co.com.infovalmer.dto;

import java.io.Serializable;
import java.util.Date;



public class EmisorDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String cEmisor;
	private String cNemotecnico;
	private String cNombre;
	private String cRazonsocial;
	private String cSituacion;
	private Date dFecharegistro;
	
	
	public String getCEmisor() {
		return this.cEmisor;
	}

	public void setCEmisor(String cEmisor) {
		this.cEmisor = cEmisor;
	}

	public String getCNemotecnico() {
		return this.cNemotecnico;
	}

	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getCRazonsocial() {
		return this.cRazonsocial;
	}

	public void setCRazonsocial(String cRazonsocial) {
		this.cRazonsocial = cRazonsocial;
	}

	public String getCSituacion() {
		return this.cSituacion;
	}

	public void setCSituacion(String cSituacion) {
		this.cSituacion = cSituacion;
	}

	public Date getDFecharegistro() {
		return this.dFecharegistro;
	}

	public void setDFecharegistro(Date dFecharegistro) {
		this.dFecharegistro = dFecharegistro;
	}
}
