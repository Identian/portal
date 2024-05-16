package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the po_vd_volumen_contrato database table.
 * 
 */
@Embeddable
public class PoVdVolumenContratoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="C_NEMOCONTRATO")
	private String cNemocontrato;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHA")
	private java.util.Date dFecha;

	public PoVdVolumenContratoPK() {
	}
	public String getCNemocontrato() {
		return this.cNemocontrato;
	}
	public void setCNemocontrato(String cNemocontrato) {
		this.cNemocontrato = cNemocontrato;
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
		if (!(other instanceof PoVdVolumenContratoPK)) {
			return false;
		}
		PoVdVolumenContratoPK castOther = (PoVdVolumenContratoPK)other;
		return 
			this.cNemocontrato.equals(castOther.cNemocontrato)
			&& this.dFecha.equals(castOther.dFecha);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cNemocontrato.hashCode();
		hash = hash * prime + this.dFecha.hashCode();
		
		return hash;
	}
}