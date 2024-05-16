package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_titgrucalifica database table.
 * 
 */
@Entity
@Table(name="sp_titgrucalifica")
@NamedQuery(name="SpTitgrucalifica.findAll", query="SELECT s FROM SpTitgrucalifica s")
public class SpTitgrucalifica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="i_tipoplazo")
	private int iTipoplazo;
	
	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Column(name="i_grupcalifica")
	private int iGrupcalifica;

	

	public SpTitgrucalifica() {
	}

	public String getCNemotecnico() {
		return this.cNemotecnico;
	}

	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public int getIGrupcalifica() {
		return this.iGrupcalifica;
	}

	public void setIGrupcalifica(int iGrupcalifica) {
		this.iGrupcalifica = iGrupcalifica;
	}

	public int getITipoplazo() {
		return this.iTipoplazo;
	}

	public void setITipoplazo(int iTipoplazo) {
		this.iTipoplazo = iTipoplazo;
	}

}