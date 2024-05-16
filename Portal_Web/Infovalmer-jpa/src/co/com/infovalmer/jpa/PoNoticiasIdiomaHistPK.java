package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the po_noticias_idioma_hist database table.
 * 
 */
@Embeddable
public class PoNoticiasIdiomaHistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="I_NOTICIA")
	private int iNoticia;

	@Column(name="C_IDIOMA")
	private String cIdioma;

	public PoNoticiasIdiomaHistPK() {
	}
	public int getINoticia() {
		return this.iNoticia;
	}
	public void setINoticia(int iNoticia) {
		this.iNoticia = iNoticia;
	}
	public String getCIdioma() {
		return this.cIdioma;
	}
	public void setCIdioma(String cIdioma) {
		this.cIdioma = cIdioma;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PoNoticiasIdiomaHistPK)) {
			return false;
		}
		PoNoticiasIdiomaHistPK castOther = (PoNoticiasIdiomaHistPK)other;
		return 
			(this.iNoticia == castOther.iNoticia)
			&& this.cIdioma.equals(castOther.cIdioma);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iNoticia;
		hash = hash * prime + this.cIdioma.hashCode();
		
		return hash;
	}
}