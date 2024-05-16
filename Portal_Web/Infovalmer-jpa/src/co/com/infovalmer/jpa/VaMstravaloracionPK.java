package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the va_mstravaloracion database table.
 * 
 */
@Embeddable
public class VaMstravaloracionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private java.util.Date dFecha;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Column(name="c_bursatilidad")
	private String cBursatilidad;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechamuestra")
	private java.util.Date dFechamuestra;

	public VaMstravaloracionPK() {
	}
	public java.util.Date getDFecha() {
		return this.dFecha;
	}
	public void setDFecha(java.util.Date dFecha) {
		this.dFecha = dFecha;
	}
	public String getCNemotecnico() {
		return this.cNemotecnico;
	}
	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}
	public String getCBursatilidad() {
		return this.cBursatilidad;
	}
	public void setCBursatilidad(String cBursatilidad) {
		this.cBursatilidad = cBursatilidad;
	}
	public java.util.Date getDFechamuestra() {
		return this.dFechamuestra;
	}
	public void setDFechamuestra(java.util.Date dFechamuestra) {
		this.dFechamuestra = dFechamuestra;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VaMstravaloracionPK)) {
			return false;
		}
		VaMstravaloracionPK castOther = (VaMstravaloracionPK)other;
		return 
			this.dFecha.equals(castOther.dFecha)
			&& this.cNemotecnico.equals(castOther.cNemotecnico)
			&& this.cBursatilidad.equals(castOther.cBursatilidad)
			&& this.dFechamuestra.equals(castOther.dFechamuestra);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dFecha.hashCode();
		hash = hash * prime + this.cNemotecnico.hashCode();
		hash = hash * prime + this.cBursatilidad.hashCode();
		hash = hash * prime + this.dFechamuestra.hashCode();
		
		return hash;
	}
}