package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_calificacion database table.
 * 
 */
@Embeddable
public class SpCalificacionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_tipcalificaci")
	private int iTipcalificaci;

	@Column(name="i_calificadora")
	private int iCalificadora;

	@Column(name="i_tipoplazo")
	private int iTipoplazo;

	@Column(name="c_aplica")
	private String cAplica;

	@Column(name="c_calificacion")
	private String cCalificacion;

	public SpCalificacionPK() {
	}
	public int getITipcalificaci() {
		return this.iTipcalificaci;
	}
	public void setITipcalificaci(int iTipcalificaci) {
		this.iTipcalificaci = iTipcalificaci;
	}
	public int getICalificadora() {
		return this.iCalificadora;
	}
	public void setICalificadora(int iCalificadora) {
		this.iCalificadora = iCalificadora;
	}
	public int getITipoplazo() {
		return this.iTipoplazo;
	}
	public void setITipoplazo(int iTipoplazo) {
		this.iTipoplazo = iTipoplazo;
	}
	public String getCAplica() {
		return this.cAplica;
	}
	public void setCAplica(String cAplica) {
		this.cAplica = cAplica;
	}
	public String getCCalificacion() {
		return this.cCalificacion;
	}
	public void setCCalificacion(String cCalificacion) {
		this.cCalificacion = cCalificacion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpCalificacionPK)) {
			return false;
		}
		SpCalificacionPK castOther = (SpCalificacionPK)other;
		return 
			(this.iTipcalificaci == castOther.iTipcalificaci)
			&& (this.iCalificadora == castOther.iCalificadora)
			&& (this.iTipoplazo == castOther.iTipoplazo)
			&& this.cAplica.equals(castOther.cAplica)
			&& this.cCalificacion.equals(castOther.cCalificacion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iTipcalificaci;
		hash = hash * prime + this.iCalificadora;
		hash = hash * prime + this.iTipoplazo;
		hash = hash * prime + this.cAplica.hashCode();
		hash = hash * prime + this.cCalificacion.hashCode();
		
		return hash;
	}
}