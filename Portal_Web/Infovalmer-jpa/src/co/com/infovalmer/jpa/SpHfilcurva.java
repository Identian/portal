package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sp_hfilcurva database table.
 * 
 */
@Entity
@Table(name="sp_hfilcurva")
@NamedQuery(name="SpHfilcurva.findAll", query="SELECT s FROM SpHfilcurva s")
public class SpHfilcurva implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpHfilcurvaPK id;

	@Column(name="e_a")
	private BigDecimal eA;

	private BigDecimal e_a2;

	@Column(name="e_b")
	private BigDecimal eB;

	private BigDecimal e_b2;

	@Column(name="e_c")
	private BigDecimal eC;

	private BigDecimal e_c2;

	private BigDecimal e_Estadistico;

	@Column(name="e_lim1")
	private BigDecimal eLim1;

	private BigDecimal e_PromedioError1;

	private BigDecimal e_PromedioError2;

	@Column(name="e_tao")
	private BigDecimal eTao;

	private BigDecimal e_Tao2;

	private BigDecimal e_ValorC;

	private int i_NroOperac1;

	private int i_NroOperac2;

	private int i_NroOperacTotal;

	public SpHfilcurva() {
	}

	public SpHfilcurvaPK getId() {
		return this.id;
	}

	public void setId(SpHfilcurvaPK id) {
		this.id = id;
	}

	public BigDecimal getEA() {
		return this.eA;
	}

	public void setEA(BigDecimal eA) {
		this.eA = eA;
	}

	public BigDecimal getE_a2() {
		return this.e_a2;
	}

	public void setE_a2(BigDecimal e_a2) {
		this.e_a2 = e_a2;
	}

	public BigDecimal getEB() {
		return this.eB;
	}

	public void setEB(BigDecimal eB) {
		this.eB = eB;
	}

	public BigDecimal getE_b2() {
		return this.e_b2;
	}

	public void setE_b2(BigDecimal e_b2) {
		this.e_b2 = e_b2;
	}

	public BigDecimal getEC() {
		return this.eC;
	}

	public void setEC(BigDecimal eC) {
		this.eC = eC;
	}

	public BigDecimal getE_c2() {
		return this.e_c2;
	}

	public void setE_c2(BigDecimal e_c2) {
		this.e_c2 = e_c2;
	}

	public BigDecimal getE_Estadistico() {
		return this.e_Estadistico;
	}

	public void setE_Estadistico(BigDecimal e_Estadistico) {
		this.e_Estadistico = e_Estadistico;
	}

	public BigDecimal getELim1() {
		return this.eLim1;
	}

	public void setELim1(BigDecimal eLim1) {
		this.eLim1 = eLim1;
	}

	public BigDecimal getE_PromedioError1() {
		return this.e_PromedioError1;
	}

	public void setE_PromedioError1(BigDecimal e_PromedioError1) {
		this.e_PromedioError1 = e_PromedioError1;
	}

	public BigDecimal getE_PromedioError2() {
		return this.e_PromedioError2;
	}

	public void setE_PromedioError2(BigDecimal e_PromedioError2) {
		this.e_PromedioError2 = e_PromedioError2;
	}

	public BigDecimal getETao() {
		return this.eTao;
	}

	public void setETao(BigDecimal eTao) {
		this.eTao = eTao;
	}

	public BigDecimal getE_Tao2() {
		return this.e_Tao2;
	}

	public void setE_Tao2(BigDecimal e_Tao2) {
		this.e_Tao2 = e_Tao2;
	}

	public BigDecimal getE_ValorC() {
		return this.e_ValorC;
	}

	public void setE_ValorC(BigDecimal e_ValorC) {
		this.e_ValorC = e_ValorC;
	}

	public int getI_NroOperac1() {
		return this.i_NroOperac1;
	}

	public void setI_NroOperac1(int i_NroOperac1) {
		this.i_NroOperac1 = i_NroOperac1;
	}

	public int getI_NroOperac2() {
		return this.i_NroOperac2;
	}

	public void setI_NroOperac2(int i_NroOperac2) {
		this.i_NroOperac2 = i_NroOperac2;
	}

	public int getI_NroOperacTotal() {
		return this.i_NroOperacTotal;
	}

	public void setI_NroOperacTotal(int i_NroOperacTotal) {
		this.i_NroOperacTotal = i_NroOperacTotal;
	}

}