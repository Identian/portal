package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the va_operacionexc database table.
 * 
 */
@Entity
@Table(name="va_operacionexc")
@NamedQuery(name="VaOperacionexc.findAll", query="SELECT v FROM VaOperacionexc v")
public class VaOperacionexc implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VaOperacionexcPK id;

	@Column(name="c_codcorrcompra")
	private String cCodcorrcompra;

	@Column(name="c_codcorrventa")
	private String cCodcorrventa;

	@Column(name="c_doccorrcompra")
	private String cDoccorrcompra;

	@Column(name="c_doccorrventa")
	private String cDoccorrventa;

	@Column(name="c_estado")
	private String cEstado;

	@Column(name="c_excluida")
	private String cExcluida;

	@Column(name="c_exdividendo")
	private String cExdividendo;

	@Column(name="c_marcacion")
	private String cMarcacion;

	@Column(name="c_mercado")
	private String cMercado;

	@Column(name="c_modliquida")
	private String cModliquida;

	@Column(name="c_origencompra")
	private String cOrigencompra;

	@Column(name="c_origenventa")
	private String cOrigenventa;

	@Column(name="c_plazoliquida")
	private String cPlazoliquida;

	@Column(name="c_promliqcompra")
	private String cPromliqcompra;

	@Column(name="c_promliqventa")
	private String cPromliqventa;

	@Column(name="c_tipo")
	private String cTipo;

	@Column(name="c_tipoliquida")
	private String cTipoliquida;

	@Column(name="c_tipooferta")
	private String cTipooferta;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaliquida")
	private Date dFechaliquida;

	@Column(name="dt_fechahora")
	private String dtFechahora;

	@Column(name="e_cantidad")
	private BigDecimal eCantidad;

	@Column(name="e_monto")
	private BigDecimal eMonto;

	@Column(name="e_precio")
	private BigDecimal ePrecio;

	@Column(name="i_metodovaloracion")
	private int iMetodovaloracion;

	public VaOperacionexc() {
	}

	public VaOperacionexcPK getId() {
		return this.id;
	}

	public void setId(VaOperacionexcPK id) {
		this.id = id;
	}

	public String getCCodcorrcompra() {
		return this.cCodcorrcompra;
	}

	public void setCCodcorrcompra(String cCodcorrcompra) {
		this.cCodcorrcompra = cCodcorrcompra;
	}

	public String getCCodcorrventa() {
		return this.cCodcorrventa;
	}

	public void setCCodcorrventa(String cCodcorrventa) {
		this.cCodcorrventa = cCodcorrventa;
	}

	public String getCDoccorrcompra() {
		return this.cDoccorrcompra;
	}

	public void setCDoccorrcompra(String cDoccorrcompra) {
		this.cDoccorrcompra = cDoccorrcompra;
	}

	public String getCDoccorrventa() {
		return this.cDoccorrventa;
	}

	public void setCDoccorrventa(String cDoccorrventa) {
		this.cDoccorrventa = cDoccorrventa;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getCExcluida() {
		return this.cExcluida;
	}

	public void setCExcluida(String cExcluida) {
		this.cExcluida = cExcluida;
	}

	public String getCExdividendo() {
		return this.cExdividendo;
	}

	public void setCExdividendo(String cExdividendo) {
		this.cExdividendo = cExdividendo;
	}

	public String getCMarcacion() {
		return this.cMarcacion;
	}

	public void setCMarcacion(String cMarcacion) {
		this.cMarcacion = cMarcacion;
	}

	public String getCMercado() {
		return this.cMercado;
	}

	public void setCMercado(String cMercado) {
		this.cMercado = cMercado;
	}

	public String getCModliquida() {
		return this.cModliquida;
	}

	public void setCModliquida(String cModliquida) {
		this.cModliquida = cModliquida;
	}

	public String getCOrigencompra() {
		return this.cOrigencompra;
	}

	public void setCOrigencompra(String cOrigencompra) {
		this.cOrigencompra = cOrigencompra;
	}

	public String getCOrigenventa() {
		return this.cOrigenventa;
	}

	public void setCOrigenventa(String cOrigenventa) {
		this.cOrigenventa = cOrigenventa;
	}

	public String getCPlazoliquida() {
		return this.cPlazoliquida;
	}

	public void setCPlazoliquida(String cPlazoliquida) {
		this.cPlazoliquida = cPlazoliquida;
	}

	public String getCPromliqcompra() {
		return this.cPromliqcompra;
	}

	public void setCPromliqcompra(String cPromliqcompra) {
		this.cPromliqcompra = cPromliqcompra;
	}

	public String getCPromliqventa() {
		return this.cPromliqventa;
	}

	public void setCPromliqventa(String cPromliqventa) {
		this.cPromliqventa = cPromliqventa;
	}

	public String getCTipo() {
		return this.cTipo;
	}

	public void setCTipo(String cTipo) {
		this.cTipo = cTipo;
	}

	public String getCTipoliquida() {
		return this.cTipoliquida;
	}

	public void setCTipoliquida(String cTipoliquida) {
		this.cTipoliquida = cTipoliquida;
	}

	public String getCTipooferta() {
		return this.cTipooferta;
	}

	public void setCTipooferta(String cTipooferta) {
		this.cTipooferta = cTipooferta;
	}

	public Date getDFechaliquida() {
		return this.dFechaliquida;
	}

	public void setDFechaliquida(Date dFechaliquida) {
		this.dFechaliquida = dFechaliquida;
	}

	public String getDtFechahora() {
		return this.dtFechahora;
	}

	public void setDtFechahora(String dtFechahora) {
		this.dtFechahora = dtFechahora;
	}

	public BigDecimal getECantidad() {
		return this.eCantidad;
	}

	public void setECantidad(BigDecimal eCantidad) {
		this.eCantidad = eCantidad;
	}

	public BigDecimal getEMonto() {
		return this.eMonto;
	}

	public void setEMonto(BigDecimal eMonto) {
		this.eMonto = eMonto;
	}

	public BigDecimal getEPrecio() {
		return this.ePrecio;
	}

	public void setEPrecio(BigDecimal ePrecio) {
		this.ePrecio = ePrecio;
	}

	public int getIMetodovaloracion() {
		return this.iMetodovaloracion;
	}

	public void setIMetodovaloracion(int iMetodovaloracion) {
		this.iMetodovaloracion = iMetodovaloracion;
	}

}