package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_tipoerror database table.
 * 
 */
@Entity
@Table(name="sp_tipoerror")
@NamedQuery(name="SpTipoerror.findAll", query="SELECT s FROM SpTipoerror s")
public class SpTipoerror implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_tipoerror")
	private byte iTipoerror;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	public SpTipoerror() {
	}

	public byte getITipoerror() {
		return this.iTipoerror;
	}

	public void setITipoerror(byte iTipoerror) {
		this.iTipoerror = iTipoerror;
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