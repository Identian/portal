package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_tablafuncion database table.
 * 
 */
@Embeddable
public class SpTablafuncionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_tablafuncion")
	private byte iTablafuncion;

	@Column(name="i_modulosistema")
	private byte iModulosistema;

	@Column(name="i_opcionmodulo")
	private byte iOpcionmodulo;

	public SpTablafuncionPK() {
	}
	public byte getITablafuncion() {
		return this.iTablafuncion;
	}
	public void setITablafuncion(byte iTablafuncion) {
		this.iTablafuncion = iTablafuncion;
	}
	public byte getIModulosistema() {
		return this.iModulosistema;
	}
	public void setIModulosistema(byte iModulosistema) {
		this.iModulosistema = iModulosistema;
	}
	public byte getIOpcionmodulo() {
		return this.iOpcionmodulo;
	}
	public void setIOpcionmodulo(byte iOpcionmodulo) {
		this.iOpcionmodulo = iOpcionmodulo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpTablafuncionPK)) {
			return false;
		}
		SpTablafuncionPK castOther = (SpTablafuncionPK)other;
		return 
			(this.iTablafuncion == castOther.iTablafuncion)
			&& (this.iModulosistema == castOther.iModulosistema)
			&& (this.iOpcionmodulo == castOther.iOpcionmodulo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) this.iTablafuncion);
		hash = hash * prime + ((int) this.iModulosistema);
		hash = hash * prime + ((int) this.iOpcionmodulo);
		
		return hash;
	}
}