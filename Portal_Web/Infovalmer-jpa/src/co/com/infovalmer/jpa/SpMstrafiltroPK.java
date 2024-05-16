package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_mstrafiltro database table.
 * 
 */
@Embeddable
public class SpMstrafiltroPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_tipomuestra")
	private String cTipomuestra;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaoperacion")
	private java.util.Date dFechaoperacion;

	private String c_sistNegcion;

	private int i_MetodoFiltro;

	private int i_Folio;

	public SpMstrafiltroPK() {
	}
	public String getCTipomuestra() {
		return this.cTipomuestra;
	}
	public void setCTipomuestra(String cTipomuestra) {
		this.cTipomuestra = cTipomuestra;
	}
	public java.util.Date getDFechaoperacion() {
		return this.dFechaoperacion;
	}
	public void setDFechaoperacion(java.util.Date dFechaoperacion) {
		this.dFechaoperacion = dFechaoperacion;
	}
	public String getC_sistNegcion() {
		return this.c_sistNegcion;
	}
	public void setC_sistNegcion(String c_sistNegcion) {
		this.c_sistNegcion = c_sistNegcion;
	}
	public int getI_MetodoFiltro() {
		return this.i_MetodoFiltro;
	}
	public void setI_MetodoFiltro(int i_MetodoFiltro) {
		this.i_MetodoFiltro = i_MetodoFiltro;
	}
	public int getI_Folio() {
		return this.i_Folio;
	}
	public void setI_Folio(int i_Folio) {
		this.i_Folio = i_Folio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpMstrafiltroPK)) {
			return false;
		}
		SpMstrafiltroPK castOther = (SpMstrafiltroPK)other;
		return 
			this.cTipomuestra.equals(castOther.cTipomuestra)
			&& this.dFechaoperacion.equals(castOther.dFechaoperacion)
			&& this.c_sistNegcion.equals(castOther.c_sistNegcion)
			&& (this.i_MetodoFiltro == castOther.i_MetodoFiltro)
			&& (this.i_Folio == castOther.i_Folio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cTipomuestra.hashCode();
		hash = hash * prime + this.dFechaoperacion.hashCode();
		hash = hash * prime + this.c_sistNegcion.hashCode();
		hash = hash * prime + this.i_MetodoFiltro;
		hash = hash * prime + this.i_Folio;
		
		return hash;
	}
}