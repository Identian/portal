package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_tiposervicio database table.
 * 
 */
@Entity
@Table(name="sp_tiposervicio")
@NamedQuery(name="SpTiposervicio.findAll", query="SELECT s FROM SpTiposervicio s")
public class SpTiposervicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_tiposervicio")
	private byte iTiposervicio;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	public SpTiposervicio() {
	}

	public byte getITiposervicio() {
		return this.iTiposervicio;
	}

	public void setITiposervicio(byte iTiposervicio) {
		this.iTiposervicio = iTiposervicio;
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

}