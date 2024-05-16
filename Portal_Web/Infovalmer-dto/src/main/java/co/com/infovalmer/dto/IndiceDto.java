package co.com.infovalmer.dto;

import java.io.Serializable;


public class IndiceDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private String cIndice;

	private String cNombre;

	private String cTipomoneda;

	private int iDiasret;

	private int iMinoper;

	public IndiceDto() {
	}

	public String getCIndice() {
		return this.cIndice;
	}

	public void setCIndice(String cIndice) {
		this.cIndice = cIndice;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getCTipomoneda() {
		return this.cTipomoneda;
	}

	public void setCTipomoneda(String cTipomoneda) {
		this.cTipomoneda = cTipomoneda;
	}

	public int getIDiasret() {
		return this.iDiasret;
	}

	public void setIDiasret(int iDiasret) {
		this.iDiasret = iDiasret;
	}

	public int getIMinoper() {
		return this.iMinoper;
	}

	public void setIMinoper(int iMinoper) {
		this.iMinoper = iMinoper;
	}

}