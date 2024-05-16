package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the po_solicitudcliente database table.
 * 
 */
@Entity
@Table(name="po_solicitudcliente")
@NamedQuery(name="PoSolicitudcliente.findAll", query="SELECT p FROM PoSolicitudcliente p")
public class PoSolicitudcliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_peticion")
	private int iPeticion;

	@Column(name="c_apellidos")
	private String cApellidos;

	@Column(name="c_cargo")
	private String cCargo;

	@Column(name="c_cedula")
	private int cCedula;

	@Column(name="c_ciudad")
	private String cCiudad;

	@Column(name="c_direccion")
	private String cDireccion;

	@Column(name="c_email")
	private String cEmail;

	@Column(name="c_empresa")
	private String cEmpresa;

	@Column(name="c_esempresacliente")
	private String cEsempresacliente;

	@Lob
	@Column(name="c_mensaje")
	private String cMensaje;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_pais")
	private String cPais;

	@Lob
	@Column(name="c_productosinteres")
	private String cProductosinteres;

	@Column(name="c_telefono")
	private String cTelefono;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecharegistro")
	private Date dFecharegistro;

	public PoSolicitudcliente() {
	}

	public int getIPeticion() {
		return this.iPeticion;
	}

	public void setIPeticion(int iPeticion) {
		this.iPeticion = iPeticion;
	}

	public String getCApellidos() {
		return this.cApellidos;
	}

	public void setCApellidos(String cApellidos) {
		this.cApellidos = cApellidos;
	}

	public String getCCargo() {
		return this.cCargo;
	}

	public void setCCargo(String cCargo) {
		this.cCargo = cCargo;
	}

	public int getCCedula() {
		return this.cCedula;
	}

	public void setCCedula(int cCedula) {
		this.cCedula = cCedula;
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

	public String getCEsempresacliente() {
		return this.cEsempresacliente;
	}

	public void setCEsempresacliente(String cEsempresacliente) {
		this.cEsempresacliente = cEsempresacliente;
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

	public String getCProductosinteres() {
		return this.cProductosinteres;
	}

	public void setCProductosinteres(String cProductosinteres) {
		this.cProductosinteres = cProductosinteres;
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