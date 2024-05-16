package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sp_valout database table.
 * 
 */
@Entity
@Table(name="sp_valout")
@NamedQuery(name="SpValout.findAll", query="SELECT s FROM SpValout s")
public class SpValout implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_secuencia")
	private String cSecuencia;

	@Column(name="c_deserr")
	private String cDeserr;

	@Column(name="c_estado")
	private String cEstado;

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

	@Column(name="i_coderr")
	private int iCoderr;

	@Column(name="i_diaven")
	private int iDiaven;

	public SpValout() {
	}

	public String getCSecuencia() {
		return this.cSecuencia;
	}

	public void setCSecuencia(String cSecuencia) {
		this.cSecuencia = cSecuencia;
	}

	public String getCDeserr() {
		return this.cDeserr;
	}

	public void setCDeserr(String cDeserr) {
		this.cDeserr = cDeserr;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
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

	public int getICoderr() {
		return this.iCoderr;
	}

	public void setICoderr(int iCoderr) {
		this.iCoderr = iCoderr;
	}

	public int getIDiaven() {
		return this.iDiaven;
	}

	public void setIDiaven(int iDiaven) {
		this.iDiaven = iDiaven;
	}

}