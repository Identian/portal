package co.com.infovalmer.dto.vistas;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import co.com.infovalmer.dto.TituloDto;

public class TablaAmortizacionVista implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nemotecnico;
	private Date fechaFinal;

	public TablaAmortizacionVista() {
		super();
	}

	public String getNemotecnico() {
		return nemotecnico;
	}

	public void setNemotecnico(String nemotecnico) {
		this.nemotecnico = nemotecnico;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

}
