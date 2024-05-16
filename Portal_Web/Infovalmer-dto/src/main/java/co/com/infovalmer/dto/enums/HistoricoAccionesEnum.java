package co.com.infovalmer.dto.enums;

public enum HistoricoAccionesEnum {
	MILA("I"), 
	MERCADO_LOCAL("A"), 
	MGC("M"),
	Estatus("E");

	String desc;

	private HistoricoAccionesEnum(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
