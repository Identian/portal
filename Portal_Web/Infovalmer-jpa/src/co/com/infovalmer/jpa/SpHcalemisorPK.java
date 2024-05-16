package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_hcalemisor database table.
 * 
 */
@Embeddable
public class SpHcalemisorPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_emisor")
	private String cEmisor;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaasignada")
	private java.util.Date dFechaasignada;

	@Column(name="i_tipcalificaci")
	private byte iTipcalificaci;

	@Column(name="i_tipoplazo")
	private byte iTipoplazo;

	@Column(name="i_calificadora")
	private byte iCalificadora;

	public SpHcalemisorPK() {
	}
	public String getCEmisor() {
		return this.cEmisor;
	}
	public void setCEmisor(String cEmisor) {
		this.cEmisor = cEmisor;
	}
	public java.util.Date getDFechaasignada() {
		return this.dFechaasignada;
	}
	public void setDFechaasignada(java.util.Date dFechaasignada) {
		this.dFechaasignada = dFechaasignada;
	}
	public byte getITipcalificaci() {
		return this.iTipcalificaci;
	}
	public void setITipcalificaci(byte iTipcalificaci) {
		this.iTipcalificaci = iTipcalificaci;
	}
	public byte getITipoplazo() {
		return this.iTipoplazo;
	}
	public void setITipoplazo(byte iTipoplazo) {
		this.iTipoplazo = iTipoplazo;
	}
	public byte getICalificadora() {
		return this.iCalificadora;
	}
	public void setICalificadora(byte iCalificadora) {
		this.iCalificadora = iCalificadora;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpHcalemisorPK)) {
			return false;
		}
		SpHcalemisorPK castOther = (SpHcalemisorPK)other;
		return 
			this.cEmisor.equals(castOther.cEmisor)
			&& this.dFechaasignada.equals(castOther.dFechaasignada)
			&& (this.iTipcalificaci == castOther.iTipcalificaci)
			&& (this.iTipoplazo == castOther.iTipoplazo)
			&& (this.iCalificadora == castOther.iCalificadora);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cEmisor.hashCode();
		hash = hash * prime + this.dFechaasignada.hashCode();
		hash = hash * prime + ((int) this.iTipcalificaci);
		hash = hash * prime + ((int) this.iTipoplazo);
		hash = hash * prime + ((int) this.iCalificadora);
		
		return hash;
	}
}