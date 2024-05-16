package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sp_betas database table.
 * 
 */
@Entity
@Table(name="sp_betas")
@NamedQuery(name="SpBeta.findAll", query="SELECT s FROM SpBeta s")
public class SpBeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpBetaPK id;

	@Column(name="c_muestraalterna")
	private String cMuestraalterna;

	@Column(name="c_nomindicador")
	private String cNomindicador;

	@Column(name="e_beta0")
	private BigDecimal eBeta0;

	@Column(name="e_beta1")
	private BigDecimal eBeta1;

	@Column(name="e_beta2")
	private BigDecimal eBeta2;

	@Column(name="e_beta3")
	private BigDecimal eBeta3;

	public SpBeta() {
	}

	public SpBetaPK getId() {
		return this.id;
	}

	public void setId(SpBetaPK id) {
		this.id = id;
	}

	public String getCMuestraalterna() {
		return this.cMuestraalterna;
	}

	public void setCMuestraalterna(String cMuestraalterna) {
		this.cMuestraalterna = cMuestraalterna;
	}

	public String getCNomindicador() {
		return this.cNomindicador;
	}

	public void setCNomindicador(String cNomindicador) {
		this.cNomindicador = cNomindicador;
	}

	public BigDecimal getEBeta0() {
		return this.eBeta0;
	}

	public void setEBeta0(BigDecimal eBeta0) {
		this.eBeta0 = eBeta0;
	}

	public BigDecimal getEBeta1() {
		return this.eBeta1;
	}

	public void setEBeta1(BigDecimal eBeta1) {
		this.eBeta1 = eBeta1;
	}

	public BigDecimal getEBeta2() {
		return this.eBeta2;
	}

	public void setEBeta2(BigDecimal eBeta2) {
		this.eBeta2 = eBeta2;
	}

	public BigDecimal getEBeta3() {
		return this.eBeta3;
	}

	public void setEBeta3(BigDecimal eBeta3) {
		this.eBeta3 = eBeta3;
	}

}