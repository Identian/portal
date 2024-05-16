package co.com.infovalmer.dto;

import java.io.Serializable;

public class ParametriaArchivoDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long idParametria;
	private String nombreProducto;
	private String ruta;
	private String descripcion;
	private String prefijo;
	private TipoCurvaAgrupadorDto agrupador = new TipoCurvaAgrupadorDto();

	public ParametriaArchivoDto() {
		super();
	}

	public Long getIdParametria() {
		return idParametria;
	}

	public void setIdParametria(Long idParametria) {
		this.idParametria = idParametria;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}

	public TipoCurvaAgrupadorDto getAgrupador() {
		return agrupador;
	}

	public void setAgrupador(TipoCurvaAgrupadorDto agrupador) {
		this.agrupador = agrupador;
	}

	@Override
	public String toString() {
		return "ParametriaArchivoDto [idParametria=" + idParametria
				+ ", nombreProducto=" + nombreProducto + ", ruta=" + ruta
				+ ", descripcion=" + descripcion + ", prefijo=" + prefijo
				+ ", agrupador=" + agrupador + "]";
	}

}
