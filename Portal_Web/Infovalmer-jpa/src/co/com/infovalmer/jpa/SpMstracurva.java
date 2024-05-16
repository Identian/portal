package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sp_mstracurva database table.
 * 
 */
@Entity
@Table(name="sp_mstracurva")
@NamedQuery(name="SpMstracurva.findAll", query="SELECT s FROM SpMstracurva s")
public class SpMstracurva implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpMstracurvaPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaventit")
	private Date dFechaventit;

	@Column(name="e_cantidad")
	private BigDecimal eCantidad;

	@Column(name="e_rentabilidad")
	private BigDecimal eRentabilidad;

	@Column(name="e_tasacupon")
	private BigDecimal eTasacupon;

	public SpMstracurva() {
	}

	public SpMstracurvaPK getId() {
		return this.id;
	}

	public void setId(SpMstracurvaPK id) {
		this.id = id;
	}

	public Date getDFechaventit() {
		return this.dFechaventit;
	}

	public void setDFechaventit(Date dFechaventit) {
		this.dFechaventit = dFechaventit;
	}

	public BigDecimal getECantidad() {
		return this.eCantidad;
	}

	public void setECantidad(BigDecimal eCantidad) {
		this.eCantidad = eCantidad;
	}

	public BigDecimal getERentabilidad() {
		return this.eRentabilidad;
	}

	public void setERentabilidad(BigDecimal eRentabilidad) {
		this.eRentabilidad = eRentabilidad;
	}

	public BigDecimal getETasacupon() {
		return this.eTasacupon;
	}

	public void setETasacupon(BigDecimal eTasacupon) {
		this.eTasacupon = eTasacupon;
	}

}