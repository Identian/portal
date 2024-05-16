package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sp_titulo database table.
 * 
 */
@Entity
@Table(name="sp_titulo")
@NamedQuery(name="SpTitulo.findAll", query="SELECT s FROM SpTitulo s")
public class SpTitulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Column(name="c_admini")
	private String cAdmini;

	@Column(name="c_aval")
	private String cAval;

	@Column(name="c_baseint")
	private String cBaseint;

	@Column(name="c_bcalificador")
	private String cBcalificador;

	@Column(name="c_caja")
	private String cCaja;

	@Column(name="c_clase")
	private String cClase;

	@Column(name="c_codigo")
	private String cCodigo;

	@Column(name="c_codigosuper")
	private String cCodigosuper;

	@Column(name="c_codisin1")
	private String cCodisin1;

	@Column(name="c_codisin2")
	private String cCodisin2;

	@Column(name="c_codisin3")
	private String cCodisin3;

	@Column(name="c_curvacerocupon")
	private String cCurvacerocupon;

	@Column(name="c_dia1flujo")
	private String cDia1flujo;

	@Column(name="c_emision")
	private String cEmision;

	@Column(name="c_emisor")
	private String cEmisor;

	@Column(name="c_enirbb")
	private String cEnirbb;

	@Column(name="c_enixtit")
	private String cEnixtit;

	@Column(name="c_estado")
	private String cEstado;

	@Column(name="c_expedicion")
	private String cExpedicion;

	@Column(name="c_flagreinv")
	private String cFlagreinv;

	@Column(name="c_mercado")
	private String cMercado;

	@Column(name="c_metodovalgarantia")
	private String cMetodovalgarantia;

	@Column(name="c_metodovaloriza")
	private String cMetodovaloriza;

	@Column(name="c_modalidad")
	private String cModalidad;

	@Column(name="c_nemocompleto")
	private String cNemocompleto;

	@Column(name="c_nemotecnico2")
	private String cNemotecnico2;

	@Column(name="c_periodicidad")
	private String cPeriodicidad;

	@Column(name="c_plazo")
	private String cPlazo;

	@Column(name="c_reinv")
	private String cReinv;

	@Column(name="c_riesgo")
	private String cRiesgo;

	@Column(name="c_serie")
	private String cSerie;

	@Column(name="c_sistema")
	private String cSistema;

	@Column(name="c_sneg")
	private String cSneg;

	@Column(name="c_tabladesarrollo")
	private String cTabladesarrollo;

	@Column(name="c_tasareferencia")
	private String cTasareferencia;

	@Column(name="c_tipomoneda")
	private String cTipomoneda;

	@Column(name="c_tipotasa")
	private String cTipotasa;

	@Column(name="c_tipotitulo")
	private String cTipotitulo;

	@Column(name="c_tiptitulo")
	private String cTiptitulo;

	@Column(name="c_tipvaloracion")
	private String cTipvaloracion;

	@Column(name="c_usotasa")
	private String cUsotasa;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechacolmax")
	private Date dFechacolmax;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaemision")
	private Date dFechaemision;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechainscripcion")
	private Date dFechainscripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechavencimiento")
	private Date dFechavencimiento;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecmaxreinv")
	private Date dFecmaxreinv;

	@Column(name="e_amortizacion")
	private BigDecimal eAmortizacion;

	@Column(name="e_portajelquidz")
	private BigDecimal ePortajelquidz;

	@Column(name="e_tasa")
	private BigDecimal eTasa;

	@Column(name="e_tasamax")
	private BigDecimal eTasamax;

	@Column(name="e_tasamin")
	private BigDecimal eTasamin;

	@Column(name="e_tasareinversion")
	private BigDecimal eTasareinversion;

	@Column(name="e_tasasec")
	private BigDecimal eTasasec;

	@Column(name="i_base360")
	private int iBase360;

	@Column(name="i_calculo")
	private int iCalculo;

	@Column(name="i_codigofiltro")
	private int iCodigofiltro;

	@Column(name="i_expresatasa")
	private int iExpresatasa;

	@Column(name="i_flujosreinv")
	private int iFlujosreinv;

	@Column(name="i_grucalificacion")
	private int iGrucalificacion;

	@Column(name="i_grumoneda")
	private int iGrumoneda;

	@Column(name="i_grutipotasa")
	private int iGrutipotasa;

	@Column(name="i_mes1flujo")
	private int iMes1flujo;

	@Column(name="i_metodfiltrprecio")
	private int iMetodfiltrprecio;

	@Column(name="i_metodfiltrtasa")
	private int iMetodfiltrtasa;

	@Column(name="i_nrocupones")
	private int iNrocupones;

	@Column(name="i_nroflujos")
	private int iNroflujos;

	@Column(name="i_numemis")
	private int iNumemis;

	@Column(name="i_pagopflujo")
	private int iPagopflujo;

	@Column(name="i_plazomaximo")
	private int iPlazomaximo;

	@Column(name="i_plazominimo")
	private int iPlazominimo;

	@Column(name="i_timpocorriento")
	private int iTimpocorriento;

	@Column(name="i_tipocalificion1")
	private int iTipocalificion1;

	@Column(name="i_tipocalificion2")
	private int iTipocalificion2;

	public SpTitulo() {
	}

	public String getCNemotecnico() {
		return this.cNemotecnico;
	}

	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public String getCAdmini() {
		return this.cAdmini;
	}

	public void setCAdmini(String cAdmini) {
		this.cAdmini = cAdmini;
	}

	public String getCAval() {
		return this.cAval;
	}

	public void setCAval(String cAval) {
		this.cAval = cAval;
	}

	public String getCBaseint() {
		return this.cBaseint;
	}

	public void setCBaseint(String cBaseint) {
		this.cBaseint = cBaseint;
	}

	public String getCBcalificador() {
		return this.cBcalificador;
	}

	public void setCBcalificador(String cBcalificador) {
		this.cBcalificador = cBcalificador;
	}

	public String getCCaja() {
		return this.cCaja;
	}

	public void setCCaja(String cCaja) {
		this.cCaja = cCaja;
	}

	public String getCClase() {
		return this.cClase;
	}

	public void setCClase(String cClase) {
		this.cClase = cClase;
	}

	public String getCCodigo() {
		return this.cCodigo;
	}

	public void setCCodigo(String cCodigo) {
		this.cCodigo = cCodigo;
	}

	public String getCCodigosuper() {
		return this.cCodigosuper;
	}

	public void setCCodigosuper(String cCodigosuper) {
		this.cCodigosuper = cCodigosuper;
	}

	public String getCCodisin1() {
		return this.cCodisin1;
	}

	public void setCCodisin1(String cCodisin1) {
		this.cCodisin1 = cCodisin1;
	}

	public String getCCodisin2() {
		return this.cCodisin2;
	}

	public void setCCodisin2(String cCodisin2) {
		this.cCodisin2 = cCodisin2;
	}

	public String getCCodisin3() {
		return this.cCodisin3;
	}

	public void setCCodisin3(String cCodisin3) {
		this.cCodisin3 = cCodisin3;
	}

	public String getCCurvacerocupon() {
		return this.cCurvacerocupon;
	}

	public void setCCurvacerocupon(String cCurvacerocupon) {
		this.cCurvacerocupon = cCurvacerocupon;
	}

	public String getCDia1flujo() {
		return this.cDia1flujo;
	}

	public void setCDia1flujo(String cDia1flujo) {
		this.cDia1flujo = cDia1flujo;
	}

	public String getCEmision() {
		return this.cEmision;
	}

	public void setCEmision(String cEmision) {
		this.cEmision = cEmision;
	}

	public String getCEmisor() {
		return this.cEmisor;
	}

	public void setCEmisor(String cEmisor) {
		this.cEmisor = cEmisor;
	}

	public String getCEnirbb() {
		return this.cEnirbb;
	}

	public void setCEnirbb(String cEnirbb) {
		this.cEnirbb = cEnirbb;
	}

	public String getCEnixtit() {
		return this.cEnixtit;
	}

	public void setCEnixtit(String cEnixtit) {
		this.cEnixtit = cEnixtit;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getCExpedicion() {
		return this.cExpedicion;
	}

	public void setCExpedicion(String cExpedicion) {
		this.cExpedicion = cExpedicion;
	}

	public String getCFlagreinv() {
		return this.cFlagreinv;
	}

	public void setCFlagreinv(String cFlagreinv) {
		this.cFlagreinv = cFlagreinv;
	}

	public String getCMercado() {
		return this.cMercado;
	}

	public void setCMercado(String cMercado) {
		this.cMercado = cMercado;
	}

	public String getCMetodovalgarantia() {
		return this.cMetodovalgarantia;
	}

	public void setCMetodovalgarantia(String cMetodovalgarantia) {
		this.cMetodovalgarantia = cMetodovalgarantia;
	}

	public String getCMetodovaloriza() {
		return this.cMetodovaloriza;
	}

	public void setCMetodovaloriza(String cMetodovaloriza) {
		this.cMetodovaloriza = cMetodovaloriza;
	}

	public String getCModalidad() {
		return this.cModalidad;
	}

	public void setCModalidad(String cModalidad) {
		this.cModalidad = cModalidad;
	}

	public String getCNemocompleto() {
		return this.cNemocompleto;
	}

	public void setCNemocompleto(String cNemocompleto) {
		this.cNemocompleto = cNemocompleto;
	}

	public String getCNemotecnico2() {
		return this.cNemotecnico2;
	}

	public void setCNemotecnico2(String cNemotecnico2) {
		this.cNemotecnico2 = cNemotecnico2;
	}

	public String getCPeriodicidad() {
		return this.cPeriodicidad;
	}

	public void setCPeriodicidad(String cPeriodicidad) {
		this.cPeriodicidad = cPeriodicidad;
	}

	public String getCPlazo() {
		return this.cPlazo;
	}

	public void setCPlazo(String cPlazo) {
		this.cPlazo = cPlazo;
	}

	public String getCReinv() {
		return this.cReinv;
	}

	public void setCReinv(String cReinv) {
		this.cReinv = cReinv;
	}

	public String getCRiesgo() {
		return this.cRiesgo;
	}

	public void setCRiesgo(String cRiesgo) {
		this.cRiesgo = cRiesgo;
	}

	public String getCSerie() {
		return this.cSerie;
	}

	public void setCSerie(String cSerie) {
		this.cSerie = cSerie;
	}

	public String getCSistema() {
		return this.cSistema;
	}

	public void setCSistema(String cSistema) {
		this.cSistema = cSistema;
	}

	public String getCSneg() {
		return this.cSneg;
	}

	public void setCSneg(String cSneg) {
		this.cSneg = cSneg;
	}

	public String getCTabladesarrollo() {
		return this.cTabladesarrollo;
	}

	public void setCTabladesarrollo(String cTabladesarrollo) {
		this.cTabladesarrollo = cTabladesarrollo;
	}

	public String getCTasareferencia() {
		return this.cTasareferencia;
	}

	public void setCTasareferencia(String cTasareferencia) {
		this.cTasareferencia = cTasareferencia;
	}

	public String getCTipomoneda() {
		return this.cTipomoneda;
	}

	public void setCTipomoneda(String cTipomoneda) {
		this.cTipomoneda = cTipomoneda;
	}

	public String getCTipotasa() {
		return this.cTipotasa;
	}

	public void setCTipotasa(String cTipotasa) {
		this.cTipotasa = cTipotasa;
	}

	public String getCTipotitulo() {
		return this.cTipotitulo;
	}

	public void setCTipotitulo(String cTipotitulo) {
		this.cTipotitulo = cTipotitulo;
	}

	public String getCTiptitulo() {
		return this.cTiptitulo;
	}

	public void setCTiptitulo(String cTiptitulo) {
		this.cTiptitulo = cTiptitulo;
	}

	public String getCTipvaloracion() {
		return this.cTipvaloracion;
	}

	public void setCTipvaloracion(String cTipvaloracion) {
		this.cTipvaloracion = cTipvaloracion;
	}

	public String getCUsotasa() {
		return this.cUsotasa;
	}

	public void setCUsotasa(String cUsotasa) {
		this.cUsotasa = cUsotasa;
	}

	public Date getDFechacolmax() {
		return this.dFechacolmax;
	}

	public void setDFechacolmax(Date dFechacolmax) {
		this.dFechacolmax = dFechacolmax;
	}

	public Date getDFechaemision() {
		return this.dFechaemision;
	}

	public void setDFechaemision(Date dFechaemision) {
		this.dFechaemision = dFechaemision;
	}

	public Date getDFechainscripcion() {
		return this.dFechainscripcion;
	}

	public void setDFechainscripcion(Date dFechainscripcion) {
		this.dFechainscripcion = dFechainscripcion;
	}

	public Date getDFechavencimiento() {
		return this.dFechavencimiento;
	}

	public void setDFechavencimiento(Date dFechavencimiento) {
		this.dFechavencimiento = dFechavencimiento;
	}

	public Date getDFecmaxreinv() {
		return this.dFecmaxreinv;
	}

	public void setDFecmaxreinv(Date dFecmaxreinv) {
		this.dFecmaxreinv = dFecmaxreinv;
	}

	public BigDecimal getEAmortizacion() {
		return this.eAmortizacion;
	}

	public void setEAmortizacion(BigDecimal eAmortizacion) {
		this.eAmortizacion = eAmortizacion;
	}

	public BigDecimal getEPortajelquidz() {
		return this.ePortajelquidz;
	}

	public void setEPortajelquidz(BigDecimal ePortajelquidz) {
		this.ePortajelquidz = ePortajelquidz;
	}

	public BigDecimal getETasa() {
		return this.eTasa;
	}

	public void setETasa(BigDecimal eTasa) {
		this.eTasa = eTasa;
	}

	public BigDecimal getETasamax() {
		return this.eTasamax;
	}

	public void setETasamax(BigDecimal eTasamax) {
		this.eTasamax = eTasamax;
	}

	public BigDecimal getETasamin() {
		return this.eTasamin;
	}

	public void setETasamin(BigDecimal eTasamin) {
		this.eTasamin = eTasamin;
	}

	public BigDecimal getETasareinversion() {
		return this.eTasareinversion;
	}

	public void setETasareinversion(BigDecimal eTasareinversion) {
		this.eTasareinversion = eTasareinversion;
	}

	public BigDecimal getETasasec() {
		return this.eTasasec;
	}

	public void setETasasec(BigDecimal eTasasec) {
		this.eTasasec = eTasasec;
	}

	public int getIBase360() {
		return this.iBase360;
	}

	public void setIBase360(int iBase360) {
		this.iBase360 = iBase360;
	}

	public int getICalculo() {
		return this.iCalculo;
	}

	public void setICalculo(int iCalculo) {
		this.iCalculo = iCalculo;
	}

	public int getICodigofiltro() {
		return this.iCodigofiltro;
	}

	public void setICodigofiltro(int iCodigofiltro) {
		this.iCodigofiltro = iCodigofiltro;
	}

	public int getIExpresatasa() {
		return this.iExpresatasa;
	}

	public void setIExpresatasa(int iExpresatasa) {
		this.iExpresatasa = iExpresatasa;
	}

	public int getIFlujosreinv() {
		return this.iFlujosreinv;
	}

	public void setIFlujosreinv(int iFlujosreinv) {
		this.iFlujosreinv = iFlujosreinv;
	}

	public int getIGrucalificacion() {
		return this.iGrucalificacion;
	}

	public void setIGrucalificacion(int iGrucalificacion) {
		this.iGrucalificacion = iGrucalificacion;
	}

	public int getIGrumoneda() {
		return this.iGrumoneda;
	}

	public void setIGrumoneda(int iGrumoneda) {
		this.iGrumoneda = iGrumoneda;
	}

	public int getIGrutipotasa() {
		return this.iGrutipotasa;
	}

	public void setIGrutipotasa(int iGrutipotasa) {
		this.iGrutipotasa = iGrutipotasa;
	}

	public int getIMes1flujo() {
		return this.iMes1flujo;
	}

	public void setIMes1flujo(int iMes1flujo) {
		this.iMes1flujo = iMes1flujo;
	}

	public int getIMetodfiltrprecio() {
		return this.iMetodfiltrprecio;
	}

	public void setIMetodfiltrprecio(int iMetodfiltrprecio) {
		this.iMetodfiltrprecio = iMetodfiltrprecio;
	}

	public int getIMetodfiltrtasa() {
		return this.iMetodfiltrtasa;
	}

	public void setIMetodfiltrtasa(int iMetodfiltrtasa) {
		this.iMetodfiltrtasa = iMetodfiltrtasa;
	}

	public int getINrocupones() {
		return this.iNrocupones;
	}

	public void setINrocupones(int iNrocupones) {
		this.iNrocupones = iNrocupones;
	}

	public int getINroflujos() {
		return this.iNroflujos;
	}

	public void setINroflujos(int iNroflujos) {
		this.iNroflujos = iNroflujos;
	}

	public int getINumemis() {
		return this.iNumemis;
	}

	public void setINumemis(int iNumemis) {
		this.iNumemis = iNumemis;
	}

	public int getIPagopflujo() {
		return this.iPagopflujo;
	}

	public void setIPagopflujo(int iPagopflujo) {
		this.iPagopflujo = iPagopflujo;
	}

	public int getIPlazomaximo() {
		return this.iPlazomaximo;
	}

	public void setIPlazomaximo(int iPlazomaximo) {
		this.iPlazomaximo = iPlazomaximo;
	}

	public int getIPlazominimo() {
		return this.iPlazominimo;
	}

	public void setIPlazominimo(int iPlazominimo) {
		this.iPlazominimo = iPlazominimo;
	}

	public int getITimpocorriento() {
		return this.iTimpocorriento;
	}

	public void setITimpocorriento(int iTimpocorriento) {
		this.iTimpocorriento = iTimpocorriento;
	}

	public int getITipocalificion1() {
		return this.iTipocalificion1;
	}

	public void setITipocalificion1(int iTipocalificion1) {
		this.iTipocalificion1 = iTipocalificion1;
	}

	public int getITipocalificion2() {
		return this.iTipocalificion2;
	}

	public void setITipocalificion2(int iTipocalificion2) {
		this.iTipocalificion2 = iTipocalificion2;
	}

}