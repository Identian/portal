package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_cajametodo database table.
 * 
 */
@Embeddable
public class SpCajametodoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_caja")
	private String cCaja;

	@Column(name="i_metodofiltro")
	private byte iMetodofiltro;

	public SpCajametodoPK() {
	}
	public String getCCaja() {
		return this.cCaja;
	}
	public void setCCaja(String cCaja) {
		this.cCaja = cCaja;
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
		if (!(other instanceof SpCajametodoPK)) {
			return false;
		}
		SpCajametodoPK castOther = (SpCajametodoPK)other;
		return 
			this.cCaja.equals(castOther.cCaja)
			&& (this.iMetodofiltro == castOther.iMetodofiltro);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cCaja.hashCode();
		hash = hash * prime + ((int) this.iMetodofiltro);
		
		return hash;
	}
}