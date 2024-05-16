package co.com.infovalmer.dto;

import java.io.Serializable;

import java.util.Date;


/**
 * The persistent class for the sp_hcaltitulo database table.
 * 
 */
public class HcaltituloDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private String cNemotecnico;

	private int iTipoplazo;

	private int iCalificadora;

	private int iTipcalificaci;

	private Date dFechaasignada;
	
	private String cCalificacion;

	private String cVigente;

	private Date dFechafin;

	private Date dFechaini;
	
	//atributo exclusivo para vista y archivo csv
	private String nombreCalificadora;

	public HcaltituloDto() {
	}
	
	public String getNombreCalificadora() {
		return nombreCalificadora;
	}

	public void setNombreCalificadora(String nombreCalificadora) {
		this.nombreCalificadora = nombreCalificadora;
	}

	public String getcNemotecnico() {
		return cNemotecnico;
	}

	public void setcNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public int getiTipoplazo() {
		return iTipoplazo;
	}

	public void setiTipoplazo(int iTipoplazo) {
		this.iTipoplazo = iTipoplazo;
	}

	public int getiCalificadora() {
		return iCalificadora;
	}

	public void setiCalificadora(int iCalificadora) {
		this.iCalificadora = iCalificadora;
	}

	public int getiTipcalificaci() {
		return iTipcalificaci;
	}

	public void setiTipcalificaci(int iTipcalificaci) {
		this.iTipcalificaci = iTipcalificaci;
	}

	public Date getdFechaasignada() {
		return dFechaasignada;
	}

	public void setdFechaasignada(Date dFechaasignada) {
		this.dFechaasignada = dFechaasignada;
	}

	public String getcCalificacion() {
		return cCalificacion;
	}

	public void setcCalificacion(String cCalificacion) {
		this.cCalificacion = cCalificacion;
	}

	public String getcVigente() {
		return cVigente;
	}

	public void setcVigente(String cVigente) {
		this.cVigente = cVigente;
	}

	public Date getdFechafin() {
		return dFechafin;
	}

	public void setdFechafin(Date dFechafin) {
		this.dFechafin = dFechafin;
	}

	public Date getdFechaini() {
		return dFechaini;
	}

	public void setdFechaini(Date dFechaini) {
		this.dFechaini = dFechaini;
	}
	
}