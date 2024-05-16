package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ve_puntosfwd database table.
 * 
 */
@Embeddable
public class VePuntosfwdPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechavaloracion")
	private java.util.Date dFechavaloracion;

	@Column(name="e_plazo")
	private long ePlazo;

	public VePuntosfwdPK() {
	}
	public java.util.Date getDFechavaloracion() {
		return this.dFechavaloracion;
	}
	public void setDFechavaloracion(java.util.Date dFechavaloracion) {
		this.dFechavaloracion = dFechavaloracion;
	}
	public long getEPlazo() {
		return this.ePlazo;
	}
	public void setEPlazo(long ePlazo) {
		this.ePlazo = ePlazo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VePuntosfwdPK)) {
			return false;
		}
		VePuntosfwdPK castOther = (VePuntosfwdPK)other;
		return 
			this.dFechavaloracion.equals(castOther.dFechavaloracion)
			&& (this.ePlazo == castOther.ePlazo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dFechavaloracion.hashCode();
		hash = hash * prime + ((int) (this.ePlazo ^ (this.ePlazo >>> 32)));
		
		return hash;
	}
}