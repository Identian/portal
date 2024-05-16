package co.com.infovalmer.dto;

import java.io.Serializable;
import java.util.Date;

public class TipoTasaDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cTipotasa;

	private String cCasoespecial;

	private String cCtipo;

	private String cDescripcion;

	private String cEquivalencia;

	private String cEstado;

	private String cPeriodmodali;

	private String cVigencia;

	private Date dFechafin;

	private Date dFechaini;

	private byte iCodtiptasa;

	private byte iGrupotasa;

	private byte iOperador;
	
	private String cMuestraTasa;

	public TipoTasaDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getcTipotasa() {
		return cTipotasa;
	}

	public void setcTipotasa(String cTipotasa) {
		this.cTipotasa = cTipotasa;
	}

	public String getcCasoespecial() {
		return cCasoespecial;
	}

	public void setcCasoespecial(String cCasoespecial) {
		this.cCasoespecial = cCasoespecial;
	}

	public String getcCtipo() {
		return cCtipo;
	}

	public void setcCtipo(String cCtipo) {
		this.cCtipo = cCtipo;
	}

	public String getcDescripcion() {
		return cDescripcion;
	}

	public void setcDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getcEquivalencia() {
		return cEquivalencia;
	}

	public void setcEquivalencia(String cEquivalencia) {
		this.cEquivalencia = cEquivalencia;
	}

	public String getcEstado() {
		return cEstado;
	}

	public void setcEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getcPeriodmodali() {
		return cPeriodmodali;
	}

	public void setcPeriodmodali(String cPeriodmodali) {
		this.cPeriodmodali = cPeriodmodali;
	}

	public String getcVigencia() {
		return cVigencia;
	}

	public void setcVigencia(String cVigencia) {
		this.cVigencia = cVigencia;
	}

	public Date getdFechafin() {
		return dFechafin;
	}

	public void setdFechafin(Date dFechafin) {
		this.dFechafin = dFechafin;
	}

	public Date getdFechaini() {
		return dFechaini;
	}

	public void setdFechaini(Date dFechaini) {
		this.dFechaini = dFechaini;
	}

	public byte getiCodtiptasa() {
		return iCodtiptasa;
	}

	public void setiCodtiptasa(byte iCodtiptasa) {
		this.iCodtiptasa = iCodtiptasa;
	}

	public byte getiGrupotasa() {
		return iGrupotasa;
	}

	public void setiGrupotasa(byte iGrupotasa) {
		this.iGrupotasa = iGrupotasa;
	}

	public byte getiOperador() {
		return iOperador;
	}

	public void setiOperador(byte iOperador) {
		this.iOperador = iOperador;
	}

	public String getcMuestraTasa() {
		return cMuestraTasa;
	}

	public void setcMuestraTasa(String cMuestraTasa) {
		this.cMuestraTasa = cMuestraTasa;
	}
}
