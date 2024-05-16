package co.com.infovalmer.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;

public class TituloDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "c_nemotecnico")
	private String cNemotecnico;

	private String cAdmini;

	private String cAval;

	@Column(name = "c_baseint")
	private String cBaseint;

	private String cBcalificador;

	private String cCaja;

	private String cClase;

	private String cCodigo;

	@Column(name = "c_codigosuper")
	private String cCodigosuper;

	@Column(name = "c_codisin1")
	private String cCodisin1;

	private String cCodisin2;

	private String cCodisin3;

	@Column(name = "c_curvacerocupon")
	private String cCurvacerocupon;

	private String cDia1flujo;

	private String cEmision;

	@Column(name = "c_emisor")
	private String cEmisor;

	private String cEnirbb;

	private String cEnixtit;

	private String cEstado;

	private String cExpedicion;

	private String cFlagreinv;

	private String cMercado;

	private String cMetodovalgarantia;

	private String cMetodovaloriza;

	private String cModalidad;

	private String cNemocompleto;

	private String cNemotecnico2;

	@Column(name = "c_periodicidad")
	private String cPeriodicidad;

	private String cPlazo;

	private String cReinv;

	private String cRiesgo;

	private String cSerie;

	private String cSistema;

	private String cSneg;

	private String cTabladesarrollo;

	private String cTasareferencia;

	@Column(name = "c_tipomoneda")
	private String cTipomoneda;

	private String cTipotasa;

	@Column(name = "c_tipotitulo")
	private String cTipotitulo;

	private String cTiptitulo;

	private String cTipvaloracion;

	@Column(name = "c_usotasa")
	private String cUsotasa;

	private Date dFechacolmax;

	@Column(name = "d_fechaemision")
	private Date dFechaemision;

	private Date dFechainscripcion;

	@Column(name = "d_fechavencimiento")
	private Date dFechavencimiento;

	private Date dFecmaxreinv;

	private BigDecimal eAmortizacion;

	private BigDecimal ePortajelquidz;

	@Column(name = "e_tasa")
	private BigDecimal eTasa;

	private BigDecimal eTasamax;

	private BigDecimal eTasamin;

	private BigDecimal eTasareinversion;

	private BigDecimal eTasasec;

	private int iBase360;

	private int iCalculo;

	private int iCodigofiltro;

	private int iExpresatasa;

	private int iFlujosreinv;

	private int iGrucalificacion;

	private int iGrumoneda;

	private int iGrutipotasa;

	private int iMes1flujo;

	private int iMetodfiltrprecio;

	private int iMetodfiltrtasa;

	private int iNrocupones;

	private int iNroflujos;

	private int iNumemis;

	private int iPagopflujo;

	private int iPlazomaximo;

	private int iPlazominimo;

	private int iTimpocorriento;

	private int iTipocalificion1;

	private int iTipocalificion2;

	private String cMuestratitulo;

	public String getcNemotecnico() {
		return cNemotecnico;
	}

	public void setcNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public String getcAdmini() {
		return cAdmini;
	}

	public void setcAdmini(String cAdmini) {
		this.cAdmini = cAdmini;
	}

	public String getcAval() {
		return cAval;
	}

	public void setcAval(String cAval) {
		this.cAval = cAval;
	}

	public String getcBaseint() {
		return cBaseint;
	}

	public void setcBaseint(String cBaseint) {
		this.cBaseint = cBaseint;
	}

	public String getcBcalificador() {
		return cBcalificador;
	}

	public void setcBcalificador(String cBcalificador) {
		this.cBcalificador = cBcalificador;
	}

	public String getcCaja() {
		return cCaja;
	}

	public void setcCaja(String cCaja) {
		this.cCaja = cCaja;
	}

	public String getcClase() {
		return cClase;
	}

	public void setcClase(String cClase) {
		this.cClase = cClase;
	}

	public String getcCodigo() {
		return cCodigo;
	}

	public void setcCodigo(String cCodigo) {
		this.cCodigo = cCodigo;
	}

	public String getcCodigosuper() {
		return cCodigosuper;
	}

	public void setcCodigosuper(String cCodigosuper) {
		this.cCodigosuper = cCodigosuper;
	}

	public String getcCodisin1() {
		return cCodisin1;
	}

	public void setcCodisin1(String cCodisin1) {
		this.cCodisin1 = cCodisin1;
	}

	public String getcCodisin2() {
		return cCodisin2;
	}

	public void setcCodisin2(String cCodisin2) {
		this.cCodisin2 = cCodisin2;
	}

	public String getcCodisin3() {
		return cCodisin3;
	}

	public void setcCodisin3(String cCodisin3) {
		this.cCodisin3 = cCodisin3;
	}

	public String getcCurvacerocupon() {
		return cCurvacerocupon;
	}

	public void setcCurvacerocupon(String cCurvacerocupon) {
		this.cCurvacerocupon = cCurvacerocupon;
	}

	public String getcDia1flujo() {
		return cDia1flujo;
	}

	public void setcDia1flujo(String cDia1flujo) {
		this.cDia1flujo = cDia1flujo;
	}

	public String getcEmision() {
		return cEmision;
	}

	public void setcEmision(String cEmision) {
		this.cEmision = cEmision;
	}

	public String getcEmisor() {
		return cEmisor;
	}

	public void setcEmisor(String cEmisor) {
		this.cEmisor = cEmisor;
	}

	public String getcEnirbb() {
		return cEnirbb;
	}

	public void setcEnirbb(String cEnirbb) {
		this.cEnirbb = cEnirbb;
	}

	public String getcEnixtit() {
		return cEnixtit;
	}

	public void setcEnixtit(String cEnixtit) {
		this.cEnixtit = cEnixtit;
	}

	public String getcEstado() {
		return cEstado;
	}

	public void setcEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getcExpedicion() {
		return cExpedicion;
	}

	public void setcExpedicion(String cExpedicion) {
		this.cExpedicion = cExpedicion;
	}

	public String getcFlagreinv() {
		return cFlagreinv;
	}

	public void setcFlagreinv(String cFlagreinv) {
		this.cFlagreinv = cFlagreinv;
	}

	public String getcMercado() {
		return cMercado;
	}

	public void setcMercado(String cMercado) {
		this.cMercado = cMercado;
	}

	public String getcMetodovalgarantia() {
		return cMetodovalgarantia;
	}

	public void setcMetodovalgarantia(String cMetodovalgarantia) {
		this.cMetodovalgarantia = cMetodovalgarantia;
	}

	public String getcMetodovaloriza() {
		return cMetodovaloriza;
	}

	public void setcMetodovaloriza(String cMetodovaloriza) {
		this.cMetodovaloriza = cMetodovaloriza;
	}

	public String getcModalidad() {
		return cModalidad;
	}

	public void setcModalidad(String cModalidad) {
		this.cModalidad = cModalidad;
	}

	public String getcNemocompleto() {
		return cNemocompleto;
	}

	public void setcNemocompleto(String cNemocompleto) {
		this.cNemocompleto = cNemocompleto;
	}

	public String getcNemotecnico2() {
		return cNemotecnico2;
	}

	public void setcNemotecnico2(String cNemotecnico2) {
		this.cNemotecnico2 = cNemotecnico2;
	}

	public String getcPeriodicidad() {
		return cPeriodicidad;
	}

	public void setcPeriodicidad(String cPeriodicidad) {
		this.cPeriodicidad = cPeriodicidad;
	}

	public String getcPlazo() {
		return cPlazo;
	}

	public void setcPlazo(String cPlazo) {
		this.cPlazo = cPlazo;
	}

	public String getcReinv() {
		return cReinv;
	}

	public void setcReinv(String cReinv) {
		this.cReinv = cReinv;
	}

	public String getcRiesgo() {
		return cRiesgo;
	}

	public void setcRiesgo(String cRiesgo) {
		this.cRiesgo = cRiesgo;
	}

	public String getcSerie() {
		return cSerie;
	}

	public void setcSerie(String cSerie) {
		this.cSerie = cSerie;
	}

	public String getcSistema() {
		return cSistema;
	}

	public void setcSistema(String cSistema) {
		this.cSistema = cSistema;
	}

	public String getcSneg() {
		return cSneg;
	}

	public void setcSneg(String cSneg) {
		this.cSneg = cSneg;
	}

	public String getcTabladesarrollo() {
		return cTabladesarrollo;
	}

	public void setcTabladesarrollo(String cTabladesarrollo) {
		this.cTabladesarrollo = cTabladesarrollo;
	}

	public String getcTasareferencia() {
		return cTasareferencia;
	}

	public void setcTasareferencia(String cTasareferencia) {
		this.cTasareferencia = cTasareferencia;
	}

	public String getcTipomoneda() {
		return cTipomoneda;
	}

	public void setcTipomoneda(String cTipomoneda) {
		this.cTipomoneda = cTipomoneda;
	}

	public String getcTipotasa() {
		return cTipotasa;
	}

	public void setcTipotasa(String cTipotasa) {
		this.cTipotasa = cTipotasa;
	}

	public String getcTipotitulo() {
		return cTipotitulo;
	}

	public void setcTipotitulo(String cTipotitulo) {
		this.cTipotitulo = cTipotitulo;
	}

	public String getcTiptitulo() {
		return cTiptitulo;
	}

	public void setcTiptitulo(String cTiptitulo) {
		this.cTiptitulo = cTiptitulo;
	}

	public String getcTipvaloracion() {
		return cTipvaloracion;
	}

	public void setcTipvaloracion(String cTipvaloracion) {
		this.cTipvaloracion = cTipvaloracion;
	}

	public String getcUsotasa() {
		return cUsotasa;
	}

	public void setcUsotasa(String cUsotasa) {
		this.cUsotasa = cUsotasa;
	}

	public Date getdFechacolmax() {
		return dFechacolmax;
	}

	public void setdFechacolmax(Date dFechacolmax) {
		this.dFechacolmax = dFechacolmax;
	}

	public Date getdFechaemision() {
		return dFechaemision;
	}

	public void setdFechaemision(Date dFechaemision) {
		this.dFechaemision = dFechaemision;
	}

	public Date getdFechainscripcion() {
		return dFechainscripcion;
	}

	public void setdFechainscripcion(Date dFechainscripcion) {
		this.dFechainscripcion = dFechainscripcion;
	}

	public Date getdFechavencimiento() {
		return dFechavencimiento;
	}

	public void setdFechavencimiento(Date dFechavencimiento) {
		this.dFechavencimiento = dFechavencimiento;
	}

	public Date getdFecmaxreinv() {
		return dFecmaxreinv;
	}

	public void setdFecmaxreinv(Date dFecmaxreinv) {
		this.dFecmaxreinv = dFecmaxreinv;
	}

	public BigDecimal geteAmortizacion() {
		return eAmortizacion;
	}

	public void seteAmortizacion(BigDecimal eAmortizacion) {
		this.eAmortizacion = eAmortizacion;
	}

	public BigDecimal getePortajelquidz() {
		return ePortajelquidz;
	}

	public void setePortajelquidz(BigDecimal ePortajelquidz) {
		this.ePortajelquidz = ePortajelquidz;
	}

	public BigDecimal geteTasa() {
		return eTasa;
	}

	public void seteTasa(BigDecimal eTasa) {
		this.eTasa = eTasa;
	}

	public BigDecimal geteTasamax() {
		return eTasamax;
	}

	public void seteTasamax(BigDecimal eTasamax) {
		this.eTasamax = eTasamax;
	}

	public BigDecimal geteTasamin() {
		return eTasamin;
	}

	public void seteTasamin(BigDecimal eTasamin) {
		this.eTasamin = eTasamin;
	}

	public BigDecimal geteTasareinversion() {
		return eTasareinversion;
	}

	public void seteTasareinversion(BigDecimal eTasareinversion) {
		this.eTasareinversion = eTasareinversion;
	}

	public BigDecimal geteTasasec() {
		return eTasasec;
	}

	public void seteTasasec(BigDecimal eTasasec) {
		this.eTasasec = eTasasec;
	}

	public int getiBase360() {
		return iBase360;
	}

	public void setiBase360(int iBase360) {
		this.iBase360 = iBase360;
	}

	public int getiCalculo() {
		return iCalculo;
	}

	public void setiCalculo(int iCalculo) {
		this.iCalculo = iCalculo;
	}

	public int getiCodigofiltro() {
		return iCodigofiltro;
	}

	public void setiCodigofiltro(int iCodigofiltro) {
		this.iCodigofiltro = iCodigofiltro;
	}

	public int getiExpresatasa() {
		return iExpresatasa;
	}

	public void setiExpresatasa(int iExpresatasa) {
		this.iExpresatasa = iExpresatasa;
	}

	public int getiFlujosreinv() {
		return iFlujosreinv;
	}

	public void setiFlujosreinv(int iFlujosreinv) {
		this.iFlujosreinv = iFlujosreinv;
	}

	public int getiGrucalificacion() {
		return iGrucalificacion;
	}

	public void setiGrucalificacion(int iGrucalificacion) {
		this.iGrucalificacion = iGrucalificacion;
	}

	public int getiGrumoneda() {
		return iGrumoneda;
	}

	public void setiGrumoneda(int iGrumoneda) {
		this.iGrumoneda = iGrumoneda;
	}

	public int getiGrutipotasa() {
		return iGrutipotasa;
	}

	public void setiGrutipotasa(int iGrutipotasa) {
		this.iGrutipotasa = iGrutipotasa;
	}

	public int getiMes1flujo() {
		return iMes1flujo;
	}

	public void setiMes1flujo(int iMes1flujo) {
		this.iMes1flujo = iMes1flujo;
	}

	public int getiMetodfiltrprecio() {
		return iMetodfiltrprecio;
	}

	public void setiMetodfiltrprecio(int iMetodfiltrprecio) {
		this.iMetodfiltrprecio = iMetodfiltrprecio;
	}

	public int getiMetodfiltrtasa() {
		return iMetodfiltrtasa;
	}

	public void setiMetodfiltrtasa(int iMetodfiltrtasa) {
		this.iMetodfiltrtasa = iMetodfiltrtasa;
	}

	public int getiNrocupones() {
		return iNrocupones;
	}

	public void setiNrocupones(int iNrocupones) {
		this.iNrocupones = iNrocupones;
	}

	public int getiNroflujos() {
		return iNroflujos;
	}

	public void setiNroflujos(int iNroflujos) {
		this.iNroflujos = iNroflujos;
	}

	public int getiNumemis() {
		return iNumemis;
	}

	public void setiNumemis(int iNumemis) {
		this.iNumemis = iNumemis;
	}

	public int getiPagopflujo() {
		return iPagopflujo;
	}

	public void setiPagopflujo(int iPagopflujo) {
		this.iPagopflujo = iPagopflujo;
	}

	public int getiPlazomaximo() {
		return iPlazomaximo;
	}

	public void setiPlazomaximo(int iPlazomaximo) {
		this.iPlazomaximo = iPlazomaximo;
	}

	public int getiPlazominimo() {
		return iPlazominimo;
	}

	public void setiPlazominimo(int iPlazominimo) {
		this.iPlazominimo = iPlazominimo;
	}

	public int getiTimpocorriento() {
		return iTimpocorriento;
	}

	public void setiTimpocorriento(int iTimpocorriento) {
		this.iTimpocorriento = iTimpocorriento;
	}

	public int getiTipocalificion1() {
		return iTipocalificion1;
	}

	public void setiTipocalificion1(int iTipocalificion1) {
		this.iTipocalificion1 = iTipocalificion1;
	}

	public int getiTipocalificion2() {
		return iTipocalificion2;
	}

	public void setiTipocalificion2(int iTipocalificion2) {
		this.iTipocalificion2 = iTipocalificion2;
	}

	public String getcMuestratitulo() {
		return cMuestratitulo;
	}

	public void setcMuestratitulo(String cMuestratitulo) {
		this.cMuestratitulo = cMuestratitulo;
	}

}
