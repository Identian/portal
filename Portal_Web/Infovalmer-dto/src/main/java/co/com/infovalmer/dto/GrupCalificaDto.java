package co.com.infovalmer.dto;

import java.io.Serializable;

public class GrupCalificaDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String iGrupcalifica;
	private String cDescripcion;
	private String cEstado;
	private String cNombre;
	private int iEscalavalor;

	public GrupCalificaDto() {
	}

	public String getIGrupcalifica() {
		return this.iGrupcalifica;
	}

	public void setIGrupcalifica(String iGrupcalifica) {
		this.iGrupcalifica = iGrupcalifica;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public int getIEscalavalor() {
		return this.iEscalavalor;
	}

	public void setIEscalavalor(int iEscalavalor) {
		this.iEscalavalor = iEscalavalor;
	}
}
