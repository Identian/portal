package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the po_acceso_opcion database table.
 * 
 */
@Embeddable
public class PoAccesoOpcionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="I_CODIGOSUSCRIPTOR")
	private int iCodigosuscriptor;

	@Column(name="I_OPCION")
	private int iOpcion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="D_FECHA")
	private java.util.Date dFecha;

	public PoAccesoOpcionPK() {
	}
	public int getICodigosuscriptor() {
		return this.iCodigosuscriptor;
	}
	public void setICodigosuscriptor(int iCodigosuscriptor) {
		this.iCodigosuscriptor = iCodigosuscriptor;
	}
	public int getIOpcion() {
		return this.iOpcion;
	}
	public void setIOpcion(int iOpcion) {
		this.iOpcion = iOpcion;
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
		if (!(other instanceof PoAccesoOpcionPK)) {
			return false;
		}
		PoAccesoOpcionPK castOther = (PoAccesoOpcionPK)other;
		return 
			(this.iCodigosuscriptor == castOther.iCodigosuscriptor)
			&& (this.iOpcion == castOther.iOpcion)
			&& this.dFecha.equals(castOther.dFecha);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iCodigosuscriptor;
		hash = hash * prime + this.iOpcion;
		hash = hash * prime + this.dFecha.hashCode();
		
		return hash;
	}
}