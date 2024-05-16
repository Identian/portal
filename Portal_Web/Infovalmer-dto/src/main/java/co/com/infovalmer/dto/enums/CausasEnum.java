package co.com.infovalmer.dto.enums;

public enum CausasEnum {
	Categoria("Categoria"),
	Diferencias_caracteristicas_faciales("Diferencias_características_faciales"),
	Ausencia_de_precio("Ausencia de precio"),
	Inconformidad_con_el_precio_de_un_Isin("Inconformidad con el precio de un Isin");
	
	private String nombre;
	
	CausasEnum(String nombre){
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
