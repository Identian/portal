package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_accionbd database table.
 * 
 */
@Entity
@Table(name="sp_accionbd")
@NamedQuery(name="SpAccionbd.findAll", query="SELECT s FROM SpAccionbd s")
public class SpAccionbd implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_accionbd")
	private int iAccionbd;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	private int contador;

	public SpAccionbd() {
	}

	public int getIAccionbd() {
		return this.iAccionbd;
	}

	public void setIAccionbd(int iAccionbd) {
		this.iAccionbd = iAccionbd;
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

	public int getContador() {
		return this.contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

}