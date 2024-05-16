package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_filtroprecio database table.
 * 
 */
@Embeddable
public class SpFiltroprecioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_grupotasa")
	private int iGrupotasa;

	@Column(name="c_tipotitulo")
	private String cTipotitulo;

	@Column(name="i_grupomoneda")
	private int iGrupomoneda;

	@Column(name="i_codrangodf")
	private int iCodrangodf;

	@Column(name="i_metodofiltro")
	private int iMetodofiltro;

	public SpFiltroprecioPK() {
	}
	public int getIGrupotasa() {
		return this.iGrupotasa;
	}
	public void setIGrupotasa(int iGrupotasa) {
		this.iGrupotasa = iGrupotasa;
	}
	public String getCTipotitulo() {
		return this.cTipotitulo;
	}
	public void setCTipotitulo(String cTipotitulo) {
		this.cTipotitulo = cTipotitulo;
	}
	public int getIGrupomoneda() {
		return this.iGrupomoneda;
	}
	public void setIGrupomoneda(int iGrupomoneda) {
		this.iGrupomoneda = iGrupomoneda;
	}
	public int getICodrangodf() {
		return this.iCodrangodf;
	}
	public void setICodrangodf(int iCodrangodf) {
		this.iCodrangodf = iCodrangodf;
	}
	public int getIMetodofiltro() {
		return this.iMetodofiltro;
	}
	public void setIMetodofiltro(int iMetodofiltro) {
		this.iMetodofiltro = iMetodofiltro;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpFiltroprecioPK)) {
			return false;
		}
		SpFiltroprecioPK castOther = (SpFiltroprecioPK)other;
		return 
			(this.iGrupotasa == castOther.iGrupotasa)
			&& this.cTipotitulo.equals(castOther.cTipotitulo)
			&& (this.iGrupomoneda == castOther.iGrupomoneda)
			&& (this.iCodrangodf == castOther.iCodrangodf)
			&& (this.iMetodofiltro == castOther.iMetodofiltro);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iGrupotasa;
		hash = hash * prime + this.cTipotitulo.hashCode();
		hash = hash * prime + this.iGrupomoneda;
		hash = hash * prime + this.iCodrangodf;
		hash = hash * prime + this.iMetodofiltro;
		
		return hash;
	}
}