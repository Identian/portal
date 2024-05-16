package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_hcaltitulo_original database table.
 * 
 */
@Entity
@Table(name="sp_hcaltitulo_original")
@NamedQuery(name="SpHcaltituloOriginal.findAll", query="SELECT s FROM SpHcaltituloOriginal s")
public class SpHcaltituloOriginal implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpHcaltituloOriginalPK id;

	@Column(name="c_calificacion")
	private String cCalificacion;

	@Column(name="c_vigente")
	private String cVigente;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechafin")
	private Date dFechafin;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaini")
	private Date dFechaini;

	public SpHcaltituloOriginal() {
	}

	public SpHcaltituloOriginalPK getId() {
		return this.id;
	}

	public void setId(SpHcaltituloOriginalPK id) {
		this.id = id;
	}

	public String getCCalificacion() {
		return this.cCalificacion;
	}

	public void setCCalificacion(String cCalificacion) {
		this.cCalificacion = cCalificacion;
	}

	public String getCVigente() {
		return this.cVigente;
	}

	public void setCVigente(String cVigente) {
		this.cVigente = cVigente;
	}

	public Date getDFechafin() {
		return this.dFechafin;
	}

	public void setDFechafin(Date dFechafin) {
		this.dFechafin = dFechafin;
	}

	public Date getDFechaini() {
		return this.dFechaini;
	}

	public void setDFechaini(Date dFechaini) {
		this.dFechaini = dFechaini;
	}

}