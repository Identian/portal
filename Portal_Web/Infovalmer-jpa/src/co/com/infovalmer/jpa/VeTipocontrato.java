package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ve_tipocontrato database table.
 * 
 */
@Entity
@Table(name="ve_tipocontrato")
@NamedQuery(name="VeTipocontrato.findAll", query="SELECT v FROM VeTipocontrato v")
public class VeTipocontrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_tipocontrato")
	private String cTipocontrato;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="i_grupotipocontrato")
	private int iGrupotipocontrato;

	public VeTipocontrato() {
	}

	public String getCTipocontrato() {
		return this.cTipocontrato;
	}

	public void setCTipocontrato(String cTipocontrato) {
		this.cTipocontrato = cTipocontrato;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public int getIGrupotipocontrato() {
		return this.iGrupotipocontrato;
	}

	public void setIGrupotipocontrato(int iGrupotipocontrato) {
		this.iGrupotipocontrato = iGrupotipocontrato;
	}

}