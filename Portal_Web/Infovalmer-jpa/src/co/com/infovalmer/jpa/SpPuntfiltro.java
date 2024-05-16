package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sp_puntfiltro database table.
 * 
 */
@Entity
@Table(name="sp_puntfiltro")
@NamedQuery(name="SpPuntfiltro.findAll", query="SELECT s FROM SpPuntfiltro s")
public class SpPuntfiltro implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpPuntfiltroPK id;

	@Column(name="e_valor")
	private BigDecimal eValor;

	public SpPuntfiltro() {
	}

	public SpPuntfiltroPK getId() {
		return this.id;
	}

	public void setId(SpPuntfiltroPK id) {
		this.id = id;
	}

	public BigDecimal getEValor() {
		return this.eValor;
	}

	public void setEValor(BigDecimal eValor) {
		this.eValor = eValor;
	}

}