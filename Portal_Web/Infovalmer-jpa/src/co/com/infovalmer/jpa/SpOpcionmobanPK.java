package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_opcionmoban database table.
 * 
 */
@Embeddable
public class SpOpcionmobanPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_opcionmodulo")
	private byte iOpcionmodulo;

	@Column(name="i_modulosistema")
	private byte iModulosistema;

	public SpOpcionmobanPK() {
	}
	public byte getIOpcionmodulo() {
		return this.iOpcionmodulo;
	}
	public void setIOpcionmodulo(byte iOpcionmodulo) {
		this.iOpcionmodulo = iOpcionmodulo;
	}
	public byte getIModulosistema() {
		return this.iModulosistema;
	}
	public void setIModulosistema(byte iModulosistema) {
		this.iModulosistema = iModulosistema;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpOpcionmobanPK)) {
			return false;
		}
		SpOpcionmobanPK castOther = (SpOpcionmobanPK)other;
		return 
			(this.iOpcionmodulo == castOther.iOpcionmodulo)
			&& (this.iModulosistema == castOther.iModulosistema);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) this.iOpcionmodulo);
		hash = hash * prime + ((int) this.iModulosistema);
		
		return hash;
	}
}