package co.com.infovalmer.jpa.no_model;
//
import java.io.Serializable;
//import javax.persistence.*;
//import java.math.BigDecimal;
//import java.util.Date;
//
//
///**
// * The persistent class for the sp_precioprodio_original database table.
// * 
// */
//@Entity
//@Table(name="sp_precioprodio_original")
//@NamedQuery(name="SpPrecioprodioOriginal.findAll", query="SELECT s FROM SpPrecioprodioOriginal s")
public class SpPrecioprodioOriginal implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Column(name="c_estado")
//	private String cEstado;
//
//	@Column(name="c_isin")
//	private String cIsin;
//
//	@Column(name="c_moneda")
//	private String cMoneda;
//
//	@Column(name="c_nemotecnico")
//	private String cNemotecnico;
//
//	@Column(name="c_periodmodali")
//	private String cPeriodmodali;
//
//	@Column(name="c_tipotasa")
//	private String cTipotasa;
//
//	@Column(name="c_tipotasaref")
//	private String cTipotasaref;
//
//	@Column(name="c_vigente")
//	private String cVigente;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name="d_fechaemistit")
//	private Date dFechaemistit;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name="d_fechafin")
//	private Date dFechafin;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name="d_fechainicio")
//	private Date dFechainicio;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name="d_fecharegistro")
//	private Date dFecharegistro;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name="d_fechavenctit")
//	private Date dFechavenctit;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name="d_fecultmprecio")
//	private Date dFecultmprecio;
//
//	@Column(name="e_numemision")
//	private BigDecimal eNumemision;
//
//	@Column(name="e_precioanterior")
//	private BigDecimal ePrecioanterior;
//
//	@Column(name="e_preciolimpio")
//	private BigDecimal ePreciolimpio;
//
//	@Column(name="e_preciopromedio")
//	private BigDecimal ePreciopromedio;
//
//	@Column(name="e_spread")
//	private BigDecimal eSpread;
//
//	@Column(name="e_ultmprecio")
//	private BigDecimal eUltmprecio;
//
//	@Column(name="e_variacion")
//	private BigDecimal eVariacion;
//
//	@Column(name="i_basecalculo")
//	private byte iBasecalculo;
//
//	@Column(name="i_diasvencimiento")
//	private int iDiasvencimiento;
//
//	@Column(name="i_tipocalculo")
//	private byte iTipocalculo;
//
//	public SpPrecioprodioOriginal() {
//	}
//
//	public String getCEstado() {
//		return this.cEstado;
//	}
//
//	public void setCEstado(String cEstado) {
//		this.cEstado = cEstado;
//	}
//
//	public String getCIsin() {
//		return this.cIsin;
//	}
//
//	public void setCIsin(String cIsin) {
//		this.cIsin = cIsin;
//	}
//
//	public String getCMoneda() {
//		return this.cMoneda;
//	}
//
//	public void setCMoneda(String cMoneda) {
//		this.cMoneda = cMoneda;
//	}
//
//	public String getCNemotecnico() {
//		return this.cNemotecnico;
//	}
//
//	public void setCNemotecnico(String cNemotecnico) {
//		this.cNemotecnico = cNemotecnico;
//	}
//
//	public String getCPeriodmodali() {
//		return this.cPeriodmodali;
//	}
//
//	public void setCPeriodmodali(String cPeriodmodali) {
//		this.cPeriodmodali = cPeriodmodali;
//	}
//
//	public String getCTipotasa() {
//		return this.cTipotasa;
//	}
//
//	public void setCTipotasa(String cTipotasa) {
//		this.cTipotasa = cTipotasa;
//	}
//
//	public String getCTipotasaref() {
//		return this.cTipotasaref;
//	}
//
//	public void setCTipotasaref(String cTipotasaref) {
//		this.cTipotasaref = cTipotasaref;
//	}
//
//	public String getCVigente() {
//		return this.cVigente;
//	}
//
//	public void setCVigente(String cVigente) {
//		this.cVigente = cVigente;
//	}
//
//	public Date getDFechaemistit() {
//		return this.dFechaemistit;
//	}
//
//	public void setDFechaemistit(Date dFechaemistit) {
//		this.dFechaemistit = dFechaemistit;
//	}
//
//	public Date getDFechafin() {
//		return this.dFechafin;
//	}
//
//	public void setDFechafin(Date dFechafin) {
//		this.dFechafin = dFechafin;
//	}
//
//	public Date getDFechainicio() {
//		return this.dFechainicio;
//	}
//
//	public void setDFechainicio(Date dFechainicio) {
//		this.dFechainicio = dFechainicio;
//	}
//
//	public Date getDFecharegistro() {
//		return this.dFecharegistro;
//	}
//
//	public void setDFecharegistro(Date dFecharegistro) {
//		this.dFecharegistro = dFecharegistro;
//	}
//
//	public Date getDFechavenctit() {
//		return this.dFechavenctit;
//	}
//
//	public void setDFechavenctit(Date dFechavenctit) {
//		this.dFechavenctit = dFechavenctit;
//	}
//
//	public Date getDFecultmprecio() {
//		return this.dFecultmprecio;
//	}
//
//	public void setDFecultmprecio(Date dFecultmprecio) {
//		this.dFecultmprecio = dFecultmprecio;
//	}
//
//	public BigDecimal getENumemision() {
//		return this.eNumemision;
//	}
//
//	public void setENumemision(BigDecimal eNumemision) {
//		this.eNumemision = eNumemision;
//	}
//
//	public BigDecimal getEPrecioanterior() {
//		return this.ePrecioanterior;
//	}
//
//	public void setEPrecioanterior(BigDecimal ePrecioanterior) {
//		this.ePrecioanterior = ePrecioanterior;
//	}
//
//	public BigDecimal getEPreciolimpio() {
//		return this.ePreciolimpio;
//	}
//
//	public void setEPreciolimpio(BigDecimal ePreciolimpio) {
//		this.ePreciolimpio = ePreciolimpio;
//	}
//
//	public BigDecimal getEPreciopromedio() {
//		return this.ePreciopromedio;
//	}
//
//	public void setEPreciopromedio(BigDecimal ePreciopromedio) {
//		this.ePreciopromedio = ePreciopromedio;
//	}
//
//	public BigDecimal getESpread() {
//		return this.eSpread;
//	}
//
//	public void setESpread(BigDecimal eSpread) {
//		this.eSpread = eSpread;
//	}
//
//	public BigDecimal getEUltmprecio() {
//		return this.eUltmprecio;
//	}
//
//	public void setEUltmprecio(BigDecimal eUltmprecio) {
//		this.eUltmprecio = eUltmprecio;
//	}
//
//	public BigDecimal getEVariacion() {
//		return this.eVariacion;
//	}
//
//	public void setEVariacion(BigDecimal eVariacion) {
//		this.eVariacion = eVariacion;
//	}
//
//	public byte getIBasecalculo() {
//		return this.iBasecalculo;
//	}
//
//	public void setIBasecalculo(byte iBasecalculo) {
//		this.iBasecalculo = iBasecalculo;
//	}
//
//	public int getIDiasvencimiento() {
//		return this.iDiasvencimiento;
//	}
//
//	public void setIDiasvencimiento(int iDiasvencimiento) {
//		this.iDiasvencimiento = iDiasvencimiento;
//	}
//
//	public byte getITipocalculo() {
//		return this.iTipocalculo;
//	}
//
//	public void setITipocalculo(byte iTipocalculo) {
//		this.iTipocalculo = iTipocalculo;
//	}
//
}