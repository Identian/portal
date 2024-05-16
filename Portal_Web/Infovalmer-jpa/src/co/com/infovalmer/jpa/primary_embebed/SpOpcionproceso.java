package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the sp_opcionproceso database table.
 * 
 */
@Entity
@Table(name = "sp_opcionproceso")
@NamedQuery(name = "SpOpcionproceso.findAll", query = "SELECT s FROM SpOpcionproceso s")
public class SpOpcionproceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpOpcionprocesoPK id;

	@Column(name = "c_descripcion")
	private String cDescripcion;

	@Column(name = "c_obligasn")
	private String cObligasn;

	@Column(name = "i_numveces")
	private int iNumveces;

	@Column(name = "i_orden")
	private int iOrden;

	public SpOpcionproceso() {
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCObligasn() {
		return this.cObligasn;
	}

	public void setCObligasn(String cObligasn) {
		this.cObligasn = cObligasn;
	}

	public int getINumveces() {
		return this.iNumveces;
	}

	public void setINumveces(int iNumveces) {
		this.iNumveces = iNumveces;
	}

	public int getIOrden() {
		return this.iOrden;
	}

	public void setIOrden(int iOrden) {
		this.iOrden = iOrden;
	}

}