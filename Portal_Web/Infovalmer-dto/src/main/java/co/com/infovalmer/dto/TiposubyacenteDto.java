package co.com.infovalmer.dto;

import java.io.Serializable;

public class TiposubyacenteDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private String cNemosubyacente;
	private String cNombre;
	private int iGruposubyacente;
	private int iLastingdate;

	public TiposubyacenteDto() {
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