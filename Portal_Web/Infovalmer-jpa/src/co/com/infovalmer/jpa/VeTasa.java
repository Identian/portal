package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ve_tasa database table.
 * 
 */
@Entity
@Table(name="ve_tasa")
@NamedQuery(name="VeTasa.findAll", query="SELECT v FROM VeTasa v")
public class VeTasa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="e_codigo")
	private int eCodigo;

	@Column(name="c_nombretasa")
	private String cNombretasa;

	@Column(name="e_plazo")
	private int ePlazo;

	public VeTasa() {
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