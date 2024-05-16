package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vd_tasa database table.
 * 
 */
@Entity
@Table(name="vd_tasa")
@NamedQuery(name="VdTasa.findAll", query="SELECT v FROM VdTasa v")
public class VdTasa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="e_codigo")
	private int eCodigo;

	@Column(name="c_nombretasa")
	private String cNombretasa;

	@Column(name="e_plazo")
	private int ePlazo;

	public VdTasa() {
	}

	public int getECodigo() {
		return this.eCodigo;
	}

	public void setECodigo(int eCodigo) {
		this.eCodigo = eCodigo;
	}

	public String getCNombretasa() {
		return this.cNombretasa;
	}

	public void setCNombretasa(String cNombretasa) {
		this.cNombretasa = cNombretasa;
	}

	public int getEPlazo() {
		return this.ePlazo;
	}

	public void setEPlazo(int ePlazo) {
		this.ePlazo = ePlazo;
	}

}