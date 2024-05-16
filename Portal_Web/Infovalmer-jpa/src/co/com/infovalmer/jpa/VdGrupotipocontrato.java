package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vd_grupotipocontrato database table.
 * 
 */
@Entity
@Table(name="vd_grupotipocontrato")
@NamedQuery(name="VdGrupotipocontrato.findAll", query="SELECT v FROM VdGrupotipocontrato v")
public class VdGrupotipocontrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_grupotipocontrato")
	private int iGrupotipocontrato;

	@Lob
	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="i_estado")
	private int iEstado;

	public VdGrupotipocontrato() {
	}

	public int getIGrupotipocontrato() {
		return this.iGrupotipocontrato;
	}

	public void setIGrupotipocontrato(int iGrupotipocontrato) {
		this.iGrupotipocontrato = iGrupotipocontrato;
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