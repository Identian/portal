package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sp_desarrollo database table.
 * 
 */
@Entity
@Table(name="sp_desarrollo")
@NamedQuery(name="SpDesarrollo.findAll", query="SELECT s FROM SpDesarrollo s")
public class SpDesarrollo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpDesarrolloPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechapago")
	private Date dFechapago;

	@Column(name="e_amortizacion")
	private BigDecimal eAmortizacion;

	@Column(name="e_flujototal")
	private BigDecimal eFlujototal;

	@Column(name="e_interes")
	private BigDecimal eInteres;

	@Column(name="e_saldoamortizar")
	private BigDecimal eSaldoamortizar;

	public SpDesarrollo() {
	}

	public SpDesarrolloPK getId() {
		return this.id;
	}

	public void setId(SpDesarrolloPK id) {
		this.id = id;
	}

	public Date getDFechapago() {
		return this.dFechapago;
	}

	public void setDFechapago(Date dFechapago) {
		this.dFechapago = dFechapago;
	}

	public BigDecimal getEAmortizacion() {
		return this.eAmortizacion;
	}

	public void setEAmortizacion(BigDecimal eAmortizacion) {
		this.eAmortizacion = eAmortizacion;
	}

	public BigDecimal getEFlujototal() {
		return this.eFlujototal;
	}

	public void setEFlujototal(BigDecimal eFlujototal) {
		this.eFlujototal = eFlujototal;
	}

	public BigDecimal getEInteres() {
		return this.eInteres;
	}

	public void setEInteres(BigDecimal eInteres) {
		this.eInteres = eInteres;
	}

	public BigDecimal getESaldoamortizar() {
		return this.eSaldoamortizar;
	}

	public void setESaldoamortizar(BigDecimal eSaldoamortizar) {
		this.eSaldoamortizar = eSaldoamortizar;
	}

}