package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_impugnacion database table.
 * 
 */
@Entity
@Table(name="sp_impugnacion")
@NamedQuery(name="SpImpugnacion.findAll", query="SELECT s FROM SpImpugnacion s")
public class SpImpugnacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpImpugnacionPK id;

	@Column(name="c_cargo")
	private String cCargo;

	@Column(name="c_ciudad")
	private String cCiudad;

	@Column(name="c_correo")
	private String cCorreo;

	@Column(name="c_direccion")
	private String cDireccion;

	@Column(name="c_entidad")
	private String cEntidad;

	@Column(name="c_estado")
	private String cEstado;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_telefono")
	private String cTelefono;

	@Column(name="c_usuario")
	private String cUsuario;

	@Column(name="c_usuariorespuesta")
	private String cUsuariorespuesta;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaproceso")
	private Date dFechaproceso;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horaimpugna")
	private Date dtHoraimpugna;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horarespuesta")
	private Date dtHorarespuesta;

	public SpImpugnacion() {
	}

	public SpImpugnacionPK getId() {
		return this.id;
	}

	public void setId(SpImpugnacionPK id) {
		this.id = id;
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

	public String getCCorreo() {
		return this.cCorreo;
	}

	public void setCCorreo(String cCorreo) {
		this.cCorreo = cCorreo;
	}

	public String getCDireccion() {
		return this.cDireccion;
	}

	public void setCDireccion(String cDireccion) {
		this.cDireccion = cDireccion;
	}

	public String getCEntidad() {
		return this.cEntidad;
	}

	public void setCEntidad(String cEntidad) {
		this.cEntidad = cEntidad;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
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

	public String getCUsuario() {
		return this.cUsuario;
	}

	public void setCUsuario(String cUsuario) {
		this.cUsuario = cUsuario;
	}

	public String getCUsuariorespuesta() {
		return this.cUsuariorespuesta;
	}

	public void setCUsuariorespuesta(String cUsuariorespuesta) {
		this.cUsuariorespuesta = cUsuariorespuesta;
	}

	public Date getDFechaproceso() {
		return this.dFechaproceso;
	}

	public void setDFechaproceso(Date dFechaproceso) {
		this.dFechaproceso = dFechaproceso;
	}

	public Date getDtHoraimpugna() {
		return this.dtHoraimpugna;
	}

	public void setDtHoraimpugna(Date dtHoraimpugna) {
		this.dtHoraimpugna = dtHoraimpugna;
	}

	public Date getDtHorarespuesta() {
		return this.dtHorarespuesta;
	}

	public void setDtHorarespuesta(Date dtHorarespuesta) {
		this.dtHorarespuesta = dtHorarespuesta;
	}

}