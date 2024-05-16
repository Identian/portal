package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vd_valorparametro database table.
 * 
 */
@Entity
@Table(name="vd_valorparametro")
@NamedQuery(name="VdValorparametro.findAll", query="SELECT v FROM VdValorparametro v")
public class VdValorparametro implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VdValorparametroPK id;

	@Column(name="c_valor")
	private String cValor;

	public VdValorparametro() {
	}

	public VdValorparametroPK getId() {
		return this.id;
	}

	public void setId(VdValorparametroPK id) {
		this.id = id;
	}

	public String getCValor() {
		return this.cValor;
	}

	public void setCValor(String cValor) {
		this.cValor = cValor;
	}

}