package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the sp_hfilcr database table.
 * 
 */
@Entity
@Table(name = "sp_hfilcr")
@NamedQuery(name = "SpHfilcr.findAll", query = "SELECT s FROM SpHfilcr s")
public class SpHfilcr implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpHfilcrPK id;

	@Column(name = "e_a")
	private BigDecimal eA;

	@Column(name = "e_a2")
	private BigDecimal eA2;

	@Column(name = "e_b")
	private BigDecimal eB;

	@Column(name = "e_b2")
	private BigDecimal eB2;

	@Column(name = "e_c")
	private BigDecimal eC;

	@Column(name = "e_c2")
	private BigDecimal eC2;

	@Column(name = "e_estadistico")
	private BigDecimal eEstadistico;

	@Column(name = "e_lim1")
	private BigDecimal eLim1;

	@Column(name = "e_promedioerror1")
	private BigDecimal ePromedioerror1;

	@Column(name = "e_promedioerror2")
	private BigDecimal ePromedioerror2;

	@Column(name = "e_tao")
	private BigDecimal eTao;

	@Column(name = "e_tao2")
	private BigDecimal eTao2;

	@Column(name = "e_valorc")
	private BigDecimal eValorc;

	@Column(name = "i_nrooperac")
	private int iNrooperac;

	@Column(name = "i_nrooperac2")
	private int iNrooperac2;

	@Column(name = "i_nrooperaciones")
	private int iNrooperaciones;

	public SpHfilcr() {
	}

	public SpHfilcrPK getId() {
		return id;
	}

	public void setId(SpHfilcrPK id) {
		this.id = id;
	}

	public BigDecimal getEA() {
		return this.eA;
	}

	public void setEA(BigDecimal eA) {
		this.eA = eA;
	}

	public BigDecimal getEA2() {
		return this.eA2;
	}

	public void setEA2(BigDecimal eA2) {
		this.eA2 = eA2;
	}

	public BigDecimal getEB() {
		return this.eB;
	}

	public void setEB(BigDecimal eB) {
		this.eB = eB;
	}

	public BigDecimal getEB2() {
		return this.eB2;
	}

	public void setEB2(BigDecimal eB2) {
		this.eB2 = eB2;
	}

	public BigDecimal getEC() {
		return this.eC;
	}

	public void setEC(BigDecimal eC) {
		this.eC = eC;
	}

	public BigDecimal getEC2() {
		return this.eC2;
	}

	public void setEC2(BigDecimal eC2) {
		this.eC2 = eC2;
	}

	public BigDecimal getEEstadistico() {
		return this.eEstadistico;
	}

	public void setEEstadistico(BigDecimal eEstadistico) {
		this.eEstadistico = eEstadistico;
	}

	public BigDecimal getELim1() {
		return this.eLim1;
	}

	public void setELim1(BigDecimal eLim1) {
		this.eLim1 = eLim1;
	}

	public BigDecimal getEPromedioerror1() {
		return this.ePromedioerror1;
	}

	public void setEPromedioerror1(BigDecimal ePromedioerror1) {
		this.ePromedioerror1 = ePromedioerror1;
	}

	public BigDecimal getEPromedioerror2() {
		return this.ePromedioerror2;
	}

	public void setEPromedioerror2(BigDecimal ePromedioerror2) {
		this.ePromedioerror2 = ePromedioerror2;
	}

	public BigDecimal getETao() {
		return this.eTao;
	}

	public void setETao(BigDecimal eTao) {
		this.eTao = eTao;
	}

	public BigDecimal getETao2() {
		return this.eTao2;
	}

	public void setETao2(BigDecimal eTao2) {
		this.eTao2 = eTao2;
	}

	public BigDecimal getEValorc() {
		return this.eValorc;
	}

	public void setEValorc(BigDecimal eValorc) {
		this.eValorc = eValorc;
	}

	public int getINrooperac() {
		return this.iNrooperac;
	}

	public void setINrooperac(int iNrooperac) {
		this.iNrooperac = iNrooperac;
	}

	public int getINrooperac2() {
		return this.iNrooperac2;
	}

	public void setINrooperac2(int iNrooperac2) {
		this.iNrooperac2 = iNrooperac2;
	}

	public int getINrooperaciones() {
		return this.iNrooperaciones;
	}

	public void setINrooperaciones(int iNrooperaciones) {
		this.iNrooperaciones = iNrooperaciones;
	}

}