package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class SpCalendextPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "c_nemoequivale")
	private String cNemoequivale;

	@Column(name = "c_nemotecnico")
	private String cNemotecnico;

	@Temporal(TemporalType.DATE)
	@Column(name = "d_fecha")
	private Date dFecha;

	public String getcNemoequivale() {
		return cNemoequivale;
	}

	public void setcNemoequivale(String cNemoequivale) {
		this.cNemoequivale = cNemoequivale;
	}

	public String getcNemotecnico() {
		return cNemotecnico;
	}

	public void setcNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public Date getdFecha() {
		return dFecha;
	}

	public void setdFecha(Date dFecha) {
		this.dFecha = dFecha;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpCalendextPK)) {
			return false;
		}
		SpCalendextPK castOther = (SpCalendextPK) other;
		return this.dFecha.equals(castOther.dFecha)
				&& this.cNemoequivale.equals(castOther.cNemoequivale)
				&& this.cNemotecnico.equals(castOther.cNemotecnico);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cNemoequivale.hashCode();
		hash = hash * prime + this.cNemotecnico.hashCode();
		hash = hash * prime + this.dFecha.hashCode();

		return hash;
	}

}
