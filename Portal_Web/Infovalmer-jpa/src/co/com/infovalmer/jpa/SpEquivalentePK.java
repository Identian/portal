package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_equivalente database table.
 * 
 */
@Embeddable
public class SpEquivalentePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Column(name="c_sistnegcion")
	private String cSistnegcion;

	public SpEquivalentePK() {
	}
	public String getCNemotecnico() {
		return this.cNemotecnico;
	}
	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}
	public String getCSistnegcion() {
		return this.cSistnegcion;
	}
	public void setCSistnegcion(String cSistnegcion) {
		this.cSistnegcion = cSistnegcion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpEquivalentePK)) {
			return false;
		}
		SpEquivalentePK castOther = (SpEquivalentePK)other;
		return 
			this.cNemotecnico.equals(castOther.cNemotecnico)
			&& this.cSistnegcion.equals(castOther.cSistnegcion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cNemotecnico.hashCode();
		hash = hash * prime + this.cSistnegcion.hashCode();
		
		return hash;
	}
}