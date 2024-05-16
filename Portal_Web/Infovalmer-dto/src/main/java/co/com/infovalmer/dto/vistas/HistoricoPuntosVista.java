package co.com.infovalmer.dto.vistas;

import java.io.Serializable;
import java.util.Date;

public class HistoricoPuntosVista implements Serializable {

	private static final long serialVersionUID = 1L;
	private String curva;
	private Date fechaInicial;
	private Date fechaFinal;

	public HistoricoPuntosVista() {
		super();
	}

	public HistoricoPuntosVista(String curva, Date fechaInicial, Date fechaFinal) {
		super();
		this.curva = curva;
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
	}

	public String getCurva() {
		return curva;
	}

	public void setCurva(String curva) {
		this.curva = curva;
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

	@Override
	public String toString() {
		return "HistoricoPuntosVista [curva=" + curva + ", fechaInicial="
				+ fechaInicial + ", fechaFinal=" + fechaFinal + "]";
	}

}
