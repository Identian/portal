package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sp_valorcritico database table.
 * 
 */
@Entity
@Table(name="sp_valorcritico")
@NamedQuery(name="SpValorcritico.findAll", query="SELECT s FROM SpValorcritico s")
public class SpValorcritico implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpValorcriticoPK id;

	private BigDecimal e_ValorC;

	public SpValorcritico() {
	}

	public SpValorcriticoPK getId() {
		return this.id;
	}

	public void setId(SpValorcriticoPK id) {
		this.id = id;
	}

	public BigDecimal getE_ValorC() {
		return this.e_ValorC;
	}

	public void setE_ValorC(BigDecimal e_ValorC) {
		this.e_ValorC = e_ValorC;
	}

}