package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the va_promedioponderado database table.
 * 
 */
@Entity
@Table(name="va_promedioponderado")
@NamedQuery(name="VaPromedioponderado.findAll", query="SELECT v FROM VaPromedioponderado v")
public class VaPromedioponderado implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VaPromedioponderadoPK id;

	@Column(name="c_marcacion")
	private String cMarcacion;

	@Column(name="e_precioanterior")
	private BigDecimal ePrecioanterior;

	@Column(name="e_preciopromedio")
	private BigDecimal ePreciopromedio;

	@Column(name="e_preciovaloracion")
	private BigDecimal ePreciovaloracion;

	@Column(name="e_variacion")
	private double eVariacion;

	public VaPromedioponderado() {
	}

	public VaPromedioponderadoPK getId() {
		return this.id;
	}

	public void setId(VaPromedioponderadoPK id) {
		this.id = id;
	}

	public String getCMarcacion() {
		return this.cMarcacion;
	}

	public void setCMarcacion(String cMarcacion) {
		this.cMarcacion = cMarcacion;
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