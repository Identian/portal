package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the sp_fecvencientocr database table.
 * 
 */
@Entity
@Table(name = "sp_fecvencientocr")
@NamedQuery(name = "SpFecvencientocr.findAll", query = "SELECT s FROM SpFecvencientocr s")
public class SpFecvencientocr implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpFecvencientocrPK id;

	@Temporal(TemporalType.DATE)
	@Column(name = "d_fechavcto")
	private Date dFechavcto;

	@Column(name = "e_promcantidad")
	private BigDecimal ePromcantidad;

	@Column(name = "e_promrentab")
	private BigDecimal ePromrentab;

	@Column(name = "e_sumacantidad")
	private BigDecimal eSumacantidad;

	@Column(name = "e_sumarenxcan")
	private BigDecimal eSumarenxcan;

	@Column(name = "e_tanualizado")
	private BigDecimal eTanualizado;

	@Column(name = "e_tasaestimada")
	private BigDecimal eTasaestimada;

	@Column(name = "i_nrooperac")
	private int iNrooperac;

	public SpFecvencientocr() {
	}

	public Date getDFechavcto() {
		return this.dFechavcto;
	}

	public void setDFechavcto(Date dFechavcto) {
		this.dFechavcto = dFechavcto;
	}

	public BigDecimal getEPromcantidad() {
		return this.ePromcantidad;
	}

	public void setEPromcantidad(BigDecimal ePromcantidad) {
		this.ePromcantidad = ePromcantidad;
	}

	public BigDecimal getEPromrentab() {
		return this.ePromrentab;
	}

	public void setEPromrentab(BigDecimal ePromrentab) {
		this.ePromrentab = ePromrentab;
	}

	public BigDecimal getESumacantidad() {
		return this.eSumacantidad;
	}

	public void setESumacantidad(BigDecimal eSumacantidad) {
		this.eSumacantidad = eSumacantidad;
	}

	public BigDecimal getESumarenxcan() {
		return this.eSumarenxcan;
	}

	public void setESumarenxcan(BigDecimal eSumarenxcan) {
		this.eSumarenxcan = eSumarenxcan;
	}

	public BigDecimal getETanualizado() {
		return this.eTanualizado;
	}

	public void setETanualizado(BigDecimal eTanualizado) {
		this.eTanualizado = eTanualizado;
	}

	public BigDecimal getETasaestimada() {
		return this.eTasaestimada;
	}

	public void setETasaestimada(BigDecimal eTasaestimada) {
		this.eTasaestimada = eTasaestimada;
	}

	public int getINrooperac() {
		return this.iNrooperac;
	}

	public void setINrooperac(int iNrooperac) {
		this.iNrooperac = iNrooperac;
	}

	public SpFecvencientocrPK getId() {
		return id;
	}

	public void setId(SpFecvencientocrPK id) {
		this.id = id;
	}

}