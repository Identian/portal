package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sp_mstrtasa database table.
 * 
 */
@Entity
@Table(name="sp_mstrtasa")
@NamedQuery(name="SpMstrtasa.findAll", query="SELECT s FROM SpMstrtasa s")
public class SpMstrtasa implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpMstrtasaPK id;

	private String c_FiltraSN;

	private String c_Inclusion1;

	private String c_Inclusion2;

	private String c_Inclusion3;

	@Temporal(TemporalType.DATE)
	private Date d_FechaVcto;

	private BigDecimal e_Cantidad;

	@Column(name="e_errorrent1")
	private BigDecimal eErrorrent1;

	@Column(name="e_errorrent2")
	private BigDecimal eErrorrent2;

	private BigDecimal e_Rentabilidad;

	private BigDecimal e_Tanualizado;

	@Column(name="e_tasaestimada1")
	private BigDecimal eTasaestimada1;

	@Column(name="e_tasaestimada2")
	private BigDecimal eTasaestimada2;

	private int i_DiasVencimiento;

	public SpMstrtasa() {
	}

	public SpMstrtasaPK getId() {
		return this.id;
	}

	public void setId(SpMstrtasaPK id) {
		this.id = id;
	}

	public String getC_FiltraSN() {
		return this.c_FiltraSN;
	}

	public void setC_FiltraSN(String c_FiltraSN) {
		this.c_FiltraSN = c_FiltraSN;
	}

	public String getC_Inclusion1() {
		return this.c_Inclusion1;
	}

	public void setC_Inclusion1(String c_Inclusion1) {
		this.c_Inclusion1 = c_Inclusion1;
	}

	public String getC_Inclusion2() {
		return this.c_Inclusion2;
	}

	public void setC_Inclusion2(String c_Inclusion2) {
		this.c_Inclusion2 = c_Inclusion2;
	}

	public String getC_Inclusion3() {
		return this.c_Inclusion3;
	}

	public void setC_Inclusion3(String c_Inclusion3) {
		this.c_Inclusion3 = c_Inclusion3;
	}

	public Date getD_FechaVcto() {
		return this.d_FechaVcto;
	}

	public void setD_FechaVcto(Date d_FechaVcto) {
		this.d_FechaVcto = d_FechaVcto;
	}

	public BigDecimal getE_Cantidad() {
		return this.e_Cantidad;
	}

	public void setE_Cantidad(BigDecimal e_Cantidad) {
		this.e_Cantidad = e_Cantidad;
	}

	public BigDecimal getEErrorrent1() {
		return this.eErrorrent1;
	}

	public void setEErrorrent1(BigDecimal eErrorrent1) {
		this.eErrorrent1 = eErrorrent1;
	}

	public BigDecimal getEErrorrent2() {
		return this.eErrorrent2;
	}

	public void setEErrorrent2(BigDecimal eErrorrent2) {
		this.eErrorrent2 = eErrorrent2;
	}

	public BigDecimal getE_Rentabilidad() {
		return this.e_Rentabilidad;
	}

	public void setE_Rentabilidad(BigDecimal e_Rentabilidad) {
		this.e_Rentabilidad = e_Rentabilidad;
	}

	public BigDecimal getE_Tanualizado() {
		return this.e_Tanualizado;
	}

	public void setE_Tanualizado(BigDecimal e_Tanualizado) {
		this.e_Tanualizado = e_Tanualizado;
	}

	public BigDecimal getETasaestimada1() {
		return this.eTasaestimada1;
	}

	public void setETasaestimada1(BigDecimal eTasaestimada1) {
		this.eTasaestimada1 = eTasaestimada1;
	}

	public BigDecimal getETasaestimada2() {
		return this.eTasaestimada2;
	}

	public void setETasaestimada2(BigDecimal eTasaestimada2) {
		this.eTasaestimada2 = eTasaestimada2;
	}

	public int getI_DiasVencimiento() {
		return this.i_DiasVencimiento;
	}

	public void setI_DiasVencimiento(int i_DiasVencimiento) {
		this.i_DiasVencimiento = i_DiasVencimiento;
	}

}