package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the po_volumen_titulo database table.
 * 
 */
@Entity
@Table(name="po_volumen_titulo")
@NamedQuery(name="PoVolumenTitulo.findAll", query="SELECT p FROM PoVolumenTitulo p")
public class PoVolumenTitulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PoVolumenTituloPK id;

	@Column(name="c_modalidad")
	private String cModalidad;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaemision")
	private Date dFechaemision;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechavencimiento")
	private Date dFechavencimiento;

	@Column(name="e_spread")
	private BigDecimal eSpread;

	@Column(name="e_volumen")
	private BigDecimal eVolumen;

	public PoVolumenTitulo() {
	}

	public PoVolumenTituloPK getId() {
		return this.id;
	}

	public void setId(PoVolumenTituloPK id) {
		this.id = id;
	}

	public String getCModalidad() {
		return this.cModalidad;
	}

	public void setCModalidad(String cModalidad) {
		this.cModalidad = cModalidad;
	}

	public Date getDFechaemision() {
		return this.dFechaemision;
	}

	public void setDFechaemision(Date dFechaemision) {
		this.dFechaemision = dFechaemision;
	}

	public Date getDFechavencimiento() {
		return this.dFechavencimiento;
	}

	public void setDFechavencimiento(Date dFechavencimiento) {
		this.dFechavencimiento = dFechavencimiento;
	}

	public BigDecimal getESpread() {
		return this.eSpread;
	}

	public void setESpread(BigDecimal eSpread) {
		this.eSpread = eSpread;
	}

	public BigDecimal getEVolumen() {
		return this.eVolumen;
	}

	public void setEVolumen(BigDecimal eVolumen) {
		this.eVolumen = eVolumen;
	}

}