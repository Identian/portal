package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the va_mstravaloracion database table.
 * 
 */
@Entity
@Table(name="va_mstravaloracion")
@NamedQuery(name="VaMstravaloracion.findAll", query="SELECT v FROM VaMstravaloracion v")
public class VaMstravaloracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VaMstravaloracionPK id;

	@Column(name="e_valor")
	private BigDecimal eValor;

	public VaMstravaloracion() {
	}

	public VaMstravaloracionPK getId() {
		return this.id;
	}

	public void setId(VaMstravaloracionPK id) {
		this.id = id;
	}

	public BigDecimal getEValor() {
		return this.eValor;
	}

	public void setEValor(BigDecimal eValor) {
		this.eValor = eValor;
	}

}