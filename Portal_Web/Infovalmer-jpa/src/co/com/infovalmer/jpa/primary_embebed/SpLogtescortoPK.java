package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SpLogtescortoPK
 *
 */
@Embeddable
public class SpLogtescortoPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name = "d_fecha")
	private Date dFecha;

	@Column(name = "c_nemotecnico")
	private String cNemotecnico;

	public SpLogtescortoPK() {
		super();
	}

	public Date getdFecha() {
		return dFecha;
	}

	public void setdFecha(Date dFecha) {
		this.dFecha = dFecha;
	}

	public String getcNemotecnico() {
		return cNemotecnico;
	}

	public void setcNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cNemotecnico == null) ? 0 : cNemotecnico.hashCode());
		result = prime * result + ((dFecha == null) ? 0 : dFecha.hashCode());
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
		SpLogtescortoPK other = (SpLogtescortoPK) obj;
		if (cNemotecnico == null) {
			if (other.cNemotecnico != null)
				return false;
		} else if (!cNemotecnico.equals(other.cNemotecnico))
			return false;
		if (dFecha == null) {
			if (other.dFecha != null)
				return false;
		} else if (!dFecha.equals(other.dFecha))
			return false;
		return true;
	}

}
