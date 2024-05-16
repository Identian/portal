package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SpFecvencientocrPK
 *
 */
@Embeddable
public class SpFecvencientocrPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "c_curvacerocupon")
	private String cCurvacerocupon;

	@Temporal(TemporalType.DATE)
	@Column(name = "d_fechacurva")
	private Date dFechacurva;

	@Column(name = "i_diasvencimiento")
	private int iDiasvencimiento;

	public SpFecvencientocrPK() {
		super();
	}

	public String getcCurvacerocupon() {
		return cCurvacerocupon;
	}

	public void setcCurvacerocupon(String cCurvacerocupon) {
		this.cCurvacerocupon = cCurvacerocupon;
	}

	public Date getdFechacurva() {
		return dFechacurva;
	}

	public void setdFechacurva(Date dFechacurva) {
		this.dFechacurva = dFechacurva;
	}

	public int getiDiasvencimiento() {
		return iDiasvencimiento;
	}

	public void setiDiasvencimiento(int iDiasvencimiento) {
		this.iDiasvencimiento = iDiasvencimiento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cCurvacerocupon == null) ? 0 : cCurvacerocupon.hashCode());
		result = prime * result
				+ ((dFechacurva == null) ? 0 : dFechacurva.hashCode());
		result = prime * result + iDiasvencimiento;
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
		SpFecvencientocrPK other = (SpFecvencientocrPK) obj;
		if (cCurvacerocupon == null) {
			if (other.cCurvacerocupon != null)
				return false;
		} else if (!cCurvacerocupon.equals(other.cCurvacerocupon))
			return false;
		if (dFechacurva == null) {
			if (other.dFechacurva != null)
				return false;
		} else if (!dFechacurva.equals(other.dFechacurva))
			return false;
		if (iDiasvencimiento != other.iDiasvencimiento)
			return false;
		return true;
	}

}
