package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_propiedades database table.
 * 
 */
@Entity
@Table(name="po_propiedades")
@NamedQuery(name="PoPropiedade.findAll", query="SELECT p FROM PoPropiedade p")
public class PoPropiedade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_propiedad")
	private String cPropiedad;

	@Lob
	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_modulo")
	private String cModulo;

	@Column(name="c_type")
	private String cType;

	@Lob
	@Column(name="c_valor")
	private String cValor;

	public PoPropiedade() {
	}

	public String getCPropiedad() {
		return this.cPropiedad;
	}

	public void setCPropiedad(String cPropiedad) {
		this.cPropiedad = cPropiedad;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCModulo() {
		return this.cModulo;
	}

	public void setCModulo(String cModulo) {
		this.cModulo = cModulo;
	}

	public String getCType() {
		return this.cType;
	}

	public void setCType(String cType) {
		this.cType = cType;
	}

	public String getCValor() {
		return this.cValor;
	}

	public void setCValor(String cValor) {
		this.cValor = cValor;
	}

}