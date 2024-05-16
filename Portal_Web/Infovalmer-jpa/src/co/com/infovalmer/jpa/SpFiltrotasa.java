package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_filtrotasa database table.
 * 
 */
@Entity
@Table(name="sp_filtrotasa")
@NamedQuery(name="SpFiltrotasa.findAll", query="SELECT s FROM SpFiltrotasa s")
public class SpFiltrotasa implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpFiltrotasaPK id;

	@Column(name="c_filtrasn")
	private String cFiltrasn;

	public SpFiltrotasa() {
	}

	public SpFiltrotasaPK getId() {
		return this.id;
	}

	public void setId(SpFiltrotasaPK id) {
		this.id = id;
	}

	public String getCFiltrasn() {
		return this.cFiltrasn;
	}

	public void setCFiltrasn(String cFiltrasn) {
		this.cFiltrasn = cFiltrasn;
	}

}