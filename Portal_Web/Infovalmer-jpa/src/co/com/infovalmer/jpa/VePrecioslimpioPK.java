package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ve_precioslimpios database table.
 * 
 */
@Embeddable
public class VePrecioslimpioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_nemotecnicoentregable")
	private String cNemotecnicoentregable;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private java.util.Date dFecha;

	public VePrecioslimpioPK() {
	}
	public String getCNemotecnicoentregable() {
		return this.cNemotecnicoentregable;
	}
	public void setCNemotecnicoentregable(String cNemotecnicoentregable) {
		this.cNemotecnicoentregable = cNemotecnicoentregable;
	}
	public java.util.Date getDFecha() {
		return this.dFecha;
	}
	public void setDFecha(java.util.Date dFecha) {
		this.dFecha = dFecha;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VePrecioslimpioPK)) {
			return false;
		}
		VePrecioslimpioPK castOther = (VePrecioslimpioPK)other;
		return 
			this.cNemotecnicoentregable.equals(castOther.cNemotecnicoentregable)
			&& this.dFecha.equals(castOther.dFecha);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cNemotecnicoentregable.hashCode();
		hash = hash * prime + this.dFecha.hashCode();
		
		return hash;
	}
}