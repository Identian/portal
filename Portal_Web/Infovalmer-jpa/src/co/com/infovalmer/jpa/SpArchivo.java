package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sp_archivo database table.
 * 
 */
@Entity
@Table(name="sp_archivo")
@NamedQuery(name="SpArchivo.findAll", query="SELECT s FROM SpArchivo s")
public class SpArchivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_archivo")
	private int iArchivo;

	@Column(name="c_sistnegcion")
	private String cSistnegcion;

	@Column(name="c_tipointerfaz")
	private String cTipointerfaz;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechagenerado")
	private Date dFechagenerado;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecharadicacion")
	private Date dFecharadicacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horaradicacion")
	private Date dtHoraradicacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horatransmision")
	private Date dtHoratransmision;

	@Column(name="e_cifracontrol")
	private BigDecimal eCifracontrol;

	@Column(name="e_valorregistros")
	private BigDecimal eValorregistros;

	@Column(name="i_cantregistros")
	private byte iCantregistros;

	@Column(name="i_consecpaquete")
	private byte iConsecpaquete;

	@Column(name="i_motivorechazo")
	private int iMotivorechazo;

	@Column(name="i_numsecuencia")
	private int iNumsecuencia;

	public SpArchivo() {
	}

	public int getIArchivo() {
		return this.iArchivo;
	}

	public void setIArchivo(int iArchivo) {
		this.iArchivo = iArchivo;
	}

	public String getCSistnegcion() {
		return this.cSistnegcion;
	}

	public void setCSistnegcion(String cSistnegcion) {
		this.cSistnegcion = cSistnegcion;
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

	public Date getDtHoraradicacion() {
		return this.dtHoraradicacion;
	}

	public void setDtHoraradicacion(Date dtHoraradicacion) {
		this.dtHoraradicacion = dtHoraradicacion;
	}

	public Date getDtHoratransmision() {
		return this.dtHoratransmision;
	}

	public void setDtHoratransmision(Date dtHoratransmision) {
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

	public byte getICantregistros() {
		return this.iCantregistros;
	}

	public void setICantregistros(byte iCantregistros) {
		this.iCantregistros = iCantregistros;
	}

	public byte getIConsecpaquete() {
		return this.iConsecpaquete;
	}

	public void setIConsecpaquete(byte iConsecpaquete) {
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