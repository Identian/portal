package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_dispautenti database table.
 * 
 */
@Entity
@Table(name="sp_dispautenti")
@NamedQuery(name="SpDispautenti.findAll", query="SELECT s FROM SpDispautenti s")
public class SpDispautenti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_dispautenti")
	private byte iDispautenti;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	public SpDispautenti() {
	}

	public byte getIDispautenti() {
		return this.iDispautenti;
	}

	public void setIDispautenti(byte iDispautenti) {
		this.iDispautenti = iDispautenti;
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