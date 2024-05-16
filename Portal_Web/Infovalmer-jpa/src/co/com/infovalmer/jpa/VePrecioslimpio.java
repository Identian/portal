package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ve_precioslimpios database table.
 * 
 */
@Entity
@Table(name="ve_precioslimpios")
@NamedQuery(name="VePrecioslimpio.findAll", query="SELECT v FROM VePrecioslimpio v")
public class VePrecioslimpio implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VePrecioslimpioPK id;

	@Column(name="e_preciolimpio")
	private BigDecimal ePreciolimpio;

	@Column(name="e_preciosucio")
	private BigDecimal ePreciosucio;

	public VePrecioslimpio() {
	}

	public VePrecioslimpioPK getId() {
		return this.id;
	}

	public void setId(VePrecioslimpioPK id) {
		this.id = id;
	}

	public BigDecimal getEPreciolimpio() {
		return this.ePreciolimpio;
	}

	public void setEPreciolimpio(BigDecimal ePreciolimpio) {
		this.ePreciolimpio = ePreciolimpio;
	}

	public BigDecimal getEPreciosucio() {
		return this.ePreciosucio;
	}

	public void setEPreciosucio(BigDecimal ePreciosucio) {
		this.ePreciosucio = ePreciosucio;
	}

}