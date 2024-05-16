package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vd_tipoopcion database table.
 * 
 */
@Entity
@Table(name="vd_tipoopcion")
@NamedQuery(name="VdTipoopcion.findAll", query="SELECT v FROM VdTipoopcion v")
public class VdTipoopcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_tipoopcion")
	private String cTipoopcion;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="i_grupotipoopcion")
	private int iGrupotipoopcion;

	public VdTipoopcion() {
	}

	public String getCTipoopcion() {
		return this.cTipoopcion;
	}

	public void setCTipoopcion(String cTipoopcion) {
		this.cTipoopcion = cTipoopcion;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public int getIGrupotipoopcion() {
		return this.iGrupotipoopcion;
	}

	public void setIGrupotipoopcion(int iGrupotipoopcion) {
		this.iGrupotipoopcion = iGrupotipoopcion;
	}

}