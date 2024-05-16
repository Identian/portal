package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_tipcalificon database table.
 * 
 */
@Entity
@Table(name="sp_tipcalificon")
@NamedQuery(name="SpTipcalificon.findAll", query="SELECT s FROM SpTipcalificon s")
public class SpTipcalificon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_tipcalificaci")
	private byte iTipcalificaci;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	public SpTipcalificon() {
	}

	public byte getITipcalificaci() {
		return this.iTipcalificaci;
	}

	public void setITipcalificaci(byte iTipcalificaci) {
		this.iTipcalificaci = iTipcalificaci;
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