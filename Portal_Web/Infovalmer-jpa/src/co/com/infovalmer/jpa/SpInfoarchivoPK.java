package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_infoarchivo database table.
 * 
 */
@Embeddable
public class SpInfoarchivoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_secuenciallinea")
	private int iSecuenciallinea;

	@Column(name="i_archivo")
	private int iArchivo;

	public SpInfoarchivoPK() {
	}
	public int getISecuenciallinea() {
		return this.iSecuenciallinea;
	}
	public void setISecuenciallinea(int iSecuenciallinea) {
		this.iSecuenciallinea = iSecuenciallinea;
	}
	public int getIArchivo() {
		return this.iArchivo;
	}
	public void setIArchivo(int iArchivo) {
		this.iArchivo = iArchivo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpInfoarchivoPK)) {
			return false;
		}
		SpInfoarchivoPK castOther = (SpInfoarchivoPK)other;
		return 
			(this.iSecuenciallinea == castOther.iSecuenciallinea)
			&& (this.iArchivo == castOther.iArchivo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iSecuenciallinea;
		hash = hash * prime + this.iArchivo;
		
		return hash;
	}
}