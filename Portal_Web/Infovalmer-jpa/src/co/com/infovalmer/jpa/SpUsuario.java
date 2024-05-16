package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sp_usuario database table.
 * 
 */
@Entity
@Table(name="sp_usuario")
@NamedQuery(name="SpUsuario.findAll", query="SELECT s FROM SpUsuario s")
public class SpUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpUsuarioPK id;

	@Column(name="c_apellidos")
	private String cApellidos;

	@Column(name="c_contrasena")
	private String cContrasena;

	@Column(name="c_direccion")
	private String cDireccion;

	@Column(name="c_email")
	private String cEmail;

	@Column(name="c_estado")
	private String cEstado;

	@Column(name="c_login")
	private String cLogin;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_proceso")
	private String cProceso;

	@Column(name="c_telefono")
	private String cTelefono;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_ultimologin")
	private Date dtUltimologin;

	@Column(name="e_identificacion")
	private BigDecimal eIdentificacion;

	@Temporal(TemporalType.DATE)
	@Column(name="f_ult_cambio_clave")
	private Date fUltCambioClave;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="f_ult_cambio_reintento")
	private Date fUltCambioReintento;

	@Column(name="i_empresa")
	private int iEmpresa;

	@Column(name="i_numsesiones")
	private int iNumsesiones;

	@Column(name="i_usuario_padre")
	private int iUsuarioPadre;

	@Column(name="i_usuariosupvisor")
	private int iUsuariosupvisor;

	public SpUsuario() {
	}

	public SpUsuarioPK getId() {
		return this.id;
	}

	public void setId(SpUsuarioPK id) {
		this.id = id;
	}

	public String getCApellidos() {
		return this.cApellidos;
	}

	public void setCApellidos(String cApellidos) {
		this.cApellidos = cApellidos;
	}

	public String getCContrasena() {
		return this.cContrasena;
	}

	public void setCContrasena(String cContrasena) {
		this.cContrasena = cContrasena;
	}

	public String getCDireccion() {
		return this.cDireccion;
	}

	public void setCDireccion(String cDireccion) {
		this.cDireccion = cDireccion;
	}

	public String getCEmail() {
		return this.cEmail;
	}

	public void setCEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getCLogin() {
		return this.cLogin;
	}

	public void setCLogin(String cLogin) {
		this.cLogin = cLogin;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getCProceso() {
		return this.cProceso;
	}

	public void setCProceso(String cProceso) {
		this.cProceso = cProceso;
	}

	public String getCTelefono() {
		return this.cTelefono;
	}

	public void setCTelefono(String cTelefono) {
		this.cTelefono = cTelefono;
	}

	public Date getDtUltimologin() {
		return this.dtUltimologin;
	}

	public void setDtUltimologin(Date dtUltimologin) {
		this.dtUltimologin = dtUltimologin;
	}

	public BigDecimal getEIdentificacion() {
		return this.eIdentificacion;
	}

	public void setEIdentificacion(BigDecimal eIdentificacion) {
		this.eIdentificacion = eIdentificacion;
	}

	public Date getFUltCambioClave() {
		return this.fUltCambioClave;
	}

	public void setFUltCambioClave(Date fUltCambioClave) {
		this.fUltCambioClave = fUltCambioClave;
	}

	public Date getFUltCambioReintento() {
		return this.fUltCambioReintento;
	}

	public void setFUltCambioReintento(Date fUltCambioReintento) {
		this.fUltCambioReintento = fUltCambioReintento;
	}

	public int getIEmpresa() {
		return this.iEmpresa;
	}

	public void setIEmpresa(int iEmpresa) {
		this.iEmpresa = iEmpresa;
	}

	public int getINumsesiones() {
		return this.iNumsesiones;
	}

	public void setINumsesiones(int iNumsesiones) {
		this.iNumsesiones = iNumsesiones;
	}

	public int getIUsuarioPadre() {
		return this.iUsuarioPadre;
	}

	public void setIUsuarioPadre(int iUsuarioPadre) {
		this.iUsuarioPadre = iUsuarioPadre;
	}

	public int getIUsuariosupvisor() {
		return this.iUsuariosupvisor;
	}

	public void setIUsuariosupvisor(int iUsuariosupvisor) {
		this.iUsuariosupvisor = iUsuariosupvisor;
	}

}