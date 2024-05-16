package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the sp_logtescorto database table.
 * 
 */
@Entity
@Table(name = "sp_logtescorto")
@NamedQuery(name = "SpLogtescorto.findAll", query = "SELECT s FROM SpLogtescorto s")
public class SpLogtescorto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpLogtescortoPK id;

	@Column(name = "c_hora")
	private String cHora;

	@Column(name = "c_metodofinal")
	private String cMetodofinal;

	@Column(name = "c_metodoinicial")
	private String cMetodoinicial;

	public SpLogtescorto() {
	}

	public SpLogtescortoPK getId() {
		return id;
	}

	public void setId(SpLogtescortoPK id) {
		this.id = id;
	}

	public String getCHora() {
		return this.cHora;
	}

	public void setCHora(String cHora) {
		this.cHora = cHora;
	}

	public String getCMetodofinal() {
		return this.cMetodofinal;
	}

	public void setCMetodofinal(String cMetodofinal) {
		this.cMetodofinal = cMetodofinal;
	}

	public String getCMetodoinicial() {
		return this.cMetodoinicial;
	}

	public void setCMetodoinicial(String cMetodoinicial) {
		this.cMetodoinicial = cMetodoinicial;
	}

}