package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the po_contacto database table.
 * 
 */
@Entity
@Table(name="po_contacto")
@NamedQuery(name="PoContacto.findAll", query="SELECT p FROM PoContacto p")
public class PoContacto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="I_CONTACTO")
	private int iContacto;

	@Column(name="C_APELLIDOS")
	private String cApellidos;

	@Column(name="C_ASUNTO")
	private String cAsunto;

	@Column(name="C_CARGO")
	private String cCargo;

	@Column(name="C_CIUDAD")
	private String cCiudad;

	@Column(name="C_DIRECCION")
	private String cDireccion;

	@Column(name="C_EMAIL")
	private String cEmail;

	@Column(name="C_EMPRESA")
	private String cEmpresa;

	@Column(name="C_ESCLIENTE")
	private String cEscliente;

	@Lob
	@Column(name="C_MENSAJE")
	private String cMensaje;

	@Column(name="C_NOMBRE")
	private String cNombre;

	@Column(name="C_PAIS")
	private String cPais;

	@Column(name="C_TELEFONO")
	private String cTelefono;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHAREGISTRO")
	private Date dFecharegistro;

	public PoContacto() {
	}

	public int getIContacto() {
		return this.iContacto;
	}

	public void setIContacto(int iContacto) {
		this.iContacto = iContacto;
	}

	public String getCApellidos() {
		return this.cApellidos;
	}

	public void setCApellidos(String cApellidos) {
		this.cApellidos = cApellidos;
	}

	public String getCAsunto() {
		return this.cAsunto;
	}

	public void setCAsunto(String cAsunto) {
		this.cAsunto = cAsunto;
	}

	public String getCCargo() {
		return this.cCargo;
	}

	public void setCCargo(String cCargo) {
		this.cCargo = cCargo;
	}

	public String getCCiudad() {
		return this.cCiudad;
	}

	public void setCCiudad(String cCiudad) {
		this.cCiudad = cCiudad;
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

	public String getCEmpresa() {
		return this.cEmpresa;
	}

	public void setCEmpresa(String cEmpresa) {
		this.cEmpresa = cEmpresa;
	}

	public String getCEscliente() {
		return this.cEscliente;
	}

	public void setCEscliente(String cEscliente) {
		this.cEscliente = cEscliente;
	}

	public String getCMensaje() {
		return this.cMensaje;
	}

	public void setCMensaje(String cMensaje) {
		this.cMensaje = cMensaje;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getCPais() {
		return this.cPais;
	}

	public void setCPais(String cPais) {
		this.cPais = cPais;
	}

	public String getCTelefono() {
		return this.cTelefono;
	}

	public void setCTelefono(String cTelefono) {
		this.cTelefono = cTelefono;
	}

	public Date getDFecharegistro() {
		return this.dFecharegistro;
	}

	public void setDFecharegistro(Date dFecharegistro) {
		this.dFecharegistro = dFecharegistro;
	}

}