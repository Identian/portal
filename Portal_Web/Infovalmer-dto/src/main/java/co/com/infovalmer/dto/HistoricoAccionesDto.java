package co.com.infovalmer.dto;

import java.io.Serializable;

public class HistoricoAccionesDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private VaPrecioValoracionDto vaPrecioValoracionDto;

	private VaIndicadores vaIndicadores;

	private String ultimaMarcacion;
	private String sector;

	public VaPrecioValoracionDto getVaPrecioValoracionDto() {
		return vaPrecioValoracionDto;
	}

	public void setVaPrecioValoracionDto(
			VaPrecioValoracionDto vaPrecioValoracionDto) {
		this.vaPrecioValoracionDto = vaPrecioValoracionDto;
	}

	public VaIndicadores getVaIndicadores() {
		return vaIndicadores;
	}

	public void setVaIndicadores(VaIndicadores vaIndicadores) {
		this.vaIndicadores = vaIndicadores;
	}

	public String getUltimaMarcacion() {
		return ultimaMarcacion;
	}

	public void setUltimaMarcacion(String ultimaMarcacion) {
		this.ultimaMarcacion = ultimaMarcacion;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	@Override
	public String toString() {
		return "HistoricoAccionesDto [vaPrecioValoracionDto="
				+ vaPrecioValoracionDto + ", vaIndicadores=" + vaIndicadores
				+ ", ultimaMarcacion=" + ultimaMarcacion + ", sector=" + sector
				+ ", getVaPrecioValoracionDto()=" + getVaPrecioValoracionDto()
				+ ", getVaIndicadores()=" + getVaIndicadores()
				+ ", getUltimaMarcacion()=" + getUltimaMarcacion()
				+ ", getSector()=" + getSector() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
