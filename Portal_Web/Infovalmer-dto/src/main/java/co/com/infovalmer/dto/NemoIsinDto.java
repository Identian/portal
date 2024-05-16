package co.com.infovalmer.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class NemoIsinDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String cIsin;
	private String cEmisor;
	private String cNemotecnico;
	private String cPeriodicidad;
	private String cTipotasa;
	private Date dFechaemision;
	private Date dFechavencimiento;
	private String eBase360;
	private BigDecimal eSpread;
	private BigDecimal eTasa;

	public NemoIsinDto() {
	}

	public String getCIsin() {
		return this.cIsin;
	}

	public void setCIsin(String cIsin) {
		this.cIsin = cIsin;
	}

	public String getCEmisor() {
		return this.cEmisor;
	}

	public void setCEmisor(String cEmisor) {
		this.cEmisor = cEmisor;
	}

	public String getCNemotecnico() {
		return this.cNemotecnico;
	}

	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public String getCPeriodicidad() {
		return this.cPeriodicidad;
	}

	public void setCPeriodicidad(String cPeriodicidad) {
		this.cPeriodicidad = cPeriodicidad;
	}

	public String getCTipotasa() {
		return this.cTipotasa;
	}

	public void setCTipotasa(String cTipotasa) {
		this.cTipotasa = cTipotasa;
	}

	public Date getDFechaemision() {
		return this.dFechaemision;
	}

	public void setDFechaemision(Date dFechaemision) {
		this.dFechaemision = dFechaemision;
	}

	public Date getDFechavencimiento() {
		return this.dFechavencimiento;
	}

	public void setDFechavencimiento(Date dFechavencimiento) {
		this.dFechavencimiento = dFechavencimiento;
	}

	public String getEBase360() {
		return this.eBase360;
	}

	public void setEBase360(String eBase360) {
		this.eBase360 = eBase360;
	}

	public BigDecimal getESpread() {
		return this.eSpread;
	}

	public void setESpread(BigDecimal eSpread) {
		this.eSpread = eSpread;
	}

	public BigDecimal getETasa() {
		return this.eTasa;
	}

	public void setETasa(BigDecimal eTasa) {
		this.eTasa = eTasa;
	}
}
