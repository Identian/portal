package co.com.infovalmer.jpa.no_model;
//
import java.io.Serializable;
//import javax.persistence.*;
//import java.math.BigDecimal;
//import java.util.Date;
//
//
///**
// * The persistent class for the sp_hcategoria_c database table.
// * 
// */
//@Entity
//@Table(name="sp_hcategoria_c")
//@NamedQuery(name="SpHcategoriaC.findAll", query="SELECT s FROM SpHcategoriaC s")
public class SpHcategoriaC implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Column(name="c_clase")
//	private String cClase;
//
//	@Column(name="c_estado")
//	private String cEstado;
//
//	@Column(name="c_isin")
//	private String cIsin;
//
//	@Column(name="c_nemotecnico")
//	private String cNemotecnico;
//
//	@Column(name="c_numemision")
//	private String cNumemision;
//
//	@Column(name="c_plazo")
//	private String cPlazo;
//
//	@Column(name="c_tasa")
//	private String cTasa;
//
//	@Column(name="c_tipomargen")
//	private String cTipomargen;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name="d_fecha")
//	private Date dFecha;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name="d_fechaemision")
//	private Date dFechaemision;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name="d_fecharegistro")
//	private Date dFecharegistro;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name="d_fechavencimiento")
//	private Date dFechavencimiento;
//
//	@Column(name="e_margen")
//	private BigDecimal eMargen;
//
//	@Column(name="i_codigo")
//	private int iCodigo;
//
//	@Column(name="i_diasvencimiento")
//	private int iDiasvencimiento;
//
//	@Column(name="i_grupocalificador")
//	private int iGrupocalificador;
//
//	@Column(name="i_grupomoneda")
//	private int iGrupomoneda;
//
//	@Column(name="i_grupotasa")
//	private int iGrupotasa;
//
//	@Column(name="i_rangovencimiento")
//	private int iRangovencimiento;
//
//	public SpHcategoriaC() {
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
//	public String getCNemotecnico() {
//		return this.cNemotecnico;
//	}
//
//	public void setCNemotecnico(String cNemotecnico) {
//		this.cNemotecnico = cNemotecnico;
//	}
//
//	public String getCNumemision() {
//		return this.cNumemision;
//	}
//
//	public void setCNumemision(String cNumemision) {
//		this.cNumemision = cNumemision;
//	}
//
//	public String getCPlazo() {
//		return this.cPlazo;
//	}
//
//	public void setCPlazo(String cPlazo) {
//		this.cPlazo = cPlazo;
//	}
//
//	public String getCTasa() {
//		return this.cTasa;
//	}
//
//	public void setCTasa(String cTasa) {
//		this.cTasa = cTasa;
//	}
//
//	public String getCTipomargen() {
//		return this.cTipomargen;
//	}
//
//	public void setCTipomargen(String cTipomargen) {
//		this.cTipomargen = cTipomargen;
//	}
//
//	public Date getDFecha() {
//		return this.dFecha;
//	}
//
//	public void setDFecha(Date dFecha) {
//		this.dFecha = dFecha;
//	}
//
//	public Date getDFechaemision() {
//		return this.dFechaemision;
//	}
//
//	public void setDFechaemision(Date dFechaemision) {
//		this.dFechaemision = dFechaemision;
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
//	public Date getDFechavencimiento() {
//		return this.dFechavencimiento;
//	}
//
//	public void setDFechavencimiento(Date dFechavencimiento) {
//		this.dFechavencimiento = dFechavencimiento;
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
//	public int getICodigo() {
//		return this.iCodigo;
//	}
//
//	public void setICodigo(int iCodigo) {
//		this.iCodigo = iCodigo;
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
//	public int getIGrupocalificador() {
//		return this.iGrupocalificador;
//	}
//
//	public void setIGrupocalificador(int iGrupocalificador) {
//		this.iGrupocalificador = iGrupocalificador;
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
//	public int getIRangovencimiento() {
//		return this.iRangovencimiento;
//	}
//
//	public void setIRangovencimiento(int iRangovencimiento) {
//		this.iRangovencimiento = iRangovencimiento;
//	}
//
}