package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_tablafuncion database table.
 * 
 */
@Entity
@Table(name="sp_tablafuncion")
@NamedQuery(name="SpTablafuncion.findAll", query="SELECT s FROM SpTablafuncion s")
public class SpTablafuncion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpTablafuncionPK id;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	public SpTablafuncion() {
	}

	public SpTablafuncionPK getId() {
		return this.id;
	}

	public void setId(SpTablafuncionPK id) {
		this.id = id;
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

}