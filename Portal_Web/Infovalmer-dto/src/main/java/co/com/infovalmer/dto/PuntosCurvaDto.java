package co.com.infovalmer.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PuntosCurvaDto implements Serializable {

	private static final long serialVersionUID = 5138040396009156603L;

	private int iCurva;

	private int iDias;

	private double eValor;

	private BigDecimal value;
	
	private Date fecha;

	public int getiCurva() {
		return iCurva;
	}

	public void setiCurva(int iCurva) {
		this.iCurva = iCurva;
	}

	public int getiDias() {
		return iDias;
	}

	public void setiDias(int iDias) {
		this.iDias = iDias;
	}

	public double geteValor() {
		return eValor;
	}

	public void seteValor(double eValor) {
		this.eValor = eValor;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
