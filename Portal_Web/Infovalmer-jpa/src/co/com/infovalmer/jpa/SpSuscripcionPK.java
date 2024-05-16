package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_suscripcion database table.
 * 
 */
@Embeddable
public class SpSuscripcionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaini")
	private java.util.Date dFechaini;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechafin")
	private java.util.Date dFechafin;

	@Column(name="i_codigosuscriptor")
	private int iCodigosuscriptor;

	@Column(name="i_codigoproducto")
	private byte iCodigoproducto;

	public SpSuscripcionPK() {
	}
	public java.util.Date getDFechaini() {
		return this.dFechaini;
	}
	public void setDFechaini(java.util.Date dFechaini) {
		this.dFechaini = dFechaini;
	}
	public java.util.Date getDFechafin() {
		return this.dFechafin;
	}
	public void setDFechafin(java.util.Date dFechafin) {
		this.dFechafin = dFechafin;
	}
	public int getICodigosuscriptor() {
		return this.iCodigosuscriptor;
	}
	public void setICodigosuscriptor(int iCodigosuscriptor) {
		this.iCodigosuscriptor = iCodigosuscriptor;
	}
	public byte getICodigoproducto() {
		return this.iCodigoproducto;
	}
	public void setICodigoproducto(byte iCodigoproducto) {
		this.iCodigoproducto = iCodigoproducto;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpSuscripcionPK)) {
			return false;
		}
		SpSuscripcionPK castOther = (SpSuscripcionPK)other;
		return 
			this.dFechaini.equals(castOther.dFechaini)
			&& this.dFechafin.equals(castOther.dFechafin)
			&& (this.iCodigosuscriptor == castOther.iCodigosuscriptor)
			&& (this.iCodigoproducto == castOther.iCodigoproducto);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dFechaini.hashCode();
		hash = hash * prime + this.dFechafin.hashCode();
		hash = hash * prime + this.iCodigosuscriptor;
		hash = hash * prime + ((int) this.iCodigoproducto);
		
		return hash;
	}
}