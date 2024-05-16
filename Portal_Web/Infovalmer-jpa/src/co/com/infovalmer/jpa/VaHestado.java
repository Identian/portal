package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the va_hestados database table.
 * 
 */
@Entity
@Table(name="va_hestados")
@NamedQuery(name="VaHestado.findAll", query="SELECT v FROM VaHestado v")
public class VaHestado implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VaHestadoPK id;

	public VaHestado() {
	}

	public VaHestadoPK getId() {
		return this.id;
	}

	public void setId(VaHestadoPK id) {
		this.id = id;
	}

}