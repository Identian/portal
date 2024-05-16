package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ve_grupotipoopcion database table.
 * 
 */
@Entity
@Table(name="ve_grupotipoopcion")
@NamedQuery(name="VeGrupotipoopcion.findAll", query="SELECT v FROM VeGrupotipoopcion v")
public class VeGrupotipoopcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_grupotipoopcion")
	private int iGrupotipoopcion;

	@Lob
	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="i_estado")
	private int iEstado;

	public VeGrupotipoopcion() {
	}

	public int getIGrupotipoopcion() {
		return this.iGrupotipoopcion;
	}

	public void setIGrupotipoopcion(int iGrupotipoopcion) {
		this.iGrupotipoopcion = iGrupotipoopcion;
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

	public int getIEstado() {
		return this.iEstado;
	}

	public void setIEstado(int iEstado) {
		this.iEstado = iEstado;
	}

}