package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_dusuaservic database table.
 * 
 */
@Embeddable
public class SpDusuaservicPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_servicio")
	private byte iServicio;

	@Column(name="i_perfil")
	private byte iPerfil;

	@Column(name="i_usuario")
	private byte iUsuario;

	public SpDusuaservicPK() {
	}
	public byte getIServicio() {
		return this.iServicio;
	}
	public void setIServicio(byte iServicio) {
		this.iServicio = iServicio;
	}
	public byte getIPerfil() {
		return this.iPerfil;
	}
	public void setIPerfil(byte iPerfil) {
		this.iPerfil = iPerfil;
	}
	public byte getIUsuario() {
		return this.iUsuario;
	}
	public void setIUsuario(byte iUsuario) {
		this.iUsuario = iUsuario;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpDusuaservicPK)) {
			return false;
		}
		SpDusuaservicPK castOther = (SpDusuaservicPK)other;
		return 
			(this.iServicio == castOther.iServicio)
			&& (this.iPerfil == castOther.iPerfil)
			&& (this.iUsuario == castOther.iUsuario);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) this.iServicio);
		hash = hash * prime + ((int) this.iPerfil);
		hash = hash * prime + ((int) this.iUsuario);
		
		return hash;
	}
}