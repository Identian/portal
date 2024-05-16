package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the vd_normal database table.
 * 
 */
@Entity
@Table(name="vd_normal")
@NamedQuery(name="VdNormal.findAll", query="SELECT v FROM VdNormal v")
public class VdNormal implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VdNormalPK id;

	private BigDecimal valor;

	public VdNormal() {
	}

	public VdNormalPK getId() {
		return this.id;
	}

	public void setId(VdNormalPK id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}