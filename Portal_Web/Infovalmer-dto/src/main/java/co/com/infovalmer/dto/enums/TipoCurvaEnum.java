package co.com.infovalmer.dto.enums;

public enum TipoCurvaEnum {

	MUESTA_TIPO_CURVA_PARAMETRIA("S"), NO_MUESTRA_TIPO_CURVA_PARAMETRIA("N");

	String valor;

	TipoCurvaEnum(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
