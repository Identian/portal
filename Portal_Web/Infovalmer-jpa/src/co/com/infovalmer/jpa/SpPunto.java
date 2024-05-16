package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sp_puntos database table.
 * 
 */
@Entity
@Table(name="sp_puntos")
@NamedQuery(name="SpPunto.findAll", query="SELECT s FROM SpPunto s")
public class SpPunto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpPuntoPK id;

	@Column(name="e_rentabilidadanterior")
	private BigDecimal eRentabilidadanterior;

	@Column(name="e_rentabilidadest")
	private BigDecimal eRentabilidadest;

	@Column(name="e_rentabilidadops")
	private BigDecimal eRentabilidadops;

	@Column(name="e_te")
	private BigDecimal eTe;

	@Column(name="e_to")
	private BigDecimal eTo;

	@Column(name="e_variacion")
	private BigDecimal eVariacion;

	public SpPunto() {
	}

	public SpPuntoPK getId() {
		return this.id;
	}

	public void setId(SpPuntoPK id) {
		this.id = id;
	}

	public BigDecimal getERentabilidadanterior() {
		return this.eRentabilidadanterior;
	}

	public void setERentabilidadanterior(BigDecimal eRentabilidadanterior) {
		this.eRentabilidadanterior = eRentabilidadanterior;
	}

	public BigDecimal getERentabilidadest() {
		return this.eRentabilidadest;
	}

	public void setERentabilidadest(BigDecimal eRentabilidadest) {
		this.eRentabilidadest = eRentabilidadest;
	}

	public BigDecimal getERentabilidadops() {
		return this.eRentabilidadops;
	}

	public void setERentabilidadops(BigDecimal eRentabilidadops) {
		this.eRentabilidadops = eRentabilidadops;
	}

	public BigDecimal getETe() {
		return this.eTe;
	}

	public void setETe(BigDecimal eTe) {
		this.eTe = eTe;
	}

	public BigDecimal getETo() {
		return this.eTo;
	}

	public void setETo(BigDecimal eTo) {
		this.eTo = eTo;
	}

	public BigDecimal getEVariacion() {
		return this.eVariacion;
	}

	public void setEVariacion(BigDecimal eVariacion) {
		this.eVariacion = eVariacion;
	}

}