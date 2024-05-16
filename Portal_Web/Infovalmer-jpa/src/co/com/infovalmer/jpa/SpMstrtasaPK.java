package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_mstrtasa database table.
 * 
 */
@Embeddable
public class SpMstrtasaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int i_MetodoFiltro;

	private String c_TipoMuestra;

	private int i_Folio;

	@Temporal(TemporalType.DATE)
	private java.util.Date d_FechaOperacion;

	private String c_SistNegcion;

	public SpMstrtasaPK() {
	}
	public int getI_MetodoFiltro() {
		return this.i_MetodoFiltro;
	}
	public void setI_MetodoFiltro(int i_MetodoFiltro) {
		this.i_MetodoFiltro = i_MetodoFiltro;
	}
	public String getC_TipoMuestra() {
		return this.c_TipoMuestra;
	}
	public void setC_TipoMuestra(String c_TipoMuestra) {
		this.c_TipoMuestra = c_TipoMuestra;
	}
	public int getI_Folio() {
		return this.i_Folio;
	}
	public void setI_Folio(int i_Folio) {
		this.i_Folio = i_Folio;
	}
	public java.util.Date getD_FechaOperacion() {
		return this.d_FechaOperacion;
	}
	public void setD_FechaOperacion(java.util.Date d_FechaOperacion) {
		this.d_FechaOperacion = d_FechaOperacion;
	}
	public String getC_SistNegcion() {
		return this.c_SistNegcion;
	}
	public void setC_SistNegcion(String c_SistNegcion) {
		this.c_SistNegcion = c_SistNegcion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpMstrtasaPK)) {
			return false;
		}
		SpMstrtasaPK castOther = (SpMstrtasaPK)other;
		return 
			(this.i_MetodoFiltro == castOther.i_MetodoFiltro)
			&& this.c_TipoMuestra.equals(castOther.c_TipoMuestra)
			&& (this.i_Folio == castOther.i_Folio)
			&& this.d_FechaOperacion.equals(castOther.d_FechaOperacion)
			&& this.c_SistNegcion.equals(castOther.c_SistNegcion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.i_MetodoFiltro;
		hash = hash * prime + this.c_TipoMuestra.hashCode();
		hash = hash * prime + this.i_Folio;
		hash = hash * prime + this.d_FechaOperacion.hashCode();
		hash = hash * prime + this.c_SistNegcion.hashCode();
		
		return hash;
	}
}