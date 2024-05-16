package co.com.infovalmer.jpa.no_model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_titulocurva database table.
 * 
 */
@Entity
@Table(name="sp_titulocurva")
@NamedQuery(name="SpTitulocurva.findAll", query="SELECT s FROM SpTitulocurva s")
public class SpTitulocurva implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Column(name="c_tasareferencia")
	private String cTasareferencia;

	@Column(name="c_tipotasaref")
	private String cTipotasaref;

	@Column(name="i_rangofinal")
	private int iRangofinal;

	@Column(name="i_rangoinicial")
	private int iRangoinicial;

	public SpTitulocurva() {
	}

	public String getCNemotecnico() {
		return this.cNemotecnico;
	}

	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public String getCTasareferencia() {
		return this.cTasareferencia;
	}

	public void setCTasareferencia(String cTasareferencia) {
		this.cTasareferencia = cTasareferencia;
	}

	public String getCTipotasaref() {
		return this.cTipotasaref;
	}

	public void setCTipotasaref(String cTipotasaref) {
		this.cTipotasaref = cTipotasaref;
	}

	public int getIRangofinal() {
		return this.iRangofinal;
	}

	public void setIRangofinal(int iRangofinal) {
		this.iRangofinal = iRangofinal;
	}

	public int getIRangoinicial() {
		return this.iRangoinicial;
	}

	public void setIRangoinicial(int iRangoinicial) {
		this.iRangoinicial = iRangoinicial;
	}

}