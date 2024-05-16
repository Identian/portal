package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ve_puntosfwd database table.
 * 
 */
@Entity
@Table(name="ve_puntosfwd")
@NamedQuery(name="VePuntosfwd.findAll", query="SELECT v FROM VePuntosfwd v")
public class VePuntosfwd implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VePuntosfwdPK id;

	@Column(name="e_mid")
	private BigDecimal eMid;

	public VePuntosfwd() {
	}

	public VePuntosfwdPK getId() {
		return this.id;
	}

	public void setId(VePuntosfwdPK id) {
		this.id = id;
	}

	public BigDecimal getEMid() {
		return this.eMid;
	}

	public void setEMid(BigDecimal eMid) {
		this.eMid = eMid;
	}

}