package co.com.infovalmer.dto.enums;

public enum EstadosPortalEnum {
	 
	ACTIVE_STATUS("A");
	
	private String nombre;
	
	EstadosPortalEnum(String nombre){
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
