package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the po_perfil_pago database table.
 * 
 */
@Embeddable
public class PoPerfilPagoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_identificacion")
	private int iIdentificacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="d_fecha")
	private java.util.Date dFecha;

	public PoPerfilPagoPK() {
	}
	public int getIIdentificacion() {
		return this.iIdentificacion;
	}
	public void setIIdentificacion(int iIdentificacion) {
		this.iIdentificacion = iIdentificacion;
	}
	public java.util.Date getDFecha() {
		return this.dFecha;
	}
	public void setDFecha(java.util.Date dFecha) {
		this.dFecha = dFecha;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PoPerfilPagoPK)) {
			return false;
		}
		PoPerfilPagoPK castOther = (PoPerfilPagoPK)other;
		return 
			(this.iIdentificacion == castOther.iIdentificacion)
			&& this.dFecha.equals(castOther.dFecha);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iIdentificacion;
		hash = hash * prime + this.dFecha.hashCode();
		
		return hash;
	}
}