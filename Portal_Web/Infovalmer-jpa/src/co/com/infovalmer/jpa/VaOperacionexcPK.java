package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the va_operacionexc database table.
 * 
 */
@Embeddable
public class VaOperacionexcPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaoperacion")
	private java.util.Date dFechaoperacion;

	@Column(name="i_folio")
	private int iFolio;

	public VaOperacionexcPK() {
	}
	public String getCNemotecnico() {
		return this.cNemotecnico;
	}
	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}
	public java.util.Date getDFechaoperacion() {
		return this.dFechaoperacion;
	}
	public void setDFechaoperacion(java.util.Date dFechaoperacion) {
		this.dFechaoperacion = dFechaoperacion;
	}
	public int getIFolio() {
		return this.iFolio;
	}
	public void setIFolio(int iFolio) {
		this.iFolio = iFolio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VaOperacionexcPK)) {
			return false;
		}
		VaOperacionexcPK castOther = (VaOperacionexcPK)other;
		return 
			this.cNemotecnico.equals(castOther.cNemotecnico)
			&& this.dFechaoperacion.equals(castOther.dFechaoperacion)
			&& (this.iFolio == castOther.iFolio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cNemotecnico.hashCode();
		hash = hash * prime + this.dFechaoperacion.hashCode();
		hash = hash * prime + this.iFolio;
		
		return hash;
	}
}