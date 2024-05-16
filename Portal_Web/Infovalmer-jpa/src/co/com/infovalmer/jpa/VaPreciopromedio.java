package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the va_preciopromedio database table.
 * 
 */
@Entity
@Table(name="va_preciopromedio")
@NamedQuery(name="VaPreciopromedio.findAll", query="SELECT v FROM VaPreciopromedio v")
public class VaPreciopromedio implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VaPreciopromedioPK id;

	@Column(name="c_fijaprecio")
	private String cFijaprecio;

	@Column(name="c_promliqcompra")
	private String cPromliqcompra;

	@Column(name="c_promliqventa")
	private String cPromliqventa;

	@Column(name="c_tendencia")
	private String cTendencia;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechapreciooficial")
	private Date dFechapreciooficial;

	@Temporal(TemporalType.DATE)
	@Column(name="d_ultmocfecha")
	private Date dUltmocfecha;

	@Temporal(TemporalType.DATE)
	@Column(name="d_ultmovfecha")
	private Date dUltmovfecha;

	@Temporal(TemporalType.DATE)
	@Column(name="d_ulttxfecha")
	private Date dUlttxfecha;

	@Column(name="e_cantidadant")
	private BigDecimal eCantidadant;

	@Column(name="e_monto")
	private BigDecimal eMonto;

	@Column(name="e_montoant")
	private BigDecimal eMontoant;

	@Column(name="e_preciocierre")
	private BigDecimal ePreciocierre;

	@Column(name="e_preciocierreant")
	private BigDecimal ePreciocierreant;

	@Column(name="e_preciomayor")
	private BigDecimal ePreciomayor;

	@Column(name="e_preciomayorant")
	private BigDecimal ePreciomayorant;

	@Column(name="e_preciomedio")
	private BigDecimal ePreciomedio;

	@Column(name="e_preciomedioant")
	private BigDecimal ePreciomedioant;

	@Column(name="e_preciomenor")
	private BigDecimal ePreciomenor;

	@Column(name="e_preciomenorant")
	private BigDecimal ePreciomenorant;

	@Column(name="e_preciopromultdia")
	private BigDecimal ePreciopromultdia;

	@Column(name="e_ultmocprecio")
	private BigDecimal eUltmocprecio;

	@Column(name="e_ultmovprecio")
	private BigDecimal eUltmovprecio;

	@Column(name="e_ultpreciooficial")
	private BigDecimal eUltpreciooficial;

	@Column(name="e_ulttxprecio")
	private BigDecimal eUlttxprecio;

	@Column(name="i_cantidad")
	private BigDecimal iCantidad;

	@Column(name="i_canttxultdia")
	private BigDecimal iCanttxultdia;

	@Column(name="i_ultmoccant")
	private BigDecimal iUltmoccant;

	@Column(name="i_ultmovcantidad")
	private BigDecimal iUltmovcantidad;

	@Column(name="i_ulttxcantidad")
	private BigDecimal iUlttxcantidad;

	public VaPreciopromedio() {
	}

	public VaPreciopromedioPK getId() {
		return this.id;
	}

	public void setId(VaPreciopromedioPK id) {
		this.id = id;
	}

	public String getCFijaprecio() {
		return this.cFijaprecio;
	}

	public void setCFijaprecio(String cFijaprecio) {
		this.cFijaprecio = cFijaprecio;
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

	public String getCTendencia() {
		return this.cTendencia;
	}

	public void setCTendencia(String cTendencia) {
		this.cTendencia = cTendencia;
	}

	public Date getDFechapreciooficial() {
		return this.dFechapreciooficial;
	}

	public void setDFechapreciooficial(Date dFechapreciooficial) {
		this.dFechapreciooficial = dFechapreciooficial;
	}

	public Date getDUltmocfecha() {
		return this.dUltmocfecha;
	}

	public void setDUltmocfecha(Date dUltmocfecha) {
		this.dUltmocfecha = dUltmocfecha;
	}

	public Date getDUltmovfecha() {
		return this.dUltmovfecha;
	}

	public void setDUltmovfecha(Date dUltmovfecha) {
		this.dUltmovfecha = dUltmovfecha;
	}

	public Date getDUlttxfecha() {
		return this.dUlttxfecha;
	}

	public void setDUlttxfecha(Date dUlttxfecha) {
		this.dUlttxfecha = dUlttxfecha;
	}

	public BigDecimal getECantidadant() {
		return this.eCantidadant;
	}

	public void setECantidadant(BigDecimal eCantidadant) {
		this.eCantidadant = eCantidadant;
	}

	public BigDecimal getEMonto() {
		return this.eMonto;
	}

	public void setEMonto(BigDecimal eMonto) {
		this.eMonto = eMonto;
	}

	public BigDecimal getEMontoant() {
		return this.eMontoant;
	}

	public void setEMontoant(BigDecimal eMontoant) {
		this.eMontoant = eMontoant;
	}

	public BigDecimal getEPreciocierre() {
		return this.ePreciocierre;
	}

	public void setEPreciocierre(BigDecimal ePreciocierre) {
		this.ePreciocierre = ePreciocierre;
	}

	public BigDecimal getEPreciocierreant() {
		return this.ePreciocierreant;
	}

	public void setEPreciocierreant(BigDecimal ePreciocierreant) {
		this.ePreciocierreant = ePreciocierreant;
	}

	public BigDecimal getEPreciomayor() {
		return this.ePreciomayor;
	}

	public void setEPreciomayor(BigDecimal ePreciomayor) {
		this.ePreciomayor = ePreciomayor;
	}

	public BigDecimal getEPreciomayorant() {
		return this.ePreciomayorant;
	}

	public void setEPreciomayorant(BigDecimal ePreciomayorant) {
		this.ePreciomayorant = ePreciomayorant;
	}

	public BigDecimal getEPreciomedio() {
		return this.ePreciomedio;
	}

	public void setEPreciomedio(BigDecimal ePreciomedio) {
		this.ePreciomedio = ePreciomedio;
	}

	public BigDecimal getEPreciomedioant() {
		return this.ePreciomedioant;
	}

	public void setEPreciomedioant(BigDecimal ePreciomedioant) {
		this.ePreciomedioant = ePreciomedioant;
	}

	public BigDecimal getEPreciomenor() {
		return this.ePreciomenor;
	}

	public void setEPreciomenor(BigDecimal ePreciomenor) {
		this.ePreciomenor = ePreciomenor;
	}

	public BigDecimal getEPreciomenorant() {
		return this.ePreciomenorant;
	}

	public void setEPreciomenorant(BigDecimal ePreciomenorant) {
		this.ePreciomenorant = ePreciomenorant;
	}

	public BigDecimal getEPreciopromultdia() {
		return this.ePreciopromultdia;
	}

	public void setEPreciopromultdia(BigDecimal ePreciopromultdia) {
		this.ePreciopromultdia = ePreciopromultdia;
	}

	public BigDecimal getEUltmocprecio() {
		return this.eUltmocprecio;
	}

	public void setEUltmocprecio(BigDecimal eUltmocprecio) {
		this.eUltmocprecio = eUltmocprecio;
	}

	public BigDecimal getEUltmovprecio() {
		return this.eUltmovprecio;
	}

	public void setEUltmovprecio(BigDecimal eUltmovprecio) {
		this.eUltmovprecio = eUltmovprecio;
	}

	public BigDecimal getEUltpreciooficial() {
		return this.eUltpreciooficial;
	}

	public void setEUltpreciooficial(BigDecimal eUltpreciooficial) {
		this.eUltpreciooficial = eUltpreciooficial;
	}

	public BigDecimal getEUlttxprecio() {
		return this.eUlttxprecio;
	}

	public void setEUlttxprecio(BigDecimal eUlttxprecio) {
		this.eUlttxprecio = eUlttxprecio;
	}

	public BigDecimal getICantidad() {
		return this.iCantidad;
	}

	public void setICantidad(BigDecimal iCantidad) {
		this.iCantidad = iCantidad;
	}

	public BigDecimal getICanttxultdia() {
		return this.iCanttxultdia;
	}

	public void setICanttxultdia(BigDecimal iCanttxultdia) {
		this.iCanttxultdia = iCanttxultdia;
	}

	public BigDecimal getIUltmoccant() {
		return this.iUltmoccant;
	}

	public void setIUltmoccant(BigDecimal iUltmoccant) {
		this.iUltmoccant = iUltmoccant;
	}

	public BigDecimal getIUltmovcantidad() {
		return this.iUltmovcantidad;
	}

	public void setIUltmovcantidad(BigDecimal iUltmovcantidad) {
		this.iUltmovcantidad = iUltmovcantidad;
	}

	public BigDecimal getIUlttxcantidad() {
		return this.iUlttxcantidad;
	}

	public void setIUlttxcantidad(BigDecimal iUlttxcantidad) {
		this.iUlttxcantidad = iUlttxcantidad;
	}

}