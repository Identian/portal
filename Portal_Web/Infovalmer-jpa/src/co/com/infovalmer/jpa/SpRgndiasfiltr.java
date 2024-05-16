package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_rgndiasfiltr database table.
 * 
 */
@Entity
@Table(name="sp_rgndiasfiltr")
@NamedQuery(name="SpRgndiasfiltr.findAll", query="SELECT s FROM SpRgndiasfiltr s")
public class SpRgndiasfiltr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_codrangodf")
	private int iCodrangodf;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="i_fin")
	private int iFin;

	@Column(name="i_inicio")
	private int iInicio;

	public SpRgndiasfiltr() {
	}

	public int getICodrangodf() {
		return this.iCodrangodf;
	}

	public void setICodrangodf(int iCodrangodf) {
		this.iCodrangodf = iCodrangodf;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public int getIFin() {
		return this.iFin;
	}

	public void setIFin(int iFin) {
		this.iFin = iFin;
	}

	public int getIInicio() {
		return this.iInicio;
	}

	public void setIInicio(int iInicio) {
		this.iInicio = iInicio;
	}

}