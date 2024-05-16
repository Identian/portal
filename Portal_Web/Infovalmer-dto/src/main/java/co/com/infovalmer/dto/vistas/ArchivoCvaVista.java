package co.com.infovalmer.dto.vistas;

import java.io.Serializable;

public class ArchivoCvaVista implements Serializable {

	private static final long serialVersionUID = 1L;
	private String archivosCargados;
	private String archivosNoCargados;

	public String getArchivosCargados() {
		return archivosCargados;
	}

	public void setArchivosCargados(String archivosCargados) {
		this.archivosCargados = archivosCargados;
	}

	public String getArchivosNoCargados() {
		return archivosNoCargados;
	}

	public void setArchivosNoCargados(String archivosNoCargados) {
		this.archivosNoCargados = archivosNoCargados;
	}

}
