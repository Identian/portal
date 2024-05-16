package co.com.infovalmer.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HcategoriaDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String cClase;
	private String cEstado;
	private String cIsin;
	private String cMoneda;
	private String cNemotecnico;
	private String cPlazo;
	private String cTasa;
	private String cTipomargen;
	private String cTipomargenanterior;
	private String cVigente;
	private String cVigenteanterior;
	private Date dFecha;
	private Date dFechaemision;
	private Date dFechafin;
	private Date dFechafinanterior;
	private Date dFechainicio;
	private Date dFechainicioanterior;
	private Date dFecharegistro;
	private Date dFechavencimiento;
	private BigDecimal eCotacalificamax;
	private BigDecimal eCotaminima;
	private BigDecimal eMargen;
	private BigDecimal eMargenanterior;
	private BigDecimal eTasadescuento;
	private BigDecimal eTasareferencia;
	private BigDecimal eVariacion;
	private int iCodigo;
	private int iDiasvencimiento;
	private int iGrupocalificador;
	private int iGrupomoneda;
	private int iGrupotasa;
	private int iRangovencimiento;

	public HcategoriaDto() {
	}

	public String getCClase() {
		return this.cClase;
	}

	public void setCClase(String cClase) {
		this.cClase = cClase;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getCIsin() {
		return this.cIsin;
	}

	public void setCIsin(String cIsin) {
		this.cIsin = cIsin;
	}

	public String getCMoneda() {
		return this.cMoneda;
	}

	public void setCMoneda(String cMoneda) {
		this.cMoneda = cMoneda;
	}

	public String getCNemotecnico() {
		return this.cNemotecnico;
	}

	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public String getCPlazo() {
		return this.cPlazo;
	}

	public void setCPlazo(String cPlazo) {
		this.cPlazo = cPlazo;
	}

	public String getCTasa() {
		return this.cTasa;
	}

	public void setCTasa(String cTasa) {
		this.cTasa = cTasa;
	}

	public String getCTipomargen() {
		return this.cTipomargen;
	}

	public void setCTipomargen(String cTipomargen) {
		this.cTipomargen = cTipomargen;
	}

	public String getCTipomargenanterior() {
		return this.cTipomargenanterior;
	}

	public void setCTipomargenanterior(String cTipomargenanterior) {
		this.cTipomargenanterior = cTipomargenanterior;
	}

	public String getCVigente() {
		return this.cVigente;
	}

	public void setCVigente(String cVigente) {
		this.cVigente = cVigente;
	}

	public String getCVigenteanterior() {
		return this.cVigenteanterior;
	}

	public void setCVigenteanterior(String cVigenteanterior) {
		this.cVigenteanterior = cVigenteanterior;
	}

	public Date getDFecha() {
		return this.dFecha;
	}

	public void setDFecha(Date dFecha) {
		this.dFecha = dFecha;
	}

	public Date getDFechaemision() {
		return this.dFechaemision;
	}

	public void setDFechaemision(Date dFechaemision) {
		this.dFechaemision = dFechaemision;
	}

	public Date getDFechafin() {
		return this.dFechafin;
	}

	public void setDFechafin(Date dFechafin) {
		this.dFechafin = dFechafin;
	}

	public Date getDFechafinanterior() {
		return this.dFechafinanterior;
	}

	public void setDFechafinanterior(Date dFechafinanterior) {
		this.dFechafinanterior = dFechafinanterior;
	}

	public Date getDFechainicio() {
		return this.dFechainicio;
	}

	public void setDFechainicio(Date dFechainicio) {
		this.dFechainicio = dFechainicio;
	}

	public Date getDFechainicioanterior() {
		return this.dFechainicioanterior;
	}

	public void setDFechainicioanterior(Date dFechainicioanterior) {
		this.dFechainicioanterior = dFechainicioanterior;
	}

	public Date getDFecharegistro() {
		return this.dFecharegistro;
	}

	public void setDFecharegistro(Date dFecharegistro) {
		this.dFecharegistro = dFecharegistro;
	}

	public Date getDFechavencimiento() {
		return this.dFechavencimiento;
	}

	public void setDFechavencimiento(Date dFechavencimiento) {
		this.dFechavencimiento = dFechavencimiento;
	}

	public BigDecimal getECotacalificamax() {
		return this.eCotacalificamax;
	}

	public void setECotacalificamax(BigDecimal eCotacalificamax) {
		this.eCotacalificamax = eCotacalificamax;
	}

	public BigDecimal getECotaminima() {
		return this.eCotaminima;
	}

	public void setECotaminima(BigDecimal eCotaminima) {
		this.eCotaminima = eCotaminima;
	}

	public BigDecimal getEMargen() {
		return this.eMargen;
	}

	public void setEMargen(BigDecimal eMargen) {
		this.eMargen = eMargen;
	}

	public BigDecimal getEMargenanterior() {
		return this.eMargenanterior;
	}

	public void setEMargenanterior(BigDecimal eMargenanterior) {
		this.eMargenanterior = eMargenanterior;
	}

	public BigDecimal getETasadescuento() {
		return this.eTasadescuento;
	}

	public void setETasadescuento(BigDecimal eTasadescuento) {
		this.eTasadescuento = eTasadescuento;
	}

	public BigDecimal getETasareferencia() {
		return this.eTasareferencia;
	}

	public void setETasareferencia(BigDecimal eTasareferencia) {
		this.eTasareferencia = eTasareferencia;
	}

	public BigDecimal getEVariacion() {
		return this.eVariacion;
	}

	public void setEVariacion(BigDecimal eVariacion) {
		this.eVariacion = eVariacion;
	}

	public int getICodigo() {
		return this.iCodigo;
	}

	public void setICodigo(int iCodigo) {
		this.iCodigo = iCodigo;
	}

	public int getIDiasvencimiento() {
		return this.iDiasvencimiento;
	}

	public void setIDiasvencimiento(int iDiasvencimiento) {
		this.iDiasvencimiento = iDiasvencimiento;
	}

	public int getIGrupocalificador() {
		return this.iGrupocalificador;
	}

	public void setIGrupocalificador(int iGrupocalificador) {
		this.iGrupocalificador = iGrupocalificador;
	}

	public int getIGrupomoneda() {
		return this.iGrupomoneda;
	}

	public void setIGrupomoneda(int iGrupomoneda) {
		this.iGrupomoneda = iGrupomoneda;
	}

	public int getIGrupotasa() {
		return this.iGrupotasa;
	}

	public void setIGrupotasa(int iGrupotasa) {
		this.iGrupotasa = iGrupotasa;
	}

	public int getIRangovencimiento() {
		return this.iRangovencimiento;
	}

	public void setIRangovencimiento(int iRangovencimiento) {
		this.iRangovencimiento = iRangovencimiento;
	}
}
