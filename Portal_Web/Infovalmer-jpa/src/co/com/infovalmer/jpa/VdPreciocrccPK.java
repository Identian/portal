package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the vd_preciocrcc database table.
 * 
 */
@Embeddable
public class VdPreciocrccPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechavaloracion")
	private java.util.Date dFechavaloracion;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaemision")
	private java.util.Date dFechaemision;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechavencimiento")
	private java.util.Date dFechavencimiento;

	@Column(name="i_diasvencimiento")
	private int iDiasvencimiento;

	@Column(name="c_modalidad")
	private String cModalidad;

	@Column(name="c_reinversion")
	private String cReinversion;

	public VdPreciocrccPK() {
	}
	public java.util.Date getDFechavaloracion() {
		return this.dFechavaloracion;
	}
	public void setDFechavaloracion(java.util.Date dFechavaloracion) {
		this.dFechavaloracion = dFechavaloracion;
	}
	public String getCNemotecnico() {
		return this.cNemotecnico;
	}
	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}
	public java.util.Date getDFechaemision() {
		return this.dFechaemision;
	}
	public void setDFechaemision(java.util.Date dFechaemision) {
		this.dFechaemision = dFechaemision;
	}
	public java.util.Date getDFechavencimiento() {
		return this.dFechavencimiento;
	}
	public void setDFechavencimiento(java.util.Date dFechavencimiento) {
		this.dFechavencimiento = dFechavencimiento;
	}
	public int getIDiasvencimiento() {
		return this.iDiasvencimiento;
	}
	public void setIDiasvencimiento(int iDiasvencimiento) {
		this.iDiasvencimiento = iDiasvencimiento;
	}
	public String getCModalidad() {
		return this.cModalidad;
	}
	public void setCModalidad(String cModalidad) {
		this.cModalidad = cModalidad;
	}
	public String getCReinversion() {
		return this.cReinversion;
	}
	public void setCReinversion(String cReinversion) {
		this.cReinversion = cReinversion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VdPreciocrccPK)) {
			return false;
		}
		VdPreciocrccPK castOther = (VdPreciocrccPK)other;
		return 
			this.dFechavaloracion.equals(castOther.dFechavaloracion)
			&& this.cNemotecnico.equals(castOther.cNemotecnico)
			&& this.dFechaemision.equals(castOther.dFechaemision)
			&& this.dFechavencimiento.equals(castOther.dFechavencimiento)
			&& (this.iDiasvencimiento == castOther.iDiasvencimiento)
			&& this.cModalidad.equals(castOther.cModalidad)
			&& this.cReinversion.equals(castOther.cReinversion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dFechavaloracion.hashCode();
		hash = hash * prime + this.cNemotecnico.hashCode();
		hash = hash * prime + this.dFechaemision.hashCode();
		hash = hash * prime + this.dFechavencimiento.hashCode();
		hash = hash * prime + this.iDiasvencimiento;
		hash = hash * prime + this.cModalidad.hashCode();
		hash = hash * prime + this.cReinversion.hashCode();
		
		return hash;
	}
}