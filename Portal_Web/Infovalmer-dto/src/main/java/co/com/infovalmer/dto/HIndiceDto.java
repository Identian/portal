package co.com.infovalmer.dto;

import java.io.Serializable;


import java.math.BigDecimal;


/**
 * The persistent class for the sp_hindice database table.
 * 
 */
public class HIndiceDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String cIndice;
	
	private java.util.Date dFechaindice;
	
	private java.util.Date dFechavcto;

	private String cNombre;

	private String cTipohcal;

	private BigDecimal eValor;

	private int iDiasvencimiento;

	public HIndiceDto() {
	}

	public String getcIndice() {
		return cIndice;
	}

	public void setcIndice(String cIndice) {
		this.cIndice = cIndice;
	}

	public java.util.Date getdFechaindice() {
		return dFechaindice;
	}

	public void setdFechaindice(java.util.Date dFechaindice) {
		this.dFechaindice = dFechaindice;
	}

	public java.util.Date getdFechavcto() {
		return dFechavcto;
	}

	public void setdFechavcto(java.util.Date dFechavcto) {
		this.dFechavcto = dFechavcto;
	}

	public String getcNombre() {
		return cNombre;
	}

	public void setcNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getcTipohcal() {
		return cTipohcal;
	}

	public void setcTipohcal(String cTipohcal) {
		this.cTipohcal = cTipohcal;
	}

	public BigDecimal geteValor() {
		return eValor;
	}

	public void seteValor(BigDecimal eValor) {
		this.eValor = eValor;
	}

	public int getiDiasvencimiento() {
		return iDiasvencimiento;
	}

	public void setiDiasvencimiento(int iDiasvencimiento) {
		this.iDiasvencimiento = iDiasvencimiento;
	}
	
}