package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sp_valortasa database table.
 * 
 */
@Entity
@Table(name="sp_valortasa")
@NamedQuery(name="SpValortasa.findAll", query="SELECT s FROM SpValortasa s")
public class SpValortasa implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpValortasaPK id;

	@Column(name="e_valortasa")
	private BigDecimal eValortasa;

	public SpValortasa() {
	}

	public SpValortasaPK getId() {
		return this.id;
	}

	public void setId(SpValortasaPK id) {
		this.id = id;
	}

	public BigDecimal getEValortasa() {
		return this.eValortasa;
	}

	public void setEValortasa(BigDecimal eValortasa) {
		this.eValortasa = eValortasa;
	}

}