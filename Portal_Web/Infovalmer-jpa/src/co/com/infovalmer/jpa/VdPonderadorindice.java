package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the vd_ponderadorindice database table.
 * 
 */
@Entity
@Table(name="vd_ponderadorindice")
@NamedQuery(name="VdPonderadorindice.findAll", query="SELECT v FROM VdPonderadorindice v")
public class VdPonderadorindice implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VdPonderadorindicePK id;

	@Column(name="e_ponderador")
	private BigDecimal ePonderador;

	public VdPonderadorindice() {
	}

	public VdPonderadorindicePK getId() {
		return this.id;
	}

	public void setId(VdPonderadorindicePK id) {
		this.id = id;
	}

	public BigDecimal getEPonderador() {
		return this.ePonderador;
	}

	public void setEPonderador(BigDecimal ePonderador) {
		this.ePonderador = ePonderador;
	}

}