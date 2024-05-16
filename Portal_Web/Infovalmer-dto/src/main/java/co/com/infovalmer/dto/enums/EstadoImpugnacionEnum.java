package co.com.infovalmer.dto.enums;

public enum EstadoImpugnacionEnum {

	ATENDIDA(1,"ATENDIDA"),
	PENDIENTE(2,"PENDIENTE");
	
	private int valor;
	private String desc;
	
	EstadoImpugnacionEnum(int valor, String desc){
		this.valor = valor;
		this.desc = desc;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
