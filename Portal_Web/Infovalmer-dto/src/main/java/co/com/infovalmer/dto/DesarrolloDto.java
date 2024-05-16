package co.com.infovalmer.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DesarrolloDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cNemotecnico;

	private int iNumerocupon;

	private java.util.Date dFechainivig;

	private java.util.Date dFechafinvig;

	private Date dFechapago;

	private BigDecimal eAmortizacion;

	private BigDecimal eFlujototal;

	private BigDecimal eInteres;

	private BigDecimal eSaldoamortizar;
	
	private BigDecimal totalNumeroCupon;

	public DesarrolloDto() {
		super();
	}

	public String getcNemotecnico() {
		return cNemotecnico;
	}

	public void setcNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public int getiNumerocupon() {
		return iNumerocupon;
	}

	public void setiNumerocupon(int iNumerocupon) {
		this.iNumerocupon = iNumerocupon;
	}

	public java.util.Date getdFechainivig() {
		return dFechainivig;
	}

	public void setdFechainivig(java.util.Date dFechainivig) {
		this.dFechainivig = dFechainivig;
	}

	public java.util.Date getdFechafinvig() {
		return dFechafinvig;
	}

	public void setdFechafinvig(java.util.Date dFechafinvig) {
		this.dFechafinvig = dFechafinvig;
	}

	public Date getdFechapago() {
		return dFechapago;
	}

	public void setdFechapago(Date dFechapago) {
		this.dFechapago = dFechapago;
	}

	public BigDecimal geteAmortizacion() {
		return eAmortizacion;
	}

	public void seteAmortizacion(BigDecimal eAmortizacion) {
		this.eAmortizacion = eAmortizacion;
	}

	public BigDecimal geteFlujototal() {
		return eFlujototal;
	}

	public void seteFlujototal(BigDecimal eFlujototal) {
		this.eFlujototal = eFlujototal;
	}

	public BigDecimal geteInteres() {
		return eInteres;
	}

	public void seteInteres(BigDecimal eInteres) {
		this.eInteres = eInteres;
	}

	public BigDecimal geteSaldoamortizar() {
		return eSaldoamortizar;
	}

	public void seteSaldoamortizar(BigDecimal eSaldoamortizar) {
		this.eSaldoamortizar = eSaldoamortizar;
	}

	public BigDecimal getTotalNumeroCupon() {
		return totalNumeroCupon;
	}

	public void setTotalNumeroCupon(BigDecimal totalNumeroCupon) {
		this.totalNumeroCupon = totalNumeroCupon;
	}
}
