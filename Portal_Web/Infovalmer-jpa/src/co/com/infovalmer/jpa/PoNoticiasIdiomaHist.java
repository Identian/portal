package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_noticias_idioma_hist database table.
 * 
 */
@Entity
@Table(name="po_noticias_idioma_hist")
@NamedQuery(name="PoNoticiasIdiomaHist.findAll", query="SELECT p FROM PoNoticiasIdiomaHist p")
public class PoNoticiasIdiomaHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PoNoticiasIdiomaHistPK id;

	@Lob
	@Column(name="C_DESCRIPCION")
	private String cDescripcion;

	public PoNoticiasIdiomaHist() {
	}

	public PoNoticiasIdiomaHistPK getId() {
		return this.id;
	}

	public void setId(PoNoticiasIdiomaHistPK id) {
		this.id = id;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

}