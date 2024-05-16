package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the vd_logoperinc database table.
 * 
 */
@Embeddable
public class VdLogoperincPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaoperacion")
	private java.util.Date dFechaoperacion;

	@Column(name="i_folio")
	private int iFolio;

	@Column(name="i_motivo")
	private int iMotivo;

	@Column(name="c_accion")
	private String cAccion;

	public VdLogoperincPK() {
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
	public int getIMotivo() {
		return this.iMotivo;
	}
	public void setIMotivo(int iMotivo) {
		this.iMotivo = iMotivo;
	}
	public String getCAccion() {
		return this.cAccion;
	}
	public void setCAccion(String cAccion) {
		this.cAccion = cAccion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VdLogoperincPK)) {
			return false;
		}
		VdLogoperincPK castOther = (VdLogoperincPK)other;
		return 
			this.dFechaoperacion.equals(castOther.dFechaoperacion)
			&& (this.iFolio == castOther.iFolio)
			&& (this.iMotivo == castOther.iMotivo)
			&& this.cAccion.equals(castOther.cAccion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dFechaoperacion.hashCode();
		hash = hash * prime + this.iFolio;
		hash = hash * prime + this.iMotivo;
		hash = hash * prime + this.cAccion.hashCode();
		
		return hash;
	}
}