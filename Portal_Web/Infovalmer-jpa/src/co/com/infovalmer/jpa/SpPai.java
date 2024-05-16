package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_pais database table.
 * 
 */
@Entity
@Table(name="sp_pais")
@NamedQuery(name="SpPai.findAll", query="SELECT s FROM SpPai s")
public class SpPai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_pais")
	private int iPais;

	@Column(name="c_nombre")
	private String cNombre;

	public SpPai() {
	}

	public int getIPais() {
		return this.iPais;
	}

	public void setIPais(int iPais) {
		this.iPais = iPais;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

}