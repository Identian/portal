package co.com.infovalmer.dto.enums;

public enum TipoEmailEnum {
	
	RESPUESTA_INFOVALMER("RESPUESTA_INFOVALMER"),
	IMPUGNACION_CLIENTE("IMPUGNACION_CLIENTE");
	
	String desc;
	
	private TipoEmailEnum(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
