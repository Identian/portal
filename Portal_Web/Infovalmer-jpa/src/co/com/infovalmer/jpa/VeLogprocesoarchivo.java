package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ve_logprocesoarchivos database table.
 * 
 */
@Entity
@Table(name="ve_logprocesoarchivos")
@NamedQuery(name="VeLogprocesoarchivo.findAll", query="SELECT v FROM VeLogprocesoarchivo v")
public class VeLogprocesoarchivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="c_archivo")
	private String cArchivo;

	@Column(name="c_proceso")
	private String cProceso;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private Date dFecha;

	public VeLogprocesoarchivo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCArchivo() {
		return this.cArchivo;
	}

	public void setCArchivo(String cArchivo) {
		this.cArchivo = cArchivo;
	}

	public String getCProceso() {
		return this.cProceso;
	}

	public void setCProceso(String cProceso) {
		this.cProceso = cProceso;
	}

	public Date getDFecha() {
		return this.dFecha;
	}

	public void setDFecha(Date dFecha) {
		this.dFecha = dFecha;
	}

}