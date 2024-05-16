package co.com.infovalmer.dto;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the sp_hcalemisor database table.
 * 
 */
public class HcalemisorDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private String cEmisor;

	private Date dFechaasignada;

	private int iTipcalificaci;

	private int iTipoplazo;

	private int iCalificadora;
	
	private String cCalificacion;

	private String cVigente;

	private Date dFechafin;

	private Date dFechaini;
	
	//atributo exclusivo para vista y archivo csv
	private String nombreCalificadora;
	
	//atributo exclusivo para vista y archivo csv
	private String etiquetaPlazo;

	public HcalemisorDto() {
	}
	
	public String getNombreCalificadora() {
		return nombreCalificadora;
	}

	public void setNombreCalificadora(String nombreCalificadora) {
		this.nombreCalificadora = nombreCalificadora;
	}

	public String getEtiquetaPlazo() {
		return etiquetaPlazo;
	}


	public void setEtiquetaPlazo(String etiquetaPlazo) {
		this.etiquetaPlazo = etiquetaPlazo;
	}


	public String getcEmisor() {
		return cEmisor;
	}

	public void setcEmisor(String cEmisor) {
		this.cEmisor = cEmisor;
	}

	public Date getdFechaasignada() {
		return dFechaasignada;
	}

	public void setdFechaasignada(Date dFechaasignada) {
		this.dFechaasignada = dFechaasignada;
	}

	public int getiTipcalificaci() {
		return iTipcalificaci;
	}

	public void setiTipcalificaci(int iTipcalificaci) {
		this.iTipcalificaci = iTipcalificaci;
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