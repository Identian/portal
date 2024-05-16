package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_haoperacion database table.
 * 
 */
@Entity
@Table(name="sp_haoperacion")
@NamedQuery(name="SpHaoperacion.findAll", query="SELECT s FROM SpHaoperacion s")
public class SpHaoperacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpHaoperacionPK id;

	@Column(name="c_causal")
	private String cCausal;

	@Column(name="c_supervisor")
	private String cSupervisor;

	@Column(name="c_usuario")
	private String cUsuario;

	public SpHaoperacion() {
	}

	public SpHaoperacionPK getId() {
		return this.id;
	}

	public void setId(SpHaoperacionPK id) {
		this.id = id;
	}

	public String getCCausal() {
		return this.cCausal;
	}

	public void setCCausal(String cCausal) {
		this.cCausal = cCausal;
	}

	public String getCSupervisor() {
		return this.cSupervisor;
	}

	public void setCSupervisor(String cSupervisor) {
		this.cSupervisor = cSupervisor;
	}

	public String getCUsuario() {
		return this.cUsuario;
	}

	public void setCUsuario(String cUsuario) {
		this.cUsuario = cUsuario;
	}

}