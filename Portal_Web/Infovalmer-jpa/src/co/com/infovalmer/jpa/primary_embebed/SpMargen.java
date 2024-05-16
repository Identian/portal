package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the sp_margen database table.
 * 
 */
@Entity
@Table(name = "sp_margen")
@NamedQuery(name = "SpMargen.findAll", query = "SELECT s FROM SpMargen s")
public class SpMargen implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private SpMargenPK id;
	
	@Column(name = "c_tipomargen")
	private String cTipomargen;

	@Column(name = "c_vigente")
	private String cVigente;

	@Temporal(TemporalType.DATE)
	@Column(name = "d_fecha")
	private Date dFecha;

	@Temporal(TemporalType.DATE)
	@Column(name = "d_fechafin")
	private Date dFechafin;

	@Temporal(TemporalType.DATE)
	@Column(name = "d_fechainicio")
	private Date dFechainicio;

	@Column(name = "e_cotacalificamax")
	private BigDecimal eCotacalificamax;

	@Column(name = "e_cotaminima")
	private BigDecimal eCotaminima;

	@Column(name = "e_margen")
	private BigDecimal eMargen;

	@Column(name = "e_margenanterior")
	private BigDecimal eMargenanterior;

	@Column(name = "e_variacion")
	private BigDecimal eVariacion;

	public SpMargen() {
	}

	public String getCTipomargen() {
		return this.cTipomargen;
	}

	public void setCTipomargen(String cTipomargen) {
		this.cTipomargen = cTipomargen;
	}

	public String getCVigente() {
		return this.cVigente;
	}

	public void setCVigente(String cVigente) {
		this.cVigente = cVigente;
	}

	public Date getDFecha() {
		return this.dFecha;
	}

	public void setDFecha(Date dFecha) {
		this.dFecha = dFecha;
	}

	public Date getDFechafin() {
		return this.dFechafin;
	}

	public void setDFechafin(Date dFechafin) {
		this.dFechafin = dFechafin;
	}

	public Date getDFechainicio() {
		return this.dFechainicio;
	}

	public void setDFechainicio(Date dFechainicio) {
		this.dFechainicio = dFechainicio;
	}

	public BigDecimal getECotacalificamax() {
		return this.eCotacalificamax;
	}

	public void setECotacalificamax(BigDecimal eCotacalificamax) {
		this.eCotacalificamax = eCotacalificamax;
	}

	public BigDecimal getECotaminima() {
		return this.eCotaminima;
	}

	public void setECotaminima(BigDecimal eCotaminima) {
		this.eCotaminima = eCotaminima;
	}

	public BigDecimal getEMargen() {
		return this.eMargen;
	}

	public void setEMargen(BigDecimal eMargen) {
		this.eMargen = eMargen;
	}

	public BigDecimal getEMargenanterior() {
		return this.eMargenanterior;
	}

	public void setEMargenanterior(BigDecimal eMargenanterior) {
		this.eMargenanterior = eMargenanterior;
	}

	public BigDecimal getEVariacion() {
		return this.eVariacion;
	}

	public void setEVariacion(BigDecimal eVariacion) {
		this.eVariacion = eVariacion;
	}

	public SpMargenPK getId() {
		return id;
	}

	public void setId(SpMargenPK id) {
		this.id = id;
	}
	
	

}