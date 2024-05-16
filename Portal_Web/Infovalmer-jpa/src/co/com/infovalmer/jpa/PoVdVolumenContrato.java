package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the po_vd_volumen_contrato database table.
 * 
 */
@Entity
@Table(name="po_vd_volumen_contrato")
@NamedQuery(name="PoVdVolumenContrato.findAll", query="SELECT p FROM PoVdVolumenContrato p")
public class PoVdVolumenContrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PoVdVolumenContratoPK id;

	@Column(name="e_volumen")
	private BigDecimal eVolumen;

	public PoVdVolumenContrato() {
	}

	public PoVdVolumenContratoPK getId() {
		return this.id;
	}

	public void setId(PoVdVolumenContratoPK id) {
		this.id = id;
	}

	public BigDecimal getEVolumen() {
		return this.eVolumen;
	}

	public void setEVolumen(BigDecimal eVolumen) {
		this.eVolumen = eVolumen;
	}

}