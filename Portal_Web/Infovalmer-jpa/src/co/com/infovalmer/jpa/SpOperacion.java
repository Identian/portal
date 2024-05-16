package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sp_operacion database table.
 * 
 */
@Entity
@Table(name="sp_operacion")
@NamedQuery(name="SpOperacion.findAll", query="SELECT s FROM SpOperacion s")
public class SpOperacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpOperacionPK id;

	@Column(name="c_amplitud")
	private String cAmplitud;

	@Column(name="c_caja")
	private String cCaja;

	@Column(name="c_clase")
	private String cClase;

	@Column(name="c_estado")
	private String cEstado;

	@Column(name="c_grupo")
	private String cGrupo;

	@Column(name="c_indicador")
	private String cIndicador;

	@Column(name="c_modalidad")
	private String cModalidad;

	@Column(name="c_moneda")
	private String cMoneda;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Column(name="c_numcontrol")
	private String cNumcontrol;

	@Column(name="c_reinversion")
	private String cReinversion;

	@Column(name="c_sesion")
	private String cSesion;

	@Column(name="c_tipotitulo")
	private String cTipotitulo;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechacumpliento")
	private Date dFechacumpliento;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaemistit")
	private Date dFechaemistit;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechapago")
	private Date dFechapago;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaventit")
	private Date dFechaventit;

	@Column(name="e_amortizacion")
	private BigDecimal eAmortizacion;

	@Column(name="e_cantidad")
	private BigDecimal eCantidad;

	@Column(name="e_errorprecio")
	private BigDecimal eErrorprecio;

	@Column(name="e_flujototal")
	private BigDecimal eFlujototal;

	@Column(name="e_interes")
	private BigDecimal eInteres;

	@Column(name="e_margen")
	private BigDecimal eMargen;

	@Column(name="e_preciolimpio")
	private BigDecimal ePreciolimpio;

	@Column(name="e_preciototal")
	private BigDecimal ePreciototal;

	@Column(name="e_rentabilidad")
	private BigDecimal eRentabilidad;

	@Column(name="e_saldoamortizacion")
	private BigDecimal eSaldoamortizacion;

	@Column(name="e_tasacupon")
	private BigDecimal eTasacupon;

	@Column(name="e_valormoneda")
	private BigDecimal eValormoneda;

	@Column(name="e_volumen")
	private BigDecimal eVolumen;

	@Column(name="i_codfiltroaplicdo")
	private int iCodfiltroaplicdo;

	@Column(name="i_diasalcumpliento")
	private int iDiasalcumpliento;

	@Column(name="i_diasalvenciento")
	private int iDiasalvenciento;

	@Column(name="i_diasvencimiento")
	private int iDiasvencimiento;

	@Column(name="i_filtromonto")
	private int iFiltromonto;

	@Column(name="i_filtrotasa")
	private int iFiltrotasa;

	@Column(name="i_grucalificacion")
	private int iGrucalificacion;

	@Column(name="i_grumoneda")
	private int iGrumoneda;

	@Column(name="i_grutipotasa")
	private int iGrutipotasa;

	@Column(name="i_metodofiltro")
	private int iMetodofiltro;

	@Column(name="i_numemisionbr")
	private int iNumemisionbr;

	@Column(name="i_numerocupon")
	private int iNumerocupon;

	@Column(name="i_rangvencimi")
	private int iRangvencimi;

	public SpOperacion() {
	}

	public SpOperacionPK getId() {
		return this.id;
	}

	public void setId(SpOperacionPK id) {
		this.id = id;
	}

	public String getCAmplitud() {
		return this.cAmplitud;
	}

	public void setCAmplitud(String cAmplitud) {
		this.cAmplitud = cAmplitud;
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

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getCGrupo() {
		return this.cGrupo;
	}

	public void setCGrupo(String cGrupo) {
		this.cGrupo = cGrupo;
	}

	public String getCIndicador() {
		return this.cIndicador;
	}

	public void setCIndicador(String cIndicador) {
		this.cIndicador = cIndicador;
	}

	public String getCModalidad() {
		return this.cModalidad;
	}

	public void setCModalidad(String cModalidad) {
		this.cModalidad = cModalidad;
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

	public String getCNumcontrol() {
		return this.cNumcontrol;
	}

	public void setCNumcontrol(String cNumcontrol) {
		this.cNumcontrol = cNumcontrol;
	}

	public String getCReinversion() {
		return this.cReinversion;
	}

	public void setCReinversion(String cReinversion) {
		this.cReinversion = cReinversion;
	}

	public String getCSesion() {
		return this.cSesion;
	}

	public void setCSesion(String cSesion) {
		this.cSesion = cSesion;
	}

	public String getCTipotitulo() {
		return this.cTipotitulo;
	}

	public void setCTipotitulo(String cTipotitulo) {
		this.cTipotitulo = cTipotitulo;
	}

	public Date getDFechacumpliento() {
		return this.dFechacumpliento;
	}

	public void setDFechacumpliento(Date dFechacumpliento) {
		this.dFechacumpliento = dFechacumpliento;
	}

	public Date getDFechaemistit() {
		return this.dFechaemistit;
	}

	public void setDFechaemistit(Date dFechaemistit) {
		this.dFechaemistit = dFechaemistit;
	}

	public Date getDFechapago() {
		return this.dFechapago;
	}

	public void setDFechapago(Date dFechapago) {
		this.dFechapago = dFechapago;
	}

	public Date getDFechaventit() {
		return this.dFechaventit;
	}

	public void setDFechaventit(Date dFechaventit) {
		this.dFechaventit = dFechaventit;
	}

	public BigDecimal getEAmortizacion() {
		return this.eAmortizacion;
	}

	public void setEAmortizacion(BigDecimal eAmortizacion) {
		this.eAmortizacion = eAmortizacion;
	}

	public BigDecimal getECantidad() {
		return this.eCantidad;
	}

	public void setECantidad(BigDecimal eCantidad) {
		this.eCantidad = eCantidad;
	}

	public BigDecimal getEErrorprecio() {
		return this.eErrorprecio;
	}

	public void setEErrorprecio(BigDecimal eErrorprecio) {
		this.eErrorprecio = eErrorprecio;
	}

	public BigDecimal getEFlujototal() {
		return this.eFlujototal;
	}

	public void setEFlujototal(BigDecimal eFlujototal) {
		this.eFlujototal = eFlujototal;
	}

	public BigDecimal getEInteres() {
		return this.eInteres;
	}

	public void setEInteres(BigDecimal eInteres) {
		this.eInteres = eInteres;
	}

	public BigDecimal getEMargen() {
		return this.eMargen;
	}

	public void setEMargen(BigDecimal eMargen) {
		this.eMargen = eMargen;
	}

	public BigDecimal getEPreciolimpio() {
		return this.ePreciolimpio;
	}

	public void setEPreciolimpio(BigDecimal ePreciolimpio) {
		this.ePreciolimpio = ePreciolimpio;
	}

	public BigDecimal getEPreciototal() {
		return this.ePreciototal;
	}

	public void setEPreciototal(BigDecimal ePreciototal) {
		this.ePreciototal = ePreciototal;
	}

	public BigDecimal getERentabilidad() {
		return this.eRentabilidad;
	}

	public void setERentabilidad(BigDecimal eRentabilidad) {
		this.eRentabilidad = eRentabilidad;
	}

	public BigDecimal getESaldoamortizacion() {
		return this.eSaldoamortizacion;
	}

	public void setESaldoamortizacion(BigDecimal eSaldoamortizacion) {
		this.eSaldoamortizacion = eSaldoamortizacion;
	}

	public BigDecimal getETasacupon() {
		return this.eTasacupon;
	}

	public void setETasacupon(BigDecimal eTasacupon) {
		this.eTasacupon = eTasacupon;
	}

	public BigDecimal getEValormoneda() {
		return this.eValormoneda;
	}

	public void setEValormoneda(BigDecimal eValormoneda) {
		this.eValormoneda = eValormoneda;
	}

	public BigDecimal getEVolumen() {
		return this.eVolumen;
	}

	public void setEVolumen(BigDecimal eVolumen) {
		this.eVolumen = eVolumen;
	}

	public int getICodfiltroaplicdo() {
		return this.iCodfiltroaplicdo;
	}

	public void setICodfiltroaplicdo(int iCodfiltroaplicdo) {
		this.iCodfiltroaplicdo = iCodfiltroaplicdo;
	}

	public int getIDiasalcumpliento() {
		return this.iDiasalcumpliento;
	}

	public void setIDiasalcumpliento(int iDiasalcumpliento) {
		this.iDiasalcumpliento = iDiasalcumpliento;
	}

	public int getIDiasalvenciento() {
		return this.iDiasalvenciento;
	}

	public void setIDiasalvenciento(int iDiasalvenciento) {
		this.iDiasalvenciento = iDiasalvenciento;
	}

	public int getIDiasvencimiento() {
		return this.iDiasvencimiento;
	}

	public void setIDiasvencimiento(int iDiasvencimiento) {
		this.iDiasvencimiento = iDiasvencimiento;
	}

	public int getIFiltromonto() {
		return this.iFiltromonto;
	}

	public void setIFiltromonto(int iFiltromonto) {
		this.iFiltromonto = iFiltromonto;
	}

	public int getIFiltrotasa() {
		return this.iFiltrotasa;
	}

	public void setIFiltrotasa(int iFiltrotasa) {
		this.iFiltrotasa = iFiltrotasa;
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

	public int getIMetodofiltro() {
		return this.iMetodofiltro;
	}

	public void setIMetodofiltro(int iMetodofiltro) {
		this.iMetodofiltro = iMetodofiltro;
	}

	public int getINumemisionbr() {
		return this.iNumemisionbr;
	}

	public void setINumemisionbr(int iNumemisionbr) {
		this.iNumemisionbr = iNumemisionbr;
	}

	public int getINumerocupon() {
		return this.iNumerocupon;
	}

	public void setINumerocupon(int iNumerocupon) {
		this.iNumerocupon = iNumerocupon;
	}

	public int getIRangvencimi() {
		return this.iRangvencimi;
	}

	public void setIRangvencimi(int iRangvencimi) {
		this.iRangvencimi = iRangvencimi;
	}

}