package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sp_mstrafiltro database table.
 * 
 */
@Entity
@Table(name="sp_mstrafiltro")
@NamedQuery(name="SpMstrafiltro.findAll", query="SELECT s FROM SpMstrafiltro s")
public class SpMstrafiltro implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpMstrafiltroPK id;

	@Column(name="c_filtrasn")
	private String cFiltrasn;

	@Column(name="e_cantidad")
	private BigDecimal eCantidad;

	@Column(name="e_errorprecio")
	private BigDecimal eErrorprecio;

	@Column(name="e_precio")
	private BigDecimal ePrecio;

	@Column(name="i_codrangodf")
	private int iCodrangodf;

	public SpMstrafiltro() {
	}

	public SpMstrafiltroPK getId() {
		return this.id;
	}

	public void setId(SpMstrafiltroPK id) {
		this.id = id;
	}

	public String getCFiltrasn() {
		return this.cFiltrasn;
	}

	public void setCFiltrasn(String cFiltrasn) {
		this.cFiltrasn = cFiltrasn;
	}

	public BigDecimal getECantidad() {
		return this.eCantidad;
	}

	public void setECantidad(BigDecimal eCantidad) {
		this.eCantidad = eCantidad;
	}

	public BigDecimal getEErrorprecio() {
		return this.eErrorprecio;
	}

	public void setEErrorprecio(BigDecimal eErrorprecio) {
		this.eErrorprecio = eErrorprecio;
	}

	public BigDecimal getEPrecio() {
		return this.ePrecio;
	}

	public void setEPrecio(BigDecimal ePrecio) {
		this.ePrecio = ePrecio;
	}

	public int getICodrangodf() {
		return this.iCodrangodf;
	}

	public void setICodrangodf(int iCodrangodf) {
		this.iCodrangodf = iCodrangodf;
	}

}