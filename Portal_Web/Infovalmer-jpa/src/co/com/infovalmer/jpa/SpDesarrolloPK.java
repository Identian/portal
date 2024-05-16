package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_desarrollo database table.
 * 
 */
@Embeddable
public class SpDesarrolloPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Column(name="i_numerocupon")
	private int iNumerocupon;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechainivig")
	private java.util.Date dFechainivig;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechafinvig")
	private java.util.Date dFechafinvig;

	public SpDesarrolloPK() {
	}
	public String getCNemotecnico() {
		return this.cNemotecnico;
	}
	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}
	public int getINumerocupon() {
		return this.iNumerocupon;
	}
	public void setINumerocupon(int iNumerocupon) {
		this.iNumerocupon = iNumerocupon;
	}
	public java.util.Date getDFechainivig() {
		return this.dFechainivig;
	}
	public void setDFechainivig(java.util.Date dFechainivig) {
		this.dFechainivig = dFechainivig;
	}
	public java.util.Date getDFechafinvig() {
		return this.dFechafinvig;
	}
	public void setDFechafinvig(java.util.Date dFechafinvig) {
		this.dFechafinvig = dFechafinvig;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpDesarrolloPK)) {
			return false;
		}
		SpDesarrolloPK castOther = (SpDesarrolloPK)other;
		return 
			this.cNemotecnico.equals(castOther.cNemotecnico)
			&& (this.iNumerocupon == castOther.iNumerocupon)
			&& this.dFechainivig.equals(castOther.dFechainivig)
			&& this.dFechafinvig.equals(castOther.dFechafinvig);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cNemotecnico.hashCode();
		hash = hash * prime + this.iNumerocupon;
		hash = hash * prime + this.dFechainivig.hashCode();
		hash = hash * prime + this.dFechafinvig.hashCode();
		
		return hash;
	}
}