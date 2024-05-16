package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the po_opcion_idioma database table.
 * 
 */
@Embeddable
public class PoOpcionIdiomaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="C_IDIOMA")
	private String cIdioma;

	@Column(name="I_OPCION")
	private int iOpcion;

	public PoOpcionIdiomaPK() {
	}
	public String getCIdioma() {
		return this.cIdioma;
	}
	public void setCIdioma(String cIdioma) {
		this.cIdioma = cIdioma;
	}
	public int getIOpcion() {
		return this.iOpcion;
	}
	public void setIOpcion(int iOpcion) {
		this.iOpcion = iOpcion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PoOpcionIdiomaPK)) {
			return false;
		}
		PoOpcionIdiomaPK castOther = (PoOpcionIdiomaPK)other;
		return 
			this.cIdioma.equals(castOther.cIdioma)
			&& (this.iOpcion == castOther.iOpcion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cIdioma.hashCode();
		hash = hash * prime + this.iOpcion;
		
		return hash;
	}
}