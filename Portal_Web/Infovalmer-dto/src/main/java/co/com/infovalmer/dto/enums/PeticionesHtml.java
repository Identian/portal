package co.com.infovalmer.dto.enums;

public enum PeticionesHtml {

	GET("GET"), POST("POST");

	private String valor;

	private PeticionesHtml(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
