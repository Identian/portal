package co.com.infovalmer.dto.enums;

public enum TablaAmortizacionEnum {

	REGISTRO_CONTROL_CABECERA("C"), REGISTRO_CONTROL_DETALLE("D"), SISTEMA_INFORMACION(
			"MEC"), NIT_ENTIDAD("1");

	String desc;

	private TablaAmortizacionEnum(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
