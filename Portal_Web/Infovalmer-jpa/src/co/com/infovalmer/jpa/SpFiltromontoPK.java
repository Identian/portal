package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_filtromonto database table.
 * 
 */
@Embeddable
public class SpFiltromontoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_grupotasa")
	private int iGrupotasa;

	@Column(name="c_tipotitulo")
	private String cTipotitulo;

	@Column(name="i_grupomoneda")
	private int iGrupomoneda;

	@Column(name="i_codigofiltro")
	private int iCodigofiltro;

	public SpFiltromontoPK() {
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
	public int getICodigofiltro() {
		return this.iCodigofiltro;
	}
	public void setICodigofiltro(int iCodigofiltro) {
		this.iCodigofiltro = iCodigofiltro;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpFiltromontoPK)) {
			return false;
		}
		SpFiltromontoPK castOther = (SpFiltromontoPK)other;
		return 
			(this.iGrupotasa == castOther.iGrupotasa)
			&& this.cTipotitulo.equals(castOther.cTipotitulo)
			&& (this.iGrupomoneda == castOther.iGrupomoneda)
			&& (this.iCodigofiltro == castOther.iCodigofiltro);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iGrupotasa;
		hash = hash * prime + this.cTipotitulo.hashCode();
		hash = hash * prime + this.iGrupomoneda;
		hash = hash * prime + this.iCodigofiltro;
		
		return hash;
	}
}