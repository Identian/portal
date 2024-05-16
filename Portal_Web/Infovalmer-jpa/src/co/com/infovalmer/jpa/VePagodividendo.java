package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ve_pagodividendos database table.
 * 
 */
@Entity
@Table(name="ve_pagodividendos")
@NamedQuery(name="VePagodividendo.findAll", query="SELECT v FROM VePagodividendo v")
public class VePagodividendo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VePagodividendoPK id;

	@Column(name="e_valorpagoespecie")
	private BigDecimal eValorpagoespecie;

	@Column(name="e_valorpagomoneda")
	private BigDecimal eValorpagomoneda;

	public VePagodividendo() {
	}

	public VePagodividendoPK getId() {
		return this.id;
	}

	public void setId(VePagodividendoPK id) {
		this.id = id;
	}

	public BigDecimal getEValorpagoespecie() {
		return this.eValorpagoespecie;
	}

	public void setEValorpagoespecie(BigDecimal eValorpagoespecie) {
		this.eValorpagoespecie = eValorpagoespecie;
	}

	public BigDecimal getEValorpagomoneda() {
		return this.eValorpagomoneda;
	}

	public void setEValorpagomoneda(BigDecimal eValorpagomoneda) {
		this.eValorpagomoneda = eValorpagomoneda;
	}

}