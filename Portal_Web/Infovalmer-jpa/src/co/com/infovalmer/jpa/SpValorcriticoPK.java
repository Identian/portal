package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_valorcritico database table.
 * 
 */
@Embeddable
public class SpValorcriticoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int e_ValorX;

	private int e_ValorY;

	public SpValorcriticoPK() {
	}
	public int getE_ValorX() {
		return this.e_ValorX;
	}
	public void setE_ValorX(int e_ValorX) {
		this.e_ValorX = e_ValorX;
	}
	public int getE_ValorY() {
		return this.e_ValorY;
	}
	public void setE_ValorY(int e_ValorY) {
		this.e_ValorY = e_ValorY;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpValorcriticoPK)) {
			return false;
		}
		SpValorcriticoPK castOther = (SpValorcriticoPK)other;
		return 
			(this.e_ValorX == castOther.e_ValorX)
			&& (this.e_ValorY == castOther.e_ValorY);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.e_ValorX;
		hash = hash * prime + this.e_ValorY;
		
		return hash;
	}
}