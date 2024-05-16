package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ve_preciocrcc database table.
 * 
 */
@Entity
@Table(name="ve_preciocrcc")
@NamedQuery(name="VePreciocrcc.findAll", query="SELECT v FROM VePreciocrcc v")
public class VePreciocrcc implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VePreciocrccPK id;

	@Column(name="c_tipotitulo")
	private String cTipotitulo;

	@Column(name="c_tipovalora")
	private String cTipovalora;

	@Column(name="e_margen")
	private BigDecimal eMargen;

	@Column(name="e_preciovaloracion")
	private BigDecimal ePreciovaloracion;

	@Column(name="e_tasadescuento")
	private BigDecimal eTasadescuento;

	@Column(name="e_tasaemision")
	private BigDecimal eTasaemision;

	@Column(name="e_tir")
	private BigDecimal eTir;

	public VePreciocrcc() {
	}

	public VePreciocrccPK getId() {
		return this.id;
	}

	public void setId(VePreciocrccPK id) {
		this.id = id;
	}

	public String getCTipotitulo() {
		return this.cTipotitulo;
	}

	public void setCTipotitulo(String cTipotitulo) {
		this.cTipotitulo = cTipotitulo;
	}

	public String getCTipovalora() {
		return this.cTipovalora;
	}

	public void setCTipovalora(String cTipovalora) {
		this.cTipovalora = cTipovalora;
	}

	public BigDecimal getEMargen() {
		return this.eMargen;
	}

	public void setEMargen(BigDecimal eMargen) {
		this.eMargen = eMargen;
	}

	public BigDecimal getEPreciovaloracion() {
		return this.ePreciovaloracion;
	}

	public void setEPreciovaloracion(BigDecimal ePreciovaloracion) {
		this.ePreciovaloracion = ePreciovaloracion;
	}

	public BigDecimal getETasadescuento() {
		return this.eTasadescuento;
	}

	public void setETasadescuento(BigDecimal eTasadescuento) {
		this.eTasadescuento = eTasadescuento;
	}

	public BigDecimal getETasaemision() {
		return this.eTasaemision;
	}

	public void setETasaemision(BigDecimal eTasaemision) {
		this.eTasaemision = eTasaemision;
	}

	public BigDecimal getETir() {
		return this.eTir;
	}

	public void setETir(BigDecimal eTir) {
		this.eTir = eTir;
	}

}