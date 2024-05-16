package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_caja database table.
 * 
 */
@Entity
@Table(name="sp_caja")
@NamedQuery(name="SpCaja.findAll", query="SELECT s FROM SpCaja s")
public class SpCaja implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_caja")
	private String cCaja;

	@Column(name="c_nombre")
	private String cNombre;

	public SpCaja() {
	}

	public String getCCaja() {
		return this.cCaja;
	}

	public void setCCaja(String cCaja) {
		this.cCaja = cCaja;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

}