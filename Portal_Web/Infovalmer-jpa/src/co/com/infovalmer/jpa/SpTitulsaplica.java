package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_titulsaplica database table.
 * 
 */
@Entity
@Table(name="sp_titulsaplica")
@NamedQuery(name="SpTitulsaplica.findAll", query="SELECT s FROM SpTitulsaplica s")
public class SpTitulsaplica implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpTitulsaplicaPK id;

	public SpTitulsaplica() {
	}

	public SpTitulsaplicaPK getId() {
		return this.id;
	}

	public void setId(SpTitulsaplicaPK id) {
		this.id = id;
	}

}