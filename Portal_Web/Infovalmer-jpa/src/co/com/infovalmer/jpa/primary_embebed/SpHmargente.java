package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the sp_hmargentes database table.
 * 
 */
@Entity
@Table(name = "sp_hmargentes")
@NamedQuery(name = "SpHmargente.findAll", query = "SELECT s FROM SpHmargente s")
public class SpHmargente implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpHmargentePK id;

	@Column(name = "c_tipomargen")
	private String cTipomargen;

	@Column(name = "c_tipomoneda")
	private String cTipomoneda;

	@Column(name = "c_tipotasa")
	private String cTipotasa;

	@Column(name = "c_vigente")
	private String cVigente;

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

	@Column(name = "e_margenanterior")
	private BigDecimal eMargenanterior;

	@Column(name = "e_valor")
	private BigDecimal eValor;

	@Column(name = "e_variacion")
	private BigDecimal eVariacion;

	public SpHmargente() {
	}

	public SpHmargentePK getId() {
		return id;
	}

	public void setId(SpHmargentePK id) {
		this.id = id;
	}

	public String getCTipomargen() {
		return this.cTipomargen;
	}

	public void setCTipomargen(String cTipomargen) {
		this.cTipomargen = cTipomargen;
	}

	public String getCTipomoneda() {
		return this.cTipomoneda;
	}

	public void setCTipomoneda(String cTipomoneda) {
		this.cTipomoneda = cTipomoneda;
	}

	public String getCTipotasa() {
		return this.cTipotasa;
	}

	public void setCTipotasa(String cTipotasa) {
		this.cTipotasa = cTipotasa;
	}

	public String getCVigente() {
		return this.cVigente;
	}

	public void setCVigente(String cVigente) {
		this.cVigente = cVigente;
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

	public BigDecimal getEMargenanterior() {
		return this.eMargenanterior;
	}

	public void setEMargenanterior(BigDecimal eMargenanterior) {
		this.eMargenanterior = eMargenanterior;
	}

	public BigDecimal getEValor() {
		return this.eValor;
	}

	public void setEValor(BigDecimal eValor) {
		this.eValor = eValor;
	}

	public BigDecimal getEVariacion() {
		return this.eVariacion;
	}

	public void setEVariacion(BigDecimal eVariacion) {
		this.eVariacion = eVariacion;
	}

}