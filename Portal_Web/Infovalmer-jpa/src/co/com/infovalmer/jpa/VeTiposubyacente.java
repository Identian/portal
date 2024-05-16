package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ve_tiposubyacente database table.
 * 
 */
@Entity
@Table(name="ve_tiposubyacente")
@NamedQuery(name="VeTiposubyacente.findAll", query="SELECT v FROM VeTiposubyacente v")
public class VeTiposubyacente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_nemosubyacente")
	private String cNemosubyacente;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="i_gruposubyacente")
	private int iGruposubyacente;

	@Column(name="i_lastingdate")
	private int iLastingdate;

	public VeTiposubyacente() {
	}

	public String getCNemosubyacente() {
		return this.cNemosubyacente;
	}

	public void setCNemosubyacente(String cNemosubyacente) {
		this.cNemosubyacente = cNemosubyacente;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public int getIGruposubyacente() {
		return this.iGruposubyacente;
	}

	public void setIGruposubyacente(int iGruposubyacente) {
		this.iGruposubyacente = iGruposubyacente;
	}

	public int getILastingdate() {
		return this.iLastingdate;
	}

	public void setILastingdate(int iLastingdate) {
		this.iLastingdate = iLastingdate;
	}

}