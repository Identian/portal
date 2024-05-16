package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_tabauditada database table.
 * 
 */
@Entity
@Table(name="sp_tabauditada")
@NamedQuery(name="SpTabauditada.findAll", query="SELECT s FROM SpTabauditada s")
public class SpTabauditada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_tabauditada")
	private byte iTabauditada;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	public SpTabauditada() {
	}

	public byte getITabauditada() {
		return this.iTabauditada;
	}

	public void setITabauditada(byte iTabauditada) {
		this.iTabauditada = iTabauditada;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

}