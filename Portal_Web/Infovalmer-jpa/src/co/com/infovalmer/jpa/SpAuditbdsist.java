package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_auditbdsist database table.
 * 
 */
@Entity
@Table(name="sp_auditbdsist")
@NamedQuery(name="SpAuditbdsist.findAll", query="SELECT s FROM SpAuditbdsist s")
public class SpAuditbdsist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_auditbdsistema")
	private byte iAuditbdsistema;

	@Column(name="c_accion")
	private String cAccion;

	@Column(name="c_anteriorvalor")
	private String cAnteriorvalor;

	@Column(name="c_campoauditado")
	private String cCampoauditado;

	@Column(name="c_nuevovalor")
	private String cNuevovalor;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private Date dFecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_hora")
	private Date dtHora;

	@Column(name="i_perfil")
	private byte iPerfil;

	@Column(name="i_tablaauditada")
	private byte iTablaauditada;

	@Column(name="i_usuario")
	private byte iUsuario;

	public SpAuditbdsist() {
	}

	public byte getIAuditbdsistema() {
		return this.iAuditbdsistema;
	}

	public void setIAuditbdsistema(byte iAuditbdsistema) {
		this.iAuditbdsistema = iAuditbdsistema;
	}

	public String getCAccion() {
		return this.cAccion;
	}

	public void setCAccion(String cAccion) {
		this.cAccion = cAccion;
	}

	public String getCAnteriorvalor() {
		return this.cAnteriorvalor;
	}

	public void setCAnteriorvalor(String cAnteriorvalor) {
		this.cAnteriorvalor = cAnteriorvalor;
	}

	public String getCCampoauditado() {
		return this.cCampoauditado;
	}

	public void setCCampoauditado(String cCampoauditado) {
		this.cCampoauditado = cCampoauditado;
	}

	public String getCNuevovalor() {
		return this.cNuevovalor;
	}

	public void setCNuevovalor(String cNuevovalor) {
		this.cNuevovalor = cNuevovalor;
	}

	public Date getDFecha() {
		return this.dFecha;
	}

	public void setDFecha(Date dFecha) {
		this.dFecha = dFecha;
	}

	public Date getDtHora() {
		return this.dtHora;
	}

	public void setDtHora(Date dtHora) {
		this.dtHora = dtHora;
	}

	public byte getIPerfil() {
		return this.iPerfil;
	}

	public void setIPerfil(byte iPerfil) {
		this.iPerfil = iPerfil;
	}

	public byte getITablaauditada() {
		return this.iTablaauditada;
	}

	public void setITablaauditada(byte iTablaauditada) {
		this.iTablaauditada = iTablaauditada;
	}

	public byte getIUsuario() {
		return this.iUsuario;
	}

	public void setIUsuario(byte iUsuario) {
		this.iUsuario = iUsuario;
	}

}