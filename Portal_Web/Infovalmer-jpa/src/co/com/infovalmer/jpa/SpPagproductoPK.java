package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_pagproducto database table.
 * 
 */
@Embeddable
public class SpPagproductoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_codigopagina")
	private byte iCodigopagina;

	@Column(name="i_codigoproducto")
	private byte iCodigoproducto;

	public SpPagproductoPK() {
	}
	public byte getICodigopagina() {
		return this.iCodigopagina;
	}
	public void setICodigopagina(byte iCodigopagina) {
		this.iCodigopagina = iCodigopagina;
	}
	public byte getICodigoproducto() {
		return this.iCodigoproducto;
	}
	public void setICodigoproducto(byte iCodigoproducto) {
		this.iCodigoproducto = iCodigoproducto;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpPagproductoPK)) {
			return false;
		}
		SpPagproductoPK castOther = (SpPagproductoPK)other;
		return 
			(this.iCodigopagina == castOther.iCodigopagina)
			&& (this.iCodigoproducto == castOther.iCodigoproducto);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) this.iCodigopagina);
		hash = hash * prime + ((int) this.iCodigoproducto);
		
		return hash;
	}
}