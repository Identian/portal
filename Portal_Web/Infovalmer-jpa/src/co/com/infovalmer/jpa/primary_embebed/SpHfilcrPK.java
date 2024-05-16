package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SpHfilcrPK
 *
 */
@Embeddable
public class SpHfilcrPK implements Serializable {	
	private static final long serialVersionUID = 1L;
	
	@Temporal(TemporalType.DATE)
	@Column(name="d_fechacurva")
	private Date dFechacurva;
	
	@Column(name="c_curcerocupon")
	private String cCurcerocupon;
	
	public SpHfilcrPK() {
		super();
	}

	public Date getdFechacurva() {
		return dFechacurva;
	}

	public void setdFechacurva(Date dFechacurva) {
		this.dFechacurva = dFechacurva;
	}

	public String getcCurcerocupon() {
		return cCurcerocupon;
	}

	public void setcCurcerocupon(String cCurcerocupon) {
		this.cCurcerocupon = cCurcerocupon;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cCurcerocupon == null) ? 0 : cCurcerocupon.hashCode());
		result = prime * result
				+ ((dFechacurva == null) ? 0 : dFechacurva.hashCode());
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
		SpHfilcrPK other = (SpHfilcrPK) obj;
		if (cCurcerocupon == null) {
			if (other.cCurcerocupon != null)
				return false;
		} else if (!cCurcerocupon.equals(other.cCurcerocupon))
			return false;
		if (dFechacurva == null) {
			if (other.dFechacurva != null)
				return false;
		} else if (!dFechacurva.equals(other.dFechacurva))
			return false;
		return true;
	}
	
}
