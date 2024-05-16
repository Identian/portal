package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vd_redondeo database table.
 * 
 */
@Entity
@Table(name="vd_redondeo")
@NamedQuery(name="VdRedondeo.findAll", query="SELECT v FROM VdRedondeo v")
public class VdRedondeo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VdRedondeoPK id;

	@Column(name="i_decimales")
	private int iDecimales;

	public VdRedondeo() {
	}

	public VdRedondeoPK getId() {
		return this.id;
	}

	public void setId(VdRedondeoPK id) {
		this.id = id;
	}

	public int getIDecimales() {
		return this.iDecimales;
	}

	public void setIDecimales(int iDecimales) {
		this.iDecimales = iDecimales;
	}

}