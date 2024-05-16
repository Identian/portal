package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the vd_volatilidad database table.
 * 
 */
@Entity
@Table(name="vd_volatilidad")
@NamedQuery(name="VdVolatilidad.findAll", query="SELECT v FROM VdVolatilidad v")
public class VdVolatilidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VdVolatilidadPK id;

	@Column(name="c_nemoatm")
	private String cNemoatm;

	@Column(name="c_nemosubyacente")
	private String cNemosubyacente;

	@Column(name="c_tipoopcion")
	private String cTipoopcion;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechavencimiento")
	private Date dFechavencimiento;

	@Column(name="e_deltacamara")
	private BigDecimal eDeltacamara;

	@Column(name="e_deltavolatilidad")
	private BigDecimal eDeltavolatilidad;

	@Column(name="e_strike")
	private BigDecimal eStrike;

	@Column(name="e_volatilidad")
	private BigDecimal eVolatilidad;

	@Column(name="i_clasecontrato")
	private int iClasecontrato;

	public VdVolatilidad() {
	}

	public VdVolatilidadPK getId() {
		return this.id;
	}

	public void setId(VdVolatilidadPK id) {
		this.id = id;
	}

	public String getCNemoatm() {
		return this.cNemoatm;
	}

	public void setCNemoatm(String cNemoatm) {
		this.cNemoatm = cNemoatm;
	}

	public String getCNemosubyacente() {
		return this.cNemosubyacente;
	}

	public void setCNemosubyacente(String cNemosubyacente) {
		this.cNemosubyacente = cNemosubyacente;
	}

	public String getCTipoopcion() {
		return this.cTipoopcion;
	}

	public void setCTipoopcion(String cTipoopcion) {
		this.cTipoopcion = cTipoopcion;
	}

	public Date getDFechavencimiento() {
		return this.dFechavencimiento;
	}

	public void setDFechavencimiento(Date dFechavencimiento) {
		this.dFechavencimiento = dFechavencimiento;
	}

	public BigDecimal getEDeltacamara() {
		return this.eDeltacamara;
	}

	public void setEDeltacamara(BigDecimal eDeltacamara) {
		this.eDeltacamara = eDeltacamara;
	}

	public BigDecimal getEDeltavolatilidad() {
		return this.eDeltavolatilidad;
	}

	public void setEDeltavolatilidad(BigDecimal eDeltavolatilidad) {
		this.eDeltavolatilidad = eDeltavolatilidad;
	}

	public BigDecimal getEStrike() {
		return this.eStrike;
	}

	public void setEStrike(BigDecimal eStrike) {
		this.eStrike = eStrike;
	}

	public BigDecimal getEVolatilidad() {
		return this.eVolatilidad;
	}

	public void setEVolatilidad(BigDecimal eVolatilidad) {
		this.eVolatilidad = eVolatilidad;
	}

	public int getIClasecontrato() {
		return this.iClasecontrato;
	}

	public void setIClasecontrato(int iClasecontrato) {
		this.iClasecontrato = iClasecontrato;
	}

}