package co.com.infovalmer.jpa.no_model;
//
import java.io.Serializable;
//import javax.persistence.*;
//import java.math.BigDecimal;
//import java.util.Date;
//
//
///**
// * The persistent class for the sp_muestmedmargen database table.
// * 
// */
//@Entity
//@Table(name="sp_muestmedmargen")
//@NamedQuery(name="SpMuestmedmargen.findAll", query="SELECT s FROM SpMuestmedmargen s")
public class SpMuestmedmargen implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Column(name="c_clase")
//	private String cClase;
//
//	@Column(name="c_excluida")
//	private String cExcluida;
//
//	@Column(name="c_indicador")
//	private String cIndicador;
//
//	@Column(name="c_modalidad")
//	private String cModalidad;
//
//	@Column(name="c_nemotecnico")
//	private String cNemotecnico;
//
//	@Column(name="c_reinversion")
//	private String cReinversion;
//
//	@Column(name="c_sistnegcion")
//	private String cSistnegcion;
//
//	@Column(name="c_tipo")
//	private String cTipo;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name="d_fechafiltro")
//	private Date dFechafiltro;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name="d_fechaoperacion")
//	private Date dFechaoperacion;
//
//	@Column(name="e_cantidad")
//	private BigDecimal eCantidad;
//
//	@Column(name="e_margen")
//	private BigDecimal eMargen;
//
//	@Column(name="e_porcentaje")
//	private BigDecimal ePorcentaje;
//
//	@Column(name="e_porcentajeacum")
//	private BigDecimal ePorcentajeacum;
//
//	@Column(name="e_preciototal")
//	private BigDecimal ePreciototal;
//
//	@Column(name="e_rentabilidad")
//	private BigDecimal eRentabilidad;
//
//	@Column(name="e_tasacupon")
//	private BigDecimal eTasacupon;
//
//	@Column(name="i_codigofiltro")
//	private int iCodigofiltro;
//
//	@Column(name="i_diasalvenciento")
//	private int iDiasalvenciento;
//
//	@Column(name="i_folio")
//	private int iFolio;
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
//	@Column(name="i_rangvencimi")
//	private int iRangvencimi;
//
//	public SpMuestmedmargen() {
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
//	public String getCExcluida() {
//		return this.cExcluida;
//	}
//
//	public void setCExcluida(String cExcluida) {
//		this.cExcluida = cExcluida;
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
//	public String getCSistnegcion() {
//		return this.cSistnegcion;
//	}
//
//	public void setCSistnegcion(String cSistnegcion) {
//		this.cSistnegcion = cSistnegcion;
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
//	public Date getDFechaoperacion() {
//		return this.dFechaoperacion;
//	}
//
//	public void setDFechaoperacion(Date dFechaoperacion) {
//		this.dFechaoperacion = dFechaoperacion;
//	}
//
//	public BigDecimal getECantidad() {
//		return this.eCantidad;
//	}
//
//	public void setECantidad(BigDecimal eCantidad) {
//		this.eCantidad = eCantidad;
//	}
//
//	public BigDecimal getEMargen() {
//		return this.eMargen;
//	}
//
//	public void setEMargen(BigDecimal eMargen) {
//		this.eMargen = eMargen;
//	}
//
//	public BigDecimal getEPorcentaje() {
//		return this.ePorcentaje;
//	}
//
//	public void setEPorcentaje(BigDecimal ePorcentaje) {
//		this.ePorcentaje = ePorcentaje;
//	}
//
//	public BigDecimal getEPorcentajeacum() {
//		return this.ePorcentajeacum;
//	}
//
//	public void setEPorcentajeacum(BigDecimal ePorcentajeacum) {
//		this.ePorcentajeacum = ePorcentajeacum;
//	}
//
//	public BigDecimal getEPreciototal() {
//		return this.ePreciototal;
//	}
//
//	public void setEPreciototal(BigDecimal ePreciototal) {
//		this.ePreciototal = ePreciototal;
//	}
//
//	public BigDecimal getERentabilidad() {
//		return this.eRentabilidad;
//	}
//
//	public void setERentabilidad(BigDecimal eRentabilidad) {
//		this.eRentabilidad = eRentabilidad;
//	}
//
//	public BigDecimal getETasacupon() {
//		return this.eTasacupon;
//	}
//
//	public void setETasacupon(BigDecimal eTasacupon) {
//		this.eTasacupon = eTasacupon;
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
//	public int getIDiasalvenciento() {
//		return this.iDiasalvenciento;
//	}
//
//	public void setIDiasalvenciento(int iDiasalvenciento) {
//		this.iDiasalvenciento = iDiasalvenciento;
//	}
//
//	public int getIFolio() {
//		return this.iFolio;
//	}
//
//	public void setIFolio(int iFolio) {
//		this.iFolio = iFolio;
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
//	public int getIRangvencimi() {
//		return this.iRangvencimi;
//	}
//
//	public void setIRangvencimi(int iRangvencimi) {
//		this.iRangvencimi = iRangvencimi;
//	}
//
}