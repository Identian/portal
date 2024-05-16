package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the va_preciovaloracion database table.
 * 
 */
@Entity
@Table(name="va_preciovaloracion")
@NamedQuery(name="VaPreciovaloracion.findAll", query="SELECT v FROM VaPreciovaloracion v")
public class VaPreciovaloracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VaPreciovaloracionPK id;

	@Column(name="e_precioanterior")
	private BigDecimal ePrecioanterior;

	@Column(name="e_preciopromedio")
	private BigDecimal ePreciopromedio;

	@Column(name="e_preciovaloracion")
	private BigDecimal ePreciovaloracion;

	@Column(name="e_variacion")
	private double eVariacion;

	public VaPreciovaloracion() {
	}

	public VaPreciovaloracionPK getId() {
		return this.id;
	}

	public void setId(VaPreciovaloracionPK id) {
		this.id = id;
	}

	public BigDecimal getEPrecioanterior() {
		return this.ePrecioanterior;
	}

	public void setEPrecioanterior(BigDecimal ePrecioanterior) {
		this.ePrecioanterior = ePrecioanterior;
	}

	public BigDecimal getEPreciopromedio() {
		return this.ePreciopromedio;
	}

	public void setEPreciopromedio(BigDecimal ePreciopromedio) {
		this.ePreciopromedio = ePreciopromedio;
	}

	public BigDecimal getEPreciovaloracion() {
		return this.ePreciovaloracion;
	}

	public void setEPreciovaloracion(BigDecimal ePreciovaloracion) {
		this.ePreciovaloracion = ePreciovaloracion;
	}

	public double getEVariacion() {
		return this.eVariacion;
	}

	public void setEVariacion(double eVariacion) {
		this.eVariacion = eVariacion;
	}

}