package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_noticias_idioma database table.
 * 
 */
@Entity
@Table(name="po_noticias_idioma")
@NamedQuery(name="PoNoticiasIdioma.findAll", query="SELECT p FROM PoNoticiasIdioma p")
public class PoNoticiasIdioma implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PoNoticiasIdiomaPK id;

	@Lob
	@Column(name="C_DESCRIPCION")
	private String cDescripcion;

	public PoNoticiasIdioma() {
	}

	public PoNoticiasIdiomaPK getId() {
		return this.id;
	}

	public void setId(PoNoticiasIdiomaPK id) {
		this.id = id;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

}