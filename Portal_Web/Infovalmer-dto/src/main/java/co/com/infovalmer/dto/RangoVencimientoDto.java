package co.com.infovalmer.dto;

import java.io.Serializable;

public class RangoVencimientoDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6648952405999844377L;

	private String iRangvencimi;

	private String cNombre;

	private int iRangofin;

	private int iRangoinicio;

	public RangoVencimientoDto() {
	}

	public String getIRangvencimi() {
		return this.iRangvencimi;
	}

	public void setIRangvencimi(String iRangvencimi) {
		this.iRangvencimi = iRangvencimi;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public int getIRangofin() {
		return this.iRangofin;
	}

	public void setIRangofin(int iRangofin) {
		this.iRangofin = iRangofin;
	}

	public int getIRangoinicio() {
		return this.iRangoinicio;
	}

	public void setIRangoinicio(int iRangoinicio) {
		this.iRangoinicio = iRangoinicio;
	}
	
}
