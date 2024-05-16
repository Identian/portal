package co.com.infovalmer.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DerivadoDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String tipo;
	private String nemoSubyacente;
	private String contrato;
	private Date fechaInicial;
	private Date fechaFinal;
	private String fechaVencimiento;
	
	private List<PreciosValoracionDto> precioValoracion;
	
	public DerivadoDto() {
		super();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNemoSubyacente() {
		return nemoSubyacente;
	}

	public void setNemoSubyacente(String nemoSubyacente) {
		this.nemoSubyacente = nemoSubyacente;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
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

	public List<PreciosValoracionDto> getPrecioValoracion() {
		return precioValoracion;
	}

	public void setPrecioValoracion(List<PreciosValoracionDto> precioValoracion) {
		this.precioValoracion = precioValoracion;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	@Override
	public String toString() {
		return "DerivadoDto [tipo=" + tipo + ", nemoSubyacente="
				+ nemoSubyacente + ", contrato=" + contrato + ", fechaInicial="
				+ fechaInicial + ", fechaFinal=" + fechaFinal
				+ ", fechaVencimiento=" + fechaVencimiento
				+ ", precioValoracion=" + precioValoracion + "]";
	}
	
	

}
