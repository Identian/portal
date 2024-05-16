package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ve_factorconv database table.
 * 
 */
@Entity
@Table(name="ve_factorconv")
@NamedQuery(name="VeFactorconv.findAll", query="SELECT v FROM VeFactorconv v")
public class VeFactorconv implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VeFactorconvPK id;

	@Column(name="e_factorconversion")
	private BigDecimal eFactorconversion;

	public VeFactorconv() {
	}

	public VeFactorconvPK getId() {
		return this.id;
	}

	public void setId(VeFactorconvPK id) {
		this.id = id;
	}

	public BigDecimal getEFactorconversion() {
		return this.eFactorconversion;
	}

	public void setEFactorconversion(BigDecimal eFactorconversion) {
		this.eFactorconversion = eFactorconversion;
	}

}