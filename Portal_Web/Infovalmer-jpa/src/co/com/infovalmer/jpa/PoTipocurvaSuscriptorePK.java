package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the po_tipocurva_suscriptores database table.
 * 
 */
@Embeddable
public class PoTipocurvaSuscriptorePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_tipocurva")
	private int iTipocurva;

	@Column(name="i_codigosuscriptor")
	private int iCodigosuscriptor;

	public PoTipocurvaSuscriptorePK() {
	}
	public int getITipocurva() {
		return this.iTipocurva;
	}
	public void setITipocurva(int iTipocurva) {
		this.iTipocurva = iTipocurva;
	}
	public int getICodigosuscriptor() {
		return this.iCodigosuscriptor;
	}
	public void setICodigosuscriptor(int iCodigosuscriptor) {
		this.iCodigosuscriptor = iCodigosuscriptor;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PoTipocurvaSuscriptorePK)) {
			return false;
		}
		PoTipocurvaSuscriptorePK castOther = (PoTipocurvaSuscriptorePK)other;
		return 
			(this.iTipocurva == castOther.iTipocurva)
			&& (this.iCodigosuscriptor == castOther.iCodigosuscriptor);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iTipocurva;
		hash = hash * prime + this.iCodigosuscriptor;
		
		return hash;
	}
}