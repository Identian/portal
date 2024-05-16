package co.com.infovalmer.dto.enums;

public enum MercadoEnum {
	RENTA_FIJA(1,"Renta fija"),
	RENTA_VARIABLE_LOCAL(2,"Renta variable local"),
	RENTA_VARIABLE_MILA_IMGC(3,"Renta variable mila imgc"),
	DERIVADOS(4,"Derivados"),
	RENTA_FIJA_INTERNACIONAL(5,"Renta fija internacional"),
	RENTA_VARIABLE_INTERNACIONAL(6,"Renta variable internacional"),
	DERIVADOS_OTC(7,"Derivados otc"),
	NOTAS_ESTRUCTURADAS(8,"Notas estructuradas");
	
	Integer valor;
	String desc;
	
	MercadoEnum(Integer valor,String desc){
		this.valor = valor;
		this.desc = desc;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
