package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_precios_curva database table.
 * 
 */
@Entity
@Table(name="po_precios_curva")
@NamedQuery(name="PoPreciosCurva.findAll", query="SELECT p FROM PoPreciosCurva p")
public class PoPreciosCurva implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PoPreciosCurvaPK id;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="i_precio")
	private int iPrecio;

	public PoPreciosCurva() {
	}

	public PoPreciosCurvaPK getId() {
		return this.id;
	}

	public void setId(PoPreciosCurvaPK id) {
		this.id = id;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public int getIPrecio() {
		return this.iPrecio;
	}

	public void setIPrecio(int iPrecio) {
		this.iPrecio = iPrecio;
	}

}