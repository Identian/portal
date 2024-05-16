package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_etiqueta database table.
 * 
 */
@Entity
@Table(name="po_etiqueta")
@NamedQuery(name="PoEtiqueta.findAll", query="SELECT p FROM PoEtiqueta p")
public class PoEtiqueta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PoEtiquetaPK id;

	@Lob
	@Column(name="C_VALOR")
	private String cValor;

	public PoEtiqueta() {
	}

	public PoEtiquetaPK getId() {
		return this.id;
	}

	public void setId(PoEtiquetaPK id) {
		this.id = id;
	}

	public String getCValor() {
		return this.cValor;
	}

	public void setCValor(String cValor) {
		this.cValor = cValor;
	}

}