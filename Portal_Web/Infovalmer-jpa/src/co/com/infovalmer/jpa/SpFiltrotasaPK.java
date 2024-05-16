package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_filtrotasa database table.
 * 
 */
@Embeddable
public class SpFiltrotasaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_grupotasa")
	private byte iGrupotasa;

	@Column(name="c_tipotitulo")
	private String cTipotitulo;

	@Column(name="i_grupomoneda")
	private byte iGrupomoneda;

	@Column(name="i_metodofiltro")
	private byte iMetodofiltro;

	public SpFiltrotasaPK() {
	}
	public byte getIGrupotasa() {
		return this.iGrupotasa;
	}
	public void setIGrupotasa(byte iGrupotasa) {
		this.iGrupotasa = iGrupotasa;
	}
	public String getCTipotitulo() {
		return this.cTipotitulo;
	}
	public void setCTipotitulo(String cTipotitulo) {
		this.cTipotitulo = cTipotitulo;
	}
	public byte getIGrupomoneda() {
		return this.iGrupomoneda;
	}
	public void setIGrupomoneda(byte iGrupomoneda) {
		this.iGrupomoneda = iGrupomoneda;
	}
	public byte getIMetodofiltro() {
		return this.iMetodofiltro;
	}
	public void setIMetodofiltro(byte iMetodofiltro) {
		this.iMetodofiltro = iMetodofiltro;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpFiltrotasaPK)) {
			return false;
		}
		SpFiltrotasaPK castOther = (SpFiltrotasaPK)other;
		return 
			(this.iGrupotasa == castOther.iGrupotasa)
			&& this.cTipotitulo.equals(castOther.cTipotitulo)
			&& (this.iGrupomoneda == castOther.iGrupomoneda)
			&& (this.iMetodofiltro == castOther.iMetodofiltro);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) this.iGrupotasa);
		hash = hash * prime + this.cTipotitulo.hashCode();
		hash = hash * prime + ((int) this.iGrupomoneda);
		hash = hash * prime + ((int) this.iMetodofiltro);
		
		return hash;
	}
}