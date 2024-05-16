package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sp_valormoneda database table.
 * 
 */
@Entity
@Table(name="sp_valormoneda")
@NamedQuery(name="SpValormoneda.findAll", query="SELECT s FROM SpValormoneda s")
public class SpValormoneda implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpValormonedaPK id;

	@Column(name="e_valormoneda")
	private BigDecimal eValormoneda;

	public SpValormoneda() {
	}

	public SpValormonedaPK getId() {
		return this.id;
	}

	public void setId(SpValormonedaPK id) {
		this.id = id;
	}

	public BigDecimal getEValormoneda() {
		return this.eValormoneda;
	}

	public void setEValormoneda(BigDecimal eValormoneda) {
		this.eValormoneda = eValormoneda;
	}

}