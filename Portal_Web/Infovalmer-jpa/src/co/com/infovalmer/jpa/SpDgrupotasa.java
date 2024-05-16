package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_dgrupotasa database table.
 * 
 */
@Entity
@Table(name="sp_dgrupotasa")
@NamedQuery(name="SpDgrupotasa.findAll", query="SELECT s FROM SpDgrupotasa s")
public class SpDgrupotasa implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpDgrupotasaPK id;

	public SpDgrupotasa() {
	}

	public SpDgrupotasaPK getId() {
		return this.id;
	}

	public void setId(SpDgrupotasaPK id) {
		this.id = id;
	}

}