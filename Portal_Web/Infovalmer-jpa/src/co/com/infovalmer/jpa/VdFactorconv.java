package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the vd_factorconv database table.
 * 
 */
@Entity
@Table(name="vd_factorconv")
@NamedQuery(name="VdFactorconv.findAll", query="SELECT v FROM VdFactorconv v")
public class VdFactorconv implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VdFactorconvPK id;

	@Column(name="e_factorconversion")
	private BigDecimal eFactorconversion;

	public VdFactorconv() {
	}

	public VdFactorconvPK getId() {
		return this.id;
	}

	public void setId(VdFactorconvPK id) {
		this.id = id;
	}

	public BigDecimal getEFactorconversion() {
		return this.eFactorconversion;
	}

	public void setEFactorconversion(BigDecimal eFactorconversion) {
		this.eFactorconversion = eFactorconversion;
	}

}