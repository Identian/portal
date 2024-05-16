package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_betas database table.
 * 
 */
@Embeddable
public class SpBetaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private java.util.Date dFecha;

	@Column(name="c_curcerocupon")
	private String cCurcerocupon;

	public SpBetaPK() {
	}
	public java.util.Date getDFecha() {
		return this.dFecha;
	}
	public void setDFecha(java.util.Date dFecha) {
		this.dFecha = dFecha;
	}
	public String getCCurcerocupon() {
		return this.cCurcerocupon;
	}
	public void setCCurcerocupon(String cCurcerocupon) {
		this.cCurcerocupon = cCurcerocupon;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpBetaPK)) {
			return false;
		}
		SpBetaPK castOther = (SpBetaPK)other;
		return 
			this.dFecha.equals(castOther.dFecha)
			&& this.cCurcerocupon.equals(castOther.cCurcerocupon);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dFecha.hashCode();
		hash = hash * prime + this.cCurcerocupon.hashCode();
		
		return hash;
	}
}