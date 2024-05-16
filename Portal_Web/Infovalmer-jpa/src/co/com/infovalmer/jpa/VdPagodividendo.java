package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the vd_pagodividendos database table.
 * 
 */
@Entity
@Table(name="vd_pagodividendos")
@NamedQuery(name="VdPagodividendo.findAll", query="SELECT v FROM VdPagodividendo v")
public class VdPagodividendo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VdPagodividendoPK id;

	@Column(name="e_valorpagoespecie")
	private BigDecimal eValorpagoespecie;

	@Column(name="e_valorpagomoneda")
	private BigDecimal eValorpagomoneda;

	public VdPagodividendo() {
	}

	public VdPagodividendoPK getId() {
		return this.id;
	}

	public void setId(VdPagodividendoPK id) {
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