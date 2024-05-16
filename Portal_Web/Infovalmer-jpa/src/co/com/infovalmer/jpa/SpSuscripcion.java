package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_suscripcion database table.
 * 
 */
@Entity
@Table(name="sp_suscripcion")
@NamedQuery(name="SpSuscripcion.findAll", query="SELECT s FROM SpSuscripcion s")
public class SpSuscripcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpSuscripcionPK id;

	@Column(name="c_dia")
	private String cDia;

	@Column(name="c_historico")
	private String cHistorico;

	@Column(name="c_periodicidad")
	private String cPeriodicidad;

	@Column(name="c_tipomoneda")
	private String cTipomoneda;

	@Column(name="i_adicional")
	private int iAdicional;

	public SpSuscripcion() {
	}

	public SpSuscripcionPK getId() {
		return this.id;
	}

	public void setId(SpSuscripcionPK id) {
		this.id = id;
	}

	public String getCDia() {
		return this.cDia;
	}

	public void setCDia(String cDia) {
		this.cDia = cDia;
	}

	public String getCHistorico() {
		return this.cHistorico;
	}

	public void setCHistorico(String cHistorico) {
		this.cHistorico = cHistorico;
	}

	public String getCPeriodicidad() {
		return this.cPeriodicidad;
	}

	public void setCPeriodicidad(String cPeriodicidad) {
		this.cPeriodicidad = cPeriodicidad;
	}

	public String getCTipomoneda() {
		return this.cTipomoneda;
	}

	public void setCTipomoneda(String cTipomoneda) {
		this.cTipomoneda = cTipomoneda;
	}

	public int getIAdicional() {
		return this.iAdicional;
	}

	public void setIAdicional(int iAdicional) {
		this.iAdicional = iAdicional;
	}

}