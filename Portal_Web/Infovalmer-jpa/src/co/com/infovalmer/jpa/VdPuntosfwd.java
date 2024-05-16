package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the vd_puntosfwd database table.
 * 
 */
@Entity
@Table(name="vd_puntosfwd")
@NamedQuery(name="VdPuntosfwd.findAll", query="SELECT v FROM VdPuntosfwd v")
public class VdPuntosfwd implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VdPuntosfwdPK id;

	@Column(name="e_mid")
	private BigDecimal eMid;

	public VdPuntosfwd() {
	}

	public VdPuntosfwdPK getId() {
		return this.id;
	}

	public void setId(VdPuntosfwdPK id) {
		this.id = id;
	}

	public BigDecimal getEMid() {
		return this.eMid;
	}

	public void setEMid(BigDecimal eMid) {
		this.eMid = eMid;
	}

}