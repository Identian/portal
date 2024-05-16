package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the po_ve_volumen_contrato database table.
 * 
 */
@Entity
@Table(name="po_ve_volumen_contrato")
@NamedQuery(name="PoVeVolumenContrato.findAll", query="SELECT p FROM PoVeVolumenContrato p")
public class PoVeVolumenContrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PoVeVolumenContratoPK id;

	@Column(name="e_volumen")
	private BigDecimal eVolumen;

	public PoVeVolumenContrato() {
	}

	public PoVeVolumenContratoPK getId() {
		return this.id;
	}

	public void setId(PoVeVolumenContratoPK id) {
		this.id = id;
	}

	public BigDecimal getEVolumen() {
		return this.eVolumen;
	}

	public void setEVolumen(BigDecimal eVolumen) {
		this.eVolumen = eVolumen;
	}

}