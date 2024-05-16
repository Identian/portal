package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sp_hindice database table.
 * 
 */
@Entity
@Table(name="sp_hindice")
@NamedQuery(name="SpHindice.findAll", query="SELECT s FROM SpHindice s")
public class SpHindice implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpHindicePK id;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_tipohcal")
	private String cTipohcal;

	@Column(name="e_valor")
	private BigDecimal eValor;

	@Column(name="i_diasvencimiento")
	private int iDiasvencimiento;

	public SpHindice() {
	}

	public SpHindicePK getId() {
		return this.id;
	}

	public void setId(SpHindicePK id) {
		this.id = id;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getCTipohcal() {
		return this.cTipohcal;
	}

	public void setCTipohcal(String cTipohcal) {
		this.cTipohcal = cTipohcal;
	}

	public BigDecimal getEValor() {
		return this.eValor;
	}

	public void setEValor(BigDecimal eValor) {
		this.eValor = eValor;
	}

	public int getIDiasvencimiento() {
		return this.iDiasvencimiento;
	}

	public void setIDiasvencimiento(int iDiasvencimiento) {
		this.iDiasvencimiento = iDiasvencimiento;
	}

}