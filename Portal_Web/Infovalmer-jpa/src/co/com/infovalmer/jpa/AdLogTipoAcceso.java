package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ad_log_tipo_acceso database table.
 * 
 */
@Entity
@Table(name="ad_log_tipo_acceso")
@NamedQuery(name="AdLogTipoAcceso.findAll", query="SELECT a FROM AdLogTipoAcceso a")
public class AdLogTipoAcceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_tipo_acceso")
	private int iTipoAcceso;

	@Column(name="c_tipo_acceso")
	private String cTipoAcceso;

	public AdLogTipoAcceso() {
	}

	public int getITipoAcceso() {
		return this.iTipoAcceso;
	}

	public void setITipoAcceso(int iTipoAcceso) {
		this.iTipoAcceso = iTipoAcceso;
	}

	public String getCTipoAcceso() {
		return this.cTipoAcceso;
	}

	public void setCTipoAcceso(String cTipoAcceso) {
		this.cTipoAcceso = cTipoAcceso;
	}

}