package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_equivalente database table.
 * 
 */
@Entity
@Table(name="sp_equivalente")
@NamedQuery(name="SpEquivalente.findAll", query="SELECT s FROM SpEquivalente s")
public class SpEquivalente implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpEquivalentePK id;

	@Column(name="c_modalidad")
	private String cModalidad;

	@Column(name="c_reinversion")
	private String cReinversion;

	@Column(name="c_valor")
	private String cValor;

	public SpEquivalente() {
	}

	public SpEquivalentePK getId() {
		return this.id;
	}

	public void setId(SpEquivalentePK id) {
		this.id = id;
	}

	public String getCModalidad() {
		return this.cModalidad;
	}

	public void setCModalidad(String cModalidad) {
		this.cModalidad = cModalidad;
	}

	public String getCReinversion() {
		return this.cReinversion;
	}

	public void setCReinversion(String cReinversion) {
		this.cReinversion = cReinversion;
	}

	public String getCValor() {
		return this.cValor;
	}

	public void setCValor(String cValor) {
		this.cValor = cValor;
	}

}