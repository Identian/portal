package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the po_eventos_idioma database table.
 * 
 */
@Embeddable
public class PoEventosIdiomaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="C_IDIOMA")
	private String cIdioma;

	@Column(name="I_EVENTO")
	private int iEvento;

	public PoEventosIdiomaPK() {
	}
	public String getCIdioma() {
		return this.cIdioma;
	}
	public void setCIdioma(String cIdioma) {
		this.cIdioma = cIdioma;
	}
	public int getIEvento() {
		return this.iEvento;
	}
	public void setIEvento(int iEvento) {
		this.iEvento = iEvento;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PoEventosIdiomaPK)) {
			return false;
		}
		PoEventosIdiomaPK castOther = (PoEventosIdiomaPK)other;
		return 
			this.cIdioma.equals(castOther.cIdioma)
			&& (this.iEvento == castOther.iEvento);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cIdioma.hashCode();
		hash = hash * prime + this.iEvento;
		
		return hash;
	}
}