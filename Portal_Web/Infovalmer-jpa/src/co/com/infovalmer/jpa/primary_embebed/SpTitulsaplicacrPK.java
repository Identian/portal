package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SpTitulsaplicacrPK
 *
 */
@Embeddable
public class SpTitulsaplicacrPK implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public SpTitulsaplicacrPK() {
		super();
	}
	
	@Column(name="c_tripotitulo")
	private String cTripotitulo;
	
	@Column(name="i_grupomoneda")
	private int iGrupomoneda;
	
	@Column(name="i_grupotasa")
	private int iGrupotasa;
	
	@Column(name="i_diasvencimiento")
	private int iDiasvencimiento;

	@Column(name="i_grupocalificacion")
	private int iGrupocalificacion;
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cTripotitulo == null) ? 0 : cTripotitulo.hashCode());
		result = prime * result + iDiasvencimiento;
		result = prime * result + iGrupocalificacion;
		result = prime * result + iGrupomoneda;
		result = prime * result + iGrupotasa;
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
		SpTitulsaplicacrPK other = (SpTitulsaplicacrPK) obj;
		if (cTripotitulo == null) {
			if (other.cTripotitulo != null)
				return false;
		} else if (!cTripotitulo.equals(other.cTripotitulo))
			return false;
		if (iDiasvencimiento != other.iDiasvencimiento)
			return false;
		if (iGrupocalificacion != other.iGrupocalificacion)
			return false;
		if (iGrupomoneda != other.iGrupomoneda)
			return false;
		if (iGrupotasa != other.iGrupotasa)
			return false;
		return true;
	}

	public String getcTripotitulo() {
		return cTripotitulo;
	}

	public void setcTripotitulo(String cTripotitulo) {
		this.cTripotitulo = cTripotitulo;
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

	public int getiDiasvencimiento() {
		return iDiasvencimiento;
	}

	public void setiDiasvencimiento(int iDiasvencimiento) {
		this.iDiasvencimiento = iDiasvencimiento;
	}

	public int getiGrupocalificacion() {
		return iGrupocalificacion;
	}

	public void setiGrupocalificacion(int iGrupocalificacion) {
		this.iGrupocalificacion = iGrupocalificacion;
	}
	
	

   
}
