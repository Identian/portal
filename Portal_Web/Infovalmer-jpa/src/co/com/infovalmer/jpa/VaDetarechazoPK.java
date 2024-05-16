package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the va_detarechazo database table.
 * 
 */
@Embeddable
public class VaDetarechazoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_detarechazo")
	private int iDetarechazo;

	@Column(name="i_numinforegistro")
	private int iNuminforegistro;

	@Column(name="i_archivo")
	private int iArchivo;

	@Column(name="i_secuencialinea")
	private int iSecuencialinea;

	public VaDetarechazoPK() {
	}
	public int getIDetarechazo() {
		return this.iDetarechazo;
	}
	public void setIDetarechazo(int iDetarechazo) {
		this.iDetarechazo = iDetarechazo;
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
	public int getISecuencialinea() {
		return this.iSecuencialinea;
	}
	public void setISecuencialinea(int iSecuencialinea) {
		this.iSecuencialinea = iSecuencialinea;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VaDetarechazoPK)) {
			return false;
		}
		VaDetarechazoPK castOther = (VaDetarechazoPK)other;
		return 
			(this.iDetarechazo == castOther.iDetarechazo)
			&& (this.iNuminforegistro == castOther.iNuminforegistro)
			&& (this.iArchivo == castOther.iArchivo)
			&& (this.iSecuencialinea == castOther.iSecuencialinea);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iDetarechazo;
		hash = hash * prime + this.iNuminforegistro;
		hash = hash * prime + this.iArchivo;
		hash = hash * prime + this.iSecuencialinea;
		
		return hash;
	}
}