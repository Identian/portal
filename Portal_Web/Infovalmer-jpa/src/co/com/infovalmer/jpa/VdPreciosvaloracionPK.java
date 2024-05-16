package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the vd_preciosvaloracion database table.
 * 
 */
@Embeddable
public class VdPreciosvaloracionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_idinstrumento")
	private long iIdinstrumento;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechavaloracion")
	private java.util.Date dFechavaloracion;

	public VdPreciosvaloracionPK() {
	}
	public long getIIdinstrumento() {
		return this.iIdinstrumento;
	}
	public void setIIdinstrumento(long iIdinstrumento) {
		this.iIdinstrumento = iIdinstrumento;
	}
	public java.util.Date getDFechavaloracion() {
		return this.dFechavaloracion;
	}
	public void setDFechavaloracion(java.util.Date dFechavaloracion) {
		this.dFechavaloracion = dFechavaloracion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VdPreciosvaloracionPK)) {
			return false;
		}
		VdPreciosvaloracionPK castOther = (VdPreciosvaloracionPK)other;
		return 
			(this.iIdinstrumento == castOther.iIdinstrumento)
			&& this.dFechavaloracion.equals(castOther.dFechavaloracion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.iIdinstrumento ^ (this.iIdinstrumento >>> 32)));
		hash = hash * prime + this.dFechavaloracion.hashCode();
		
		return hash;
	}
}