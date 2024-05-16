package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SpMargenPK
 *
 */
@Embeddable
public class SpMargenPK implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name = "i_grupomoneda")
	private int iGrupomoneda;

	@Column(name = "i_grupotasa")
	private int iGrupotasa;

	@Column(name = "i_grupcalifica")
	private int iGrupcalifica;

	@Column(name = "i_rangovencimi")
	private int iRangovencimi;

	@Column(name = "c_clase")
	private String cClase;

	public SpMargenPK() {
		super();
	}

	public int getiGrupomoneda() {
		return iGrupomoneda;
	}

	public void setiGrupomoneda(int iGrupomoneda) {
		this.iGrupomoneda = iGrupomoneda;
	}

	public int getiGrupotasa() {
		return iGrupotasa;
	}

	public void setiGrupotasa(int iGrupotasa) {
		this.iGrupotasa = iGrupotasa;
	}

	public int getiGrupcalifica() {
		return iGrupcalifica;
	}

	public void setiGrupcalifica(int iGrupcalifica) {
		this.iGrupcalifica = iGrupcalifica;
	}

	public int getiRangovencimi() {
		return iRangovencimi;
	}

	public void setiRangovencimi(int iRangovencimi) {
		this.iRangovencimi = iRangovencimi;
	}

	public String getcClase() {
		return cClase;
	}

	public void setcClase(String cClase) {
		this.cClase = cClase;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cClase == null) ? 0 : cClase.hashCode());
		result = prime * result + iGrupcalifica;
		result = prime * result + iGrupomoneda;
		result = prime * result + iGrupotasa;
		result = prime * result + iRangovencimi;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpMargenPK other = (SpMargenPK) obj;
		if (cClase == null) {
			if (other.cClase != null)
				return false;
		} else if (!cClase.equals(other.cClase))
			return false;
		if (iGrupcalifica != other.iGrupcalifica)
			return false;
		if (iGrupomoneda != other.iGrupomoneda)
			return false;
		if (iGrupotasa != other.iGrupotasa)
			return false;
		if (iRangovencimi != other.iRangovencimi)
			return false;
		return true;
	}

}
