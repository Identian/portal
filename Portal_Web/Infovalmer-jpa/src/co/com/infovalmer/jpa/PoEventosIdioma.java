package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_eventos_idioma database table.
 * 
 */
@Entity
@Table(name="po_eventos_idioma")
@NamedQuery(name="PoEventosIdioma.findAll", query="SELECT p FROM PoEventosIdioma p")
public class PoEventosIdioma implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PoEventosIdiomaPK id;

	@Lob
	@Column(name="C_DESCRIPCION")
	private String cDescripcion;

	public PoEventosIdioma() {
	}

	public PoEventosIdiomaPK getId() {
		return this.id;
	}

	public void setId(PoEventosIdiomaPK id) {
		this.id = id;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

}