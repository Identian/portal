package co.com.infovalmer.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class PreciosValoracionDto implements Serializable {

	private static final long serialVersionUID = 49773098846732301L;

	// Campos tablas ve_preciovaloracion y vd_preciosvaloracion
	private long iIdinstrumento;

	private java.util.Date dFechavaloracion;

	private String cNemosubyacente;

	private BigDecimal ePrecioDefinitivo;

	private BigDecimal ePreciocierre;

	private BigDecimal ePreciomercado;

	private BigDecimal ePreciomid;

	private BigDecimal ePreciosubyacente;

	private BigDecimal ePrecioteorico1;

	private BigDecimal ePrecioteorico2;

	private BigDecimal ePrecioteorico3;

	private BigDecimal eTasadividendos;

	private BigDecimal eTasausd;

	private BigDecimal eVariacion;

	private BigDecimal eZerocuponcontinua;

	// Campos tabla ve_preciosvaloracion unicamente
	private BigDecimal ePrecioanterior;

	private BigDecimal ePrecioapertura;

	private BigDecimal ePrecioencuesta;

	private String cNemocontrato;

	public PreciosValoracionDto() {
		super();
	}

	public long getiIdinstrumento() {
		return iIdinstrumento;
	}

	public void setiIdinstrumento(long iIdinstrumento) {
		this.iIdinstrumento = iIdinstrumento;
	}

	public java.util.Date getdFechavaloracion() {
		return dFechavaloracion;
	}

	public void setdFechavaloracion(java.util.Date dFechavaloracion) {
		this.dFechavaloracion = dFechavaloracion;
	}

	public String getcNemosubyacente() {
		return cNemosubyacente;
	}

	public void setcNemosubyacente(String cNemosubyacente) {
		this.cNemosubyacente = cNemosubyacente;
	}

	public BigDecimal getePrecioDefinitivo() {
		return ePrecioDefinitivo;
	}

	public void setePrecioDefinitivo(BigDecimal ePrecioDefinitivo) {
		this.ePrecioDefinitivo = ePrecioDefinitivo;
	}

	public BigDecimal getePreciocierre() {
		return ePreciocierre;
	}

	public void setePreciocierre(BigDecimal ePreciocierre) {
		this.ePreciocierre = ePreciocierre;
	}

	public BigDecimal getePreciomercado() {
		return ePreciomercado;
	}

	public void setePreciomercado(BigDecimal ePreciomercado) {
		this.ePreciomercado = ePreciomercado;
	}

	public BigDecimal getePreciomid() {
		return ePreciomid;
	}

	public void setePreciomid(BigDecimal ePreciomid) {
		this.ePreciomid = ePreciomid;
	}

	public BigDecimal getePreciosubyacente() {
		return ePreciosubyacente;
	}

	public void setePreciosubyacente(BigDecimal ePreciosubyacente) {
		this.ePreciosubyacente = ePreciosubyacente;
	}

	public BigDecimal getePrecioteorico1() {
		return ePrecioteorico1;
	}

	public void setePrecioteorico1(BigDecimal ePrecioteorico1) {
		this.ePrecioteorico1 = ePrecioteorico1;
	}

	public BigDecimal getePrecioteorico2() {
		return ePrecioteorico2;
	}

	public void setePrecioteorico2(BigDecimal ePrecioteorico2) {
		this.ePrecioteorico2 = ePrecioteorico2;
	}

	public BigDecimal getePrecioteorico3() {
		return ePrecioteorico3;
	}

	public void setePrecioteorico3(BigDecimal ePrecioteorico3) {
		this.ePrecioteorico3 = ePrecioteorico3;
	}

	public BigDecimal geteTasadividendos() {
		return eTasadividendos;
	}

	public void seteTasadividendos(BigDecimal eTasadividendos) {
		this.eTasadividendos = eTasadividendos;
	}

	public BigDecimal geteTasausd() {
		return eTasausd;
	}

	public void seteTasausd(BigDecimal eTasausd) {
		this.eTasausd = eTasausd;
	}

	public BigDecimal geteVariacion() {
		return eVariacion;
	}

	public void seteVariacion(BigDecimal eVariacion) {
		this.eVariacion = eVariacion;
	}

	public BigDecimal geteZerocuponcontinua() {
		return eZerocuponcontinua;
	}

	public void seteZerocuponcontinua(BigDecimal eZerocuponcontinua) {
		this.eZerocuponcontinua = eZerocuponcontinua;
	}

	public BigDecimal getePrecioanterior() {
		return ePrecioanterior;
	}

	public void setePrecioanterior(BigDecimal ePrecioanterior) {
		this.ePrecioanterior = ePrecioanterior;
	}

	public BigDecimal getePrecioapertura() {
		return ePrecioapertura;
	}

	public void setePrecioapertura(BigDecimal ePrecioapertura) {
		this.ePrecioapertura = ePrecioapertura;
	}

	public BigDecimal getePrecioencuesta() {
		return ePrecioencuesta;
	}

	public void setePrecioencuesta(BigDecimal ePrecioencuesta) {
		this.ePrecioencuesta = ePrecioencuesta;
	}

	public String getcNemocontrato() {
		return cNemocontrato;
	}

	public void setcNemocontrato(String cNemocontrato) {
		this.cNemocontrato = cNemocontrato;
	}

}
