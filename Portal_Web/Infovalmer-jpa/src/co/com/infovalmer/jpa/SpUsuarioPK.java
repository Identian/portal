package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_usuario database table.
 * 
 */
@Embeddable
public class SpUsuarioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_usuario")
	private int iUsuario;

	@Column(name="i_perfil")
	private int iPerfil;

	public SpUsuarioPK() {
	}
	public int getIUsuario() {
		return this.iUsuario;
	}
	public void setIUsuario(int iUsuario) {
		this.iUsuario = iUsuario;
	}
	public int getIPerfil() {
		return this.iPerfil;
	}
	public void setIPerfil(int iPerfil) {
		this.iPerfil = iPerfil;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpUsuarioPK)) {
			return false;
		}
		SpUsuarioPK castOther = (SpUsuarioPK)other;
		return 
			(this.iUsuario == castOther.iUsuario)
			&& (this.iPerfil == castOther.iPerfil);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iUsuario;
		hash = hash * prime + this.iPerfil;
		
		return hash;
	}
}