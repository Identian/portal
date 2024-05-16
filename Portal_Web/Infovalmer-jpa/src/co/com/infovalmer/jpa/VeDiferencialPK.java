package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ve_diferencial database table.
 * 
 */
@Embeddable
public class VeDiferencialPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private java.util.Date dFecha;

	@Column(name="c_tipoderivado")
	private String cTipoderivado;

	@Column(name="c_nemosubyacente")
	private String cNemosubyacente;

	@Column(name="c_nemocontrato")
	private String cNemocontrato;

	public VeDiferencialPK() {
	}
	public java.util.Date getDFecha() {
		return this.dFecha;
	}
	public void setDFecha(java.util.Date dFecha) {
		this.dFecha = dFecha;
	}
	public String getCTipoderivado() {
		return this.cTipoderivado;
	}
	public void setCTipoderivado(String cTipoderivado) {
		this.cTipoderivado = cTipoderivado;
	}
	public String getCNemosubyacente() {
		return this.cNemosubyacente;
	}
	public void setCNemosubyacente(String cNemosubyacente) {
		this.cNemosubyacente = cNemosubyacente;
	}
	public String getCNemocontrato() {
		return this.cNemocontrato;
	}
	public void setCNemocontrato(String cNemocontrato) {
		this.cNemocontrato = cNemocontrato;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VeDiferencialPK)) {
			return false;
		}
		VeDiferencialPK castOther = (VeDiferencialPK)other;
		return 
			this.dFecha.equals(castOther.dFecha)
			&& this.cTipoderivado.equals(castOther.cTipoderivado)
			&& this.cNemosubyacente.equals(castOther.cNemosubyacente)
			&& this.cNemocontrato.equals(castOther.cNemocontrato);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dFecha.hashCode();
		hash = hash * prime + this.cTipoderivado.hashCode();
		hash = hash * prime + this.cNemosubyacente.hashCode();
		hash = hash * prime + this.cNemocontrato.hashCode();
		
		return hash;
	}
}