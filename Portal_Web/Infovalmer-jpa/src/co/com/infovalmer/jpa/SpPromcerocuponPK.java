package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_promcerocupon database table.
 * 
 */
@Embeddable
public class SpPromcerocuponPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaventit")
	private java.util.Date dFechaventit;

	@Column(name="e_tasacupon")
	private long eTasacupon;

	public SpPromcerocuponPK() {
	}
	public java.util.Date getDFechaventit() {
		return this.dFechaventit;
	}
	public void setDFechaventit(java.util.Date dFechaventit) {
		this.dFechaventit = dFechaventit;
	}
	public long getETasacupon() {
		return this.eTasacupon;
	}
	public void setETasacupon(long eTasacupon) {
		this.eTasacupon = eTasacupon;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpPromcerocuponPK)) {
			return false;
		}
		SpPromcerocuponPK castOther = (SpPromcerocuponPK)other;
		return 
			this.dFechaventit.equals(castOther.dFechaventit)
			&& (this.eTasacupon == castOther.eTasacupon);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dFechaventit.hashCode();
		hash = hash * prime + ((int) (this.eTasacupon ^ (this.eTasacupon >>> 32)));
		
		return hash;
	}
}