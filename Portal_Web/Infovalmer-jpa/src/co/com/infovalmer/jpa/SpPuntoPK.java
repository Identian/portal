package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_puntos database table.
 * 
 */
@Embeddable
public class SpPuntoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private java.util.Date dFecha;

	@Column(name="i_plazodias")
	private int iPlazodias;

	@Column(name="c_curcerocupon")
	private String cCurcerocupon;

	public SpPuntoPK() {
	}
	public java.util.Date getDFecha() {
		return this.dFecha;
	}
	public void setDFecha(java.util.Date dFecha) {
		this.dFecha = dFecha;
	}
	public int getIPlazodias() {
		return this.iPlazodias;
	}
	public void setIPlazodias(int iPlazodias) {
		this.iPlazodias = iPlazodias;
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
		if (!(other instanceof SpPuntoPK)) {
			return false;
		}
		SpPuntoPK castOther = (SpPuntoPK)other;
		return 
			this.dFecha.equals(castOther.dFecha)
			&& (this.iPlazodias == castOther.iPlazodias)
			&& this.cCurcerocupon.equals(castOther.cCurcerocupon);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dFecha.hashCode();
		hash = hash * prime + this.iPlazodias;
		hash = hash * prime + this.cCurcerocupon.hashCode();
		
		return hash;
	}
}