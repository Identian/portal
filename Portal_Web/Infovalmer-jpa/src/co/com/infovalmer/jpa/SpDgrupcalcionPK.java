package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_dgrupcalcion database table.
 * 
 */
@Embeddable
public class SpDgrupcalcionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_tipoplazo")
	private int iTipoplazo;

	@Column(name="i_calificadora")
	private int iCalificadora;

	@Column(name="i_tipcalificaci")
	private int iTipcalificaci;

	@Column(name="c_aplica")
	private String cAplica;

	@Column(name="c_calificacion")
	private String cCalificacion;

	@Column(name="i_grupcalifica")
	private int iGrupcalifica;

	public SpDgrupcalcionPK() {
	}
	public int getITipoplazo() {
		return this.iTipoplazo;
	}
	public void setITipoplazo(int iTipoplazo) {
		this.iTipoplazo = iTipoplazo;
	}
	public int getICalificadora() {
		return this.iCalificadora;
	}
	public void setICalificadora(int iCalificadora) {
		this.iCalificadora = iCalificadora;
	}
	public int getITipcalificaci() {
		return this.iTipcalificaci;
	}
	public void setITipcalificaci(int iTipcalificaci) {
		this.iTipcalificaci = iTipcalificaci;
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
	public int getIGrupcalifica() {
		return this.iGrupcalifica;
	}
	public void setIGrupcalifica(int iGrupcalifica) {
		this.iGrupcalifica = iGrupcalifica;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpDgrupcalcionPK)) {
			return false;
		}
		SpDgrupcalcionPK castOther = (SpDgrupcalcionPK)other;
		return 
			(this.iTipoplazo == castOther.iTipoplazo)
			&& (this.iCalificadora == castOther.iCalificadora)
			&& (this.iTipcalificaci == castOther.iTipcalificaci)
			&& this.cAplica.equals(castOther.cAplica)
			&& this.cCalificacion.equals(castOther.cCalificacion)
			&& (this.iGrupcalifica == castOther.iGrupcalifica);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iTipoplazo;
		hash = hash * prime + this.iCalificadora;
		hash = hash * prime + this.iTipcalificaci;
		hash = hash * prime + this.cAplica.hashCode();
		hash = hash * prime + this.cCalificacion.hashCode();
		hash = hash * prime + this.iGrupcalifica;
		
		return hash;
	}
}