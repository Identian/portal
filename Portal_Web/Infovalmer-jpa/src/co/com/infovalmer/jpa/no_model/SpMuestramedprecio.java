package co.com.infovalmer.jpa.no_model;
//}
import java.io.Serializable;
//import javax.persistence.*;
//import java.math.BigDecimal;
//import java.util.Date;
//
//
///**
// * The persistent class for the sp_muestramedprecio database table.
// * 
// */
//@Entity
//@Table(name="sp_muestramedprecio")
//@NamedQuery(name="SpMuestramedprecio.findAll", query="SELECT s FROM SpMuestramedprecio s")
public class SpMuestramedprecio implements Serializable {
//	private static final long serialVersionUID = 1L;
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
//	@Column(name="c_moneda")
//	private String cMoneda;
//
//	@Column(name="c_nemotecnico")
//	private String cNemotecnico;
//
//	@Column(name="c_reinvesion")
//	private String cReinvesion;
//
//	@Column(name="c_sistnegcion")
//	private String cSistnegcion;
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
//	@Column(name="d_fechaoperacion")
//	private Date dFechaoperacion;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name="d_fechaventit")
//	private Date dFechaventit;
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
//	public SpMuestramedprecio() {
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
//	public String getCReinvesion() {
//		return this.cReinvesion;
//	}
//
//	public void setCReinvesion(String cReinvesion) {
//		this.cReinvesion = cReinvesion;
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
//	public Date getDFechaoperacion() {
//		return this.dFechaoperacion;
//	}
//
//	public void setDFechaoperacion(Date dFechaoperacion) {
//		this.dFechaoperacion = dFechaoperacion;
//	}
//
//	public Date getDFechaventit() {
//		return this.dFechaventit;
//	}
//
//	public void setDFechaventit(Date dFechaventit) {
//		this.dFechaventit = dFechaventit;
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
}