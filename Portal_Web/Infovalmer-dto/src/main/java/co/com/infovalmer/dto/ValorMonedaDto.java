package co.com.infovalmer.dto;

import java.io.Serializable;

import java.math.BigDecimal;

/**
 * The persistent class for the sp_valormoneda database table.
 * 
 */

public class ValorMonedaDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private String cTipomoneda;

	private java.util.Date dFecha;

	private BigDecimal eValormoneda;

	private BigDecimal eValorMonedaAnterior;

	private BigDecimal variacion;

	private String imagen;

	public ValorMonedaDto() {
		super();
	}

	public String getcTipomoneda() {
		return cTipomoneda;
	}

	public void setcTipomoneda(String cTipomoneda) {
		this.cTipomoneda = cTipomoneda;
	}

	public java.util.Date getdFecha() {
		return dFecha;
	}

	public void setdFecha(java.util.Date dFecha) {
		this.dFecha = dFecha;
	}

	public BigDecimal geteValormoneda() {
		return eValormoneda;
	}

	public void seteValormoneda(BigDecimal eValormoneda) {
		this.eValormoneda = eValormoneda;
	}

	public BigDecimal geteValorMonedaAnterior() {
		return eValorMonedaAnterior;
	}

	public void seteValorMonedaAnterior(BigDecimal eValorMonedaAnterior) {
		this.eValorMonedaAnterior = eValorMonedaAnterior;
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