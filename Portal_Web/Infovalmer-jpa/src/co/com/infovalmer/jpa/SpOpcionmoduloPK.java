package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_opcionmodulo database table.
 * 
 */
@Embeddable
public class SpOpcionmoduloPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_opcionmodulo")
	private int iOpcionmodulo;

	@Column(name="i_modulosistema")
	private int iModulosistema;

	public SpOpcionmoduloPK() {
	}
	public int getIOpcionmodulo() {
		return this.iOpcionmodulo;
	}
	public void setIOpcionmodulo(int iOpcionmodulo) {
		this.iOpcionmodulo = iOpcionmodulo;
	}
	public int getIModulosistema() {
		return this.iModulosistema;
	}
	public void setIModulosistema(int iModulosistema) {
		this.iModulosistema = iModulosistema;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpOpcionmoduloPK)) {
			return false;
		}
		SpOpcionmoduloPK castOther = (SpOpcionmoduloPK)other;
		return 
			(this.iOpcionmodulo == castOther.iOpcionmodulo)
			&& (this.iModulosistema == castOther.iModulosistema);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iOpcionmodulo;
		hash = hash * prime + this.iModulosistema;
		
		return hash;
	}
}