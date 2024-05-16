package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the va_logcasoespecial database table.
 * 
 */
@Embeddable
public class VaLogcasoespecialPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private java.util.Date dFecha;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Column(name="c_bursatilidad")
	private String cBursatilidad;

	@Column(name="c_accion")
	private String cAccion;

	public VaLogcasoespecialPK() {
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
		if (!(other instanceof VaLogcasoespecialPK)) {
			return false;
		}
		VaLogcasoespecialPK castOther = (VaLogcasoespecialPK)other;
		return 
			this.dFecha.equals(castOther.dFecha)
			&& this.cNemotecnico.equals(castOther.cNemotecnico)
			&& this.cBursatilidad.equals(castOther.cBursatilidad)
			&& this.cAccion.equals(castOther.cAccion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dFecha.hashCode();
		hash = hash * prime + this.cNemotecnico.hashCode();
		hash = hash * prime + this.cBursatilidad.hashCode();
		hash = hash * prime + this.cAccion.hashCode();
		
		return hash;
	}
}