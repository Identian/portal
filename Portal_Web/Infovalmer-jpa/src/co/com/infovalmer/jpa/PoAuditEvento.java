package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the po_audit_eventos database table.
 * 
 */
@Entity
@Table(name="po_audit_eventos")
@NamedQuery(name="PoAuditEvento.findAll", query="SELECT p FROM PoAuditEvento p")
public class PoAuditEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_evento")
	private int idEvento;

	@Lob
	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_dir_ip")
	private String cDirIp;

	@Column(name="c_modulo")
	private String cModulo;

	@Column(name="c_resultado")
	private String cResultado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="d_fecha")
	private Date dFecha;

	@Column(name="i_codigosuscriptor")
	private int iCodigosuscriptor;

	public PoAuditEvento() {
	}

	public int getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCDirIp() {
		return this.cDirIp;
	}

	public void setCDirIp(String cDirIp) {
		this.cDirIp = cDirIp;
	}

	public String getCModulo() {
		return this.cModulo;
	}

	public void setCModulo(String cModulo) {
		this.cModulo = cModulo;
	}

	public String getCResultado() {
		return this.cResultado;
	}

	public void setCResultado(String cResultado) {
		this.cResultado = cResultado;
	}

	public Date getDFecha() {
		return this.dFecha;
	}

	public void setDFecha(Date dFecha) {
		this.dFecha = dFecha;
	}

	public int getICodigosuscriptor() {
		return this.iCodigosuscriptor;
	}

	public void setICodigosuscriptor(int iCodigosuscriptor) {
		this.iCodigosuscriptor = iCodigosuscriptor;
	}

}