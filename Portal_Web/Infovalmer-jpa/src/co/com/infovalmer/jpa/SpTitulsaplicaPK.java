package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_titulsaplica database table.
 * 
 */
@Embeddable
public class SpTitulsaplicaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_curvacerocupon")
	private String cCurvacerocupon;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	public SpTitulsaplicaPK() {
	}
	public String getCCurvacerocupon() {
		return this.cCurvacerocupon;
	}
	public void setCCurvacerocupon(String cCurvacerocupon) {
		this.cCurvacerocupon = cCurvacerocupon;
	}
	public String getCNemotecnico() {
		return this.cNemotecnico;
	}
	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpTitulsaplicaPK)) {
			return false;
		}
		SpTitulsaplicaPK castOther = (SpTitulsaplicaPK)other;
		return 
			this.cCurvacerocupon.equals(castOther.cCurvacerocupon)
			&& this.cNemotecnico.equals(castOther.cNemotecnico);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cCurvacerocupon.hashCode();
		hash = hash * prime + this.cNemotecnico.hashCode();
		
		return hash;
	}
}