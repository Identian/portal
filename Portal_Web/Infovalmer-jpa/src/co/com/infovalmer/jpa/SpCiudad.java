package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_ciudad database table.
 * 
 */
@Entity
@Table(name="sp_ciudad")
@NamedQuery(name="SpCiudad.findAll", query="SELECT s FROM SpCiudad s")
public class SpCiudad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_ciudad")
	private int iCiudad;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="i_pais")
	private int iPais;

	public SpCiudad() {
	}

	public int getICiudad() {
		return this.iCiudad;
	}

	public void setICiudad(int iCiudad) {
		this.iCiudad = iCiudad;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public int getIPais() {
		return this.iPais;
	}

	public void setIPais(int iPais) {
		this.iPais = iPais;
	}

}