package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_impugnacion database table.
 * 
 */
@Embeddable
public class SpImpugnacionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_impugnacion")
	private int iImpugnacion;

	@Column(name="c_tipo")
	private String cTipo;

	public SpImpugnacionPK() {
	}
	public int getIImpugnacion() {
		return this.iImpugnacion;
	}
	public void setIImpugnacion(int iImpugnacion) {
		this.iImpugnacion = iImpugnacion;
	}
	public String getCTipo() {
		return this.cTipo;
	}
	public void setCTipo(String cTipo) {
		this.cTipo = cTipo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpImpugnacionPK)) {
			return false;
		}
		SpImpugnacionPK castOther = (SpImpugnacionPK)other;
		return 
			(this.iImpugnacion == castOther.iImpugnacion)
			&& this.cTipo.equals(castOther.cTipo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iImpugnacion;
		hash = hash * prime + this.cTipo.hashCode();
		
		return hash;
	}
}