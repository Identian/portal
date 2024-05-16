package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the po_volumen_especie database table.
 * 
 */
@Embeddable
public class PoVolumenEspeciePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="C_NEMOTECNICO")
	private String cNemotecnico;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHA")
	private java.util.Date dFecha;

	public PoVolumenEspeciePK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PoVolumenEspeciePK)) {
			return false;
		}
		PoVolumenEspeciePK castOther = (PoVolumenEspeciePK)other;
		return 
			this.cNemotecnico.equals(castOther.cNemotecnico)
			&& this.dFecha.equals(castOther.dFecha);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cNemotecnico.hashCode();
		hash = hash * prime + this.dFecha.hashCode();
		
		return hash;
	}
}