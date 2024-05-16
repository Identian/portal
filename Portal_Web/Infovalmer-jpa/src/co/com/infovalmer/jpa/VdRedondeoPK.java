package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the vd_redondeo database table.
 * 
 */
@Embeddable
public class VdRedondeoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_clasecontrato")
	private int iClasecontrato;

	@Column(name="i_tiposubyacente")
	private int iTiposubyacente;

	public VdRedondeoPK() {
	}
	public int getIClasecontrato() {
		return this.iClasecontrato;
	}
	public void setIClasecontrato(int iClasecontrato) {
		this.iClasecontrato = iClasecontrato;
	}
	public int getITiposubyacente() {
		return this.iTiposubyacente;
	}
	public void setITiposubyacente(int iTiposubyacente) {
		this.iTiposubyacente = iTiposubyacente;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VdRedondeoPK)) {
			return false;
		}
		VdRedondeoPK castOther = (VdRedondeoPK)other;
		return 
			(this.iClasecontrato == castOther.iClasecontrato)
			&& (this.iTiposubyacente == castOther.iTiposubyacente);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iClasecontrato;
		hash = hash * prime + this.iTiposubyacente;
		
		return hash;
	}
}