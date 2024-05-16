package co.com.infovalmer.dto.enums;

public enum RolesEnum {
	ADMIN("ADMIN"), USER("USER");

	private RolesEnum(String valor) {
		this.valor = valor;
	}

	private String valor;

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
