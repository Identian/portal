package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_filtroprecio database table.
 * 
 */
@Entity
@Table(name="sp_filtroprecio")
@NamedQuery(name="SpFiltroprecio.findAll", query="SELECT s FROM SpFiltroprecio s")
public class SpFiltroprecio implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpFiltroprecioPK id;

	@Column(name="c_caja")
	private String cCaja;

	@Column(name="c_filtrasn")
	private String cFiltrasn;

	public SpFiltroprecio() {
	}

	public SpFiltroprecioPK getId() {
		return this.id;
	}

	public void setId(SpFiltroprecioPK id) {
		this.id = id;
	}

	public String getCCaja() {
		return this.cCaja;
	}

	public void setCCaja(String cCaja) {
		this.cCaja = cCaja;
	}

	public String getCFiltrasn() {
		return this.cFiltrasn;
	}

	public void setCFiltrasn(String cFiltrasn) {
		this.cFiltrasn = cFiltrasn;
	}

}