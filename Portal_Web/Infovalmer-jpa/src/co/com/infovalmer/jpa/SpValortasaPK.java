package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_valortasa database table.
 * 
 */
@Embeddable
public class SpValortasaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_tipotasa")
	private String cTipotasa;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private java.util.Date dFecha;

	public SpValortasaPK() {
	}
	public String getCTipotasa() {
		return this.cTipotasa;
	}
	public void setCTipotasa(String cTipotasa) {
		this.cTipotasa = cTipotasa;
	}
	public java.util.Date getDFecha() {
		return this.dFecha;
	}
	public void setDFecha(java.util.Date dFecha) {
		this.dFecha = dFecha;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpValortasaPK)) {
			return false;
		}
		SpValortasaPK castOther = (SpValortasaPK)other;
		return 
			this.cTipotasa.equals(castOther.cTipotasa)
			&& this.dFecha.equals(castOther.dFecha);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cTipotasa.hashCode();
		hash = hash * prime + this.dFecha.hashCode();
		
		return hash;
	}
}