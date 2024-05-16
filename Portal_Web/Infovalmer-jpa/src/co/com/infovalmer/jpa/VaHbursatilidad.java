package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the va_hbursatilidad database table.
 * 
 */
@Entity
@Table(name="va_hbursatilidad")
@NamedQuery(name="VaHbursatilidad.findAll", query="SELECT v FROM VaHbursatilidad v")
public class VaHbursatilidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VaHbursatilidadPK id;

	public VaHbursatilidad() {
	}

	public VaHbursatilidadPK getId() {
		return this.id;
	}

	public void setId(VaHbursatilidadPK id) {
		this.id = id;
	}

}