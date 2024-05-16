package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sp_muestracr database table.
 * 
 */
@Entity
@Table(name="sp_muestracr")
@NamedQuery(name="SpMuestracr.findAll", query="SELECT s FROM SpMuestracr s")
public class SpMuestracr implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private SpMuestracrPK id;
	
	@Column(name="c_inclusion1")
	private String cInclusion1;

	@Column(name="c_inclusion2")
	private String cInclusion2;

	@Column(name="c_inclusion3")
	private String cInclusion3;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechavcto")
	private Date dFechavcto;

	@Column(name="e_cantidad")
	private BigDecimal eCantidad;

	@Column(name="e_errorrent1")
	private BigDecimal eErrorrent1;

	@Column(name="e_errorrent2")
	private BigDecimal eErrorrent2;

	@Column(name="e_rentabilidad")
	private BigDecimal eRentabilidad;

	@Column(name="e_tanualizado")
	private BigDecimal eTanualizado;

	@Column(name="e_tasaestimada1")
	private BigDecimal eTasaestimada1;

	@Column(name="e_tasaestimada2")
	private BigDecimal eTasaestimada2;

	@Column(name="i_diasvencimiento")
	private int iDiasvencimiento;

	
	public SpMuestracr() {
	}

	public String getCInclusion1() {
		return this.cInclusion1;
	}

	public void setCInclusion1(String cInclusion1) {
		this.cInclusion1 = cInclusion1;
	}

	public String getCInclusion2() {
		return this.cInclusion2;
	}

	public void setCInclusion2(String cInclusion2) {
		this.cInclusion2 = cInclusion2;
	}

	public String getCInclusion3() {
		return this.cInclusion3;
	}

	public void setCInclusion3(String cInclusion3) {
		this.cInclusion3 = cInclusion3;
	}

	public Date getDFechavcto() {
		return this.dFechavcto;
	}

	public void setDFechavcto(Date dFechavcto) {
		this.dFechavcto = dFechavcto;
	}

	public BigDecimal getECantidad() {
		return this.eCantidad;
	}

	public void setECantidad(BigDecimal eCantidad) {
		this.eCantidad = eCantidad;
	}

	public BigDecimal getEErrorrent1() {
		return this.eErrorrent1;
	}

	public void setEErrorrent1(BigDecimal eErrorrent1) {
		this.eErrorrent1 = eErrorrent1;
	}

	public BigDecimal getEErrorrent2() {
		return this.eErrorrent2;
	}

	public void setEErrorrent2(BigDecimal eErrorrent2) {
		this.eErrorrent2 = eErrorrent2;
	}

	public BigDecimal getERentabilidad() {
		return this.eRentabilidad;
	}

	public void setERentabilidad(BigDecimal eRentabilidad) {
		this.eRentabilidad = eRentabilidad;
	}

	public BigDecimal getETanualizado() {
		return this.eTanualizado;
	}

	public void setETanualizado(BigDecimal eTanualizado) {
		this.eTanualizado = eTanualizado;
	}

	public BigDecimal getETasaestimada1() {
		return this.eTasaestimada1;
	}

	public void setETasaestimada1(BigDecimal eTasaestimada1) {
		this.eTasaestimada1 = eTasaestimada1;
	}

	public BigDecimal getETasaestimada2() {
		return this.eTasaestimada2;
	}

	public void setETasaestimada2(BigDecimal eTasaestimada2) {
		this.eTasaestimada2 = eTasaestimada2;
	}

	public int getIDiasvencimiento() {
		return this.iDiasvencimiento;
	}

	public void setIDiasvencimiento(int iDiasvencimiento) {
		this.iDiasvencimiento = iDiasvencimiento;
	}

}