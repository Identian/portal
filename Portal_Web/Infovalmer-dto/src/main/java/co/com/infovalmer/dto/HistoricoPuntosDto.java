package co.com.infovalmer.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class HistoricoPuntosDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private int iPlazodias;
	private double rentabilidadInicial;
	private double rentabilidadMaxima;
	private double rentabilidadMinima;
	private double rentabilidadFinal;

	public HistoricoPuntosDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HistoricoPuntosDto(int iPlazodias, double rentabilidadInicial,
			double rentabilidadMaxima, double rentabilidadMinima,
			double rentabilidadFinal) {
		super();
		this.iPlazodias = iPlazodias;
		this.rentabilidadInicial = rentabilidadInicial;
		this.rentabilidadMaxima = rentabilidadMaxima;
		this.rentabilidadMinima = rentabilidadMinima;
		this.rentabilidadFinal = rentabilidadFinal;
	}

	public double getRentabilidadInicial() {
		return rentabilidadInicial;
	}

	public void setRentabilidadInicial(double rentabilidadInicial) {
		this.rentabilidadInicial = rentabilidadInicial;
	}

	public double getRentabilidadFinal() {
		return rentabilidadFinal;
	}

	public void setRentabilidadFinal(double rentabilidadFinal) {
		this.rentabilidadFinal = rentabilidadFinal;
	}

	public int getiPlazodias() {
		return iPlazodias;
	}

	public void setiPlazodias(int iPlazodias) {
		this.iPlazodias = iPlazodias;
	}

	public double getRentabilidadMaxima() {
		return rentabilidadMaxima;
	}

	public void setRentabilidadMaxima(double rentabilidadMaxima) {
		this.rentabilidadMaxima = rentabilidadMaxima;
	}

	public double getRentabilidadMinima() {
		return rentabilidadMinima;
	}

	public void setRentabilidadMinima(double rentabilidadMinima) {
		this.rentabilidadMinima = rentabilidadMinima;
	}

	@Override
	public String toString() {
		return "HistoricoPuntosDto [iPlazodias=" + iPlazodias
				+ ", rentabilidadInicial=" + rentabilidadInicial
				+ ", rentabilidadMaxima=" + rentabilidadMaxima
				+ ", rentabilidadMinima=" + rentabilidadMinima
				+ ", rentabilidadFinal=" + rentabilidadFinal + "]";
	}

}
