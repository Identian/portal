package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ve_redondeo database table.
 * 
 */
@Entity
@Table(name="ve_redondeo")
@NamedQuery(name="VeRedondeo.findAll", query="SELECT v FROM VeRedondeo v")
public class VeRedondeo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VeRedondeoPK id;

	@Column(name="i_decimales")
	private int iDecimales;

	public VeRedondeo() {
	}

	public VeRedondeoPK getId() {
		return this.id;
	}

	public void setId(VeRedondeoPK id) {
		this.id = id;
	}

	public int getIDecimales() {
		return this.iDecimales;
	}

	public void setIDecimales(int iDecimales) {
		this.iDecimales = iDecimales;
	}

}