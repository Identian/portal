package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vd_log_operaciones database table.
 * 
 */
@Entity
@Table(name="vd_log_operaciones")
@NamedQuery(name="VdLogOperacione.findAll", query="SELECT v FROM VdLogOperacione v")
public class VdLogOperacione implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VdLogOperacionePK id;

	@Column(name="c_comentario")
	private String cComentario;

	public VdLogOperacione() {
	}

	public VdLogOperacionePK getId() {
		return this.id;
	}

	public void setId(VdLogOperacionePK id) {
		this.id = id;
	}

	public String getCComentario() {
		return this.cComentario;
	}

	public void setCComentario(String cComentario) {
		this.cComentario = cComentario;
	}

}