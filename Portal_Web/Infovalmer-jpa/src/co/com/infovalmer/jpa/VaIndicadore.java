package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the va_indicadores database table.
 * 
 */
@Entity
@Table(name="va_indicadores")
@NamedQuery(name="VaIndicadore.findAll", query="SELECT v FROM VaIndicadore v")
public class VaIndicadore implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VaIndicadorePK id;

	@Column(name="e_capitalizacion")
	private BigDecimal eCapitalizacion;

	@Column(name="e_frecuencia")
	private BigDecimal eFrecuencia;

	@Column(name="e_liquidez")
	private BigDecimal eLiquidez;

	@Column(name="e_tobin")
	private BigDecimal eTobin;

	public VaIndicadore() {
	}

	public VaIndicadorePK getId() {
		return this.id;
	}

	public void setId(VaIndicadorePK id) {
		this.id = id;
	}

	public BigDecimal getECapitalizacion() {
		return this.eCapitalizacion;
	}

	public void setECapitalizacion(BigDecimal eCapitalizacion) {
		this.eCapitalizacion = eCapitalizacion;
	}

	public BigDecimal getEFrecuencia() {
		return this.eFrecuencia;
	}

	public void setEFrecuencia(BigDecimal eFrecuencia) {
		this.eFrecuencia = eFrecuencia;
	}

	public BigDecimal getELiquidez() {
		return this.eLiquidez;
	}

	public void setELiquidez(BigDecimal eLiquidez) {
		this.eLiquidez = eLiquidez;
	}

	public BigDecimal getETobin() {
		return this.eTobin;
	}

	public void setETobin(BigDecimal eTobin) {
		this.eTobin = eTobin;
	}

}