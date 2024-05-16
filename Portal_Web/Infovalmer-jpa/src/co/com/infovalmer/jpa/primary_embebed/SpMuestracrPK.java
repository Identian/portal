package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SpMuestracrPK
 *
 */
@Embeddable
public class SpMuestracrPK implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name = "c_curcerocupon")
	private String cCurcerocupon;

	@Column(name = "c_tipomuestra")
	private String cTipomuestra;

	@Column(name = "i_folio")
	private int iFolio;

	@Temporal(TemporalType.DATE)
	@Column(name = "d_fechaoperacion")
	private Date dFechaoperacion;

	@Column(name = "c_sistnegcion")
	private String cSistnegcion;

	public SpMuestracrPK() {
		super();
	}

	public String getcCurcerocupon() {
		return cCurcerocupon;
	}

	public void setcCurcerocupon(String cCurcerocupon) {
		this.cCurcerocupon = cCurcerocupon;
	}

	public String getcTipomuestra() {
		return cTipomuestra;
	}

	public void setcTipomuestra(String cTipomuestra) {
		this.cTipomuestra = cTipomuestra;
	}

	public int getiFolio() {
		return iFolio;
	}

	public void setiFolio(int iFolio) {
		this.iFolio = iFolio;
	}

	public Date getdFechaoperacion() {
		return dFechaoperacion;
	}

	public void setdFechaoperacion(Date dFechaoperacion) {
		this.dFechaoperacion = dFechaoperacion;
	}

	public String getcSistnegcion() {
		return cSistnegcion;
	}

	public void setcSistnegcion(String cSistnegcion) {
		this.cSistnegcion = cSistnegcion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cCurcerocupon == null) ? 0 : cCurcerocupon.hashCode());
		result = prime * result
				+ ((cSistnegcion == null) ? 0 : cSistnegcion.hashCode());
		result = prime * result
				+ ((cTipomuestra == null) ? 0 : cTipomuestra.hashCode());
		result = prime * result
				+ ((dFechaoperacion == null) ? 0 : dFechaoperacion.hashCode());
		result = prime * result + iFolio;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpMuestracrPK other = (SpMuestracrPK) obj;
		if (cCurcerocupon == null) {
			if (other.cCurcerocupon != null)
				return false;
		} else if (!cCurcerocupon.equals(other.cCurcerocupon))
			return false;
		if (cSistnegcion == null) {
			if (other.cSistnegcion != null)
				return false;
		} else if (!cSistnegcion.equals(other.cSistnegcion))
			return false;
		if (cTipomuestra == null) {
			if (other.cTipomuestra != null)
				return false;
		} else if (!cTipomuestra.equals(other.cTipomuestra))
			return false;
		if (dFechaoperacion == null) {
			if (other.dFechaoperacion != null)
				return false;
		} else if (!dFechaoperacion.equals(other.dFechaoperacion))
			return false;
		if (iFolio != other.iFolio)
			return false;
		return true;
	}

}
