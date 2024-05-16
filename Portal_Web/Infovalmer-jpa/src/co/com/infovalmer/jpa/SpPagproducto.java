package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_pagproducto database table.
 * 
 */
@Entity
@Table(name="sp_pagproducto")
@NamedQuery(name="SpPagproducto.findAll", query="SELECT s FROM SpPagproducto s")
public class SpPagproducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpPagproductoPK id;

	public SpPagproducto() {
	}

	public SpPagproductoPK getId() {
		return this.id;
	}

	public void setId(SpPagproductoPK id) {
		this.id = id;
	}

}