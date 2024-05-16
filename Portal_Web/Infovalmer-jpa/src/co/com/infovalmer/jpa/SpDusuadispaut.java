package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_dusuadispaut database table.
 * 
 */
@Entity
@Table(name="sp_dusuadispaut")
@NamedQuery(name="SpDusuadispaut.findAll", query="SELECT s FROM SpDusuadispaut s")
public class SpDusuadispaut implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpDusuadispautPK id;

	public SpDusuadispaut() {
	}

	public SpDusuadispautPK getId() {
		return this.id;
	}

	public void setId(SpDusuadispautPK id) {
		this.id = id;
	}

}