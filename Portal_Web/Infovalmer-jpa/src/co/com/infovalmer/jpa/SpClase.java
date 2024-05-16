package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_clase database table.
 * 
 */
@Entity
@Table(name="sp_clase")
@NamedQuery(name="SpClase.findAll", query="SELECT s FROM SpClase s")
public class SpClase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_clase")
	private String cClase;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_estado")
	private String cEstado;

	@Column(name="c_nombre")
	private String cNombre;

	public SpClase() {
	}

	public String getCClase() {
		return this.cClase;
	}

	public void setCClase(String cClase) {
		this.cClase = cClase;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

}