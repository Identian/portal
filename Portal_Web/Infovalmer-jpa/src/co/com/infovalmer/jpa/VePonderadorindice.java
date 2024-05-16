package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ve_ponderadorindice database table.
 * 
 */
@Entity
@Table(name="ve_ponderadorindice")
@NamedQuery(name="VePonderadorindice.findAll", query="SELECT v FROM VePonderadorindice v")
public class VePonderadorindice implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VePonderadorindicePK id;

	@Column(name="e_ponderador")
	private BigDecimal ePonderador;

	public VePonderadorindice() {
	}

	public VePonderadorindicePK getId() {
		return this.id;
	}

	public void setId(VePonderadorindicePK id) {
		this.id = id;
	}

	public BigDecimal getEPonderador() {
		return this.ePonderador;
	}

	public void setEPonderador(BigDecimal ePonderador) {
		this.ePonderador = ePonderador;
	}

}