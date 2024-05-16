package co.com.infovalmer.dto.enums;

public enum RutasFtpEnum {

	ARCHIVOS("rutaArchivos"),
	ARCHIVOS_PRODUCTOS_ESTRUCTURADOS("productos.estructurados.files.path"),
	ARCHIVOS_DERIVADOS("derivatives.files.path"),
	ARCHIVOS_DERIVADOS_FINANCIEROS("derivatives.financieros.valuation.files.path"),
	ARCHIVOS_DERIVADOS_ENERGETICOS("derivatives.energeticos.valuation.files.path"),
	ARCHIVOS_VALORACION_INTERNACIONAL_RF("renta.fija.files.path"),
	ARCHIVOS_VALORACION_RENTA_FIJA("renta.fija.valoracion.files.path"),
	ARCHIVOS_NEMOS_ISINES_LOCAL_RF("renta.fija.nemosisines.local"),
	ARCHIVOS_NEMOS_ISINES_INTERNACIONAL_RF("renta.fija.nemosisines.internacional"),
	ARCHIVOS_VALORACION_LOCAL_RV("variableincome.valuation.files.path"),
	ARCHIVOS_VALORACION_INTERNACIONAL_RV("variableincome.valuation.international.files.path"),
	ARCHIVOS_BD_ESPECIALIZADA("variableincome.specializedDB.files.path"),
	ARCHIVOS_CARGA_ARCHIVOS_CVA("load_file_cva_path"),
	ARCHIVOS_DERIVADOS_OTC("derivatives.otc.ftp.files.path"),
	ARCHIVOS_DOWNLOAD_CVA("download_file_cva_path"),
	ARCHIVOS_TITULOS_PARTICIPATIVO("variableincome.valuation.participativo.files.path");
	
	
	private String key;
	
	RutasFtpEnum(String key){
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	
}
