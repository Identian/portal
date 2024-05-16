package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_idioma database table.
 * 
 */
@Entity
@Table(name="po_idioma")
@NamedQuery(name="PoIdioma.findAll", query="SELECT p FROM PoIdioma p")
public class PoIdioma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="C_IDIOMA")
	private String cIdioma;

	@Column(name="C_DESCRIPCION")
	private String cDescripcion;

	public PoIdioma() {
	}

	public String getCIdioma() {
		return this.cIdioma;
	}

	public void setCIdioma(String cIdioma) {
		this.cIdioma = cIdioma;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

}