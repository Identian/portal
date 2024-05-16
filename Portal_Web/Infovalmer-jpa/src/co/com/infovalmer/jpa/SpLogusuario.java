package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_logusuarios database table.
 * 
 */
@Entity
@Table(name="sp_logusuarios")
@NamedQuery(name="SpLogusuario.findAll", query="SELECT s FROM SpLogusuario s")
public class SpLogusuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpLogusuarioPK id;

	@Column(name="c_ipingresa")
	private String cIpingresa;

	public SpLogusuario() {
	}

	public SpLogusuarioPK getId() {
		return this.id;
	}

	public void setId(SpLogusuarioPK id) {
		this.id = id;
	}

	public String getCIpingresa() {
		return this.cIpingresa;
	}

	public void setCIpingresa(String cIpingresa) {
		this.cIpingresa = cIpingresa;
	}

}