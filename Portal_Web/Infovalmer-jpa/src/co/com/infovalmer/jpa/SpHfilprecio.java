package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sp_hfilprecio database table.
 * 
 */
@Entity
@Table(name="sp_hfilprecio")
@NamedQuery(name="SpHfilprecio.findAll", query="SELECT s FROM SpHfilprecio s")
public class SpHfilprecio implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpHfilprecioPK id;

	@Column(name="e_limitemax")
	private BigDecimal eLimitemax;

	@Column(name="e_limitemin")
	private BigDecimal eLimitemin;

	@Column(name="e_precioponderado")
	private BigDecimal ePrecioponderado;

	@Column(name="e_promedioerror")
	private BigDecimal ePromedioerror;

	@Column(name="e_sumaprecio")
	private BigDecimal eSumaprecio;

	@Column(name="e_sumprecioxcanti")
	private BigDecimal eSumprecioxcanti;

	@Column(name="i_codrangodf")
	private int iCodrangodf;

	@Column(name="i_nrooperaciones")
	private int iNrooperaciones;

	@Column(name="i_sumacantidad")
	private BigDecimal iSumacantidad;

	public SpHfilprecio() {
	}

	public SpHfilprecioPK getId() {
		return this.id;
	}

	public void setId(SpHfilprecioPK id) {
		this.id = id;
	}

	public BigDecimal getELimitemax() {
		return this.eLimitemax;
	}

	public void setELimitemax(BigDecimal eLimitemax) {
		this.eLimitemax = eLimitemax;
	}

	public BigDecimal getELimitemin() {
		return this.eLimitemin;
	}

	public void setELimitemin(BigDecimal eLimitemin) {
		this.eLimitemin = eLimitemin;
	}

	public BigDecimal getEPrecioponderado() {
		return this.ePrecioponderado;
	}

	public void setEPrecioponderado(BigDecimal ePrecioponderado) {
		this.ePrecioponderado = ePrecioponderado;
	}

	public BigDecimal getEPromedioerror() {
		return this.ePromedioerror;
	}

	public void setEPromedioerror(BigDecimal ePromedioerror) {
		this.ePromedioerror = ePromedioerror;
	}

	public BigDecimal getESumaprecio() {
		return this.eSumaprecio;
	}

	public void setESumaprecio(BigDecimal eSumaprecio) {
		this.eSumaprecio = eSumaprecio;
	}

	public BigDecimal getESumprecioxcanti() {
		return this.eSumprecioxcanti;
	}

	public void setESumprecioxcanti(BigDecimal eSumprecioxcanti) {
		this.eSumprecioxcanti = eSumprecioxcanti;
	}

	public int getICodrangodf() {
		return this.iCodrangodf;
	}

	public void setICodrangodf(int iCodrangodf) {
		this.iCodrangodf = iCodrangodf;
	}

	public int getINrooperaciones() {
		return this.iNrooperaciones;
	}

	public void setINrooperaciones(int iNrooperaciones) {
		this.iNrooperaciones = iNrooperaciones;
	}

	public BigDecimal getISumacantidad() {
		return this.iSumacantidad;
	}

	public void setISumacantidad(BigDecimal iSumacantidad) {
		this.iSumacantidad = iSumacantidad;
	}

}