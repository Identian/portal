package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_suscriptor database table.
 * 
 */
@Entity
@Table(name="sp_suscriptor")
@NamedQuery(name="SpSuscriptor.findAll", query="SELECT s FROM SpSuscriptor s")
public class SpSuscriptor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_codigosuscriptor")
	private int iCodigosuscriptor;

	@Column(name="c_ciudad")
	private String cCiudad;

	@Column(name="c_clave")
	private String cClave;

	@Column(name="c_departamento")
	private String cDepartamento;

	@Column(name="c_direccion")
	private String cDireccion;

	@Column(name="c_email")
	private String cEmail;

	@Column(name="c_email2")
	private String cEmail2;

	@Column(name="c_estado")
	private String cEstado;

	@Column(name="c_fax")
	private String cFax;

	@Column(name="c_identificacion")
	private String cIdentificacion;

	@Column(name="c_identiusuario")
	private String cIdentiusuario;

	@Column(name="c_nombresrasocial")
	private String cNombresrasocial;

	@Column(name="c_nombreusuario")
	private String cNombreusuario;

	@Column(name="c_pais")
	private String cPais;

	@Column(name="c_razonsocial")
	private String cRazonsocial;

	@Column(name="c_sexo")
	private String cSexo;

	@Column(name="c_telefono")
	private String cTelefono;

	@Column(name="c_telusuario")
	private String cTelusuario;

	@Column(name="c_tipoidentifica")
	private String cTipoidentifica;

	@Column(name="c_tipoidusuario")
	private String cTipoidusuario;

	@Column(name="c_tipopersona")
	private String cTipopersona;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechanaciento")
	private Date dFechanaciento;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecharegistro")
	private Date dFecharegistro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_ultimologin")
	private Date dtUltimologin;

	@Temporal(TemporalType.DATE)
	@Column(name="f_ult_cambio_clave")
	private Date fUltCambioClave;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="f_ult_cambio_reintento")
	private Date fUltCambioReintento;

	@Column(name="i_numsesiones")
	private int iNumsesiones;

	public SpSuscriptor() {
	}

	public int getICodigosuscriptor() {
		return this.iCodigosuscriptor;
	}

	public void setICodigosuscriptor(int iCodigosuscriptor) {
		this.iCodigosuscriptor = iCodigosuscriptor;
	}

	public String getCCiudad() {
		return this.cCiudad;
	}

	public void setCCiudad(String cCiudad) {
		this.cCiudad = cCiudad;
	}

	public String getCClave() {
		return this.cClave;
	}

	public void setCClave(String cClave) {
		this.cClave = cClave;
	}

	public String getCDepartamento() {
		return this.cDepartamento;
	}

	public void setCDepartamento(String cDepartamento) {
		this.cDepartamento = cDepartamento;
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

	public String getCEmail2() {
		return this.cEmail2;
	}

	public void setCEmail2(String cEmail2) {
		this.cEmail2 = cEmail2;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getCFax() {
		return this.cFax;
	}

	public void setCFax(String cFax) {
		this.cFax = cFax;
	}

	public String getCIdentificacion() {
		return this.cIdentificacion;
	}

	public void setCIdentificacion(String cIdentificacion) {
		this.cIdentificacion = cIdentificacion;
	}

	public String getCIdentiusuario() {
		return this.cIdentiusuario;
	}

	public void setCIdentiusuario(String cIdentiusuario) {
		this.cIdentiusuario = cIdentiusuario;
	}

	public String getCNombresrasocial() {
		return this.cNombresrasocial;
	}

	public void setCNombresrasocial(String cNombresrasocial) {
		this.cNombresrasocial = cNombresrasocial;
	}

	public String getCNombreusuario() {
		return this.cNombreusuario;
	}

	public void setCNombreusuario(String cNombreusuario) {
		this.cNombreusuario = cNombreusuario;
	}

	public String getCPais() {
		return this.cPais;
	}

	public void setCPais(String cPais) {
		this.cPais = cPais;
	}

	public String getCRazonsocial() {
		return this.cRazonsocial;
	}

	public void setCRazonsocial(String cRazonsocial) {
		this.cRazonsocial = cRazonsocial;
	}

	public String getCSexo() {
		return this.cSexo;
	}

	public void setCSexo(String cSexo) {
		this.cSexo = cSexo;
	}

	public String getCTelefono() {
		return this.cTelefono;
	}

	public void setCTelefono(String cTelefono) {
		this.cTelefono = cTelefono;
	}

	public String getCTelusuario() {
		return this.cTelusuario;
	}

	public void setCTelusuario(String cTelusuario) {
		this.cTelusuario = cTelusuario;
	}

	public String getCTipoidentifica() {
		return this.cTipoidentifica;
	}

	public void setCTipoidentifica(String cTipoidentifica) {
		this.cTipoidentifica = cTipoidentifica;
	}

	public String getCTipoidusuario() {
		return this.cTipoidusuario;
	}

	public void setCTipoidusuario(String cTipoidusuario) {
		this.cTipoidusuario = cTipoidusuario;
	}

	public String getCTipopersona() {
		return this.cTipopersona;
	}

	public void setCTipopersona(String cTipopersona) {
		this.cTipopersona = cTipopersona;
	}

	public Date getDFechanaciento() {
		return this.dFechanaciento;
	}

	public void setDFechanaciento(Date dFechanaciento) {
		this.dFechanaciento = dFechanaciento;
	}

	public Date getDFecharegistro() {
		return this.dFecharegistro;
	}

	public void setDFecharegistro(Date dFecharegistro) {
		this.dFecharegistro = dFecharegistro;
	}

	public Date getDtUltimologin() {
		return this.dtUltimologin;
	}

	public void setDtUltimologin(Date dtUltimologin) {
		this.dtUltimologin = dtUltimologin;
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

	public int getINumsesiones() {
		return this.iNumsesiones;
	}

	public void setINumsesiones(int iNumsesiones) {
		this.iNumsesiones = iNumsesiones;
	}

}