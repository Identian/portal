package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the po_etiqueta database table.
 * 
 */
@Embeddable
public class PoEtiquetaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="C_ETIQUETA")
	private String cEtiqueta;

	@Column(name="C_IDIOMA")
	private String cIdioma;

	public PoEtiquetaPK() {
	}
	public String getCEtiqueta() {
		return this.cEtiqueta;
	}
	public void setCEtiqueta(String cEtiqueta) {
		this.cEtiqueta = cEtiqueta;
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
		if (!(other instanceof PoEtiquetaPK)) {
			return false;
		}
		PoEtiquetaPK castOther = (PoEtiquetaPK)other;
		return 
			this.cEtiqueta.equals(castOther.cEtiqueta)
			&& this.cIdioma.equals(castOther.cIdioma);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cEtiqueta.hashCode();
		hash = hash * prime + this.cIdioma.hashCode();
		
		return hash;
	}
}