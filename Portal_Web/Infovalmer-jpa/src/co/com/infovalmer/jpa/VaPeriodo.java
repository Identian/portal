package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the va_periodos database table.
 * 
 */
@Entity
@Table(name="va_periodos")
@NamedQuery(name="VaPeriodo.findAll", query="SELECT v FROM VaPeriodo v")
public class VaPeriodo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VaPeriodoPK id;

	public VaPeriodo() {
	}

	public VaPeriodoPK getId() {
		return this.id;
	}

	public void setId(VaPeriodoPK id) {
		this.id = id;
	}

}