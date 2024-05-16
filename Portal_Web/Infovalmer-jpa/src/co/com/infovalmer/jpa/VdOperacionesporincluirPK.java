package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the vd_operacionesporincluir database table.
 * 
 */
@Embeddable
public class VdOperacionesporincluirPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="t_fecha")
	private java.util.Date tFecha;

	@Column(name="i_folio")
	private int iFolio;

	public VdOperacionesporincluirPK() {
	}
	public String getCNemotecnico() {
		return this.cNemotecnico;
	}
	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}
	public java.util.Date getTFecha() {
		return this.tFecha;
	}
	public void setTFecha(java.util.Date tFecha) {
		this.tFecha = tFecha;
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
		if (!(other instanceof VdOperacionesporincluirPK)) {
			return false;
		}
		VdOperacionesporincluirPK castOther = (VdOperacionesporincluirPK)other;
		return 
			this.cNemotecnico.equals(castOther.cNemotecnico)
			&& this.tFecha.equals(castOther.tFecha)
			&& (this.iFolio == castOther.iFolio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cNemotecnico.hashCode();
		hash = hash * prime + this.tFecha.hashCode();
		hash = hash * prime + this.iFolio;
		
		return hash;
	}
}