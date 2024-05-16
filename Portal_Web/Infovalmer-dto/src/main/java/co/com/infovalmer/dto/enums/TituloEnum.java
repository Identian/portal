package co.com.infovalmer.dto.enums;

public enum TituloEnum {
	MUESTA_TITULO_PARAMETRIA("S"), NO_MUESTRA_TITULO_PARAMETRIA("N"),FECHAINICIOSISTEMA("10");

	String valor;

	TituloEnum(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
