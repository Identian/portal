package co.com.infovalmer.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class CurvaCeroCuponDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cCurcerocupon;

	private String cIncluyefechvcto;

	private String cMetodocalculo;

	private String cNombre;

	private String cTipocurva;

	private BigDecimal ePromediocantidad;

	private BigDecimal eTolerancia1;

	private BigDecimal eTolerancia2;

	private int iDiasciclo;

	private int iMaxdiasatras;

	private int iMaxiteraciones;

	private int iMaxoperaciones;

	private int iMinfecvcto;

	private int iNdiascorridos;

	private int iUltimosndias;

	public CurvaCeroCuponDto() {
		super();
	}

	public String getcCurcerocupon() {
		return cCurcerocupon;
	}

	public void setcCurcerocupon(String cCurcerocupon) {
		this.cCurcerocupon = cCurcerocupon;
	}

	public String getcIncluyefechvcto() {
		return cIncluyefechvcto;
	}

	public void setcIncluyefechvcto(String cIncluyefechvcto) {
		this.cIncluyefechvcto = cIncluyefechvcto;
	}

	public String getcMetodocalculo() {
		return cMetodocalculo;
	}

	public void setcMetodocalculo(String cMetodocalculo) {
		this.cMetodocalculo = cMetodocalculo;
	}

	public String getcNombre() {
		return cNombre;
	}

	public void setcNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getcTipocurva() {
		return cTipocurva;
	}

	public void setcTipocurva(String cTipocurva) {
		this.cTipocurva = cTipocurva;
	}

	public BigDecimal getePromediocantidad() {
		return ePromediocantidad;
	}

	public void setePromediocantidad(BigDecimal ePromediocantidad) {
		this.ePromediocantidad = ePromediocantidad;
	}

	public BigDecimal geteTolerancia1() {
		return eTolerancia1;
	}

	public void seteTolerancia1(BigDecimal eTolerancia1) {
		this.eTolerancia1 = eTolerancia1;
	}

	public BigDecimal geteTolerancia2() {
		return eTolerancia2;
	}

	public void seteTolerancia2(BigDecimal eTolerancia2) {
		this.eTolerancia2 = eTolerancia2;
	}

	public int getiDiasciclo() {
		return iDiasciclo;
	}

	public void setiDiasciclo(int iDiasciclo) {
		this.iDiasciclo = iDiasciclo;
	}

	public int getiMaxdiasatras() {
		return iMaxdiasatras;
	}

	public void setiMaxdiasatras(int iMaxdiasatras) {
		this.iMaxdiasatras = iMaxdiasatras;
	}

	public int getiMaxiteraciones() {
		return iMaxiteraciones;
	}

	public void setiMaxiteraciones(int iMaxiteraciones) {
		this.iMaxiteraciones = iMaxiteraciones;
	}

	public int getiMaxoperaciones() {
		return iMaxoperaciones;
	}

	public void setiMaxoperaciones(int iMaxoperaciones) {
		this.iMaxoperaciones = iMaxoperaciones;
	}

	public int getiMinfecvcto() {
		return iMinfecvcto;
	}

	public void setiMinfecvcto(int iMinfecvcto) {
		this.iMinfecvcto = iMinfecvcto;
	}

	public int getiNdiascorridos() {
		return iNdiascorridos;
	}

	public void setiNdiascorridos(int iNdiascorridos) {
		this.iNdiascorridos = iNdiascorridos;
	}

	public int getiUltimosndias() {
		return iUltimosndias;
	}

	public void setiUltimosndias(int iUltimosndias) {
		this.iUltimosndias = iUltimosndias;
	}

	@Override
	public String toString() {
		return "CurvaCeroCuponDto [cCurcerocupon=" + cCurcerocupon
				+ ", cIncluyefechvcto=" + cIncluyefechvcto
				+ ", cMetodocalculo=" + cMetodocalculo + ", cNombre=" + cNombre
				+ ", cTipocurva=" + cTipocurva + ", ePromediocantidad="
				+ ePromediocantidad + ", eTolerancia1=" + eTolerancia1
				+ ", eTolerancia2=" + eTolerancia2 + ", iDiasciclo="
				+ iDiasciclo + ", iMaxdiasatras=" + iMaxdiasatras
				+ ", iMaxiteraciones=" + iMaxiteraciones + ", iMaxoperaciones="
				+ iMaxoperaciones + ", iMinfecvcto=" + iMinfecvcto
				+ ", iNdiascorridos=" + iNdiascorridos + ", iUltimosndias="
				+ iUltimosndias + "]";
	}

}
