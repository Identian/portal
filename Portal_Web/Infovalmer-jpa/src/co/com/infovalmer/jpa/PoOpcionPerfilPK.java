package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the po_opcion_perfil database table.
 * 
 */
@Embeddable
public class PoOpcionPerfilPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="I_PERFIL")
	private int iPerfil;

	@Column(name="I_OPCION")
	private int iOpcion;

	public PoOpcionPerfilPK() {
	}
	public int getIPerfil() {
		return this.iPerfil;
	}
	public void setIPerfil(int iPerfil) {
		this.iPerfil = iPerfil;
	}
	public int getIOpcion() {
		return this.iOpcion;
	}
	public void setIOpcion(int iOpcion) {
		this.iOpcion = iOpcion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PoOpcionPerfilPK)) {
			return false;
		}
		PoOpcionPerfilPK castOther = (PoOpcionPerfilPK)other;
		return 
			(this.iPerfil == castOther.iPerfil)
			&& (this.iOpcion == castOther.iOpcion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iPerfil;
		hash = hash * prime + this.iOpcion;
		
		return hash;
	}
}