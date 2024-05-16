package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the va_preciopromedio database table.
 * 
 */
@Embeddable
public class VaPreciopromedioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaprecio")
	private java.util.Date dFechaprecio;

	public VaPreciopromedioPK() {
	}
	public String getCNemotecnico() {
		return this.cNemotecnico;
	}
	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}
	public java.util.Date getDFechaprecio() {
		return this.dFechaprecio;
	}
	public void setDFechaprecio(java.util.Date dFechaprecio) {
		this.dFechaprecio = dFechaprecio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VaPreciopromedioPK)) {
			return false;
		}
		VaPreciopromedioPK castOther = (VaPreciopromedioPK)other;
		return 
			this.cNemotecnico.equals(castOther.cNemotecnico)
			&& this.dFechaprecio.equals(castOther.dFechaprecio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cNemotecnico.hashCode();
		hash = hash * prime + this.dFechaprecio.hashCode();
		
		return hash;
	}
}