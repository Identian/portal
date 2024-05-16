package co.com.infovalmer.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;

public class PrecioPromedioDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cCalificacion;

	private String cEstado;

	@Column(name = "c_isin")
	private String cIsin;

	private String cMoneda;

	private String cNemotecnico;

	@Column(name = "c_periodmodali")
	private String cPeriodmodali;

	private String cTipotasa;

	private String cTipotasaref;

	private String cVigente;

	@Column(name = "d_fechaemistit")
	private Date dFechaemistit;

	private Date dFechafin;

	private Date dFechainicio;

	@Column(name = "d_fecharegistro")
	private Date dFecharegistro;

	@Column(name = "d_fechavenctit")
	private Date dFechavenctit;

	private Date dFecultmprecio;

	private BigDecimal eConvexidad;

	private BigDecimal eCuponcorrido;

	private BigDecimal eDuracion;

	private BigDecimal eDuracionmod;

	private BigDecimal eMargen;

	@Column(name = "e_margenequivalente")
	private BigDecimal eMargenequivalente;

	private BigDecimal eNumemision;

	private BigDecimal ePrecioanterior;

	@Column(name = "e_preciolimpio")
	private BigDecimal ePreciolimpio;

	@Column(name = "e_preciopromedio")
	private BigDecimal ePreciopromedio;

	@Column(name = "e_spread")
	private BigDecimal eSpread;

	@Column(name = "e_tir")
	private BigDecimal eTir;

	private BigDecimal eUltmprecio;

	private BigDecimal eVariacion;

	private int iBasecalculo;

	private int iDiasvencimiento;

	private int iRangovencimiento;

	@Column(name = "i_tipocalculo")
	private int iTipocalculo;

	public PrecioPromedioDto() {
		super();
	}

	public PrecioPromedioDto(String cCalificacion, String cEstado,
			String cIsin, String cMoneda, String cNemotecnico,
			String cPeriodmodali, String cTipotasa, String cTipotasaref,
			String cVigente, Date dFechaemistit, Date dFechafin,
			Date dFechainicio, Date dFecharegistro, Date dFechavenctit,
			Date dFecultmprecio, BigDecimal eConvexidad,
			BigDecimal eCuponcorrido, BigDecimal eDuracion,
			BigDecimal eDuracionmod, BigDecimal eMargen,
			BigDecimal eMargenequivalente, BigDecimal eNumemision,
			BigDecimal ePrecioanterior, BigDecimal ePreciolimpio,
			BigDecimal ePreciopromedio, BigDecimal eSpread, BigDecimal eTir,
			BigDecimal eUltmprecio, BigDecimal eVariacion, int iBasecalculo,
			int iDiasvencimiento, int iRangovencimiento, int iTipocalculo) {
		super();
		this.cCalificacion = cCalificacion;
		this.cEstado = cEstado;
		this.cIsin = cIsin;
		this.cMoneda = cMoneda;
		this.cNemotecnico = cNemotecnico;
		this.cPeriodmodali = cPeriodmodali;
		this.cTipotasa = cTipotasa;
		this.cTipotasaref = cTipotasaref;
		this.cVigente = cVigente;
		this.dFechaemistit = dFechaemistit;
		this.dFechafin = dFechafin;
		this.dFechainicio = dFechainicio;
		this.dFecharegistro = dFecharegistro;
		this.dFechavenctit = dFechavenctit;
		this.dFecultmprecio = dFecultmprecio;
		this.eConvexidad = eConvexidad;
		this.eCuponcorrido = eCuponcorrido;
		this.eDuracion = eDuracion;
		this.eDuracionmod = eDuracionmod;
		this.eMargen = eMargen;
		this.eMargenequivalente = eMargenequivalente;
		this.eNumemision = eNumemision;
		this.ePrecioanterior = ePrecioanterior;
		this.ePreciolimpio = ePreciolimpio;
		this.ePreciopromedio = ePreciopromedio;
		this.eSpread = eSpread;
		this.eTir = eTir;
		this.eUltmprecio = eUltmprecio;
		this.eVariacion = eVariacion;
		this.iBasecalculo = iBasecalculo;
		this.iDiasvencimiento = iDiasvencimiento;
		this.iRangovencimiento = iRangovencimiento;
		this.iTipocalculo = iTipocalculo;
	}

	@Override
	public String toString() {
		return "PrecioPromedioDto [cCalificacion=" + cCalificacion
				+ ", cEstado=" + cEstado + ", cIsin=" + cIsin + ", cMoneda="
				+ cMoneda + ", cNemotecnico=" + cNemotecnico
				+ ", cPeriodmodali=" + cPeriodmodali + ", cTipotasa="
				+ cTipotasa + ", cTipotasaref=" + cTipotasaref + ", cVigente="
				+ cVigente + ", dFechaemistit=" + dFechaemistit
				+ ", dFechafin=" + dFechafin + ", dFechainicio=" + dFechainicio
				+ ", dFecharegistro=" + dFecharegistro + ", dFechavenctit="
				+ dFechavenctit + ", dFecultmprecio=" + dFecultmprecio
				+ ", eConvexidad=" + eConvexidad + ", eCuponcorrido="
				+ eCuponcorrido + ", eDuracion=" + eDuracion
				+ ", eDuracionmod=" + eDuracionmod + ", eMargen=" + eMargen
				+ ", eMargenequivalente=" + eMargenequivalente
				+ ", eNumemision=" + eNumemision + ", ePrecioanterior="
				+ ePrecioanterior + ", ePreciolimpio=" + ePreciolimpio
				+ ", ePreciopromedio=" + ePreciopromedio + ", eSpread="
				+ eSpread + ", eTir=" + eTir + ", eUltmprecio=" + eUltmprecio
				+ ", eVariacion=" + eVariacion + ", iBasecalculo="
				+ iBasecalculo + ", iDiasvencimiento=" + iDiasvencimiento
				+ ", iRangovencimiento=" + iRangovencimiento
				+ ", iTipocalculo=" + iTipocalculo + "]";
	}

	public String getcCalificacion() {
		return cCalificacion;
	}

	public void setcCalificacion(String cCalificacion) {
		this.cCalificacion = cCalificacion;
	}

	public String getcEstado() {
		return cEstado;
	}

	public void setcEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getcIsin() {
		return cIsin;
	}

	public void setcIsin(String cIsin) {
		this.cIsin = cIsin;
	}

	public String getcMoneda() {
		return cMoneda;
	}

	public void setcMoneda(String cMoneda) {
		this.cMoneda = cMoneda;
	}

	public String getcNemotecnico() {
		return cNemotecnico;
	}

	public void setcNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public String getcPeriodmodali() {
		return cPeriodmodali;
	}

	public void setcPeriodmodali(String cPeriodmodali) {
		this.cPeriodmodali = cPeriodmodali;
	}

	public String getcTipotasa() {
		return cTipotasa;
	}

	public void setcTipotasa(String cTipotasa) {
		this.cTipotasa = cTipotasa;
	}

	public String getcTipotasaref() {
		return cTipotasaref;
	}

	public void setcTipotasaref(String cTipotasaref) {
		this.cTipotasaref = cTipotasaref;
	}

	public String getcVigente() {
		return cVigente;
	}

	public void setcVigente(String cVigente) {
		this.cVigente = cVigente;
	}

	public Date getdFechaemistit() {
		return dFechaemistit;
	}

	public void setdFechaemistit(Date dFechaemistit) {
		this.dFechaemistit = dFechaemistit;
	}

	public Date getdFechafin() {
		return dFechafin;
	}

	public void setdFechafin(Date dFechafin) {
		this.dFechafin = dFechafin;
	}

	public Date getdFechainicio() {
		return dFechainicio;
	}

	public void setdFechainicio(Date dFechainicio) {
		this.dFechainicio = dFechainicio;
	}

	public Date getdFecharegistro() {
		return dFecharegistro;
	}

	public void setdFecharegistro(Date dFecharegistro) {
		this.dFecharegistro = dFecharegistro;
	}

	public Date getdFechavenctit() {
		return dFechavenctit;
	}

	public void setdFechavenctit(Date dFechavenctit) {
		this.dFechavenctit = dFechavenctit;
	}

	public Date getdFecultmprecio() {
		return dFecultmprecio;
	}

	public void setdFecultmprecio(Date dFecultmprecio) {
		this.dFecultmprecio = dFecultmprecio;
	}

	public BigDecimal geteConvexidad() {
		return eConvexidad;
	}

	public void seteConvexidad(BigDecimal eConvexidad) {
		this.eConvexidad = eConvexidad;
	}

	public BigDecimal geteCuponcorrido() {
		return eCuponcorrido;
	}

	public void seteCuponcorrido(BigDecimal eCuponcorrido) {
		this.eCuponcorrido = eCuponcorrido;
	}

	public BigDecimal geteDuracion() {
		return eDuracion;
	}

	public void seteDuracion(BigDecimal eDuracion) {
		this.eDuracion = eDuracion;
	}

	public BigDecimal geteDuracionmod() {
		return eDuracionmod;
	}

	public void seteDuracionmod(BigDecimal eDuracionmod) {
		this.eDuracionmod = eDuracionmod;
	}

	public BigDecimal geteMargen() {
		return eMargen;
	}

	public void seteMargen(BigDecimal eMargen) {
		this.eMargen = eMargen;
	}

	public BigDecimal geteMargenequivalente() {
		return eMargenequivalente;
	}

	public void seteMargenequivalente(BigDecimal eMargenequivalente) {
		this.eMargenequivalente = eMargenequivalente;
	}

	public BigDecimal geteNumemision() {
		return eNumemision;
	}

	public void seteNumemision(BigDecimal eNumemision) {
		this.eNumemision = eNumemision;
	}

	public BigDecimal getePrecioanterior() {
		return ePrecioanterior;
	}

	public void setePrecioanterior(BigDecimal ePrecioanterior) {
		this.ePrecioanterior = ePrecioanterior;
	}

	public BigDecimal getePreciolimpio() {
		return ePreciolimpio;
	}

	public void setePreciolimpio(BigDecimal ePreciolimpio) {
		this.ePreciolimpio = ePreciolimpio;
	}

	public BigDecimal getePreciopromedio() {
		return ePreciopromedio;
	}

	public void setePreciopromedio(BigDecimal ePreciopromedio) {
		this.ePreciopromedio = ePreciopromedio;
	}

	public BigDecimal geteSpread() {
		return eSpread;
	}

	public void seteSpread(BigDecimal eSpread) {
		this.eSpread = eSpread;
	}

	public BigDecimal geteTir() {
		return eTir;
	}

	public void seteTir(BigDecimal eTir) {
		this.eTir = eTir;
	}

	public BigDecimal geteUltmprecio() {
		return eUltmprecio;
	}

	public void seteUltmprecio(BigDecimal eUltmprecio) {
		this.eUltmprecio = eUltmprecio;
	}

	public BigDecimal geteVariacion() {
		return eVariacion;
	}

	public void seteVariacion(BigDecimal eVariacion) {
		this.eVariacion = eVariacion;
	}

	public int getiBasecalculo() {
		return iBasecalculo;
	}

	public void setiBasecalculo(int iBasecalculo) {
		this.iBasecalculo = iBasecalculo;
	}

	public int getiDiasvencimiento() {
		return iDiasvencimiento;
	}

	public void setiDiasvencimiento(int iDiasvencimiento) {
		this.iDiasvencimiento = iDiasvencimiento;
	}

	public int getiRangovencimiento() {
		return iRangovencimiento;
	}

	public void setiRangovencimiento(int iRangovencimiento) {
		this.iRangovencimiento = iRangovencimiento;
	}

	public int getiTipocalculo() {
		return iTipocalculo;
	}

	public void setiTipocalculo(int iTipocalculo) {
		this.iTipocalculo = iTipocalculo;
	}

}
