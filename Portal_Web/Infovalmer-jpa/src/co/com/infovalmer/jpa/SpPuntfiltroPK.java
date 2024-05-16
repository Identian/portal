package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_puntfiltro database table.
 * 
 */
@Embeddable
public class SpPuntfiltroPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private java.util.Date dFecha;

	@Column(name="i_metodofiltro")
	private byte iMetodofiltro;

	@Column(name="i_diavcto")
	private int iDiavcto;

	public SpPuntfiltroPK() {
	}
	public java.util.Date getDFecha() {
		return this.dFecha;
	}
	public void setDFecha(java.util.Date dFecha) {
		this.dFecha = dFecha;
	}
	public byte getIMetodofiltro() {
		return this.iMetodofiltro;
	}
	public void setIMetodofiltro(byte iMetodofiltro) {
		this.iMetodofiltro = iMetodofiltro;
	}
	public int getIDiavcto() {
		return this.iDiavcto;
	}
	public void setIDiavcto(int iDiavcto) {
		this.iDiavcto = iDiavcto;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpPuntfiltroPK)) {
			return false;
		}
		SpPuntfiltroPK castOther = (SpPuntfiltroPK)other;
		return 
			this.dFecha.equals(castOther.dFecha)
			&& (this.iMetodofiltro == castOther.iMetodofiltro)
			&& (this.iDiavcto == castOther.iDiavcto);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dFecha.hashCode();
		hash = hash * prime + ((int) this.iMetodofiltro);
		hash = hash * prime + this.iDiavcto;
		
		return hash;
	}
}