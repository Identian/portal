package co.com.infovalmer.dto.enums;

public enum TipoTasaEnum {
	MUESTA_TASA_PARAMETRIA("S"), NO_MUESTRA_TASA_PARAMETRIA("N");

	String valor;

	TipoTasaEnum(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
