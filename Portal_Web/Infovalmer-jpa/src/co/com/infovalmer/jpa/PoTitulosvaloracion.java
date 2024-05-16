package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_titulosvaloracion database table.
 * 
 */
@Entity
@Table(name="po_titulosvaloracion")
@NamedQuery(name="PoTitulosvaloracion.findAll", query="SELECT p FROM PoTitulosvaloracion p")
public class PoTitulosvaloracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PoTitulosvaloracionPK id;

	public PoTitulosvaloracion() {
	}

	public PoTitulosvaloracionPK getId() {
		return this.id;
	}

	public void setId(PoTitulosvaloracionPK id) {
		this.id = id;
	}

}