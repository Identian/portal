package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_opcion database table.
 * 
 */
@Entity
@Table(name="po_opcion")
@NamedQuery(name="PoOpcion.findAll", query="SELECT p FROM PoOpcion p")
public class PoOpcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="I_OPCION")
	private int iOpcion;

	@Column(name="C_ACCION")
	private String cAccion;

	@Column(name="C_DESCRIPCION")
	private String cDescripcion;

	@Column(name="I_MERCADO")
	private int iMercado;

	@Column(name="I_OPCION_PADRE")
	private int iOpcionPadre;

	public PoOpcion() {
	}

	public int getIOpcion() {
		return this.iOpcion;
	}

	public void setIOpcion(int iOpcion) {
		this.iOpcion = iOpcion;
	}

	public String getCAccion() {
		return this.cAccion;
	}

	public void setCAccion(String cAccion) {
		this.cAccion = cAccion;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public int getIMercado() {
		return this.iMercado;
	}

	public void setIMercado(int iMercado) {
		this.iMercado = iMercado;
	}

	public int getIOpcionPadre() {
		return this.iOpcionPadre;
	}

	public void setIOpcionPadre(int iOpcionPadre) {
		this.iOpcionPadre = iOpcionPadre;
	}

}