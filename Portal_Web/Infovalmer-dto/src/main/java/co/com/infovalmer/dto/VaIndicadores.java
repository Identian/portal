package co.com.infovalmer.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class VaIndicadores implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cNemotecnico;

	private java.util.Date dFecha;

	private BigDecimal eCapitalizacion;

	private BigDecimal eFrecuencia;

	private BigDecimal eLiquidez;

	private BigDecimal eTobin;

	public String getcNemotecnico() {
		return cNemotecnico;
	}

	public void setcNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public java.util.Date getdFecha() {
		return dFecha;
	}

	public void setdFecha(java.util.Date dFecha) {
		this.dFecha = dFecha;
	}

	public BigDecimal geteCapitalizacion() {
		return eCapitalizacion;
	}

	public void seteCapitalizacion(BigDecimal eCapitalizacion) {
		this.eCapitalizacion = eCapitalizacion;
	}

	public BigDecimal geteFrecuencia() {
		return eFrecuencia;
	}

	public void seteFrecuencia(BigDecimal eFrecuencia) {
		this.eFrecuencia = eFrecuencia;
	}

	public BigDecimal geteLiquidez() {
		return eLiquidez;
	}

	public void seteLiquidez(BigDecimal eLiquidez) {
		this.eLiquidez = eLiquidez;
	}

	public BigDecimal geteTobin() {
		return eTobin;
	}

	public void seteTobin(BigDecimal eTobin) {
		this.eTobin = eTobin;
	}

}
