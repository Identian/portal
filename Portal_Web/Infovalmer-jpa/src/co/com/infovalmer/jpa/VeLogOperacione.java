package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ve_log_operaciones database table.
 * 
 */
@Entity
@Table(name="ve_log_operaciones")
@NamedQuery(name="VeLogOperacione.findAll", query="SELECT v FROM VeLogOperacione v")
public class VeLogOperacione implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VeLogOperacionePK id;

	@Column(name="c_comentario")
	private String cComentario;

	public VeLogOperacione() {
	}

	public VeLogOperacionePK getId() {
		return this.id;
	}

	public void setId(VeLogOperacionePK id) {
		this.id = id;
	}

	public String getCComentario() {
		return this.cComentario;
	}

	public void setCComentario(String cComentario) {
		this.cComentario = cComentario;
	}

}