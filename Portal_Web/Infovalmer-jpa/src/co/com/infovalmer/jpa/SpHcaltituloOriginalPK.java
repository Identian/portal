package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_hcaltitulo_original database table.
 * 
 */
@Embeddable
public class SpHcaltituloOriginalPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Column(name="i_tipoplazo")
	private int iTipoplazo;

	@Column(name="i_calificadora")
	private int iCalificadora;

	@Column(name="i_tipcalificaci")
	private int iTipcalificaci;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaasignada")
	private java.util.Date dFechaasignada;

	public SpHcaltituloOriginalPK() {
	}
	public String getCNemotecnico() {
		return this.cNemotecnico;
	}
	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
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
	public java.util.Date getDFechaasignada() {
		return this.dFechaasignada;
	}
	public void setDFechaasignada(java.util.Date dFechaasignada) {
		this.dFechaasignada = dFechaasignada;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpHcaltituloOriginalPK)) {
			return false;
		}
		SpHcaltituloOriginalPK castOther = (SpHcaltituloOriginalPK)other;
		return 
			this.cNemotecnico.equals(castOther.cNemotecnico)
			&& (this.iTipoplazo == castOther.iTipoplazo)
			&& (this.iCalificadora == castOther.iCalificadora)
			&& (this.iTipcalificaci == castOther.iTipcalificaci)
			&& this.dFechaasignada.equals(castOther.dFechaasignada);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cNemotecnico.hashCode();
		hash = hash * prime + this.iTipoplazo;
		hash = hash * prime + this.iCalificadora;
		hash = hash * prime + this.iTipcalificaci;
		hash = hash * prime + this.dFechaasignada.hashCode();
		
		return hash;
	}
}