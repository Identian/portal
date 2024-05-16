package co.com.infovalmer.dto;

import java.io.Serializable;

public class EtiquetaDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String cEtiqueta;
	private String cIdioma;
	private String cValor;

	public EtiquetaDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getcEtiqueta() {
		return cEtiqueta;
	}

	public void setcEtiqueta(String cEtiqueta) {
		this.cEtiqueta = cEtiqueta;
	}

	public String getcIdioma() {
		return cIdioma;
	}

	public void setcIdioma(String cIdioma) {
		this.cIdioma = cIdioma;
	}

	public String getcValor() {
		return cValor;
	}

	public void setcValor(String cValor) {
		this.cValor = cValor;
	}
}
