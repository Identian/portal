package co.com.infovalmer.dto;

import java.io.Serializable;

public class PropiedadesDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cPropiedad;

	private String cDescripcion;

	private String cModulo;

	private String cType;

	private String cValor;

	public String getcPropiedad() {
		return cPropiedad;
	}

	public void setcPropiedad(String cPropiedad) {
		this.cPropiedad = cPropiedad;
	}

	public String getcDescripcion() {
		return cDescripcion;
	}

	public void setcDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getcModulo() {
		return cModulo;
	}

	public void setcModulo(String cModulo) {
		this.cModulo = cModulo;
	}

	public String getcType() {
		return cType;
	}

	public void setcType(String cType) {
		this.cType = cType;
	}

	public String getcValor() {
		return cValor;
	}

	public void setcValor(String cValor) {
		this.cValor = cValor;
	}
}
