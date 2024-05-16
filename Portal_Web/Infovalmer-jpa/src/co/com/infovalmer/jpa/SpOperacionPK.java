package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_operacion database table.
 * 
 */
@Embeddable
public class SpOperacionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaoperacion")
	private java.util.Date dFechaoperacion;

	@Column(name="c_sistnegcion")
	private String cSistnegcion;

	@Column(name="i_folio")
	private int iFolio;

	public SpOperacionPK() {
	}
	public java.util.Date getDFechaoperacion() {
		return this.dFechaoperacion;
	}
	public void setDFechaoperacion(java.util.Date dFechaoperacion) {
		this.dFechaoperacion = dFechaoperacion;
	}
	public String getCSistnegcion() {
		return this.cSistnegcion;
	}
	public void setCSistnegcion(String cSistnegcion) {
		this.cSistnegcion = cSistnegcion;
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
		if (!(other instanceof SpOperacionPK)) {
			return false;
		}
		SpOperacionPK castOther = (SpOperacionPK)other;
		return 
			this.dFechaoperacion.equals(castOther.dFechaoperacion)
			&& this.cSistnegcion.equals(castOther.cSistnegcion)
			&& (this.iFolio == castOther.iFolio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dFechaoperacion.hashCode();
		hash = hash * prime + this.cSistnegcion.hashCode();
		hash = hash * prime + this.iFolio;
		
		return hash;
	}
}