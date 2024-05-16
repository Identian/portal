package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_texto database table.
 * 
 */
@Embeddable
public class SpTextoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_texto")
	private int iTexto;

	@Column(name="i_codigopagina")
	private int iCodigopagina;

	public SpTextoPK() {
	}
	public int getITexto() {
		return this.iTexto;
	}
	public void setITexto(int iTexto) {
		this.iTexto = iTexto;
	}
	public int getICodigopagina() {
		return this.iCodigopagina;
	}
	public void setICodigopagina(int iCodigopagina) {
		this.iCodigopagina = iCodigopagina;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpTextoPK)) {
			return false;
		}
		SpTextoPK castOther = (SpTextoPK)other;
		return 
			(this.iTexto == castOther.iTexto)
			&& (this.iCodigopagina == castOther.iCodigopagina);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iTexto;
		hash = hash * prime + this.iCodigopagina;
		
		return hash;
	}
}