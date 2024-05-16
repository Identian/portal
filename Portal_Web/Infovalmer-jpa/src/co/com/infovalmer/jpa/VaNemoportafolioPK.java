package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the va_nemoportafolio database table.
 * 
 */
@Embeddable
public class VaNemoportafolioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	public VaNemoportafolioPK() {
	}
	public String getCNombre() {
		return this.cNombre;
	}
	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}
	public String getCNemotecnico() {
		return this.cNemotecnico;
	}
	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VaNemoportafolioPK)) {
			return false;
		}
		VaNemoportafolioPK castOther = (VaNemoportafolioPK)other;
		return 
			this.cNombre.equals(castOther.cNombre)
			&& this.cNemotecnico.equals(castOther.cNemotecnico);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cNombre.hashCode();
		hash = hash * prime + this.cNemotecnico.hashCode();
		
		return hash;
	}
}