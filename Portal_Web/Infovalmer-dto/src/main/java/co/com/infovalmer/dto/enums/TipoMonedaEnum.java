package co.com.infovalmer.dto.enums;

public enum TipoMonedaEnum {
	MUESTA_MONEDA_PARAMETRIA("S"), NO_MUESTRA_MONEDA_PARAMETRIA("N");

	String valor;

	TipoMonedaEnum(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
