package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_emisor database table.
 * 
 */
@Entity
@Table(name="sp_emisor")
@NamedQuery(name="SpEmisor.findAll", query="SELECT s FROM SpEmisor s")
public class SpEmisor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_emisor")
	private String cEmisor;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_razonsocial")
	private String cRazonsocial;

	@Column(name="c_situacion")
	private String cSituacion;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecharegistro")
	private Date dFecharegistro;

	public SpEmisor() {
	}

	public String getCEmisor() {
		return this.cEmisor;
	}

	public void setCEmisor(String cEmisor) {
		this.cEmisor = cEmisor;
	}

	public String getCNemotecnico() {
		return this.cNemotecnico;
	}

	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getCRazonsocial() {
		return this.cRazonsocial;
	}

	public void setCRazonsocial(String cRazonsocial) {
		this.cRazonsocial = cRazonsocial;
	}

	public String getCSituacion() {
		return this.cSituacion;
	}

	public void setCSituacion(String cSituacion) {
		this.cSituacion = cSituacion;
	}

	public Date getDFecharegistro() {
		return this.dFecharegistro;
	}

	public void setDFecharegistro(Date dFecharegistro) {
		this.dFecharegistro = dFecharegistro;
	}

}