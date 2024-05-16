package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ve_valorparametro database table.
 * 
 */
@Entity
@Table(name="ve_valorparametro")
@NamedQuery(name="VeValorparametro.findAll", query="SELECT v FROM VeValorparametro v")
public class VeValorparametro implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VeValorparametroPK id;

	@Column(name="c_valor")
	private String cValor;

	public VeValorparametro() {
	}

	public VeValorparametroPK getId() {
		return this.id;
	}

	public void setId(VeValorparametroPK id) {
		this.id = id;
	}

	public String getCValor() {
		return this.cValor;
	}

	public void setCValor(String cValor) {
		this.cValor = cValor;
	}

}