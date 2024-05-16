package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ve_canastaentregables database table.
 * 
 */
@Embeddable
public class VeCanastaentregablePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_nemosubyacente")
	private String cNemosubyacente;

	@Column(name="c_nemotecnicoentregable")
	private String cNemotecnicoentregable;

	public VeCanastaentregablePK() {
	}
	public String getCNemosubyacente() {
		return this.cNemosubyacente;
	}
	public void setCNemosubyacente(String cNemosubyacente) {
		this.cNemosubyacente = cNemosubyacente;
	}
	public String getCNemotecnicoentregable() {
		return this.cNemotecnicoentregable;
	}
	public void setCNemotecnicoentregable(String cNemotecnicoentregable) {
		this.cNemotecnicoentregable = cNemotecnicoentregable;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VeCanastaentregablePK)) {
			return false;
		}
		VeCanastaentregablePK castOther = (VeCanastaentregablePK)other;
		return 
			this.cNemosubyacente.equals(castOther.cNemosubyacente)
			&& this.cNemotecnicoentregable.equals(castOther.cNemotecnicoentregable);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cNemosubyacente.hashCode();
		hash = hash * prime + this.cNemotecnicoentregable.hashCode();
		
		return hash;
	}
}