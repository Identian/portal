package co.com.infovalmer.dto;

import java.io.Serializable;

public class FiltroNemoDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cEmisor;
	private String cTipoTasa;
	private String cNemotecnico;
	private String cIsin;
	private String limInicial;
	private String limFinal;

	public String getcEmisor() {
		return cEmisor;
	}

	public void setcEmisor(String cEmisor) {
		this.cEmisor = cEmisor;
	}

	public String getcTipoTasa() {
		return cTipoTasa;
	}

	public void setcTipoTasa(String cTipoTasa) {
		this.cTipoTasa = cTipoTasa;
	}

	public String getcNemotecnico() {
		return cNemotecnico;
	}

	public void setcNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public String getcIsin() {
		return cIsin;
	}

	public void setcIsin(String cIsin) {
		this.cIsin = cIsin;
	}

	public String getLimInicial() {
		return limInicial;
	}

	public void setLimInicial(String limInicial) {
		this.limInicial = limInicial;
	}

	public String getLimFinal() {
		return limFinal;
	}

	public void setLimFinal(String limFinal) {
		this.limFinal = limFinal;
	}
}
