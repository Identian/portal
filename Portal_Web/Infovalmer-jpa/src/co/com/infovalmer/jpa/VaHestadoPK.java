package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the va_hestados database table.
 * 
 */
@Embeddable
public class VaHestadoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private java.util.Date dFecha;

	@Column(name="c_estado")
	private String cEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechainicio")
	private java.util.Date dFechainicio;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechafin")
	private java.util.Date dFechafin;

	public VaHestadoPK() {
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
	public String getCEstado() {
		return this.cEstado;
	}
	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
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
		if (!(other instanceof VaHestadoPK)) {
			return false;
		}
		VaHestadoPK castOther = (VaHestadoPK)other;
		return 
			this.cNemotecnico.equals(castOther.cNemotecnico)
			&& this.dFecha.equals(castOther.dFecha)
			&& this.cEstado.equals(castOther.cEstado)
			&& this.dFechainicio.equals(castOther.dFechainicio)
			&& this.dFechafin.equals(castOther.dFechafin);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cNemotecnico.hashCode();
		hash = hash * prime + this.dFecha.hashCode();
		hash = hash * prime + this.cEstado.hashCode();
		hash = hash * prime + this.dFechainicio.hashCode();
		hash = hash * prime + this.dFechafin.hashCode();
		
		return hash;
	}
}