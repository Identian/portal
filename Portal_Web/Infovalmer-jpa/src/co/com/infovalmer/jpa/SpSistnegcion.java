package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_sistnegcion database table.
 * 
 */
@Entity
@Table(name="sp_sistnegcion")
@NamedQuery(name="SpSistnegcion.findAll", query="SELECT s FROM SpSistnegcion s")
public class SpSistnegcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_sistnegcion")
	private String cSistnegcion;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="i_diascumpliento")
	private int iDiascumpliento;

	public SpSistnegcion() {
	}

	public String getCSistnegcion() {
		return this.cSistnegcion;
	}

	public void setCSistnegcion(String cSistnegcion) {
		this.cSistnegcion = cSistnegcion;
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

	public int getIDiascumpliento() {
		return this.iDiascumpliento;
	}

	public void setIDiascumpliento(int iDiascumpliento) {
		this.iDiascumpliento = iDiascumpliento;
	}

}