package co.com.infovalmer.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class ImpugnacionDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8595296440254178993L;

	private int iImpugnacion;
	
	private Integer iConsec;

	private Integer iTipoCurva;

	private String cCausa;

	private String cClase;

	private String cCorreo;

	private String cCurvas;

	private String cDescripcion;

	private String cIsin;

	private String cMoneda;
	
	private String cTipotasa;

	private String cNemotecnico;

	private String cRespuesta;

	private String cTelefono;

	private String cUsuario;

	private Date dFechaproceso;

	private Date dtHorarespuesta;

	private int iMercado;
	
	private String c_mercado;

	private int iSuscriptor;
	
	private int iEstado;
	
	private List<String> urlAdjuntos;

	public ImpugnacionDto() {
	}

	public int getIImpugnacion() {
		return this.iImpugnacion;
	}

	public void setIImpugnacion(int iImpugnacion) {
		this.iImpugnacion = iImpugnacion;
	}

	public String getCCausa() {
		return this.cCausa;
	}

	public void setCCausa(String cCausa) {
		this.cCausa = cCausa;
	}

	public String getCClase() {
		return this.cClase;
	}

	public void setCClase(String cClase) {
		this.cClase = cClase;
	}

	public String getCCorreo() {
		return this.cCorreo;
	}

	public void setCCorreo(String cCorreo) {
		this.cCorreo = cCorreo;
	}

	public String getCCurvas() {
		return this.cCurvas;
	}

	public void setCCurvas(String cCurvas) {
		this.cCurvas = cCurvas;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCIsin() {
		return this.cIsin;
	}

	public void setCIsin(String cIsin) {
		this.cIsin = cIsin;
	}

	public String getCMoneda() {
		return this.cMoneda;
	}

	public void setCMoneda(String cMoneda) {
		this.cMoneda = cMoneda;
	}

	public String getcTipotasa() {
		return cTipotasa;
	}

	public void setcTipotasa(String cTipotasa) {
		this.cTipotasa = cTipotasa;
	}

	public String getCNemotecnico() {
		return this.cNemotecnico;
	}

	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public String getCRespuesta() {
		return this.cRespuesta;
	}

	public void setCRespuesta(String cRespuesta) {
		this.cRespuesta = cRespuesta;
	}

	public String getCTelefono() {
		return this.cTelefono;
	}

	public void setCTelefono(String cTelefono) {
		this.cTelefono = cTelefono;
	}

	public String getCUsuario() {
		return this.cUsuario;
	}

	public void setCUsuario(String cUsuario) {
		this.cUsuario = cUsuario;
	}

	public Date getDFechaproceso() {
		return this.dFechaproceso;
	}

	public void setDFechaproceso(Date dFechaproceso) {
		this.dFechaproceso = dFechaproceso;
	}

	public Date getDtHorarespuesta() {
		return this.dtHorarespuesta;
	}

	public void setDtHorarespuesta(Date dtHorarespuesta) {
		this.dtHorarespuesta = dtHorarespuesta;
	}

	public int getIMercado() {
		return this.iMercado;
	}

	public void setIMercado(int iMercado) {
		this.iMercado = iMercado;
	}

	public int getISuscriptor() {
		return this.iSuscriptor;
	}

	public void setISuscriptor(int iSuscriptor) {
		this.iSuscriptor = iSuscriptor;
	}

	public int getiEstado() {
		return iEstado;
	}

	public void setiEstado(int iEstado) {
		this.iEstado = iEstado;
	}

	public Integer getiConsec() {
		return iConsec;
	}

	public void setiConsec(Integer iConsec) {
		this.iConsec = iConsec;
	}

	public String getC_mercado() {
		return c_mercado;
	}

	public void setC_mercado(String c_mercado) {
		this.c_mercado = c_mercado;
	}

	public List<String> getUrlAdjuntos() {
		return urlAdjuntos;
	}

	public void setUrlAdjuntos(List<String> urlAdjuntos) {
		this.urlAdjuntos = urlAdjuntos;
	}

	public Integer getiTipoCurva() {
		return iTipoCurva;
	}

	public void setiTipoCurva(Integer iTipoCurva) {
		this.iTipoCurva = iTipoCurva;
	}

	@Override
	public String toString() {
		return "ImpugnacionDto [iImpugnacion=" + iImpugnacion + ", iConsec="
				+ iConsec + ", iTipoCurva=" + iTipoCurva + ", cCausa=" + cCausa
				+ ", cClase=" + cClase + ", cCorreo=" + cCorreo + ", cCurvas="
				+ cCurvas + ", cDescripcion=" + cDescripcion + ", cIsin="
				+ cIsin + ", cMoneda=" + cMoneda + ", cTipotasa=" + cTipotasa
				+ ", cNemotecnico=" + cNemotecnico + ", cRespuesta="
				+ cRespuesta + ", cTelefono=" + cTelefono + ", cUsuario="
				+ cUsuario + ", dFechaproceso=" + dFechaproceso
				+ ", dtHorarespuesta=" + dtHorarespuesta + ", iMercado="
				+ iMercado + ", c_mercado=" + c_mercado + ", iSuscriptor="
				+ iSuscriptor + ", iEstado=" + iEstado + ", urlAdjuntos="
				+ urlAdjuntos + "]";
	}
	
	

}
