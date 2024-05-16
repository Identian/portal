package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ve_ponderadorindice database table.
 * 
 */
@Embeddable
public class VePonderadorindicePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_nemoindice")
	private String cNemoindice;

	@Column(name="c_nemoaccion")
	private String cNemoaccion;

	public VePonderadorindicePK() {
	}
	public String getCNemoindice() {
		return this.cNemoindice;
	}
	public void setCNemoindice(String cNemoindice) {
		this.cNemoindice = cNemoindice;
	}
	public String getCNemoaccion() {
		return this.cNemoaccion;
	}
	public void setCNemoaccion(String cNemoaccion) {
		this.cNemoaccion = cNemoaccion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VePonderadorindicePK)) {
			return false;
		}
		VePonderadorindicePK castOther = (VePonderadorindicePK)other;
		return 
			this.cNemoindice.equals(castOther.cNemoindice)
			&& this.cNemoaccion.equals(castOther.cNemoaccion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cNemoindice.hashCode();
		hash = hash * prime + this.cNemoaccion.hashCode();
		
		return hash;
	}
}