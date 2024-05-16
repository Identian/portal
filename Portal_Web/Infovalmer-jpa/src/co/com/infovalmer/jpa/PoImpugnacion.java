package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the po_impugnacion database table.
 * 
 */
@Entity
@Table(name="po_impugnacion")
@NamedQuery(name="PoImpugnacion.findAll", query="SELECT p FROM PoImpugnacion p")
public class PoImpugnacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_impugnacion")
	private int iImpugnacion;

	@Column(name="c_correo")
	private String cCorreo;

	@Column(name="c_curvas")
	private String cCurvas;

//	@Lob
//	@Column(name="c_detalle")
//	private String cDetalle;
//
//	@Column(name="c_nemos")
//	private String cNemos;
//
//	@Lob
//	@Column(name="c_razon")
//	private String cRazon;

	@Lob
	@Column(name="c_respuesta")
	private String cRespuesta;

	@Column(name="c_usuario")
	private String cUsuario;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaproceso")
	private Date dFechaproceso;

	@Temporal(TemporalType.DATE)
	@Column(name="dt_horarespuesta")
	private Date dtHorarespuesta;

	@Column(name="i_mercado")
	private int iMercado;

	@Column(name="i_suscriptor")
	private int iSuscriptor;

	@Column(name="c_telefono")
	private String cTelefono;
	
	public PoImpugnacion() {
	}

	public int getIImpugnacion() {
		return this.iImpugnacion;
	}

	public void setIImpugnacion(int iImpugnacion) {
		this.iImpugnacion = iImpugnacion;
	}

	public String getCCorreo() {
		return this.cCorreo;
	}

	public void setCCorreo(String cCorreo) {
		this.cCorreo = cCorreo;
	}

	public String getCCurvas() {
		return this.cCurvas;
	}

	public void setCCurvas(String cCurvas) {
		this.cCurvas = cCurvas;
	}

//	public String getCDetalle() {
//		return this.cDetalle;
//	}
//
//	public void setCDetalle(String cDetalle) {
//		this.cDetalle = cDetalle;
//	}
//
//	public String getCNemos() {
//		return this.cNemos;
//	}
//
//	public void setCNemos(String cNemos) {
//		this.cNemos = cNemos;
//	}
//
//	public String getCRazon() {
//		return this.cRazon;
//	}

//	public void setCRazon(String cRazon) {
//		this.cRazon = cRazon;
//	}

	public String getCRespuesta() {
		return this.cRespuesta;
	}

	public void setCRespuesta(String cRespuesta) {
		this.cRespuesta = cRespuesta;
	}

	public String getCUsuario() {
		return this.cUsuario;
	}

	public void setCUsuario(String cUsuario) {
		this.cUsuario = cUsuario;
	}

	public Date getDFechaproceso() {
		return this.dFechaproceso;
	}

	public void setDFechaproceso(Date dFechaproceso) {
		this.dFechaproceso = dFechaproceso;
	}

	public Date getDtHorarespuesta() {
		return this.dtHorarespuesta;
	}

	public void setDtHorarespuesta(Date dtHorarespuesta) {
		this.dtHorarespuesta = dtHorarespuesta;
	}

	public int getIMercado() {
		return this.iMercado;
	}

	public void setIMercado(int iMercado) {
		this.iMercado = iMercado;
	}

	public int getISuscriptor() {
		return this.iSuscriptor;
	}

	public void setISuscriptor(int iSuscriptor) {
		this.iSuscriptor = iSuscriptor;
	}

	public String getcTelefono() {
		return cTelefono;
	}

	public void setcTelefono(String cTelefono) {
		this.cTelefono = cTelefono;
	}

}