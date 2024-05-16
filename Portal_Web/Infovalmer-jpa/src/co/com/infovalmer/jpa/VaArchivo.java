package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the va_archivo database table.
 * 
 */
@Entity
@Table(name="va_archivo")
@NamedQuery(name="VaArchivo.findAll", query="SELECT v FROM VaArchivo v")
public class VaArchivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_archivo")
	private int iArchivo;

	@Column(name="c_tipointerfaz")
	private String cTipointerfaz;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechagenerado")
	private Date dFechagenerado;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecharadicacion")
	private Date dFecharadicacion;

	@Column(name="dt_horaradicacion")
	private Timestamp dtHoraradicacion;

	@Column(name="dt_horatransmision")
	private Timestamp dtHoratransmision;

	@Column(name="e_cifracontrol")
	private BigDecimal eCifracontrol;

	@Column(name="e_valorregistros")
	private BigDecimal eValorregistros;

	@Column(name="i_cantregistros")
	private int iCantregistros;

	@Column(name="i_consecpaquete")
	private int iConsecpaquete;

	@Column(name="i_motivorechazo")
	private int iMotivorechazo;

	@Column(name="i_numsecuencia")
	private int iNumsecuencia;

	public VaArchivo() {
	}

	public int getIArchivo() {
		return this.iArchivo;
	}

	public void setIArchivo(int iArchivo) {
		this.iArchivo = iArchivo;
	}

	public String getCTipointerfaz() {
		return this.cTipointerfaz;
	}

	public void setCTipointerfaz(String cTipointerfaz) {
		this.cTipointerfaz = cTipointerfaz;
	}

	public Date getDFechagenerado() {
		return this.dFechagenerado;
	}

	public void setDFechagenerado(Date dFechagenerado) {
		this.dFechagenerado = dFechagenerado;
	}

	public Date getDFecharadicacion() {
		return this.dFecharadicacion;
	}

	public void setDFecharadicacion(Date dFecharadicacion) {
		this.dFecharadicacion = dFecharadicacion;
	}

	public Timestamp getDtHoraradicacion() {
		return this.dtHoraradicacion;
	}

	public void setDtHoraradicacion(Timestamp dtHoraradicacion) {
		this.dtHoraradicacion = dtHoraradicacion;
	}

	public Timestamp getDtHoratransmision() {
		return this.dtHoratransmision;
	}

	public void setDtHoratransmision(Timestamp dtHoratransmision) {
		this.dtHoratransmision = dtHoratransmision;
	}

	public BigDecimal getECifracontrol() {
		return this.eCifracontrol;
	}

	public void setECifracontrol(BigDecimal eCifracontrol) {
		this.eCifracontrol = eCifracontrol;
	}

	public BigDecimal getEValorregistros() {
		return this.eValorregistros;
	}

	public void setEValorregistros(BigDecimal eValorregistros) {
		this.eValorregistros = eValorregistros;
	}

	public int getICantregistros() {
		return this.iCantregistros;
	}

	public void setICantregistros(int iCantregistros) {
		this.iCantregistros = iCantregistros;
	}

	public int getIConsecpaquete() {
		return this.iConsecpaquete;
	}

	public void setIConsecpaquete(int iConsecpaquete) {
		this.iConsecpaquete = iConsecpaquete;
	}

	public int getIMotivorechazo() {
		return this.iMotivorechazo;
	}

	public void setIMotivorechazo(int iMotivorechazo) {
		this.iMotivorechazo = iMotivorechazo;
	}

	public int getINumsecuencia() {
		return this.iNumsecuencia;
	}

	public void setINumsecuencia(int iNumsecuencia) {
		this.iNumsecuencia = iNumsecuencia;
	}

}