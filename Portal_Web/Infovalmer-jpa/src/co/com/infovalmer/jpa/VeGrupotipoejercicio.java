package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ve_grupotipoejercicio database table.
 * 
 */
@Entity
@Table(name="ve_grupotipoejercicio")
@NamedQuery(name="VeGrupotipoejercicio.findAll", query="SELECT v FROM VeGrupotipoejercicio v")
public class VeGrupotipoejercicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_grupotipoejercicio")
	private int iGrupotipoejercicio;

	@Lob
	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_estado")
	private int cEstado;

	@Column(name="c_nombre")
	private String cNombre;

	public VeGrupotipoejercicio() {
	}

	public int getIGrupotipoejercicio() {
		return this.iGrupotipoejercicio;
	}

	public void setIGrupotipoejercicio(int iGrupotipoejercicio) {
		this.iGrupotipoejercicio = iGrupotipoejercicio;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public int getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(int cEstado) {
		this.cEstado = cEstado;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

}