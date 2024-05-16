package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sp_valin database table.
 * 
 */
@Entity
@Table(name="sp_valin")
@NamedQuery(name="SpValin.findAll", query="SELECT s FROM SpValin s")
public class SpValin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_secuencia")
	private String cSecuencia;

	@Column(name="c_calend")
	private String cCalend;

	@Column(name="c_cqp")
	private String cCqp;

	@Column(name="c_curva")
	private String cCurva;

	@Column(name="c_estado")
	private String cEstado;

	@Column(name="c_modemi")
	private String cModemi;

	@Column(name="c_modrei")
	private String cModrei;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Column(name="c_opcion")
	private String cOpcion;

	@Column(name="c_tipoefec")
	private String cTipoefec;

	@Temporal(TemporalType.DATE)
	@Column(name="d_feccum")
	private Date dFeccum;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecemi")
	private Date dFecemi;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecval")
	private Date dFecval;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecven")
	private Date dFecven;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_hora")
	private Date dtHora;

	@Column(name="e_cantid")
	private BigDecimal eCantid;

	@Column(name="e_margen")
	private BigDecimal eMargen;

	@Column(name="e_monto")
	private BigDecimal eMonto;

	@Column(name="e_precio")
	private BigDecimal ePrecio;

	@Column(name="e_tasa")
	private BigDecimal eTasa;

	@Column(name="e_tasemi")
	private BigDecimal eTasemi;

	@Column(name="i_diaven")
	private int iDiaven;

	public SpValin() {
	}

	public String getCSecuencia() {
		return this.cSecuencia;
	}

	public void setCSecuencia(String cSecuencia) {
		this.cSecuencia = cSecuencia;
	}

	public String getCCalend() {
		return this.cCalend;
	}

	public void setCCalend(String cCalend) {
		this.cCalend = cCalend;
	}

	public String getCCqp() {
		return this.cCqp;
	}

	public void setCCqp(String cCqp) {
		this.cCqp = cCqp;
	}

	public String getCCurva() {
		return this.cCurva;
	}

	public void setCCurva(String cCurva) {
		this.cCurva = cCurva;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getCModemi() {
		return this.cModemi;
	}

	public void setCModemi(String cModemi) {
		this.cModemi = cModemi;
	}

	public String getCModrei() {
		return this.cModrei;
	}

	public void setCModrei(String cModrei) {
		this.cModrei = cModrei;
	}

	public String getCNemotecnico() {
		return this.cNemotecnico;
	}

	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public String getCOpcion() {
		return this.cOpcion;
	}

	public void setCOpcion(String cOpcion) {
		this.cOpcion = cOpcion;
	}

	public String getCTipoefec() {
		return this.cTipoefec;
	}

	public void setCTipoefec(String cTipoefec) {
		this.cTipoefec = cTipoefec;
	}

	public Date getDFeccum() {
		return this.dFeccum;
	}

	public void setDFeccum(Date dFeccum) {
		this.dFeccum = dFeccum;
	}

	public Date getDFecemi() {
		return this.dFecemi;
	}

	public void setDFecemi(Date dFecemi) {
		this.dFecemi = dFecemi;
	}

	public Date getDFecval() {
		return this.dFecval;
	}

	public void setDFecval(Date dFecval) {
		this.dFecval = dFecval;
	}

	public Date getDFecven() {
		return this.dFecven;
	}

	public void setDFecven(Date dFecven) {
		this.dFecven = dFecven;
	}

	public Date getDtHora() {
		return this.dtHora;
	}

	public void setDtHora(Date dtHora) {
		this.dtHora = dtHora;
	}

	public BigDecimal getECantid() {
		return this.eCantid;
	}

	public void setECantid(BigDecimal eCantid) {
		this.eCantid = eCantid;
	}

	public BigDecimal getEMargen() {
		return this.eMargen;
	}

	public void setEMargen(BigDecimal eMargen) {
		this.eMargen = eMargen;
	}

	public BigDecimal getEMonto() {
		return this.eMonto;
	}

	public void setEMonto(BigDecimal eMonto) {
		this.eMonto = eMonto;
	}

	public BigDecimal getEPrecio() {
		return this.ePrecio;
	}

	public void setEPrecio(BigDecimal ePrecio) {
		this.ePrecio = ePrecio;
	}

	public BigDecimal getETasa() {
		return this.eTasa;
	}

	public void setETasa(BigDecimal eTasa) {
		this.eTasa = eTasa;
	}

	public BigDecimal getETasemi() {
		return this.eTasemi;
	}

	public void setETasemi(BigDecimal eTasemi) {
		this.eTasemi = eTasemi;
	}

	public int getIDiaven() {
		return this.iDiaven;
	}

	public void setIDiaven(int iDiaven) {
		this.iDiaven = iDiaven;
	}

}