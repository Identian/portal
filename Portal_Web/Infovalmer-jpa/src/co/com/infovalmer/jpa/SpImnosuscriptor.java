package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_imnosuscriptor database table.
 * 
 */
@Entity
@Table(name="sp_imnosuscriptor")
@NamedQuery(name="SpImnosuscriptor.findAll", query="SELECT s FROM SpImnosuscriptor s")
public class SpImnosuscriptor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_imnosuscriptor")
	private int iImnosuscriptor;

	@Lob
	@Column(name="b_nota")
	private String bNota;

	@Column(name="c_apellidos")
	private String cApellidos;

	@Column(name="c_clave")
	private String cClave;

	@Column(name="c_direccion")
	private String cDireccion;

	@Column(name="c_empresa")
	private String cEmpresa;

	@Column(name="c_login")
	private String cLogin;

	@Column(name="c_mail")
	private String cMail;

	@Column(name="c_mailopc")
	private String cMailopc;

	@Column(name="c_nombre_imnosuscriptor")
	private String cNombreImnosuscriptor;

	@Column(name="c_profesion")
	private String cProfesion;

	@Column(name="c_telefono")
	private String cTelefono;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="d_fecha_cancelacion")
	private Date dFechaCancelacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="d_fecha_suscripcion")
	private Date dFechaSuscripcion;

	@Column(name="i_cod_imcensura")
	private int iCodImcensura;

	private int i_cod_imestado;

	public SpImnosuscriptor() {
	}

	public int getIImnosuscriptor() {
		return this.iImnosuscriptor;
	}

	public void setIImnosuscriptor(int iImnosuscriptor) {
		this.iImnosuscriptor = iImnosuscriptor;
	}

	public String getBNota() {
		return this.bNota;
	}

	public void setBNota(String bNota) {
		this.bNota = bNota;
	}

	public String getCApellidos() {
		return this.cApellidos;
	}

	public void setCApellidos(String cApellidos) {
		this.cApellidos = cApellidos;
	}

	public String getCClave() {
		return this.cClave;
	}

	public void setCClave(String cClave) {
		this.cClave = cClave;
	}

	public String getCDireccion() {
		return this.cDireccion;
	}

	public void setCDireccion(String cDireccion) {
		this.cDireccion = cDireccion;
	}

	public String getCEmpresa() {
		return this.cEmpresa;
	}

	public void setCEmpresa(String cEmpresa) {
		this.cEmpresa = cEmpresa;
	}

	public String getCLogin() {
		return this.cLogin;
	}

	public void setCLogin(String cLogin) {
		this.cLogin = cLogin;
	}

	public String getCMail() {
		return this.cMail;
	}

	public void setCMail(String cMail) {
		this.cMail = cMail;
	}

	public String getCMailopc() {
		return this.cMailopc;
	}

	public void setCMailopc(String cMailopc) {
		this.cMailopc = cMailopc;
	}

	public String getCNombreImnosuscriptor() {
		return this.cNombreImnosuscriptor;
	}

	public void setCNombreImnosuscriptor(String cNombreImnosuscriptor) {
		this.cNombreImnosuscriptor = cNombreImnosuscriptor;
	}

	public String getCProfesion() {
		return this.cProfesion;
	}

	public void setCProfesion(String cProfesion) {
		this.cProfesion = cProfesion;
	}

	public String getCTelefono() {
		return this.cTelefono;
	}

	public void setCTelefono(String cTelefono) {
		this.cTelefono = cTelefono;
	}

	public Date getDFechaCancelacion() {
		return this.dFechaCancelacion;
	}

	public void setDFechaCancelacion(Date dFechaCancelacion) {
		this.dFechaCancelacion = dFechaCancelacion;
	}

	public Date getDFechaSuscripcion() {
		return this.dFechaSuscripcion;
	}

	public void setDFechaSuscripcion(Date dFechaSuscripcion) {
		this.dFechaSuscripcion = dFechaSuscripcion;
	}

	public int getICodImcensura() {
		return this.iCodImcensura;
	}

	public void setICodImcensura(int iCodImcensura) {
		this.iCodImcensura = iCodImcensura;
	}

	public int getI_cod_imestado() {
		return this.i_cod_imestado;
	}

	public void setI_cod_imestado(int i_cod_imestado) {
		this.i_cod_imestado = i_cod_imestado;
	}

}