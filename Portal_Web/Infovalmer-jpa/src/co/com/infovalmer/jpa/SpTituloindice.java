package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_tituloindice database table.
 * 
 */
@Entity
@Table(name="sp_tituloindice")
@NamedQuery(name="SpTituloindice.findAll", query="SELECT s FROM SpTituloindice s")
public class SpTituloindice implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpTituloindicePK id;

	public SpTituloindice() {
	}

	public SpTituloindicePK getId() {
		return this.id;
	}

	public void setId(SpTituloindicePK id) {
		this.id = id;
	}

}