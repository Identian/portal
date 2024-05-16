package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_breves database table.
 * 
 */
@Embeddable
public class SpBrevePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_codigopagina")
	private int iCodigopagina;

	@Column(name="i_codigobreve")
	private int iCodigobreve;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private java.util.Date dFecha;

	public SpBrevePK() {
	}
	public int getICodigopagina() {
		return this.iCodigopagina;
	}
	public void setICodigopagina(int iCodigopagina) {
		this.iCodigopagina = iCodigopagina;
	}
	public int getICodigobreve() {
		return this.iCodigobreve;
	}
	public void setICodigobreve(int iCodigobreve) {
		this.iCodigobreve = iCodigobreve;
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
		if (!(other instanceof SpBrevePK)) {
			return false;
		}
		SpBrevePK castOther = (SpBrevePK)other;
		return 
			(this.iCodigopagina == castOther.iCodigopagina)
			&& (this.iCodigobreve == castOther.iCodigobreve)
			&& this.dFecha.equals(castOther.dFecha);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iCodigopagina;
		hash = hash * prime + this.iCodigobreve;
		hash = hash * prime + this.dFecha.hashCode();
		
		return hash;
	}
}