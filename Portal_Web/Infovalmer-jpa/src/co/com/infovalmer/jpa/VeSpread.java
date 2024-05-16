package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ve_spreads database table.
 * 
 */
@Entity
@Table(name="ve_spreads")
@NamedQuery(name="VeSpread.findAll", query="SELECT v FROM VeSpread v")
public class VeSpread implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VeSpreadPK id;

	@Column(name="e_spread")
	private BigDecimal eSpread;

	public VeSpread() {
	}

	public VeSpreadPK getId() {
		return this.id;
	}

	public void setId(VeSpreadPK id) {
		this.id = id;
	}

	public BigDecimal getESpread() {
		return this.eSpread;
	}

	public void setESpread(BigDecimal eSpread) {
		this.eSpread = eSpread;
	}

}