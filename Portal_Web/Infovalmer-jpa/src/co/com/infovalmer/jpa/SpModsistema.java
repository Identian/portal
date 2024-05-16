package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_modsistema database table.
 * 
 */
@Entity
@Table(name="sp_modsistema")
@NamedQuery(name="SpModsistema.findAll", query="SELECT s FROM SpModsistema s")
public class SpModsistema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_modulosistema")
	private byte iModulosistema;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	public SpModsistema() {
	}

	public byte getIModulosistema() {
		return this.iModulosistema;
	}

	public void setIModulosistema(byte iModulosistema) {
		this.iModulosistema = iModulosistema;
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