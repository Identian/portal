package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_tipotasa database table.
 * 
 */
@Entity
@Table(name="sp_tipotasa")
@NamedQuery(name="SpTipotasa.findAll", query="SELECT s FROM SpTipotasa s")
public class SpTipotasa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_tipotasa")
	private String cTipotasa;

	@Column(name="c_casoespecial")
	private String cCasoespecial;

	@Column(name="c_ctipo")
	private String cCtipo;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_equivalencia")
	private String cEquivalencia;

	@Column(name="c_estado")
	private String cEstado;

	@Column(name="c_periodmodali")
	private String cPeriodmodali;

	@Column(name="c_vigencia")
	private String cVigencia;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechafin")
	private Date dFechafin;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaini")
	private Date dFechaini;

	@Column(name="i_codtiptasa")
	private byte iCodtiptasa;

	@Column(name="i_grupotasa")
	private byte iGrupotasa;

	@Column(name="i_operador")
	private byte iOperador;

	public SpTipotasa() {
	}

	public String getCTipotasa() {
		return this.cTipotasa;
	}

	public void setCTipotasa(String cTipotasa) {
		this.cTipotasa = cTipotasa;
	}

	public String getCCasoespecial() {
		return this.cCasoespecial;
	}

	public void setCCasoespecial(String cCasoespecial) {
		this.cCasoespecial = cCasoespecial;
	}

	public String getCCtipo() {
		return this.cCtipo;
	}

	public void setCCtipo(String cCtipo) {
		this.cCtipo = cCtipo;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCEquivalencia() {
		return this.cEquivalencia;
	}

	public void setCEquivalencia(String cEquivalencia) {
		this.cEquivalencia = cEquivalencia;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getCPeriodmodali() {
		return this.cPeriodmodali;
	}

	public void setCPeriodmodali(String cPeriodmodali) {
		this.cPeriodmodali = cPeriodmodali;
	}

	public String getCVigencia() {
		return this.cVigencia;
	}

	public void setCVigencia(String cVigencia) {
		this.cVigencia = cVigencia;
	}

	public Date getDFechafin() {
		return this.dFechafin;
	}

	public void setDFechafin(Date dFechafin) {
		this.dFechafin = dFechafin;
	}

	public Date getDFechaini() {
		return this.dFechaini;
	}

	public void setDFechaini(Date dFechaini) {
		this.dFechaini = dFechaini;
	}

	public byte getICodtiptasa() {
		return this.iCodtiptasa;
	}

	public void setICodtiptasa(byte iCodtiptasa) {
		this.iCodtiptasa = iCodtiptasa;
	}

	public byte getIGrupotasa() {
		return this.iGrupotasa;
	}

	public void setIGrupotasa(byte iGrupotasa) {
		this.iGrupotasa = iGrupotasa;
	}

	public byte getIOperador() {
		return this.iOperador;
	}

	public void setIOperador(byte iOperador) {
		this.iOperador = iOperador;
	}

}