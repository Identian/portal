package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the po_suscriptor_solicitud_password database table.
 * 
 */
@Entity
@Table(name="po_suscriptor_solicitud_password")
@NamedQuery(name="PoSuscriptorSolicitudPassword.findAll", query="SELECT p FROM PoSuscriptorSolicitudPassword p")
public class PoSuscriptorSolicitudPassword implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_numero_solicitud")
	private int iNumeroSolicitud;

	@Lob
	@Column(name="c_clave_acceso")
	private String cClaveAcceso;

	@Column(name="c_estado")
	private String cEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_fecha_solicitud")
	private Date dtFechaSolicitud;

	@Column(name="i_codigo_suscriptor")
	private int iCodigoSuscriptor;

	public PoSuscriptorSolicitudPassword() {
	}

	public int getINumeroSolicitud() {
		return this.iNumeroSolicitud;
	}

	public void setINumeroSolicitud(int iNumeroSolicitud) {
		this.iNumeroSolicitud = iNumeroSolicitud;
	}

	public String getCClaveAcceso() {
		return this.cClaveAcceso;
	}

	public void setCClaveAcceso(String cClaveAcceso) {
		this.cClaveAcceso = cClaveAcceso;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public Date getDtFechaSolicitud() {
		return this.dtFechaSolicitud;
	}

	public void setDtFechaSolicitud(Date dtFechaSolicitud) {
		this.dtFechaSolicitud = dtFechaSolicitud;
	}

	public int getICodigoSuscriptor() {
		return this.iCodigoSuscriptor;
	}

	public void setICodigoSuscriptor(int iCodigoSuscriptor) {
		this.iCodigoSuscriptor = iCodigoSuscriptor;
	}

}