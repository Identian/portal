package co.com.infovalmer.dto;

import java.io.Serializable;
import java.util.Date;

public class TasasVistaDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String tipoTasa;
	private Date fechaInicial;
	private Date fechaFinal;

	public String getTipoTasa() {
		return tipoTasa;
	}

	public void setTipoTasa(String tipoTasa) {
		this.tipoTasa = tipoTasa;
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
