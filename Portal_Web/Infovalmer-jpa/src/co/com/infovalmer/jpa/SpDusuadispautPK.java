package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_dusuadispaut database table.
 * 
 */
@Embeddable
public class SpDusuadispautPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_usuario")
	private byte iUsuario;

	@Column(name="i_perfil")
	private byte iPerfil;

	@Column(name="i_dispautentica")
	private byte iDispautentica;

	public SpDusuadispautPK() {
	}
	public byte getIUsuario() {
		return this.iUsuario;
	}
	public void setIUsuario(byte iUsuario) {
		this.iUsuario = iUsuario;
	}
	public byte getIPerfil() {
		return this.iPerfil;
	}
	public void setIPerfil(byte iPerfil) {
		this.iPerfil = iPerfil;
	}
	public byte getIDispautentica() {
		return this.iDispautentica;
	}
	public void setIDispautentica(byte iDispautentica) {
		this.iDispautentica = iDispautentica;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpDusuadispautPK)) {
			return false;
		}
		SpDusuadispautPK castOther = (SpDusuadispautPK)other;
		return 
			(this.iUsuario == castOther.iUsuario)
			&& (this.iPerfil == castOther.iPerfil)
			&& (this.iDispautentica == castOther.iDispautentica);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) this.iUsuario);
		hash = hash * prime + ((int) this.iPerfil);
		hash = hash * prime + ((int) this.iDispautentica);
		
		return hash;
	}
}