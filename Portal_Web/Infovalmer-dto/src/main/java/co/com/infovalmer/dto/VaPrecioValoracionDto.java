package co.com.infovalmer.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class VaPrecioValoracionDto implements Serializable {

	private static final long serialVersionUID = -2143251346777606169L;

	private java.util.Date dFecha;

	private String cNemotecnico;

	private String cBursatilidad;

	private BigDecimal ePrecioanterior;

	private BigDecimal ePreciopromedio;

	private BigDecimal ePreciovaloracion;

	private double eVariacion;

	private String cTipoprecio;

	private java.util.Date dFechainicio;

	private java.util.Date dFechafin;

	private String cVigente;

	private double cVolumen;

	public java.util.Date getdFecha() {
		return dFecha;
	}

	public void setdFecha(java.util.Date dFecha) {
		this.dFecha = dFecha;
	}

	public String getcNemotecnico() {
		return cNemotecnico;
	}

	public void setcNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public String getcBursatilidad() {
		return cBursatilidad;
	}

	public void setcBursatilidad(String cBursatilidad) {
		this.cBursatilidad = cBursatilidad;
	}

	public BigDecimal getePrecioanterior() {
		return ePrecioanterior;
	}

	public void setePrecioanterior(BigDecimal ePrecioanterior) {
		this.ePrecioanterior = ePrecioanterior;
	}

	public BigDecimal getePreciopromedio() {
		return ePreciopromedio;
	}

	public void setePreciopromedio(BigDecimal ePreciopromedio) {
		this.ePreciopromedio = ePreciopromedio;
	}

	public BigDecimal getePreciovaloracion() {
		return ePreciovaloracion;
	}

	public void setePreciovaloracion(BigDecimal ePreciovaloracion) {
		this.ePreciovaloracion = ePreciovaloracion;
	}

	public double geteVariacion() {
		return eVariacion;
	}

	public void seteVariacion(double eVariacion) {
		this.eVariacion = eVariacion;
	}

	public String getcTipoprecio() {
		return cTipoprecio;
	}

	public void setcTipoprecio(String cTipoprecio) {
		this.cTipoprecio = cTipoprecio;
	}

	public java.util.Date getdFechainicio() {
		return dFechainicio;
	}

	public void setdFechainicio(java.util.Date dFechainicio) {
		this.dFechainicio = dFechainicio;
	}

	public java.util.Date getdFechafin() {
		return dFechafin;
	}

	public void setdFechafin(java.util.Date dFechafin) {
		this.dFechafin = dFechafin;
	}

	public String getcVigente() {
		return cVigente;
	}

	public void setcVigente(String cVigente) {
		this.cVigente = cVigente;
	}

	public double getcVolumen() {
		return cVolumen;
	}

	public void setcVolumen(double cVolumen) {
		this.cVolumen = cVolumen;
	}

}
