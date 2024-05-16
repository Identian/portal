package co.com.infovalmer.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the sp_valortasa database table.
 * 
 */

public class ValorTasaDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private String cTipotasa;

	private java.util.Date dFecha;

	private BigDecimal eValortasa;

	private BigDecimal eValorTasaAnterior;

	private BigDecimal variacion;
	
	private String imagen;

	public ValorTasaDto() {
		super();
	}

	public String getcTipotasa() {
		return cTipotasa;
	}

	public void setcTipotasa(String cTipotasa) {
		this.cTipotasa = cTipotasa;
	}

	public java.util.Date getdFecha() {
		return dFecha;
	}

	public void setdFecha(java.util.Date dFecha) {
		this.dFecha = dFecha;
	}

	public BigDecimal geteValortasa() {
		return eValortasa;
	}

	public void seteValortasa(BigDecimal eValortasa) {
		this.eValortasa = eValortasa;
	}

	public BigDecimal geteValorTasaAnterior() {
		return eValorTasaAnterior;
	}

	public void seteValorTasaAnterior(BigDecimal eValorTasaAnterior) {
		this.eValorTasaAnterior = eValorTasaAnterior;
	}

	public BigDecimal getVariacion() {
		return variacion;
	}

	public void setVariacion(BigDecimal variacion) {
		this.variacion = variacion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	
}