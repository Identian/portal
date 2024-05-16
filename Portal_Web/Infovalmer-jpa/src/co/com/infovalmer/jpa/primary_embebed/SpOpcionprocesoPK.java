package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SpOpcionprocesoPK
 *
 */
@Embeddable
public class SpOpcionprocesoPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "i_proceso")
	private int iProceso;

	@Column(name = "i_opcionmodulo")
	private int iOpcionmodulo;

	public SpOpcionprocesoPK() {
		super();
	}

	public int getiProceso() {
		return iProceso;
	}

	public void setiProceso(int iProceso) {
		this.iProceso = iProceso;
	}

	public int getiOpcionmodulo() {
		return iOpcionmodulo;
	}

	public void setiOpcionmodulo(int iOpcionmodulo) {
		this.iOpcionmodulo = iOpcionmodulo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iOpcionmodulo;
		result = prime * result + iProceso;
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
		SpOpcionprocesoPK other = (SpOpcionprocesoPK) obj;
		if (iOpcionmodulo != other.iOpcionmodulo)
			return false;
		if (iProceso != other.iProceso)
			return false;
		return true;
	}

}
