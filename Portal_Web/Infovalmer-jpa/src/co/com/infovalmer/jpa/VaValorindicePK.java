package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the va_valorindice database table.
 * 
 */
@Embeddable
public class VaValorindicePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaindice")
	private java.util.Date dFechaindice;

	@Column(name="c_indice")
	private String cIndice;

	public VaValorindicePK() {
	}
	public java.util.Date getDFechaindice() {
		return this.dFechaindice;
	}
	public void setDFechaindice(java.util.Date dFechaindice) {
		this.dFechaindice = dFechaindice;
	}
	public String getCIndice() {
		return this.cIndice;
	}
	public void setCIndice(String cIndice) {
		this.cIndice = cIndice;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VaValorindicePK)) {
			return false;
		}
		VaValorindicePK castOther = (VaValorindicePK)other;
		return 
			this.dFechaindice.equals(castOther.dFechaindice)
			&& this.cIndice.equals(castOther.cIndice);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dFechaindice.hashCode();
		hash = hash * prime + this.cIndice.hashCode();
		
		return hash;
	}
}