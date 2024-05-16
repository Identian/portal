package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_perfil database table.
 * 
 */
@Entity
@Table(name="sp_perfil")
@NamedQuery(name="SpPerfil.findAll", query="SELECT s FROM SpPerfil s")
public class SpPerfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_perfil")
	private int iPerfil;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_rango")
	private String cRango;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horafinsesion")
	private Date dtHorafinsesion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horainisesion")
	private Date dtHorainisesion;

	public SpPerfil() {
	}

	public int getIPerfil() {
		return this.iPerfil;
	}

	public void setIPerfil(int iPerfil) {
		this.iPerfil = iPerfil;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getCRango() {
		return this.cRango;
	}

	public void setCRango(String cRango) {
		this.cRango = cRango;
	}

	public Date getDtHorafinsesion() {
		return this.dtHorafinsesion;
	}

	public void setDtHorafinsesion(Date dtHorafinsesion) {
		this.dtHorafinsesion = dtHorafinsesion;
	}

	public Date getDtHorainisesion() {
		return this.dtHorainisesion;
	}

	public void setDtHorainisesion(Date dtHorainisesion) {
		this.dtHorainisesion = dtHorainisesion;
	}

}