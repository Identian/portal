package co.com.infovalmer.dto;

import java.io.Serializable;

public class TipoCurvaAgrupadorDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer iAgrupador;
	private String cNombre;
	private String cEtiqueta;
	private String cDirectorio;

	public TipoCurvaAgrupadorDto() {
	}

	public Integer getIAgrupador() {
		return this.iAgrupador;
	}

	public void setIAgrupador(Integer iAgrupador) {
		this.iAgrupador = iAgrupador;
	}

	public String getCDirectorio() {
		return this.cDirectorio;
	}

	public void setCDirectorio(String cDirectorio) {
		this.cDirectorio = cDirectorio;
	}

	public String getCEtiqueta() {
		return this.cEtiqueta;
	}

	public void setCEtiqueta(String cEtiqueta) {
		this.cEtiqueta = cEtiqueta;
	}

	public String getcNombre() {
		return cNombre;
	}

	public void setcNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	@Override
	public String toString() {
		return "TipoCurvaAgrupadorDto [iAgrupador=" + iAgrupador + ", cNombre="
				+ cNombre + ", cEtiqueta=" + cEtiqueta + ", cDirectorio="
				+ cDirectorio + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cDirectorio == null) ? 0 : cDirectorio.hashCode());
		result = prime * result
				+ ((cEtiqueta == null) ? 0 : cEtiqueta.hashCode());
		result = prime * result + ((cNombre == null) ? 0 : cNombre.hashCode());
		result = prime * result
				+ ((iAgrupador == null) ? 0 : iAgrupador.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoCurvaAgrupadorDto other = (TipoCurvaAgrupadorDto) obj;
		if (cDirectorio == null) {
			if (other.cDirectorio != null)
				return false;
		} else if (!cDirectorio.equals(other.cDirectorio))
			return false;
		if (cEtiqueta == null) {
			if (other.cEtiqueta != null)
				return false;
		} else if (!cEtiqueta.equals(other.cEtiqueta))
			return false;
		if (cNombre == null) {
			if (other.cNombre != null)
				return false;
		} else if (!cNombre.equals(other.cNombre))
			return false;
		if (iAgrupador == null) {
			if (other.iAgrupador != null)
				return false;
		} else if (!iAgrupador.equals(other.iAgrupador))
			return false;
		return true;
	}

}