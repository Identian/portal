package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.sql.Time;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the va_especie_original database table.
 * 
 */
@Entity
@Table(name="va_especie_original")
@NamedQuery(name="VaEspecieOriginal.findAll", query="SELECT v FROM VaEspecieOriginal v")
public class VaEspecieOriginal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Column(name="c_activaayer")
	private String cActivaayer;

	@Column(name="c_bolsapaisorigen")
	private String cBolsapaisorigen;

	@Column(name="c_bursatilidad")
	private String cBursatilidad;

	@Column(name="c_bursatilidadanterior")
	private String cBursatilidadanterior;

	@Column(name="c_clase")
	private String cClase;

	@Column(name="c_codigoric")
	private String cCodigoric;

	@Column(name="c_codigosuper")
	private String cCodigosuper;

	@Column(name="c_codisin1")
	private String cCodisin1;

	@Column(name="c_codisin2")
	private String cCodisin2;

	@Column(name="c_emisor")
	private String cEmisor;

	@Column(name="c_estado")
	private String cEstado;

	@Column(name="c_exdividendo")
	private String cExdividendo;

	@Column(name="c_mgc")
	private String cMgc;

	@Column(name="c_modenaorigen")
	private String cModenaorigen;

	@Column(name="c_pertenececanasta")
	private String cPertenececanasta;

	@Column(name="c_pertenecesector")
	private String cPertenecesector;

	@Column(name="c_razonsocial")
	private String cRazonsocial;

	@Column(name="c_sector")
	private String cSector;

	@Column(name="c_sistnegcion")
	private String cSistnegcion;

	@Column(name="c_suspendidahoy")
	private String cSuspendidahoy;

	@Column(name="c_suspension")
	private String cSuspension;

	@Column(name="c_suspensiones")
	private String cSuspensiones;

	@Column(name="c_titulo")
	private String cTitulo;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechacausacion")
	private Date dFechacausacion;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechadividendo")
	private Date dFechadividendo;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechafinsusp")
	private Date dFechafinsusp;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechainscripcion")
	private Date dFechainscripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechanominal")
	private Date dFechanominal;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechapatrimonial")
	private Date dFechapatrimonial;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechapreciobase")
	private Date dFechapreciobase;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechasuscripcion")
	private Date dFechasuscripcion;

	@Column(name="dt_fecvigultestado")
	private Timestamp dtFecvigultestado;

	@Column(name="e_precioajustsusp")
	private BigDecimal ePrecioajustsusp;

	@Column(name="e_preciobase")
	private BigDecimal ePreciobase;

	@Column(name="e_preciomaximo")
	private BigDecimal ePreciomaximo;

	@Column(name="e_preciominimo")
	private BigDecimal ePreciominimo;

	@Column(name="e_precionalbase")
	private BigDecimal ePrecionalbase;

	@Column(name="e_precionalmaximo")
	private BigDecimal ePrecionalmaximo;

	@Column(name="e_precionalminimo")
	private BigDecimal ePrecionalminimo;

	@Column(name="e_valordividendo")
	private BigDecimal eValordividendo;

	@Column(name="e_valorfiscal")
	private BigDecimal eValorfiscal;

	@Column(name="e_valornominal")
	private BigDecimal eValornominal;

	@Column(name="e_valorpatrimonial")
	private BigDecimal eValorpatrimonial;

	@Column(name="e_valorsuscripcion")
	private BigDecimal eValorsuscripcion;

	@Column(name="i_maxnumdecimal")
	private int iMaxnumdecimal;

	@Column(name="i_numacciones")
	private BigDecimal iNumacciones;

	@Column(name="t_horafinsusp")
	private Time tHorafinsusp;

	public VaEspecieOriginal() {
	}

	public String getCNemotecnico() {
		return this.cNemotecnico;
	}

	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public String getCActivaayer() {
		return this.cActivaayer;
	}

	public void setCActivaayer(String cActivaayer) {
		this.cActivaayer = cActivaayer;
	}

	public String getCBolsapaisorigen() {
		return this.cBolsapaisorigen;
	}

	public void setCBolsapaisorigen(String cBolsapaisorigen) {
		this.cBolsapaisorigen = cBolsapaisorigen;
	}

	public String getCBursatilidad() {
		return this.cBursatilidad;
	}

	public void setCBursatilidad(String cBursatilidad) {
		this.cBursatilidad = cBursatilidad;
	}

	public String getCBursatilidadanterior() {
		return this.cBursatilidadanterior;
	}

	public void setCBursatilidadanterior(String cBursatilidadanterior) {
		this.cBursatilidadanterior = cBursatilidadanterior;
	}

	public String getCClase() {
		return this.cClase;
	}

	public void setCClase(String cClase) {
		this.cClase = cClase;
	}

	public String getCCodigoric() {
		return this.cCodigoric;
	}

	public void setCCodigoric(String cCodigoric) {
		this.cCodigoric = cCodigoric;
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

	public String getCEmisor() {
		return this.cEmisor;
	}

	public void setCEmisor(String cEmisor) {
		this.cEmisor = cEmisor;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getCExdividendo() {
		return this.cExdividendo;
	}

	public void setCExdividendo(String cExdividendo) {
		this.cExdividendo = cExdividendo;
	}

	public String getCMgc() {
		return this.cMgc;
	}

	public void setCMgc(String cMgc) {
		this.cMgc = cMgc;
	}

	public String getCModenaorigen() {
		return this.cModenaorigen;
	}

	public void setCModenaorigen(String cModenaorigen) {
		this.cModenaorigen = cModenaorigen;
	}

	public String getCPertenececanasta() {
		return this.cPertenececanasta;
	}

	public void setCPertenececanasta(String cPertenececanasta) {
		this.cPertenececanasta = cPertenececanasta;
	}

	public String getCPertenecesector() {
		return this.cPertenecesector;
	}

	public void setCPertenecesector(String cPertenecesector) {
		this.cPertenecesector = cPertenecesector;
	}

	public String getCRazonsocial() {
		return this.cRazonsocial;
	}

	public void setCRazonsocial(String cRazonsocial) {
		this.cRazonsocial = cRazonsocial;
	}

	public String getCSector() {
		return this.cSector;
	}

	public void setCSector(String cSector) {
		this.cSector = cSector;
	}

	public String getCSistnegcion() {
		return this.cSistnegcion;
	}

	public void setCSistnegcion(String cSistnegcion) {
		this.cSistnegcion = cSistnegcion;
	}

	public String getCSuspendidahoy() {
		return this.cSuspendidahoy;
	}

	public void setCSuspendidahoy(String cSuspendidahoy) {
		this.cSuspendidahoy = cSuspendidahoy;
	}

	public String getCSuspension() {
		return this.cSuspension;
	}

	public void setCSuspension(String cSuspension) {
		this.cSuspension = cSuspension;
	}

	public String getCSuspensiones() {
		return this.cSuspensiones;
	}

	public void setCSuspensiones(String cSuspensiones) {
		this.cSuspensiones = cSuspensiones;
	}

	public String getCTitulo() {
		return this.cTitulo;
	}

	public void setCTitulo(String cTitulo) {
		this.cTitulo = cTitulo;
	}

	public Date getDFechacausacion() {
		return this.dFechacausacion;
	}

	public void setDFechacausacion(Date dFechacausacion) {
		this.dFechacausacion = dFechacausacion;
	}

	public Date getDFechadividendo() {
		return this.dFechadividendo;
	}

	public void setDFechadividendo(Date dFechadividendo) {
		this.dFechadividendo = dFechadividendo;
	}

	public Date getDFechafinsusp() {
		return this.dFechafinsusp;
	}

	public void setDFechafinsusp(Date dFechafinsusp) {
		this.dFechafinsusp = dFechafinsusp;
	}

	public Date getDFechainscripcion() {
		return this.dFechainscripcion;
	}

	public void setDFechainscripcion(Date dFechainscripcion) {
		this.dFechainscripcion = dFechainscripcion;
	}

	public Date getDFechanominal() {
		return this.dFechanominal;
	}

	public void setDFechanominal(Date dFechanominal) {
		this.dFechanominal = dFechanominal;
	}

	public Date getDFechapatrimonial() {
		return this.dFechapatrimonial;
	}

	public void setDFechapatrimonial(Date dFechapatrimonial) {
		this.dFechapatrimonial = dFechapatrimonial;
	}

	public Date getDFechapreciobase() {
		return this.dFechapreciobase;
	}

	public void setDFechapreciobase(Date dFechapreciobase) {
		this.dFechapreciobase = dFechapreciobase;
	}

	public Date getDFechasuscripcion() {
		return this.dFechasuscripcion;
	}

	public void setDFechasuscripcion(Date dFechasuscripcion) {
		this.dFechasuscripcion = dFechasuscripcion;
	}

	public Timestamp getDtFecvigultestado() {
		return this.dtFecvigultestado;
	}

	public void setDtFecvigultestado(Timestamp dtFecvigultestado) {
		this.dtFecvigultestado = dtFecvigultestado;
	}

	public BigDecimal getEPrecioajustsusp() {
		return this.ePrecioajustsusp;
	}

	public void setEPrecioajustsusp(BigDecimal ePrecioajustsusp) {
		this.ePrecioajustsusp = ePrecioajustsusp;
	}

	public BigDecimal getEPreciobase() {
		return this.ePreciobase;
	}

	public void setEPreciobase(BigDecimal ePreciobase) {
		this.ePreciobase = ePreciobase;
	}

	public BigDecimal getEPreciomaximo() {
		return this.ePreciomaximo;
	}

	public void setEPreciomaximo(BigDecimal ePreciomaximo) {
		this.ePreciomaximo = ePreciomaximo;
	}

	public BigDecimal getEPreciominimo() {
		return this.ePreciominimo;
	}

	public void setEPreciominimo(BigDecimal ePreciominimo) {
		this.ePreciominimo = ePreciominimo;
	}

	public BigDecimal getEPrecionalbase() {
		return this.ePrecionalbase;
	}

	public void setEPrecionalbase(BigDecimal ePrecionalbase) {
		this.ePrecionalbase = ePrecionalbase;
	}

	public BigDecimal getEPrecionalmaximo() {
		return this.ePrecionalmaximo;
	}

	public void setEPrecionalmaximo(BigDecimal ePrecionalmaximo) {
		this.ePrecionalmaximo = ePrecionalmaximo;
	}

	public BigDecimal getEPrecionalminimo() {
		return this.ePrecionalminimo;
	}

	public void setEPrecionalminimo(BigDecimal ePrecionalminimo) {
		this.ePrecionalminimo = ePrecionalminimo;
	}

	public BigDecimal getEValordividendo() {
		return this.eValordividendo;
	}

	public void setEValordividendo(BigDecimal eValordividendo) {
		this.eValordividendo = eValordividendo;
	}

	public BigDecimal getEValorfiscal() {
		return this.eValorfiscal;
	}

	public void setEValorfiscal(BigDecimal eValorfiscal) {
		this.eValorfiscal = eValorfiscal;
	}

	public BigDecimal getEValornominal() {
		return this.eValornominal;
	}

	public void setEValornominal(BigDecimal eValornominal) {
		this.eValornominal = eValornominal;
	}

	public BigDecimal getEValorpatrimonial() {
		return this.eValorpatrimonial;
	}

	public void setEValorpatrimonial(BigDecimal eValorpatrimonial) {
		this.eValorpatrimonial = eValorpatrimonial;
	}

	public BigDecimal getEValorsuscripcion() {
		return this.eValorsuscripcion;
	}

	public void setEValorsuscripcion(BigDecimal eValorsuscripcion) {
		this.eValorsuscripcion = eValorsuscripcion;
	}

	public int getIMaxnumdecimal() {
		return this.iMaxnumdecimal;
	}

	public void setIMaxnumdecimal(int iMaxnumdecimal) {
		this.iMaxnumdecimal = iMaxnumdecimal;
	}

	public BigDecimal getINumacciones() {
		return this.iNumacciones;
	}

	public void setINumacciones(BigDecimal iNumacciones) {
		this.iNumacciones = iNumacciones;
	}

	public Time getTHorafinsusp() {
		return this.tHorafinsusp;
	}

	public void setTHorafinsusp(Time tHorafinsusp) {
		this.tHorafinsusp = tHorafinsusp;
	}

}