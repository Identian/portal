package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ve_parametro database table.
 * 
 */
@Entity
@Table(name="ve_parametro")
@NamedQuery(name="VeParametro.findAll", query="SELECT v FROM VeParametro v")
public class VeParametro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_parametro")
	private int iParametro;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="i_tipodato")
	private int iTipodato;

	public VeParametro() {
	}

	public int getIParametro() {
		return this.iParametro;
	}

	public void setIParametro(int iParametro) {
		this.iParametro = iParametro;
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

	public int getITipodato() {
		return this.iTipodato;
	}

	public void setITipodato(int iTipodato) {
		this.iTipodato = iTipodato;
	}

}