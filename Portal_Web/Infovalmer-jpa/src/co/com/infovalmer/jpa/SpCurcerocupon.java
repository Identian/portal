package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sp_curcerocupon database table.
 * 
 */
@Entity
@Table(name="sp_curcerocupon")
@NamedQuery(name="SpCurcerocupon.findAll", query="SELECT s FROM SpCurcerocupon s")
public class SpCurcerocupon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_curcerocupon")
	private String cCurcerocupon;

	@Column(name="c_incluyefechvcto")
	private String cIncluyefechvcto;

	@Column(name="c_metodocalculo")
	private String cMetodocalculo;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_tipocurva")
	private String cTipocurva;

	@Column(name="e_promediocantidad")
	private BigDecimal ePromediocantidad;

	@Column(name="e_tolerancia1")
	private BigDecimal eTolerancia1;

	@Column(name="e_tolerancia2")
	private BigDecimal eTolerancia2;

	@Column(name="i_diasciclo")
	private int iDiasciclo;

	@Column(name="i_maxdiasatras")
	private int iMaxdiasatras;

	@Column(name="i_maxiteraciones")
	private int iMaxiteraciones;

	@Column(name="i_maxoperaciones")
	private int iMaxoperaciones;

	@Column(name="i_minfecvcto")
	private int iMinfecvcto;

	@Column(name="i_ndiascorridos")
	private int iNdiascorridos;

	@Column(name="i_ultimosndias")
	private int iUltimosndias;

	public SpCurcerocupon() {
	}

	public String getCCurcerocupon() {
		return this.cCurcerocupon;
	}

	public void setCCurcerocupon(String cCurcerocupon) {
		this.cCurcerocupon = cCurcerocupon;
	}

	public String getCIncluyefechvcto() {
		return this.cIncluyefechvcto;
	}

	public void setCIncluyefechvcto(String cIncluyefechvcto) {
		this.cIncluyefechvcto = cIncluyefechvcto;
	}

	public String getCMetodocalculo() {
		return this.cMetodocalculo;
	}

	public void setCMetodocalculo(String cMetodocalculo) {
		this.cMetodocalculo = cMetodocalculo;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getCTipocurva() {
		return this.cTipocurva;
	}

	public void setCTipocurva(String cTipocurva) {
		this.cTipocurva = cTipocurva;
	}

	public BigDecimal getEPromediocantidad() {
		return this.ePromediocantidad;
	}

	public void setEPromediocantidad(BigDecimal ePromediocantidad) {
		this.ePromediocantidad = ePromediocantidad;
	}

	public BigDecimal getETolerancia1() {
		return this.eTolerancia1;
	}

	public void setETolerancia1(BigDecimal eTolerancia1) {
		this.eTolerancia1 = eTolerancia1;
	}

	public BigDecimal getETolerancia2() {
		return this.eTolerancia2;
	}

	public void setETolerancia2(BigDecimal eTolerancia2) {
		this.eTolerancia2 = eTolerancia2;
	}

	public int getIDiasciclo() {
		return this.iDiasciclo;
	}

	public void setIDiasciclo(int iDiasciclo) {
		this.iDiasciclo = iDiasciclo;
	}

	public int getIMaxdiasatras() {
		return this.iMaxdiasatras;
	}

	public void setIMaxdiasatras(int iMaxdiasatras) {
		this.iMaxdiasatras = iMaxdiasatras;
	}

	public int getIMaxiteraciones() {
		return this.iMaxiteraciones;
	}

	public void setIMaxiteraciones(int iMaxiteraciones) {
		this.iMaxiteraciones = iMaxiteraciones;
	}

	public int getIMaxoperaciones() {
		return this.iMaxoperaciones;
	}

	public void setIMaxoperaciones(int iMaxoperaciones) {
		this.iMaxoperaciones = iMaxoperaciones;
	}

	public int getIMinfecvcto() {
		return this.iMinfecvcto;
	}

	public void setIMinfecvcto(int iMinfecvcto) {
		this.iMinfecvcto = iMinfecvcto;
	}

	public int getINdiascorridos() {
		return this.iNdiascorridos;
	}

	public void setINdiascorridos(int iNdiascorridos) {
		this.iNdiascorridos = iNdiascorridos;
	}

	public int getIUltimosndias() {
		return this.iUltimosndias;
	}

	public void setIUltimosndias(int iUltimosndias) {
		this.iUltimosndias = iUltimosndias;
	}

}