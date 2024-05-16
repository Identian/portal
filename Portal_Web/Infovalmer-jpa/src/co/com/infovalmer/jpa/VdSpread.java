package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the vd_spreads database table.
 * 
 */
@Entity
@Table(name="vd_spreads")
@NamedQuery(name="VdSpread.findAll", query="SELECT v FROM VdSpread v")
public class VdSpread implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VdSpreadPK id;

	@Column(name="e_spread")
	private BigDecimal eSpread;

	public VdSpread() {
	}

	public VdSpreadPK getId() {
		return this.id;
	}

	public void setId(VdSpreadPK id) {
		this.id = id;
	}

	public BigDecimal getESpread() {
		return this.eSpread;
	}

	public void setESpread(BigDecimal eSpread) {
		this.eSpread = eSpread;
	}

}