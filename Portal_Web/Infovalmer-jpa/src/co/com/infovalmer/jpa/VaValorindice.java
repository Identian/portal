package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the va_valorindice database table.
 * 
 */
@Entity
@Table(name="va_valorindice")
@NamedQuery(name="VaValorindice.findAll", query="SELECT v FROM VaValorindice v")
public class VaValorindice implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VaValorindicePK id;

	@Column(name="e_acumulado")
	private BigDecimal eAcumulado;

	@Column(name="e_valorayer")
	private BigDecimal eValorayer;

	@Column(name="e_valorhoy")
	private BigDecimal eValorhoy;

	@Column(name="e_varanual")
	private BigDecimal eVaranual;

	@Column(name="e_vardia")
	private BigDecimal eVardia;

	@Column(name="e_varprimero")
	private BigDecimal eVarprimero;

	public VaValorindice() {
	}

	public VaValorindicePK getId() {
		return this.id;
	}

	public void setId(VaValorindicePK id) {
		this.id = id;
	}

	public BigDecimal getEAcumulado() {
		return this.eAcumulado;
	}

	public void setEAcumulado(BigDecimal eAcumulado) {
		this.eAcumulado = eAcumulado;
	}

	public BigDecimal getEValorayer() {
		return this.eValorayer;
	}

	public void setEValorayer(BigDecimal eValorayer) {
		this.eValorayer = eValorayer;
	}

	public BigDecimal getEValorhoy() {
		return this.eValorhoy;
	}

	public void setEValorhoy(BigDecimal eValorhoy) {
		this.eValorhoy = eValorhoy;
	}

	public BigDecimal getEVaranual() {
		return this.eVaranual;
	}

	public void setEVaranual(BigDecimal eVaranual) {
		this.eVaranual = eVaranual;
	}

	public BigDecimal getEVardia() {
		return this.eVardia;
	}

	public void setEVardia(BigDecimal eVardia) {
		this.eVardia = eVardia;
	}

	public BigDecimal getEVarprimero() {
		return this.eVarprimero;
	}

	public void setEVarprimero(BigDecimal eVarprimero) {
		this.eVarprimero = eVarprimero;
	}

}