package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_hindice database table.
 * 
 */
@Embeddable
public class SpHindicePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_indice")
	private String cIndice;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaindice")
	private java.util.Date dFechaindice;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechavcto")
	private java.util.Date dFechavcto;

	public SpHindicePK() {
	}
	public String getCIndice() {
		return this.cIndice;
	}
	public void setCIndice(String cIndice) {
		this.cIndice = cIndice;
	}
	public java.util.Date getDFechaindice() {
		return this.dFechaindice;
	}
	public void setDFechaindice(java.util.Date dFechaindice) {
		this.dFechaindice = dFechaindice;
	}
	public java.util.Date getDFechavcto() {
		return this.dFechavcto;
	}
	public void setDFechavcto(java.util.Date dFechavcto) {
		this.dFechavcto = dFechavcto;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpHindicePK)) {
			return false;
		}
		SpHindicePK castOther = (SpHindicePK)other;
		return 
			this.cIndice.equals(castOther.cIndice)
			&& this.dFechaindice.equals(castOther.dFechaindice)
			&& this.dFechavcto.equals(castOther.dFechavcto);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cIndice.hashCode();
		hash = hash * prime + this.dFechaindice.hashCode();
		hash = hash * prime + this.dFechavcto.hashCode();
		
		return hash;
	}
}