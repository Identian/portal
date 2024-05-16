package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_tituloindice database table.
 * 
 */
@Embeddable
public class SpTituloindicePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_indice")
	private String cIndice;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	public SpTituloindicePK() {
	}
	public String getCIndice() {
		return this.cIndice;
	}
	public void setCIndice(String cIndice) {
		this.cIndice = cIndice;
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
		if (!(other instanceof SpTituloindicePK)) {
			return false;
		}
		SpTituloindicePK castOther = (SpTituloindicePK)other;
		return 
			this.cIndice.equals(castOther.cIndice)
			&& this.cNemotecnico.equals(castOther.cNemotecnico);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cIndice.hashCode();
		hash = hash * prime + this.cNemotecnico.hashCode();
		
		return hash;
	}
}