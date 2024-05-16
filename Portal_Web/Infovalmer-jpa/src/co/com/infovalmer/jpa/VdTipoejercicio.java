package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vd_tipoejercicio database table.
 * 
 */
@Entity
@Table(name="vd_tipoejercicio")
@NamedQuery(name="VdTipoejercicio.findAll", query="SELECT v FROM VdTipoejercicio v")
public class VdTipoejercicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_tipoejercicio")
	private String cTipoejercicio;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="i_grupotipoejercicio")
	private int iGrupotipoejercicio;

	public VdTipoejercicio() {
	}

	public String getCTipoejercicio() {
		return this.cTipoejercicio;
	}

	public void setCTipoejercicio(String cTipoejercicio) {
		this.cTipoejercicio = cTipoejercicio;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public int getIGrupotipoejercicio() {
		return this.iGrupotipoejercicio;
	}

	public void setIGrupotipoejercicio(int iGrupotipoejercicio) {
		this.iGrupotipoejercicio = iGrupotipoejercicio;
	}

}