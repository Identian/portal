package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the po_titulosvaloracion database table.
 * 
 */
@Embeddable
public class PoTitulosvaloracionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="I_VALORAAMEDIDA")
	private int iValoraamedida;

	@Column(name="C_NEMOTECNICO")
	private String cNemotecnico;

	public PoTitulosvaloracionPK() {
	}
	public int getIValoraamedida() {
		return this.iValoraamedida;
	}
	public void setIValoraamedida(int iValoraamedida) {
		this.iValoraamedida = iValoraamedida;
	}
	public String getCNemotecnico() {
		return this.cNemotecnico;
	}
	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PoTitulosvaloracionPK)) {
			return false;
		}
		PoTitulosvaloracionPK castOther = (PoTitulosvaloracionPK)other;
		return 
			(this.iValoraamedida == castOther.iValoraamedida)
			&& this.cNemotecnico.equals(castOther.cNemotecnico);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iValoraamedida;
		hash = hash * prime + this.cNemotecnico.hashCode();
		
		return hash;
	}
}