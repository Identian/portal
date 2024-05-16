package co.com.infovalmer.dto.enums;

public enum EtiquetasEnum {

	NOMBRE_ARCHIVO_CONSULTA_DERIVADOS("dr.query.derivatives.memo"),
	NOMBRE_ARCHIVO_HISTORICO_DERIVADOS("dr.valuation.memo"),
	NOMBRE_ARCHIVO_CALIFICACIONES("rf.consultas.ratings"),
	NOMBRE_COLUMNA_FECHA_CALIFICACION("rf.fecha.calificacion"),
	NOMBRE_COLUMNA_NEMOTECNICO("rf.nemotecnico"),
	NOMBRE_COLUMNA_CALIFICADORA("rf.gradername.tabla.header"),
	NOMBRE_COLUMNA_CALIFICACION("rf.calificacion"),
	NOMBRE_COLUMNA_EMISOR("rf.emisor"),
	NOMBRE_COLUMNA_PLAZO("rf.termtype.tabla.header"),
	
	NOMBRE_ARCHIVO_BETA("rf.Beta"),
	NOMBRE_COLUMNA_FECHA("rf.fecha.tabla.header"),
	NOMBRE_COLUMNA_CURVA_BETA("rf.curva"),
	NOMBRE_COLUMNA_BETA0("rf.beta0.tabla.header"),
	NOMBRE_COLUMNA_BETA1("rf.beta1.tabla.header"),
	NOMBRE_COLUMNA_BETA2("rf.beta2.tabla.header"),
	NOMBRE_COLUMNA_TAO_BETA("rf.tao.tabla.header"),
	
	NOMBRE_ARCHIVO_HISTORICO_INDICE("rf.indice"),
	NOMBRE_COLUMNA_VALOR("rf.valor.tabla.header"),
	
	NOMBRE_ARCHIVO_MONEDA("rf.moneda"),
	
	NOMBRE_ARCHIVO_PRECIOS("rf.precio"),
	NOMBRE_COLUMNA_FECHA_EMISION_PRECIO("rf.fechaemision.tabla.header"),
	NOMBRE_COLUMNA_FECHA_VENCIMI_PRECIO("rf.fechavencimiento.tabla.header"),
	NOMBRE_COLUMNA_CUPON_PRECIO("rf.cupon"),
	NOMBRE_COLUMNA_MODALIDAD_PRECIO("rf.periodModalidad"),
	NOMBRE_COLUMNA_PRECIO_SUCIO("rf.preciosucio.tabla.header"),
	NOMBRE_COLUMNA_TIPO_PRECIO("rf.tipoprecio"),
	NOMBRE_COLUMNA_PRECIO_LIMPIO("rf.preciolimpio.tabla.header"),
	NOMBRE_COLUMNA_MARGEN_PRECIO("rf.margenequivalente"),
	NOMBRE_COLUMNA_TIR_PRECIO("rf.tir"),
	NOMBRE_COLUMNA_ISIN_PRECIO("rf.isin"),
	
	NOMBRE_ARCHIVO_PUNTOS("rf.punto"),
	
	NOMBRE_ARCHIVO_TASAS("rf.tasas"),
	NOMBRE_COLUMNA_TASAS("rf.tasa"),
	
	NOMBRE_ARCHIVO_MARGEN_VALORACION("dr.query.rentafija.margenVal"),
	NOMBRE_ARCHIVO_NEMOTECNICOS("dr.query.rentafija.nemo"),
	NOMBRE_ARCHIVO_HISTORICO_NEMOS("rf.historic.info.memo"),
	
	NOMBRE_ZIP_DERIVADOS_FINANCIEROS("d.archivos.valoracion.financieros"),
	NOMBRE_ZIP_DERIVADOS_ENERGETICOS("d.archivos.valoracion.energeticos"),
	NOMBRE_ZIP_DERIVADOS_OTC("dr.archivos.valoracion.otc"),
	NOMBRE_ZIP_VALORACION_INTERNACIONAL("rf.archivos.valoracion.internacionales"),
	NOMBRE_ZIP_VALORACION("rv.archivos.valoracion"),
	NOMBRE_ZIP_VALORACION_PARTICIPATIVO("rv.archivos.valoracion.participativo"),
	NOMBRE_ZIP_VALORACION_RENTA_FIJA("rf.archivos.valoracion"),
	NOMBRE_ZIP_ARCHIVOS_CVA("pe.archivos.cva");
	
	private String valor;

	private EtiquetasEnum(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
