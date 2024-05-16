package co.com.infovalmer.dto;

import java.io.Serializable;

public class TipoCurvaDto implements Serializable {

	private static final long serialVersionUID = -6752041488098185156L;

	private int iTipocurva;

	private String cDescripcion;

	private String cEjex;

	private String cEjey;

	private String cNombre;

	private String cPrefijoArchivo;

	private int iAgrupador;

	private int iOrden;
	
	private String muestraCurva;

	public int getiTipocurva() {
		return iTipocurva;
	}

	public void setiTipocurva(int iTipocurva) {
		this.iTipocurva = iTipocurva;
	}

	public String getcDescripcion() {
		return cDescripcion;
	}

	public void setcDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getcEjex() {
		return cEjex;
	}

	public void setcEjex(String cEjex) {
		this.cEjex = cEjex;
	}

	public String getcEjey() {
		return cEjey;
	}

	public void setcEjey(String cEjey) {
		this.cEjey = cEjey;
	}

	public String getcNombre() {
		return cNombre;
	}

	public void setcNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getcPrefijoArchivo() {
		return cPrefijoArchivo;
	}

	public void setcPrefijoArchivo(String cPrefijoArchivo) {
		this.cPrefijoArchivo = cPrefijoArchivo;
	}

	public int getiAgrupador() {
		return iAgrupador;
	}

	public void setiAgrupador(int iAgrupador) {
		this.iAgrupador = iAgrupador;
	}

	public int getiOrden() {
		return iOrden;
	}

	public void setiOrden(int iOrden) {
		this.iOrden = iOrden;
	}

	public String getMuestraCurva() {
		return muestraCurva;
	}

	public void setMuestraCurva(String muestraCurva) {
		this.muestraCurva = muestraCurva;
	}
}
