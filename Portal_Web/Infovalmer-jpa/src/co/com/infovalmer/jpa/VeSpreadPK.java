package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ve_spreads database table.
 * 
 */
@Embeddable
public class VeSpreadPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechavaloracion")
	private java.util.Date dFechavaloracion;

	@Column(name="d_plazo")
	private int dPlazo;

	public VeSpreadPK() {
	}
	public java.util.Date getDFechavaloracion() {
		return this.dFechavaloracion;
	}
	public void setDFechavaloracion(java.util.Date dFechavaloracion) {
		this.dFechavaloracion = dFechavaloracion;
	}
	public int getDPlazo() {
		return this.dPlazo;
	}
	public void setDPlazo(int dPlazo) {
		this.dPlazo = dPlazo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VeSpreadPK)) {
			return false;
		}
		VeSpreadPK castOther = (VeSpreadPK)other;
		return 
			this.dFechavaloracion.equals(castOther.dFechavaloracion)
			&& (this.dPlazo == castOther.dPlazo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dFechavaloracion.hashCode();
		hash = hash * prime + this.dPlazo;
		
		return hash;
	}
}