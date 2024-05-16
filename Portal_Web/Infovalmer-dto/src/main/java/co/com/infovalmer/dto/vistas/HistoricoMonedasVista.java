package co.com.infovalmer.dto.vistas;

import java.io.Serializable;
import java.util.Date;

public class HistoricoMonedasVista implements Serializable {
	private static final long serialVersionUID = 1L;

	private String tipoMoneda;
	private Date fechaInicial;
	private Date fechaFinal;
	private boolean mostrarBotton = false;

	public String getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
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
