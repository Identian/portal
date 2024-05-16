package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_indice database table.
 * 
 */
@Entity
@Table(name="sp_indice")
@NamedQuery(name="SpIndice.findAll", query="SELECT s FROM SpIndice s")
public class SpIndice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_indice")
	private String cIndice;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_tipomoneda")
	private String cTipomoneda;

	@Column(name="i_diasret")
	private int iDiasret;

	@Column(name="i_minoper")
	private int iMinoper;

	public SpIndice() {
	}

	public String getCIndice() {
		return this.cIndice;
	}

	public void setCIndice(String cIndice) {
		this.cIndice = cIndice;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getCTipomoneda() {
		return this.cTipomoneda;
	}

	public void setCTipomoneda(String cTipomoneda) {
		this.cTipomoneda = cTipomoneda;
	}

	public int getIDiasret() {
		return this.iDiasret;
	}

	public void setIDiasret(int iDiasret) {
		this.iDiasret = iDiasret;
	}

	public int getIMinoper() {
		return this.iMinoper;
	}

	public void setIMinoper(int iMinoper) {
		this.iMinoper = iMinoper;
	}

}