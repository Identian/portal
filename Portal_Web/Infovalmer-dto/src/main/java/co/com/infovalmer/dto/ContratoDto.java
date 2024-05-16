package co.com.infovalmer.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ContratoDto implements Serializable {

	private static final long serialVersionUID = 238585879951768341L;

	public ContratoDto() {
		// TODO Auto-generated constructor stub
	}

	private int iIdinstrumento;

	private String cCodcontrato;

	private String cEstado;

	private String cNemocontrato;

	private String cNemosubyacente;

	private String cNombreinstrumento;

	private String cTipoderivado;

	private String cTipoejercicio;

	private String cTipoopcion;

	private Date dFechavencimiento;

	private Date dLastnegotiationday;

	private BigDecimal eBid;

	private int eDiasalvencimiento;

	private int eDividendosxpagar;

	private BigDecimal eLast;

	private BigDecimal eMaxpreciodia;

	private BigDecimal eMinimotick;

	private BigDecimal eMinpreciodia;

	private BigDecimal eOffer;

	private BigDecimal ePreciocierre;

	private BigDecimal eStrike;

	private BigDecimal eTamanocontrato;

	private int iGrupotipocontrato;

	private int i_grupotipoejercicioInf;

	private int iGrupotipoopcioninf;

	private int iGrupotiposubyacente;

	private String tipoContrato;
	
	private PreciosValoracionDto preciosValoracion;

	public int getiIdinstrumento() {
		return iIdinstrumento;
	}

	public void setiIdinstrumento(int iIdinstrumento) {
		this.iIdinstrumento = iIdinstrumento;
	}

	public String getcCodcontrato() {
		return cCodcontrato;
	}

	public void setcCodcontrato(String cCodcontrato) {
		this.cCodcontrato = cCodcontrato;
	}

	public String getcEstado() {
		return cEstado;
	}

	public void setcEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getcNemocontrato() {
		return cNemocontrato;
	}

	public void setcNemocontrato(String cNemocontrato) {
		this.cNemocontrato = cNemocontrato;
	}

	public String getcNemosubyacente() {
		return cNemosubyacente;
	}

	public void setcNemosubyacente(String cNemosubyacente) {
		this.cNemosubyacente = cNemosubyacente;
	}

	public String getcNombreinstrumento() {
		return cNombreinstrumento;
	}

	public void setcNombreinstrumento(String cNombreinstrumento) {
		this.cNombreinstrumento = cNombreinstrumento;
	}

	public String getcTipoderivado() {
		return cTipoderivado;
	}

	public void setcTipoderivado(String cTipoderivado) {
		this.cTipoderivado = cTipoderivado;
	}

	public String getcTipoejercicio() {
		return cTipoejercicio;
	}

	public void setcTipoejercicio(String cTipoejercicio) {
		this.cTipoejercicio = cTipoejercicio;
	}

	public String getcTipoopcion() {
		return cTipoopcion;
	}

	public void setcTipoopcion(String cTipoopcion) {
		this.cTipoopcion = cTipoopcion;
	}

	public Date getdFechavencimiento() {
		return dFechavencimiento;
	}

	public void setdFechavencimiento(Date dFechavencimiento) {
		this.dFechavencimiento = dFechavencimiento;
	}

	public Date getdLastnegotiationday() {
		return dLastnegotiationday;
	}

	public void setdLastnegotiationday(Date dLastnegotiationday) {
		this.dLastnegotiationday = dLastnegotiationday;
	}

	public BigDecimal geteBid() {
		return eBid;
	}

	public void seteBid(BigDecimal eBid) {
		this.eBid = eBid;
	}

	public int geteDiasalvencimiento() {
		return eDiasalvencimiento;
	}

	public void seteDiasalvencimiento(int eDiasalvencimiento) {
		this.eDiasalvencimiento = eDiasalvencimiento;
	}

	public int geteDividendosxpagar() {
		return eDividendosxpagar;
	}

	public void seteDividendosxpagar(int eDividendosxpagar) {
		this.eDividendosxpagar = eDividendosxpagar;
	}

	public BigDecimal geteLast() {
		return eLast;
	}

	public void seteLast(BigDecimal eLast) {
		this.eLast = eLast;
	}

	public BigDecimal geteMaxpreciodia() {
		return eMaxpreciodia;
	}

	public void seteMaxpreciodia(BigDecimal eMaxpreciodia) {
		this.eMaxpreciodia = eMaxpreciodia;
	}

	public BigDecimal geteMinimotick() {
		return eMinimotick;
	}

	public void seteMinimotick(BigDecimal eMinimotick) {
		this.eMinimotick = eMinimotick;
	}

	public BigDecimal geteMinpreciodia() {
		return eMinpreciodia;
	}

	public void seteMinpreciodia(BigDecimal eMinpreciodia) {
		this.eMinpreciodia = eMinpreciodia;
	}

	public BigDecimal geteOffer() {
		return eOffer;
	}

	public void seteOffer(BigDecimal eOffer) {
		this.eOffer = eOffer;
	}

	public BigDecimal getePreciocierre() {
		return ePreciocierre;
	}

	public void setePreciocierre(BigDecimal ePreciocierre) {
		this.ePreciocierre = ePreciocierre;
	}

	public BigDecimal geteStrike() {
		return eStrike;
	}

	public void seteStrike(BigDecimal eStrike) {
		this.eStrike = eStrike;
	}

	public BigDecimal geteTamanocontrato() {
		return eTamanocontrato;
	}

	public void seteTamanocontrato(BigDecimal eTamanocontrato) {
		this.eTamanocontrato = eTamanocontrato;
	}

	public int getiGrupotipocontrato() {
		return iGrupotipocontrato;
	}

	public void setiGrupotipocontrato(int iGrupotipocontrato) {
		this.iGrupotipocontrato = iGrupotipocontrato;
	}

	public int getI_grupotipoejercicioInf() {
		return i_grupotipoejercicioInf;
	}

	public void setI_grupotipoejercicioInf(int i_grupotipoejercicioInf) {
		this.i_grupotipoejercicioInf = i_grupotipoejercicioInf;
	}

	public int getiGrupotipoopcioninf() {
		return iGrupotipoopcioninf;
	}

	public void setiGrupotipoopcioninf(int iGrupotipoopcioninf) {
		this.iGrupotipoopcioninf = iGrupotipoopcioninf;
	}

	public int getiGrupotiposubyacente() {
		return iGrupotiposubyacente;
	}

	public void setiGrupotiposubyacente(int iGrupotiposubyacente) {
		this.iGrupotiposubyacente = iGrupotiposubyacente;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public PreciosValoracionDto getPreciosValoracion() {
		return preciosValoracion;
	}

	public void setPreciosValoracion(PreciosValoracionDto preciosValoracion) {
		this.preciosValoracion = preciosValoracion;
	}
	
}
