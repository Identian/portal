package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the vd_factorconv database table.
 * 
 */
@Embeddable
public class VdFactorconvPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_idinstrumento")
	private long iIdinstrumento;

	@Column(name="c_nemotecnicoentregable")
	private String cNemotecnicoentregable;

	public VdFactorconvPK() {
	}
	public long getIIdinstrumento() {
		return this.iIdinstrumento;
	}
	public void setIIdinstrumento(long iIdinstrumento) {
		this.iIdinstrumento = iIdinstrumento;
	}
	public String getCNemotecnicoentregable() {
		return this.cNemotecnicoentregable;
	}
	public void setCNemotecnicoentregable(String cNemotecnicoentregable) {
		this.cNemotecnicoentregable = cNemotecnicoentregable;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VdFactorconvPK)) {
			return false;
		}
		VdFactorconvPK castOther = (VdFactorconvPK)other;
		return 
			(this.iIdinstrumento == castOther.iIdinstrumento)
			&& this.cNemotecnicoentregable.equals(castOther.cNemotecnicoentregable);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.iIdinstrumento ^ (this.iIdinstrumento >>> 32)));
		hash = hash * prime + this.cNemotecnicoentregable.hashCode();
		
		return hash;
	}
}