package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the vd_valortasa database table.
 * 
 */
@Entity
@Table(name="vd_valortasa")
@NamedQuery(name="VdValortasa.findAll", query="SELECT v FROM VdValortasa v")
public class VdValortasa implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VdValortasaPK id;

	@Column(name="e_valortasa")
	private BigDecimal eValortasa;

	public VdValortasa() {
	}

	public VdValortasaPK getId() {
		return this.id;
	}

	public void setId(VdValortasaPK id) {
		this.id = id;
	}

	public BigDecimal getEValortasa() {
		return this.eValortasa;
	}

	public void setEValortasa(BigDecimal eValortasa) {
		this.eValortasa = eValortasa;
	}

}