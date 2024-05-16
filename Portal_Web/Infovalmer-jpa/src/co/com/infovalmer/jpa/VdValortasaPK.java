package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the vd_valortasa database table.
 * 
 */
@Embeddable
public class VdValortasaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_nemotasa")
	private String cNemotasa;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechatasa")
	private java.util.Date dFechatasa;

	public VdValortasaPK() {
	}
	public String getCNemotasa() {
		return this.cNemotasa;
	}
	public void setCNemotasa(String cNemotasa) {
		this.cNemotasa = cNemotasa;
	}
	public java.util.Date getDFechatasa() {
		return this.dFechatasa;
	}
	public void setDFechatasa(java.util.Date dFechatasa) {
		this.dFechatasa = dFechatasa;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VdValortasaPK)) {
			return false;
		}
		VdValortasaPK castOther = (VdValortasaPK)other;
		return 
			this.cNemotasa.equals(castOther.cNemotasa)
			&& this.dFechatasa.equals(castOther.dFechatasa);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cNemotasa.hashCode();
		hash = hash * prime + this.dFechatasa.hashCode();
		
		return hash;
	}
}