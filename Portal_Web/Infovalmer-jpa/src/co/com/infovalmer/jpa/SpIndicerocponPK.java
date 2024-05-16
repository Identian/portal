package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_indicerocpon database table.
 * 
 */
@Embeddable
public class SpIndicerocponPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_indicerocpon")
	private String cIndicerocpon;

	@Column(name="c_curvacerocupon")
	private String cCurvacerocupon;

	public SpIndicerocponPK() {
	}
	public String getCIndicerocpon() {
		return this.cIndicerocpon;
	}
	public void setCIndicerocpon(String cIndicerocpon) {
		this.cIndicerocpon = cIndicerocpon;
	}
	public String getCCurvacerocupon() {
		return this.cCurvacerocupon;
	}
	public void setCCurvacerocupon(String cCurvacerocupon) {
		this.cCurvacerocupon = cCurvacerocupon;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpIndicerocponPK)) {
			return false;
		}
		SpIndicerocponPK castOther = (SpIndicerocponPK)other;
		return 
			this.cIndicerocpon.equals(castOther.cIndicerocpon)
			&& this.cCurvacerocupon.equals(castOther.cCurvacerocupon);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cIndicerocpon.hashCode();
		hash = hash * prime + this.cCurvacerocupon.hashCode();
		
		return hash;
	}
}