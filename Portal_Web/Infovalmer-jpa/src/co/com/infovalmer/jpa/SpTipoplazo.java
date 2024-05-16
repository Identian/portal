package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_tipoplazo database table.
 * 
 */
@Entity
@Table(name="sp_tipoplazo")
@NamedQuery(name="SpTipoplazo.findAll", query="SELECT s FROM SpTipoplazo s")
public class SpTipoplazo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_tipoplazo")
	private byte iTipoplazo;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="i_plazofin")
	private int iPlazofin;

	@Column(name="i_plazoini")
	private int iPlazoini;

	public SpTipoplazo() {
	}

	public byte getITipoplazo() {
		return this.iTipoplazo;
	}

	public void setITipoplazo(byte iTipoplazo) {
		this.iTipoplazo = iTipoplazo;
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

	public int getIPlazofin() {
		return this.iPlazofin;
	}

	public void setIPlazofin(int iPlazofin) {
		this.iPlazofin = iPlazofin;
	}

	public int getIPlazoini() {
		return this.iPlazoini;
	}

	public void setIPlazoini(int iPlazoini) {
		this.iPlazoini = iPlazoini;
	}

}