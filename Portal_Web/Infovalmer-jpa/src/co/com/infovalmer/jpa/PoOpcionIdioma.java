package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_opcion_idioma database table.
 * 
 */
@Entity
@Table(name="po_opcion_idioma")
@NamedQuery(name="PoOpcionIdioma.findAll", query="SELECT p FROM PoOpcionIdioma p")
public class PoOpcionIdioma implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PoOpcionIdiomaPK id;

	@Column(name="C_VALOR")
	private String cValor;

	public PoOpcionIdioma() {
	}

	public PoOpcionIdiomaPK getId() {
		return this.id;
	}

	public void setId(PoOpcionIdiomaPK id) {
		this.id = id;
	}

	public String getCValor() {
		return this.cValor;
	}

	public void setCValor(String cValor) {
		this.cValor = cValor;
	}

}