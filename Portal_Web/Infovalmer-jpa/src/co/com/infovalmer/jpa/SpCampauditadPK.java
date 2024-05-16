package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_campauditad database table.
 * 
 */
@Embeddable
public class SpCampauditadPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_campauditad")
	private String cCampauditad;

	@Column(name="i_tablaauditada")
	private byte iTablaauditada;

	public SpCampauditadPK() {
	}
	public String getCCampauditad() {
		return this.cCampauditad;
	}
	public void setCCampauditad(String cCampauditad) {
		this.cCampauditad = cCampauditad;
	}
	public byte getITablaauditada() {
		return this.iTablaauditada;
	}
	public void setITablaauditada(byte iTablaauditada) {
		this.iTablaauditada = iTablaauditada;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpCampauditadPK)) {
			return false;
		}
		SpCampauditadPK castOther = (SpCampauditadPK)other;
		return 
			this.cCampauditad.equals(castOther.cCampauditad)
			&& (this.iTablaauditada == castOther.iTablaauditada);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cCampauditad.hashCode();
		hash = hash * prime + ((int) this.iTablaauditada);
		
		return hash;
	}
}