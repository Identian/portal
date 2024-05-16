package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ve_logcasoespecial database table.
 * 
 */
@Embeddable
public class VeLogcasoespecialPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechavaloracion")
	private java.util.Date dFechavaloracion;

	@Column(name="i_idinstrumento")
	private long iIdinstrumento;

	@Column(name="c_accion")
	private String cAccion;

	public VeLogcasoespecialPK() {
	}
	public java.util.Date getDFechavaloracion() {
		return this.dFechavaloracion;
	}
	public void setDFechavaloracion(java.util.Date dFechavaloracion) {
		this.dFechavaloracion = dFechavaloracion;
	}
	public long getIIdinstrumento() {
		return this.iIdinstrumento;
	}
	public void setIIdinstrumento(long iIdinstrumento) {
		this.iIdinstrumento = iIdinstrumento;
	}
	public String getCAccion() {
		return this.cAccion;
	}
	public void setCAccion(String cAccion) {
		this.cAccion = cAccion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VeLogcasoespecialPK)) {
			return false;
		}
		VeLogcasoespecialPK castOther = (VeLogcasoespecialPK)other;
		return 
			this.dFechavaloracion.equals(castOther.dFechavaloracion)
			&& (this.iIdinstrumento == castOther.iIdinstrumento)
			&& this.cAccion.equals(castOther.cAccion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dFechavaloracion.hashCode();
		hash = hash * prime + ((int) (this.iIdinstrumento ^ (this.iIdinstrumento >>> 32)));
		hash = hash * prime + this.cAccion.hashCode();
		
		return hash;
	}
}