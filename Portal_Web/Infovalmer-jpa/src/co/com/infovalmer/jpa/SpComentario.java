package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_comentario database table.
 * 
 */
@Entity
@Table(name="sp_comentario")
@NamedQuery(name="SpComentario.findAll", query="SELECT s FROM SpComentario s")
public class SpComentario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_comentario")
	private int iComentario;

	@Column(name="c_apellido")
	private String cApellido;

	@Column(name="c_asunto")
	private String cAsunto;

	@Column(name="c_cargo")
	private String cCargo;

	@Column(name="c_comentario")
	private String cComentario;

	@Column(name="c_compania")
	private String cCompania;

	@Column(name="c_direccion")
	private String cDireccion;

	@Column(name="c_email")
	private String cEmail;

	@Column(name="c_fax")
	private String cFax;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_telefono")
	private String cTelefono;

	@Column(name="c_url")
	private String cUrl;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private Date dFecha;

	@Column(name="i_ciudad")
	private int iCiudad;

	@Column(name="i_pais")
	private int iPais;

	public SpComentario() {
	}

	public int getIComentario() {
		return this.iComentario;
	}

	public void setIComentario(int iComentario) {
		this.iComentario = iComentario;
	}

	public String getCApellido() {
		return this.cApellido;
	}

	public void setCApellido(String cApellido) {
		this.cApellido = cApellido;
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

	public String getCComentario() {
		return this.cComentario;
	}

	public void setCComentario(String cComentario) {
		this.cComentario = cComentario;
	}

	public String getCCompania() {
		return this.cCompania;
	}

	public void setCCompania(String cCompania) {
		this.cCompania = cCompania;
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

	public String getCFax() {
		return this.cFax;
	}

	public void setCFax(String cFax) {
		this.cFax = cFax;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getCTelefono() {
		return this.cTelefono;
	}

	public void setCTelefono(String cTelefono) {
		this.cTelefono = cTelefono;
	}

	public String getCUrl() {
		return this.cUrl;
	}

	public void setCUrl(String cUrl) {
		this.cUrl = cUrl;
	}

	public Date getDFecha() {
		return this.dFecha;
	}

	public void setDFecha(Date dFecha) {
		this.dFecha = dFecha;
	}

	public int getICiudad() {
		return this.iCiudad;
	}

	public void setICiudad(int iCiudad) {
		this.iCiudad = iCiudad;
	}

	public int getIPais() {
		return this.iPais;
	}

	public void setIPais(int iPais) {
		this.iPais = iPais;
	}

}