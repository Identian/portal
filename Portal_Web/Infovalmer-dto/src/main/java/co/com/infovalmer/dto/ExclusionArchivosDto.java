package co.com.infovalmer.dto;

import java.io.Serializable;

public class ExclusionArchivosDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String cNombreArchivo;

	private String cExtension;

	public String getcNombreArchivo() {
		return cNombreArchivo;
	}

	public void setcNombreArchivo(String cNombreArchivo) {
		this.cNombreArchivo = cNombreArchivo;
	}

	public String getcExtension() {
		return cExtension;
	}

	public void setcExtension(String cExtension) {
		this.cExtension = cExtension;
	}
	
	
}
