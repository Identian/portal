package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_dgrupotasa database table.
 * 
 */
@Embeddable
public class SpDgrupotasaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_tipotasa")
	private String cTipotasa;

	@Column(name="i_grupotasa")
	private byte iGrupotasa;

	public SpDgrupotasaPK() {
	}
	public String getCTipotasa() {
		return this.cTipotasa;
	}
	public void setCTipotasa(String cTipotasa) {
		this.cTipotasa = cTipotasa;
	}
	public byte getIGrupotasa() {
		return this.iGrupotasa;
	}
	public void setIGrupotasa(byte iGrupotasa) {
		this.iGrupotasa = iGrupotasa;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpDgrupotasaPK)) {
			return false;
		}
		SpDgrupotasaPK castOther = (SpDgrupotasaPK)other;
		return 
			this.cTipotasa.equals(castOther.cTipotasa)
			&& (this.iGrupotasa == castOther.iGrupotasa);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cTipotasa.hashCode();
		hash = hash * prime + ((int) this.iGrupotasa);
		
		return hash;
	}
}