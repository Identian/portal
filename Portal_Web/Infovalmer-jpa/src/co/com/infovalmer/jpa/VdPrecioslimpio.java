package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the vd_precioslimpios database table.
 * 
 */
@Entity
@Table(name="vd_precioslimpios")
@NamedQuery(name="VdPrecioslimpio.findAll", query="SELECT v FROM VdPrecioslimpio v")
public class VdPrecioslimpio implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VdPrecioslimpioPK id;

	@Column(name="e_preciolimpio")
	private BigDecimal ePreciolimpio;

	@Column(name="e_preciosucio")
	private BigDecimal ePreciosucio;

	public VdPrecioslimpio() {
	}

	public VdPrecioslimpioPK getId() {
		return this.id;
	}

	public void setId(VdPrecioslimpioPK id) {
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