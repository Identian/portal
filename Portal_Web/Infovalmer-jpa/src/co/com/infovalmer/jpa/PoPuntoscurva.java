package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_puntoscurva database table.
 * 
 */
@Entity
@Table(name="po_puntoscurva")
@NamedQuery(name="PoPuntoscurva.findAll", query="SELECT p FROM PoPuntoscurva p")
public class PoPuntoscurva implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PoPuntoscurvaPK id;

	@Column(name="e_valor")
	private double eValor;

	public PoPuntoscurva() {
	}

	public PoPuntoscurvaPK getId() {
		return this.id;
	}

	public void setId(PoPuntoscurvaPK id) {
		this.id = id;
	}

	public double getEValor() {
		return this.eValor;
	}

	public void setEValor(double eValor) {
		this.eValor = eValor;
	}

}