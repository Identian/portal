package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_valormoneda database table.
 * 
 */
@Embeddable
public class SpValormonedaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_tipomoneda")
	private String cTipomoneda;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private java.util.Date dFecha;

	public SpValormonedaPK() {
	}
	public String getCTipomoneda() {
		return this.cTipomoneda;
	}
	public void setCTipomoneda(String cTipomoneda) {
		this.cTipomoneda = cTipomoneda;
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
		if (!(other instanceof SpValormonedaPK)) {
			return false;
		}
		SpValormonedaPK castOther = (SpValormonedaPK)other;
		return 
			this.cTipomoneda.equals(castOther.cTipomoneda)
			&& this.dFecha.equals(castOther.dFecha);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cTipomoneda.hashCode();
		hash = hash * prime + this.dFecha.hashCode();
		
		return hash;
	}
}