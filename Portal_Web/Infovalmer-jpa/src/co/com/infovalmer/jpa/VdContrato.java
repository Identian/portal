package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the vd_contratos database table.
 * 
 */
@Entity
@Table(name = "vd_contratos")
@NamedQueries({
		@NamedQuery(name = "VdContrato.findAll", query = "SELECT v FROM VdContrato v"),
		@NamedQuery(name = "VdContrato.findContratoNemoSubyacente", query = "SELECT v FROM VdContrato v WHERE v.cNemosubyacente = ?1") })
public class VdContrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "i_idinstrumento")
	private int iIdinstrumento;

	@Column(name = "c_codcontrato")
	private String cCodcontrato;

	@Column(name = "c_estado")
	private String cEstado;

	@Column(name = "c_nemocontrato")
	private String cNemocontrato;

	@Column(name = "c_nemosubyacente")
	private String cNemosubyacente;

	@Column(name = "c_nombreinstrumento")
	private String cNombreinstrumento;

	@Column(name = "c_tipoderivado")
	private String cTipoderivado;

	@Column(name = "c_tipoejercicio")
	private String cTipoejercicio;

	@Column(name = "c_tipoopcion")
	private String cTipoopcion;

	@Temporal(TemporalType.DATE)
	@Column(name = "d_fechavencimiento")
	private Date dFechavencimiento;

	@Temporal(TemporalType.DATE)
	@Column(name = "d_lastnegotiationday")
	private Date dLastnegotiationday;

	@Column(name = "e_bid")
	private BigDecimal eBid;

	@Column(name = "e_diasalvencimiento")
	private int eDiasalvencimiento;

	@Column(name = "e_dividendosxpagar")
	private int eDividendosxpagar;

	@Column(name = "e_last")
	private BigDecimal eLast;

	@Column(name = "e_maxpreciodia")
	private BigDecimal eMaxpreciodia;

	@Column(name = "e_minimotick")
	private BigDecimal eMinimotick;

	@Column(name = "e_minpreciodia")
	private BigDecimal eMinpreciodia;

	@Column(name = "e_offer")
	private BigDecimal eOffer;

	@Column(name = "e_preciocierre")
	private BigDecimal ePreciocierre;

	@Column(name = "e_strike")
	private BigDecimal eStrike;

	@Column(name = "e_tamanocontrato")
	private BigDecimal eTamanocontrato;

	@Column(name = "i_grupotipocontrato")
	private int iGrupotipocontrato;

	private int i_grupotipoejercicioInf;

	@Column(name = "i_grupotipoopcioninf")
	private int iGrupotipoopcioninf;

	@Column(name = "i_grupotiposubyacente")
	private int iGrupotiposubyacente;

	@Column(name = "tipo_contrato")
	private String tipoContrato;

	public VdContrato() {
	}

	public int getIIdinstrumento() {
		return this.iIdinstrumento;
	}

	public void setIIdinstrumento(int iIdinstrumento) {
		this.iIdinstrumento = iIdinstrumento;
	}

	public String getCCodcontrato() {
		return this.cCodcontrato;
	}

	public void setCCodcontrato(String cCodcontrato) {
		this.cCodcontrato = cCodcontrato;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getCNemocontrato() {
		return this.cNemocontrato;
	}

	public void setCNemocontrato(String cNemocontrato) {
		this.cNemocontrato = cNemocontrato;
	}

	public String getCNemosubyacente() {
		return this.cNemosubyacente;
	}

	public void setCNemosubyacente(String cNemosubyacente) {
		this.cNemosubyacente = cNemosubyacente;
	}

	public String getCNombreinstrumento() {
		return this.cNombreinstrumento;
	}

	public void setCNombreinstrumento(String cNombreinstrumento) {
		this.cNombreinstrumento = cNombreinstrumento;
	}

	public String getCTipoderivado() {
		return this.cTipoderivado;
	}

	public void setCTipoderivado(String cTipoderivado) {
		this.cTipoderivado = cTipoderivado;
	}

	public String getCTipoejercicio() {
		return this.cTipoejercicio;
	}

	public void setCTipoejercicio(String cTipoejercicio) {
		this.cTipoejercicio = cTipoejercicio;
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

	public Date getDLastnegotiationday() {
		return this.dLastnegotiationday;
	}

	public void setDLastnegotiationday(Date dLastnegotiationday) {
		this.dLastnegotiationday = dLastnegotiationday;
	}

	public BigDecimal getEBid() {
		return this.eBid;
	}

	public void setEBid(BigDecimal eBid) {
		this.eBid = eBid;
	}

	public int getEDiasalvencimiento() {
		return this.eDiasalvencimiento;
	}

	public void setEDiasalvencimiento(int eDiasalvencimiento) {
		this.eDiasalvencimiento = eDiasalvencimiento;
	}

	public int getEDividendosxpagar() {
		return this.eDividendosxpagar;
	}

	public void setEDividendosxpagar(int eDividendosxpagar) {
		this.eDividendosxpagar = eDividendosxpagar;
	}

	public BigDecimal getELast() {
		return this.eLast;
	}

	public void setELast(BigDecimal eLast) {
		this.eLast = eLast;
	}

	public BigDecimal getEMaxpreciodia() {
		return this.eMaxpreciodia;
	}

	public void setEMaxpreciodia(BigDecimal eMaxpreciodia) {
		this.eMaxpreciodia = eMaxpreciodia;
	}

	public BigDecimal getEMinimotick() {
		return this.eMinimotick;
	}

	public void setEMinimotick(BigDecimal eMinimotick) {
		this.eMinimotick = eMinimotick;
	}

	public BigDecimal getEMinpreciodia() {
		return this.eMinpreciodia;
	}

	public void setEMinpreciodia(BigDecimal eMinpreciodia) {
		this.eMinpreciodia = eMinpreciodia;
	}

	public BigDecimal getEOffer() {
		return this.eOffer;
	}

	public void setEOffer(BigDecimal eOffer) {
		this.eOffer = eOffer;
	}

	public BigDecimal getEPreciocierre() {
		return this.ePreciocierre;
	}

	public void setEPreciocierre(BigDecimal ePreciocierre) {
		this.ePreciocierre = ePreciocierre;
	}

	public BigDecimal getEStrike() {
		return this.eStrike;
	}

	public void setEStrike(BigDecimal eStrike) {
		this.eStrike = eStrike;
	}

	public BigDecimal getETamanocontrato() {
		return this.eTamanocontrato;
	}

	public void setETamanocontrato(BigDecimal eTamanocontrato) {
		this.eTamanocontrato = eTamanocontrato;
	}

	public int getIGrupotipocontrato() {
		return this.iGrupotipocontrato;
	}

	public void setIGrupotipocontrato(int iGrupotipocontrato) {
		this.iGrupotipocontrato = iGrupotipocontrato;
	}

	public int getI_grupotipoejercicioInf() {
		return this.i_grupotipoejercicioInf;
	}

	public void setI_grupotipoejercicioInf(int i_grupotipoejercicioInf) {
		this.i_grupotipoejercicioInf = i_grupotipoejercicioInf;
	}

	public int getIGrupotipoopcioninf() {
		return this.iGrupotipoopcioninf;
	}

	public void setIGrupotipoopcioninf(int iGrupotipoopcioninf) {
		this.iGrupotipoopcioninf = iGrupotipoopcioninf;
	}

	public int getIGrupotiposubyacente() {
		return this.iGrupotiposubyacente;
	}

	public void setIGrupotiposubyacente(int iGrupotiposubyacente) {
		this.iGrupotiposubyacente = iGrupotiposubyacente;
	}

	public String getTipoContrato() {
		return this.tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

}