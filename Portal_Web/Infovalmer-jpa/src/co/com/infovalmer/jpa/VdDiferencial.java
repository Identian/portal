package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the vd_diferencial database table.
 * 
 */
@Entity
@Table(name="vd_diferencial")
@NamedQuery(name="VdDiferencial.findAll", query="SELECT v FROM VdDiferencial v")
public class VdDiferencial implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VdDiferencialPK id;

	@Column(name="c_nemocontratoant")
	private String cNemocontratoant;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechavencimiento")
	private Date dFechavencimiento;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechavencimientoant")
	private Date dFechavencimientoant;

	@Column(name="i_diferencial")
	private BigDecimal iDiferencial;

	public VdDiferencial() {
	}

	public VdDiferencialPK getId() {
		return this.id;
	}

	public void setId(VdDiferencialPK id) {
		this.id = id;
	}

	public String getCNemocontratoant() {
		return this.cNemocontratoant;
	}

	public void setCNemocontratoant(String cNemocontratoant) {
		this.cNemocontratoant = cNemocontratoant;
	}

	public Date getDFechavencimiento() {
		return this.dFechavencimiento;
	}

	public void setDFechavencimiento(Date dFechavencimiento) {
		this.dFechavencimiento = dFechavencimiento;
	}

	public Date getDFechavencimientoant() {
		return this.dFechavencimientoant;
	}

	public void setDFechavencimientoant(Date dFechavencimientoant) {
		this.dFechavencimientoant = dFechavencimientoant;
	}

	public BigDecimal getIDiferencial() {
		return this.iDiferencial;
	}

	public void setIDiferencial(BigDecimal iDiferencial) {
		this.iDiferencial = iDiferencial;
	}

}