package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the va_hbursatilidad database table.
 * 
 */
@Embeddable
public class VaHbursatilidadPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private java.util.Date dFecha;

	@Column(name="c_bursatilidad")
	private String cBursatilidad;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechainicio")
	private java.util.Date dFechainicio;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechafin")
	private java.util.Date dFechafin;

	public VaHbursatilidadPK() {
	}
	public String getCNemotecnico() {
		return this.cNemotecnico;
	}
	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}
	public java.util.Date getDFecha() {
		return this.dFecha;
	}
	public void setDFecha(java.util.Date dFecha) {
		this.dFecha = dFecha;
	}
	public String getCBursatilidad() {
		return this.cBursatilidad;
	}
	public void setCBursatilidad(String cBursatilidad) {
		this.cBursatilidad = cBursatilidad;
	}
	public java.util.Date getDFechainicio() {
		return this.dFechainicio;
	}
	public void setDFechainicio(java.util.Date dFechainicio) {
		this.dFechainicio = dFechainicio;
	}
	public java.util.Date getDFechafin() {
		return this.dFechafin;
	}
	public void setDFechafin(java.util.Date dFechafin) {
		this.dFechafin = dFechafin;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VaHbursatilidadPK)) {
			return false;
		}
		VaHbursatilidadPK castOther = (VaHbursatilidadPK)other;
		return 
			this.cNemotecnico.equals(castOther.cNemotecnico)
			&& this.dFecha.equals(castOther.dFecha)
			&& this.cBursatilidad.equals(castOther.cBursatilidad)
			&& this.dFechainicio.equals(castOther.dFechainicio)
			&& this.dFechafin.equals(castOther.dFechafin);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cNemotecnico.hashCode();
		hash = hash * prime + this.dFecha.hashCode();
		hash = hash * prime + this.cBursatilidad.hashCode();
		hash = hash * prime + this.dFechainicio.hashCode();
		hash = hash * prime + this.dFechafin.hashCode();
		
		return hash;
	}
}