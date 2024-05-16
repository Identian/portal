package co.com.infovalmer.jpa;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;

/**
 * The persistent class for the ve_preciosvaloracion database table.
 * 
 */
@Entity
@Table(name = "ve_preciosvaloracion")
@NamedQueries({
		@NamedQuery(name = "VePreciosvaloracion.findAll", query = "SELECT v FROM VePreciosvaloracion v"),
		@NamedQuery(name = "VePreciosvaloracion.findFilterDate", query = "SELECT v FROM VePreciosvaloracion v WHERE v.id.iIdinstrumento = ?1 and v.id.dFechavaloracion BETWEEN ?2 AND ?3") })
public class VePreciosvaloracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VePreciosvaloracionPK id;

	@Column(name = "c_nemosubyacente")
	private String cNemosubyacente;

	@Column(name = "e_precio_definitivo")
	private BigDecimal ePrecioDefinitivo;

	@Column(name = "e_precioanterior")
	private BigDecimal ePrecioanterior;

	@Column(name = "e_precioapertura")
	private BigDecimal ePrecioapertura;

	@Column(name = "e_preciocierre")
	private BigDecimal ePreciocierre;

	@Column(name = "e_precioencuesta")
	private BigDecimal ePrecioencuesta;

	@Column(name = "e_preciomercado")
	private BigDecimal ePreciomercado;

	@Column(name = "e_preciosubyacente")
	private BigDecimal ePreciosubyacente;

	@Column(name = "e_precioteorico1")
	private BigDecimal ePrecioteorico1;

	@Column(name = "e_precioteorico2")
	private BigDecimal ePrecioteorico2;

	@Column(name = "e_tasadividendos")
	private BigDecimal eTasadividendos;

	@Column(name = "e_tasausd")
	private BigDecimal eTasausd;

	@Column(name = "e_variacion")
	private BigDecimal eVariacion;

	@Column(name = "e_zerocuponcontinua")
	private BigDecimal eZerocuponcontinua;

	public VePreciosvaloracion() {
	}

	public VePreciosvaloracionPK getId() {
		return this.id;
	}

	public void setId(VePreciosvaloracionPK id) {
		this.id = id;
	}

	public String getCNemosubyacente() {
		return this.cNemosubyacente;
	}

	public void setCNemosubyacente(String cNemosubyacente) {
		this.cNemosubyacente = cNemosubyacente;
	}

	public BigDecimal getEPrecioDefinitivo() {
		return this.ePrecioDefinitivo;
	}

	public void setEPrecioDefinitivo(BigDecimal ePrecioDefinitivo) {
		this.ePrecioDefinitivo = ePrecioDefinitivo;
	}

	public BigDecimal getEPrecioanterior() {
		return this.ePrecioanterior;
	}

	public void setEPrecioanterior(BigDecimal ePrecioanterior) {
		this.ePrecioanterior = ePrecioanterior;
	}

	public BigDecimal getEPrecioapertura() {
		return this.ePrecioapertura;
	}

	public void setEPrecioapertura(BigDecimal ePrecioapertura) {
		this.ePrecioapertura = ePrecioapertura;
	}

	public BigDecimal getEPreciocierre() {
		return this.ePreciocierre;
	}

	public void setEPreciocierre(BigDecimal ePreciocierre) {
		this.ePreciocierre = ePreciocierre;
	}

	public BigDecimal getEPrecioencuesta() {
		return this.ePrecioencuesta;
	}

	public void setEPrecioencuesta(BigDecimal ePrecioencuesta) {
		this.ePrecioencuesta = ePrecioencuesta;
	}

	public BigDecimal getEPreciomercado() {
		return this.ePreciomercado;
	}

	public void setEPreciomercado(BigDecimal ePreciomercado) {
		this.ePreciomercado = ePreciomercado;
	}

	public BigDecimal getEPreciosubyacente() {
		return this.ePreciosubyacente;
	}

	public void setEPreciosubyacente(BigDecimal ePreciosubyacente) {
		this.ePreciosubyacente = ePreciosubyacente;
	}

	public BigDecimal getEPrecioteorico1() {
		return this.ePrecioteorico1;
	}

	public void setEPrecioteorico1(BigDecimal ePrecioteorico1) {
		this.ePrecioteorico1 = ePrecioteorico1;
	}

	public BigDecimal getEPrecioteorico2() {
		return this.ePrecioteorico2;
	}

	public void setEPrecioteorico2(BigDecimal ePrecioteorico2) {
		this.ePrecioteorico2 = ePrecioteorico2;
	}

	public BigDecimal getETasadividendos() {
		return this.eTasadividendos;
	}

	public void setETasadividendos(BigDecimal eTasadividendos) {
		this.eTasadividendos = eTasadividendos;
	}

	public BigDecimal getETasausd() {
		return this.eTasausd;
	}

	public void setETasausd(BigDecimal eTasausd) {
		this.eTasausd = eTasausd;
	}

	public BigDecimal getEVariacion() {
		return this.eVariacion;
	}

	public void setEVariacion(BigDecimal eVariacion) {
		this.eVariacion = eVariacion;
	}

	public BigDecimal getEZerocuponcontinua() {
		return this.eZerocuponcontinua;
	}

	public void setEZerocuponcontinua(BigDecimal eZerocuponcontinua) {
		this.eZerocuponcontinua = eZerocuponcontinua;
	}

}