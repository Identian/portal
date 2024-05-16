package co.com.infovalmer.dto;

import java.io.Serializable;

public class MercadosDto implements Serializable{
	private static final long serialVersionUID = 1L;

	private int iMercado;

	private String cNombre;

	public MercadosDto() {
	}

	public int getIMercado() {
		return this.iMercado;
	}

	public void setIMercado(int iMercado) {
		this.iMercado = iMercado;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	
}
