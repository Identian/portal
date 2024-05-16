package co.com.infovalmer.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PuntosDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private java.util.Date dFecha;

	private int iPlazodias;

	private String cCurcerocupon;

	private BigDecimal eRentabilidadanterior;

	private BigDecimal eRentabilidadest;

	private BigDecimal eRentabilidadops;

	private BigDecimal eTe;

	private BigDecimal eTo;

	private BigDecimal eVariacion;

	public PuntosDto() {
		super();
	}

	public PuntosDto(Date dFecha, int iPlazodias, String cCurcerocupon,
			BigDecimal eRentabilidadanterior, BigDecimal eRentabilidadest,
			BigDecimal eRentabilidadops, BigDecimal eTe, BigDecimal eTo,
			BigDecimal eVariacion) {
		super();
		this.dFecha = dFecha;
		this.iPlazodias = iPlazodias;
		this.cCurcerocupon = cCurcerocupon;
		this.eRentabilidadanterior = eRentabilidadanterior;
		this.eRentabilidadest = eRentabilidadest;
		this.eRentabilidadops = eRentabilidadops;
		this.eTe = eTe;
		this.eTo = eTo;
		this.eVariacion = eVariacion;
	}

	public java.util.Date getdFecha() {
		return dFecha;
	}

	public void setdFecha(java.util.Date dFecha) {
		this.dFecha = dFecha;
	}

	public int getiPlazodias() {
		return iPlazodias;
	}

	public void setiPlazodias(int iPlazodias) {
		this.iPlazodias = iPlazodias;
	}

	public String getcCurcerocupon() {
		return cCurcerocupon;
	}

	public void setcCurcerocupon(String cCurcerocupon) {
		this.cCurcerocupon = cCurcerocupon;
	}

	public BigDecimal geteRentabilidadanterior() {
		return eRentabilidadanterior;
	}

	public void seteRentabilidadanterior(BigDecimal eRentabilidadanterior) {
		this.eRentabilidadanterior = eRentabilidadanterior;
	}

	public BigDecimal geteRentabilidadest() {
		return eRentabilidadest;
	}

	public void seteRentabilidadest(BigDecimal eRentabilidadest) {
		this.eRentabilidadest = eRentabilidadest;
	}

	public BigDecimal geteRentabilidadops() {
		return eRentabilidadops;
	}

	public void seteRentabilidadops(BigDecimal eRentabilidadops) {
		this.eRentabilidadops = eRentabilidadops;
	}

	public BigDecimal geteTe() {
		return eTe;
	}

	public void seteTe(BigDecimal eTe) {
		this.eTe = eTe;
	}

	public BigDecimal geteTo() {
		return eTo;
	}

	public void seteTo(BigDecimal eTo) {
		this.eTo = eTo;
	}

	public BigDecimal geteVariacion() {
		return eVariacion;
	}

	public void seteVariacion(BigDecimal eVariacion) {
		this.eVariacion = eVariacion;
	}

	@Override
	public String toString() {
		return "PuntosDto [dFecha=" + dFecha + ", iPlazodias=" + iPlazodias
				+ ", cCurcerocupon=" + cCurcerocupon
				+ ", eRentabilidadanterior=" + eRentabilidadanterior
				+ ", eRentabilidadest=" + eRentabilidadest
				+ ", eRentabilidadops=" + eRentabilidadops + ", eTe=" + eTe
				+ ", eTo=" + eTo + ", eVariacion=" + eVariacion + "]";
	}
	
	

}
