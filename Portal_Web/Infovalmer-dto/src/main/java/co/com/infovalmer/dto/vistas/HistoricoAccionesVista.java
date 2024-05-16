package co.com.infovalmer.dto.vistas;

import java.io.Serializable;
import java.util.Date;

public class HistoricoAccionesVista implements Serializable {

	private static final long serialVersionUID = 179972332660047434L;
	private String tipoMercado;
	private String emisor;
	private String nemotecnico;
	private Date fechaInicial;
	private Date fechaFinal;

	public String getTipoMercado() {
		return tipoMercado;
	}

	public void setTipoMercado(String tipoMercado) {
		this.tipoMercado = tipoMercado;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public String getNemotecnico() {
		return nemotecnico;
	}

	public void setNemotecnico(String nemotecnico) {
		this.nemotecnico = nemotecnico;
	}

	public Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

}
