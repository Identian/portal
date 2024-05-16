package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the vd_pagodividendos database table.
 * 
 */
@Embeddable
public class VdPagodividendoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechapago")
	private java.util.Date dFechapago;

	public VdPagodividendoPK() {
	}
	public String getCNemotecnico() {
		return this.cNemotecnico;
	}
	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}
	public java.util.Date getDFechapago() {
		return this.dFechapago;
	}
	public void setDFechapago(java.util.Date dFechapago) {
		this.dFechapago = dFechapago;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VdPagodividendoPK)) {
			return false;
		}
		VdPagodividendoPK castOther = (VdPagodividendoPK)other;
		return 
			this.cNemotecnico.equals(castOther.cNemotecnico)
			&& this.dFechapago.equals(castOther.dFechapago);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cNemotecnico.hashCode();
		hash = hash * prime + this.dFechapago.hashCode();
		
		return hash;
	}
}