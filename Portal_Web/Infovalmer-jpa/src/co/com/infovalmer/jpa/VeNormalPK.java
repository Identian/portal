package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ve_normal database table.
 * 
 */
@Embeddable
public class VeNormalPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="e_fila")
	private long eFila;

	@Column(name="e_columna")
	private long eColumna;

	public VeNormalPK() {
	}
	public long getEFila() {
		return this.eFila;
	}
	public void setEFila(long eFila) {
		this.eFila = eFila;
	}
	public long getEColumna() {
		return this.eColumna;
	}
	public void setEColumna(long eColumna) {
		this.eColumna = eColumna;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VeNormalPK)) {
			return false;
		}
		VeNormalPK castOther = (VeNormalPK)other;
		return 
			(this.eFila == castOther.eFila)
			&& (this.eColumna == castOther.eColumna);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.eFila ^ (this.eFila >>> 32)));
		hash = hash * prime + ((int) (this.eColumna ^ (this.eColumna >>> 32)));
		
		return hash;
	}
}