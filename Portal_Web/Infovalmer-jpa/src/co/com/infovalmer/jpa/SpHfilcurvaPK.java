package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_hfilcurva database table.
 * 
 */
@Embeddable
public class SpHfilcurvaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private java.util.Date d_FechaCurva;

	private int i_MetodoFiltro;

	public SpHfilcurvaPK() {
	}
	public java.util.Date getD_FechaCurva() {
		return this.d_FechaCurva;
	}
	public void setD_FechaCurva(java.util.Date d_FechaCurva) {
		this.d_FechaCurva = d_FechaCurva;
	}
	public int getI_MetodoFiltro() {
		return this.i_MetodoFiltro;
	}
	public void setI_MetodoFiltro(int i_MetodoFiltro) {
		this.i_MetodoFiltro = i_MetodoFiltro;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpHfilcurvaPK)) {
			return false;
		}
		SpHfilcurvaPK castOther = (SpHfilcurvaPK)other;
		return 
			this.d_FechaCurva.equals(castOther.d_FechaCurva)
			&& (this.i_MetodoFiltro == castOther.i_MetodoFiltro);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.d_FechaCurva.hashCode();
		hash = hash * prime + this.i_MetodoFiltro;
		
		return hash;
	}
}