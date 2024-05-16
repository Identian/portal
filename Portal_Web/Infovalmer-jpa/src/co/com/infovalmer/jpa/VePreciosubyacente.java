package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ve_preciosubyacente database table.
 * 
 */
@Entity
@Table(name="ve_preciosubyacente")
@NamedQuery(name="VePreciosubyacente.findAll", query="SELECT v FROM VePreciosubyacente v")
public class VePreciosubyacente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_nemotasa")
	private String cNemotasa;

	@Column(name="c_nombretasa")
	private String cNombretasa;

	public VePreciosubyacente() {
	}

	public String getCNemotasa() {
		return this.cNemotasa;
	}

	public void setCNemotasa(String cNemotasa) {
		this.cNemotasa = cNemotasa;
	}

	public String getCNombretasa() {
		return this.cNombretasa;
	}

	public void setCNombretasa(String cNombretasa) {
		this.cNombretasa = cNombretasa;
	}

}