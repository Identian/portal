package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_sistransac database table.
 * 
 */
@Entity
@Table(name="sp_sistransac")
@NamedQuery(name="SpSistransac.findAll", query="SELECT s FROM SpSistransac s")
public class SpSistransac implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_sistransaccio")
	private String cSistransaccio;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	public SpSistransac() {
	}

	public String getCSistransaccio() {
		return this.cSistransaccio;
	}

	public void setCSistransaccio(String cSistransaccio) {
		this.cSistransaccio = cSistransaccio;
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