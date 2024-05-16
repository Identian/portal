package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_hfilprecio database table.
 * 
 */
@Embeddable
public class SpHfilprecioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaproceso")
	private java.util.Date dFechaproceso;

	@Column(name="i_metodofiltro")
	private int iMetodofiltro;

	public SpHfilprecioPK() {
	}
	public java.util.Date getDFechaproceso() {
		return this.dFechaproceso;
	}
	public void setDFechaproceso(java.util.Date dFechaproceso) {
		this.dFechaproceso = dFechaproceso;
	}
	public int getIMetodofiltro() {
		return this.iMetodofiltro;
	}
	public void setIMetodofiltro(int iMetodofiltro) {
		this.iMetodofiltro = iMetodofiltro;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpHfilprecioPK)) {
			return false;
		}
		SpHfilprecioPK castOther = (SpHfilprecioPK)other;
		return 
			this.dFechaproceso.equals(castOther.dFechaproceso)
			&& (this.iMetodofiltro == castOther.iMetodofiltro);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dFechaproceso.hashCode();
		hash = hash * prime + this.iMetodofiltro;
		
		return hash;
	}
}