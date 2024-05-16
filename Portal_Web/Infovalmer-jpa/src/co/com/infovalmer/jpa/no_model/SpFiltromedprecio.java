package co.com.infovalmer.jpa.no_model;
//
import java.io.Serializable;
//import javax.persistence.*;
//import java.math.BigDecimal;
//import java.util.Date;
//
//
///**
// * The persistent class for the sp_filtromedprecio database table.
// * 
// */
//@Entity
//@Table(name="sp_filtromedprecio")
//@NamedQuery(name="SpFiltromedprecio.findAll", query="SELECT s FROM SpFiltromedprecio s")
public class SpFiltromedprecio implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Column(name="c_accionseguida")
//	private String cAccionseguida;
//
//	@Column(name="c_clase")
//	private String cClase;
//
//	@Column(name="c_indicador")
//	private String cIndicador;
//
//	@Column(name="c_modalidad")
//	private String cModalidad;
//
//	@Column(name="c_moneda")
//	private String cMoneda;
//
//	@Column(name="c_nemotecnico")
//	private String cNemotecnico;
//
//	@Column(name="c_reinversion")
//	private String cReinversion;
//
//	@Column(name="c_tipo")
//	private String cTipo;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name="d_fechaemistit")
//	private Date dFechaemistit;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name="d_fechafiltro")
//	private Date dFechafiltro;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name="d_fechavencimiento")
//	private Date dFechavencimiento;
//
//	@Column(name="e_desvestandar")
//	private BigDecimal eDesvestandar;
//
//	@Column(name="e_limiteinferior")
//	private BigDecimal eLimiteinferior;
//
//	@Column(name="e_limitesuperior")
//	private BigDecimal eLimitesuperior;
//
//	@Column(name="e_medponderada")
//	private BigDecimal eMedponderada;
//
//	@Column(name="e_nivelconfianza")
//	private BigDecimal eNivelconfianza;
//
//	@Column(name="e_sumacantidad")
//	private BigDecimal eSumacantidad;
//
//	@Column(name="e_sumaprecio")
//	private BigDecimal eSumaprecio;
//
//	@Column(name="i_cantoperaciones")
//	private int iCantoperaciones;
//
//	@Column(name="i_codigofiltro")
//	private int iCodigofiltro;
//
//	@Column(name="i_diasalvencimiento")
//	private int iDiasalvencimiento;
//
//	@Column(name="i_diasatras")
//	private int iDiasatras;
//
//	@Column(name="i_diasatrasreal")
//	private int iDiasatrasreal;
//
//	@Column(name="i_marcaciones")
//	private int iMarcaciones;
//
//	@Column(name="i_minimooperaciones")
//	private int iMinimooperaciones;
//
//	@Column(name="i_operadia")
//	private int iOperadia;
//
//	@Column(name="i_operaexclude")
//	private int iOperaexclude;
//
//	public SpFiltromedprecio() {
//	}
//
//	public String getCAccionseguida() {
//		return this.cAccionseguida;
//	}
//
//	public void setCAccionseguida(String cAccionseguida) {
//		this.cAccionseguida = cAccionseguida;
//	}
//
//	public String getCClase() {
//		return this.cClase;
//	}
//
//	public void setCClase(String cClase) {
//		this.cClase = cClase;
//	}
//
//	public String getCIndicador() {
//		return this.cIndicador;
//	}
//
//	public void setCIndicador(String cIndicador) {
//		this.cIndicador = cIndicador;
//	}
//
//	public String getCModalidad() {
//		return this.cModalidad;
//	}
//
//	public void setCModalidad(String cModalidad) {
//		this.cModalidad = cModalidad;
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
//	public String getCReinversion() {
//		return this.cReinversion;
//	}
//
//	public void setCReinversion(String cReinversion) {
//		this.cReinversion = cReinversion;
//	}
//
//	public String getCTipo() {
//		return this.cTipo;
//	}
//
//	public void setCTipo(String cTipo) {
//		this.cTipo = cTipo;
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
//	public Date getDFechafiltro() {
//		return this.dFechafiltro;
//	}
//
//	public void setDFechafiltro(Date dFechafiltro) {
//		this.dFechafiltro = dFechafiltro;
//	}
//
//	public Date getDFechavencimiento() {
//		return this.dFechavencimiento;
//	}
//
//	public void setDFechavencimiento(Date dFechavencimiento) {
//		this.dFechavencimiento = dFechavencimiento;
//	}
//
//	public BigDecimal getEDesvestandar() {
//		return this.eDesvestandar;
//	}
//
//	public void setEDesvestandar(BigDecimal eDesvestandar) {
//		this.eDesvestandar = eDesvestandar;
//	}
//
//	public BigDecimal getELimiteinferior() {
//		return this.eLimiteinferior;
//	}
//
//	public void setELimiteinferior(BigDecimal eLimiteinferior) {
//		this.eLimiteinferior = eLimiteinferior;
//	}
//
//	public BigDecimal getELimitesuperior() {
//		return this.eLimitesuperior;
//	}
//
//	public void setELimitesuperior(BigDecimal eLimitesuperior) {
//		this.eLimitesuperior = eLimitesuperior;
//	}
//
//	public BigDecimal getEMedponderada() {
//		return this.eMedponderada;
//	}
//
//	public void setEMedponderada(BigDecimal eMedponderada) {
//		this.eMedponderada = eMedponderada;
//	}
//
//	public BigDecimal getENivelconfianza() {
//		return this.eNivelconfianza;
//	}
//
//	public void setENivelconfianza(BigDecimal eNivelconfianza) {
//		this.eNivelconfianza = eNivelconfianza;
//	}
//
//	public BigDecimal getESumacantidad() {
//		return this.eSumacantidad;
//	}
//
//	public void setESumacantidad(BigDecimal eSumacantidad) {
//		this.eSumacantidad = eSumacantidad;
//	}
//
//	public BigDecimal getESumaprecio() {
//		return this.eSumaprecio;
//	}
//
//	public void setESumaprecio(BigDecimal eSumaprecio) {
//		this.eSumaprecio = eSumaprecio;
//	}
//
//	public int getICantoperaciones() {
//		return this.iCantoperaciones;
//	}
//
//	public void setICantoperaciones(int iCantoperaciones) {
//		this.iCantoperaciones = iCantoperaciones;
//	}
//
//	public int getICodigofiltro() {
//		return this.iCodigofiltro;
//	}
//
//	public void setICodigofiltro(int iCodigofiltro) {
//		this.iCodigofiltro = iCodigofiltro;
//	}
//
//	public int getIDiasalvencimiento() {
//		return this.iDiasalvencimiento;
//	}
//
//	public void setIDiasalvencimiento(int iDiasalvencimiento) {
//		this.iDiasalvencimiento = iDiasalvencimiento;
//	}
//
//	public int getIDiasatras() {
//		return this.iDiasatras;
//	}
//
//	public void setIDiasatras(int iDiasatras) {
//		this.iDiasatras = iDiasatras;
//	}
//
//	public int getIDiasatrasreal() {
//		return this.iDiasatrasreal;
//	}
//
//	public void setIDiasatrasreal(int iDiasatrasreal) {
//		this.iDiasatrasreal = iDiasatrasreal;
//	}
//
//	public int getIMarcaciones() {
//		return this.iMarcaciones;
//	}
//
//	public void setIMarcaciones(int iMarcaciones) {
//		this.iMarcaciones = iMarcaciones;
//	}
//
//	public int getIMinimooperaciones() {
//		return this.iMinimooperaciones;
//	}
//
//	public void setIMinimooperaciones(int iMinimooperaciones) {
//		this.iMinimooperaciones = iMinimooperaciones;
//	}
//
//	public int getIOperadia() {
//		return this.iOperadia;
//	}
//
//	public void setIOperadia(int iOperadia) {
//		this.iOperadia = iOperadia;
//	}
//
//	public int getIOperaexclude() {
//		return this.iOperaexclude;
//	}
//
//	public void setIOperaexclude(int iOperaexclude) {
//		this.iOperaexclude = iOperaexclude;
//	}
//
}