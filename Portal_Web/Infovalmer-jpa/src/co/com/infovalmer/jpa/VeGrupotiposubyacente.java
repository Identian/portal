package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ve_grupotiposubyacente database table.
 * 
 */
@Entity
@Table(name="ve_grupotiposubyacente")
@NamedQuery(name="VeGrupotiposubyacente.findAll", query="SELECT v FROM VeGrupotiposubyacente v")
public class VeGrupotiposubyacente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_grupotiposubyacente")
	private int iGrupotiposubyacente;

	@Lob
	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="i_estado")
	private int iEstado;

	public VeGrupotiposubyacente() {
	}

	public int getIGrupotiposubyacente() {
		return this.iGrupotiposubyacente;
	}

	public void setIGrupotiposubyacente(int iGrupotiposubyacente) {
		this.iGrupotiposubyacente = iGrupotiposubyacente;
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