package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the po_puntoscurva database table.
 * 
 */
@Embeddable
public class PoPuntoscurvaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_curva")
	private int iCurva;

	@Column(name="i_dias")
	private int iDias;

	public PoPuntoscurvaPK() {
	}
	public int getICurva() {
		return this.iCurva;
	}
	public void setICurva(int iCurva) {
		this.iCurva = iCurva;
	}
	public int getIDias() {
		return this.iDias;
	}
	public void setIDias(int iDias) {
		this.iDias = iDias;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PoPuntoscurvaPK)) {
			return false;
		}
		PoPuntoscurvaPK castOther = (PoPuntoscurvaPK)other;
		return 
			(this.iCurva == castOther.iCurva)
			&& (this.iDias == castOther.iDias);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iCurva;
		hash = hash * prime + this.iDias;
		
		return hash;
	}
}