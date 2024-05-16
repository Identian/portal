package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_infoformula database table.
 * 
 */
@Embeddable
public class SpInfoformulaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_numinforegistro")
	private int iNuminforegistro;

	@Column(name="i_archivo")
	private int iArchivo;

	@Column(name="i_secuenciallinea")
	private int iSecuenciallinea;

	public SpInfoformulaPK() {
	}
	public int getINuminforegistro() {
		return this.iNuminforegistro;
	}
	public void setINuminforegistro(int iNuminforegistro) {
		this.iNuminforegistro = iNuminforegistro;
	}
	public int getIArchivo() {
		return this.iArchivo;
	}
	public void setIArchivo(int iArchivo) {
		this.iArchivo = iArchivo;
	}
	public int getISecuenciallinea() {
		return this.iSecuenciallinea;
	}
	public void setISecuenciallinea(int iSecuenciallinea) {
		this.iSecuenciallinea = iSecuenciallinea;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpInfoformulaPK)) {
			return false;
		}
		SpInfoformulaPK castOther = (SpInfoformulaPK)other;
		return 
			(this.iNuminforegistro == castOther.iNuminforegistro)
			&& (this.iArchivo == castOther.iArchivo)
			&& (this.iSecuenciallinea == castOther.iSecuenciallinea);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iNuminforegistro;
		hash = hash * prime + this.iArchivo;
		hash = hash * prime + this.iSecuenciallinea;
		
		return hash;
	}
}