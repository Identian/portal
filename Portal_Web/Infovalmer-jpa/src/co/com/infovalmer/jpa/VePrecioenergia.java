package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ve_precioenergia database table.
 * 
 */
@Entity
@Table(name="ve_precioenergia")
@NamedQuery(name="VePrecioenergia.findAll", query="SELECT v FROM VePrecioenergia v")
public class VePrecioenergia implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VePrecioenergiaPK id;

	@Column(name="e_valortasa")
	private BigDecimal eValortasa;

	public VePrecioenergia() {
	}

	public VePrecioenergiaPK getId() {
		return this.id;
	}

	public void setId(VePrecioenergiaPK id) {
		this.id = id;
	}

	public BigDecimal getEValortasa() {
		return this.eValortasa;
	}

	public void setEValortasa(BigDecimal eValortasa) {
		this.eValortasa = eValortasa;
	}

}