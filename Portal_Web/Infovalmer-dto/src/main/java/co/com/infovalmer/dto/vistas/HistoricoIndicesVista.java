package co.com.infovalmer.dto.vistas;

import java.io.Serializable;
import java.util.Date;

public class HistoricoIndicesVista implements Serializable {
	private static final long serialVersionUID = 1L;

	private String indice;
	private Date fechaInicial;
	private Date fechaFinal;

	public HistoricoIndicesVista(){
		
	}
	
	public HistoricoIndicesVista(String indice, Date fechaInicial,
			Date fechaFinal) {
		this.indice = indice;
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
	}

	public String getIndice() {
		return indice;
	}

	public void setIndice(String indice) {
		this.indice = indice;
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
		return "HistoricoIndicesVista [indice=" + indice + ", fechaInicial="
				+ fechaInicial + ", fechaFinal=" + fechaFinal + "]";
	}
	
	
	
}
