package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_opcionmodulo database table.
 * 
 */
@Entity
@Table(name="sp_opcionmodulo")
@NamedQuery(name="SpOpcionmodulo.findAll", query="SELECT s FROM SpOpcionmodulo s")
public class SpOpcionmodulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpOpcionmoduloPK id;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="i_codigopagina")
	private int iCodigopagina;

	@Column(name="i_estado")
	private int iEstado;

	@Column(name="i_nivel")
	private int iNivel;

	@Column(name="i_opciondepende")
	private int iOpciondepende;

	@Column(name="i_orden")
	private int iOrden;

	public SpOpcionmodulo() {
	}

	public SpOpcionmoduloPK getId() {
		return this.id;
	}

	public void setId(SpOpcionmoduloPK id) {
		this.id = id;
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

	public int getICodigopagina() {
		return this.iCodigopagina;
	}

	public void setICodigopagina(int iCodigopagina) {
		this.iCodigopagina = iCodigopagina;
	}

	public int getIEstado() {
		return this.iEstado;
	}

	public void setIEstado(int iEstado) {
		this.iEstado = iEstado;
	}

	public int getINivel() {
		return this.iNivel;
	}

	public void setINivel(int iNivel) {
		this.iNivel = iNivel;
	}

	public int getIOpciondepende() {
		return this.iOpciondepende;
	}

	public void setIOpciondepende(int iOpciondepende) {
		this.iOpciondepende = iOpciondepende;
	}

	public int getIOrden() {
		return this.iOrden;
	}

	public void setIOrden(int iOrden) {
		this.iOrden = iOrden;
	}

}