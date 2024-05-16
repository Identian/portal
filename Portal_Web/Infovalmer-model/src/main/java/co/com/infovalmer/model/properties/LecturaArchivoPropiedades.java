package co.com.infovalmer.model.properties;

import java.io.FileInputStream;
import java.util.Properties;

import co.com.infovalmer.utilidades.LOGS;

public class LecturaArchivoPropiedades {

	private Properties archivoConfiguracion;

	public void cargarProperties() {
		this.archivoConfiguracion = new Properties();
		try {
			this.archivoConfiguracion.load(new FileInputStream(System.getProperty("propertyInfovalmer")));
		} catch (Exception e) {
			LOGS.LOG_ERRORES.error("ERROR AL CONSULTAR EL ARCHIVO GENERAL DE PROPERTIES DE INFOVALMER: " + e);
		}

	}

	public String consultaMaximoResultados() {
		String maximoResultados = null;
		String propiedad = this.lecturaPropiedades("MAXIMO_RESULT_AUTOCOMPLETE");
		if (propiedad != null)
			maximoResultados = propiedad;
		return maximoResultados;
	}
	
	public String lecturaPropiedades(String idPropiedad){
		String descripcionPropiedad = null;
		try{
			this.cargarProperties();
			descripcionPropiedad = this.archivoConfiguracion.getProperty(idPropiedad);
		}catch(Exception e){
			LOGS.LOG_ERRORES.error("ERROR AL CONSULTAR LA PROPIEDAD : " +idPropiedad+ ", DESCRIPCION ERROR: " + e);
		}
		return descripcionPropiedad;
	}
}
