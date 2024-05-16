package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ve_normal database table.
 * 
 */
@Entity
@Table(name="ve_normal")
@NamedQuery(name="VeNormal.findAll", query="SELECT v FROM VeNormal v")
public class VeNormal implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VeNormalPK id;

	private BigDecimal valor;

	public VeNormal() {
	}

	public VeNormalPK getId() {
		return this.id;
	}

	public void setId(VeNormalPK id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}