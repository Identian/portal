package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_categoria database table.
 * 
 */
@Entity
@Table(name="sp_categoria")
@NamedQuery(name="SpCategoria.findAll", query="SELECT s FROM SpCategoria s")
public class SpCategoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpCategoriaPK id;

	public SpCategoria() {
	}

	public SpCategoriaPK getId() {
		return this.id;
	}

	public void setId(SpCategoriaPK id) {
		this.id = id;
	}

}