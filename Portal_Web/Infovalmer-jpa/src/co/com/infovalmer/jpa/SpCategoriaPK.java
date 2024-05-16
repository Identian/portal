package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_categoria database table.
 * 
 */
@Embeddable
public class SpCategoriaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_clase")
	private String cClase;

	@Column(name="i_codigo")
	private int iCodigo;

	@Column(name="i_grupocalificador")
	private int iGrupocalificador;

	@Column(name="i_grupomoneda")
	private int iGrupomoneda;

	@Column(name="i_grupotasa")
	private int iGrupotasa;

	@Column(name="i_rangvencimi")
	private int iRangvencimi;

	public SpCategoriaPK() {
	}
	public String getCClase() {
		return this.cClase;
	}
	public void setCClase(String cClase) {
		this.cClase = cClase;
	}
	public int getICodigo() {
		return this.iCodigo;
	}
	public void setICodigo(int iCodigo) {
		this.iCodigo = iCodigo;
	}
	public int getIGrupocalificador() {
		return this.iGrupocalificador;
	}
	public void setIGrupocalificador(int iGrupocalificador) {
		this.iGrupocalificador = iGrupocalificador;
	}
	public int getIGrupomoneda() {
		return this.iGrupomoneda;
	}
	public void setIGrupomoneda(int iGrupomoneda) {
		this.iGrupomoneda = iGrupomoneda;
	}
	public int getIGrupotasa() {
		return this.iGrupotasa;
	}
	public void setIGrupotasa(int iGrupotasa) {
		this.iGrupotasa = iGrupotasa;
	}
	public int getIRangvencimi() {
		return this.iRangvencimi;
	}
	public void setIRangvencimi(int iRangvencimi) {
		this.iRangvencimi = iRangvencimi;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpCategoriaPK)) {
			return false;
		}
		SpCategoriaPK castOther = (SpCategoriaPK)other;
		return 
			this.cClase.equals(castOther.cClase)
			&& (this.iCodigo == castOther.iCodigo)
			&& (this.iGrupocalificador == castOther.iGrupocalificador)
			&& (this.iGrupomoneda == castOther.iGrupomoneda)
			&& (this.iGrupotasa == castOther.iGrupotasa)
			&& (this.iRangvencimi == castOther.iRangvencimi);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cClase.hashCode();
		hash = hash * prime + this.iCodigo;
		hash = hash * prime + this.iGrupocalificador;
		hash = hash * prime + this.iGrupomoneda;
		hash = hash * prime + this.iGrupotasa;
		hash = hash * prime + this.iRangvencimi;
		
		return hash;
	}
}