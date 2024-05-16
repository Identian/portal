package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_filtromonto database table.
 * 
 */
@Entity
@Table(name="sp_filtromonto")
@NamedQuery(name="SpFiltromonto.findAll", query="SELECT s FROM SpFiltromonto s")
public class SpFiltromonto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpFiltromontoPK id;

	public SpFiltromonto() {
	}

	public SpFiltromontoPK getId() {
		return this.id;
	}

	public void setId(SpFiltromontoPK id) {
		this.id = id;
	}

}