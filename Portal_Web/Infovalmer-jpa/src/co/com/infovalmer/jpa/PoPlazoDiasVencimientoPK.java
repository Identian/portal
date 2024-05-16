package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the po_plazo_dias_vencimiento database table.
 * 
 */
@Embeddable
public class PoPlazoDiasVencimientoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_plazo_de")
	private int iPlazoDe;

	@Column(name="i_plazo_hasta")
	private int iPlazoHasta;

	public PoPlazoDiasVencimientoPK() {
	}
	public int getIPlazoDe() {
		return this.iPlazoDe;
	}
	public void setIPlazoDe(int iPlazoDe) {
		this.iPlazoDe = iPlazoDe;
	}
	public int getIPlazoHasta() {
		return this.iPlazoHasta;
	}
	public void setIPlazoHasta(int iPlazoHasta) {
		this.iPlazoHasta = iPlazoHasta;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PoPlazoDiasVencimientoPK)) {
			return false;
		}
		PoPlazoDiasVencimientoPK castOther = (PoPlazoDiasVencimientoPK)other;
		return 
			(this.iPlazoDe == castOther.iPlazoDe)
			&& (this.iPlazoHasta == castOther.iPlazoHasta);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iPlazoDe;
		hash = hash * prime + this.iPlazoHasta;
		
		return hash;
	}
}