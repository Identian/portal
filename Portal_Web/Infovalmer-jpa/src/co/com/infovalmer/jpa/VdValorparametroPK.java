package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the vd_valorparametro database table.
 * 
 */
@Embeddable
public class VdValorparametroPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_parametro")
	private int iParametro;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechainicio")
	private java.util.Date dFechainicio;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechafin")
	private java.util.Date dFechafin;

	public VdValorparametroPK() {
	}
	public int getIParametro() {
		return this.iParametro;
	}
	public void setIParametro(int iParametro) {
		this.iParametro = iParametro;
	}
	public java.util.Date getDFechainicio() {
		return this.dFechainicio;
	}
	public void setDFechainicio(java.util.Date dFechainicio) {
		this.dFechainicio = dFechainicio;
	}
	public java.util.Date getDFechafin() {
		return this.dFechafin;
	}
	public void setDFechafin(java.util.Date dFechafin) {
		this.dFechafin = dFechafin;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VdValorparametroPK)) {
			return false;
		}
		VdValorparametroPK castOther = (VdValorparametroPK)other;
		return 
			(this.iParametro == castOther.iParametro)
			&& this.dFechainicio.equals(castOther.dFechainicio)
			&& this.dFechafin.equals(castOther.dFechafin);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iParametro;
		hash = hash * prime + this.dFechainicio.hashCode();
		hash = hash * prime + this.dFechafin.hashCode();
		
		return hash;
	}
}