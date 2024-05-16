package co.com.infovalmer.jpa.no_model;
//
import java.io.Serializable;
//import javax.persistence.*;
//import java.math.BigDecimal;
//import java.util.Date;
//
//
///**
// * The persistent class for the sp_filtromedmargen database table.
// * 
// */
//@Entity
//@Table(name="sp_filtromedmargen")
//@NamedQuery(name="SpFiltromedmargen.findAll", query="SELECT s FROM SpFiltromedmargen s")
public class SpFiltromedmargen implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Column(name="c_clase")
//	private String cClase;
//
//	@Column(name="c_tipo")
//	private String cTipo;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name="d_fechafiltro")
//	private Date dFechafiltro;
//
//	@Column(name="e_desvestandar")
//	private BigDecimal eDesvestandar;
//
//	@Column(name="e_desvminima")
//	private BigDecimal eDesvminima;
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
//	@Column(name="i_accionseguida")
//	private int iAccionseguida;
//
//	@Column(name="i_cantoperaciones")
//	private int iCantoperaciones;
//
//	@Column(name="i_codigofiltro")
//	private int iCodigofiltro;
//
//	@Column(name="i_diasaatras")
//	private int iDiasaatras;
//
//	@Column(name="i_diasaatrasreal")
//	private int iDiasaatrasreal;
//
//	@Column(name="i_grucalificacion")
//	private int iGrucalificacion;
//
//	@Column(name="i_grupomoneda")
//	private int iGrupomoneda;
//
//	@Column(name="i_grupotasa")
//	private int iGrupotasa;
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
//	@Column(name="i_rangvencimi")
//	private int iRangvencimi;
//
//	public SpFiltromedmargen() {
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
//	public String getCTipo() {
//		return this.cTipo;
//	}
//
//	public void setCTipo(String cTipo) {
//		this.cTipo = cTipo;
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
//	public BigDecimal getEDesvestandar() {
//		return this.eDesvestandar;
//	}
//
//	public void setEDesvestandar(BigDecimal eDesvestandar) {
//		this.eDesvestandar = eDesvestandar;
//	}
//
//	public BigDecimal getEDesvminima() {
//		return this.eDesvminima;
//	}
//
//	public void setEDesvminima(BigDecimal eDesvminima) {
//		this.eDesvminima = eDesvminima;
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
//	public int getIAccionseguida() {
//		return this.iAccionseguida;
//	}
//
//	public void setIAccionseguida(int iAccionseguida) {
//		this.iAccionseguida = iAccionseguida;
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
//	public int getIDiasaatras() {
//		return this.iDiasaatras;
//	}
//
//	public void setIDiasaatras(int iDiasaatras) {
//		this.iDiasaatras = iDiasaatras;
//	}
//
//	public int getIDiasaatrasreal() {
//		return this.iDiasaatrasreal;
//	}
//
//	public void setIDiasaatrasreal(int iDiasaatrasreal) {
//		this.iDiasaatrasreal = iDiasaatrasreal;
//	}
//
//	public int getIGrucalificacion() {
//		return this.iGrucalificacion;
//	}
//
//	public void setIGrucalificacion(int iGrucalificacion) {
//		this.iGrucalificacion = iGrucalificacion;
//	}
//
//	public int getIGrupomoneda() {
//		return this.iGrupomoneda;
//	}
//
//	public void setIGrupomoneda(int iGrupomoneda) {
//		this.iGrupomoneda = iGrupomoneda;
//	}
//
//	public int getIGrupotasa() {
//		return this.iGrupotasa;
//	}
//
//	public void setIGrupotasa(int iGrupotasa) {
//		this.iGrupotasa = iGrupotasa;
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
//	public int getIRangvencimi() {
//		return this.iRangvencimi;
//	}
//
//	public void setIRangvencimi(int iRangvencimi) {
//		this.iRangvencimi = iRangvencimi;
//	}
//
}