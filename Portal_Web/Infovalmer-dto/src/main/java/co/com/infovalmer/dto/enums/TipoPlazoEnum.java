package co.com.infovalmer.dto.enums;

public enum TipoPlazoEnum {
	LARGO_PLAZO("LARGO PLAZO"), CORTO_PLAZO("CORTO PLAZO");

	String valor;

	TipoPlazoEnum(String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
