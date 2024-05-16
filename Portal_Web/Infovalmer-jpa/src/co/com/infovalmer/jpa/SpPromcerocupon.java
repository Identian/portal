package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sp_promcerocupon database table.
 * 
 */
@Entity
@Table(name="sp_promcerocupon")
@NamedQuery(name="SpPromcerocupon.findAll", query="SELECT s FROM SpPromcerocupon s")
public class SpPromcerocupon implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpPromcerocuponPK id;

	@Column(name="c_curva")
	private String cCurva;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaproceso")
	private Date dFechaproceso;

	@Column(name="e_rentpromedio")
	private BigDecimal eRentpromedio;

	@Column(name="i_diasvencimiento")
	private int iDiasvencimiento;

	public SpPromcerocupon() {
	}

	public SpPromcerocuponPK getId() {
		return this.id;
	}

	public void setId(SpPromcerocuponPK id) {
		this.id = id;
	}

	public String getCCurva() {
		return this.cCurva;
	}

	public void setCCurva(String cCurva) {
		this.cCurva = cCurva;
	}

	public Date getDFechaproceso() {
		return this.dFechaproceso;
	}

	public void setDFechaproceso(Date dFechaproceso) {
		this.dFechaproceso = dFechaproceso;
	}

	public BigDecimal getERentpromedio() {
		return this.eRentpromedio;
	}

	public void setERentpromedio(BigDecimal eRentpromedio) {
		this.eRentpromedio = eRentpromedio;
	}

	public int getIDiasvencimiento() {
		return this.iDiasvencimiento;
	}

	public void setIDiasvencimiento(int iDiasvencimiento) {
		this.iDiasvencimiento = iDiasvencimiento;
	}

}