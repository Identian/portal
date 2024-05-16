package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the po_portafolios database table.
 * 
 */
@Entity
@Table(name="po_portafolios")
@NamedQuery(name="PoPortafolio.findAll", query="SELECT p FROM PoPortafolio p")
public class PoPortafolio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_identificador")
	private int iIdentificador;

	@Lob
	@Column(name="c_fxml_respuesta")
	private String cFxmlRespuesta;

	@Lob
	@Column(name="c_fxml_solicitud")
	private String cFxmlSolicitud;

	@Column(name="c_transaction_id")
	private String cTransactionId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="d_fecha_respuesta")
	private Date dFechaRespuesta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="d_fecha_solicitud")
	private Date dFechaSolicitud;

	@Column(name="i_codigosuscriptor")
	private int iCodigosuscriptor;

	public PoPortafolio() {
	}

	public int getIIdentificador() {
		return this.iIdentificador;
	}

	public void setIIdentificador(int iIdentificador) {
		this.iIdentificador = iIdentificador;
	}

	public String getCFxmlRespuesta() {
		return this.cFxmlRespuesta;
	}

	public void setCFxmlRespuesta(String cFxmlRespuesta) {
		this.cFxmlRespuesta = cFxmlRespuesta;
	}

	public String getCFxmlSolicitud() {
		return this.cFxmlSolicitud;
	}

	public void setCFxmlSolicitud(String cFxmlSolicitud) {
		this.cFxmlSolicitud = cFxmlSolicitud;
	}

	public String getCTransactionId() {
		return this.cTransactionId;
	}

	public void setCTransactionId(String cTransactionId) {
		this.cTransactionId = cTransactionId;
	}

	public Date getDFechaRespuesta() {
		return this.dFechaRespuesta;
	}

	public void setDFechaRespuesta(Date dFechaRespuesta) {
		this.dFechaRespuesta = dFechaRespuesta;
	}

	public Date getDFechaSolicitud() {
		return this.dFechaSolicitud;
	}

	public void setDFechaSolicitud(Date dFechaSolicitud) {
		this.dFechaSolicitud = dFechaSolicitud;
	}

	public int getICodigosuscriptor() {
		return this.iCodigosuscriptor;
	}

	public void setICodigosuscriptor(int iCodigosuscriptor) {
		this.iCodigosuscriptor = iCodigosuscriptor;
	}

}