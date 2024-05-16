package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the va_muestprecio database table.
 * 
 */
@Entity
@Table(name="va_muestprecio")
@NamedQuery(name="VaMuestprecio.findAll", query="SELECT v FROM VaMuestprecio v")
public class VaMuestprecio implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VaMuestprecioPK id;

	@Column(name="c_tipo")
	private String cTipo;

	@Column(name="e_cantidad")
	private BigDecimal eCantidad;

	@Column(name="e_precio")
	private BigDecimal ePrecio;

	public VaMuestprecio() {
	}

	public VaMuestprecioPK getId() {
		return this.id;
	}

	public void setId(VaMuestprecioPK id) {
		this.id = id;
	}

	public String getCTipo() {
		return this.cTipo;
	}

	public void setCTipo(String cTipo) {
		this.cTipo = cTipo;
	}

	public BigDecimal getECantidad() {
		return this.eCantidad;
	}

	public void setECantidad(BigDecimal eCantidad) {
		this.eCantidad = eCantidad;
	}

	public BigDecimal getEPrecio() {
		return this.ePrecio;
	}

	public void setEPrecio(BigDecimal ePrecio) {
		this.ePrecio = ePrecio;
	}

}