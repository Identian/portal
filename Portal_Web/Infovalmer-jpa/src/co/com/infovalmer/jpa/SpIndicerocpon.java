package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sp_indicerocpon database table.
 * 
 */
@Entity
@Table(name="sp_indicerocpon")
@NamedQuery(name="SpIndicerocpon.findAll", query="SELECT s FROM SpIndicerocpon s")
public class SpIndicerocpon implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpIndicerocponPK id;

	@Column(name="c_nombre")
	private String cNombre;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private Date dFecha;

	@Column(name="e_valor")
	private BigDecimal eValor;

	@Column(name="i_rango")
	private int iRango;

	public SpIndicerocpon() {
	}

	public SpIndicerocponPK getId() {
		return this.id;
	}

	public void setId(SpIndicerocponPK id) {
		this.id = id;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public Date getDFecha() {
		return this.dFecha;
	}

	public void setDFecha(Date dFecha) {
		this.dFecha = dFecha;
	}

	public BigDecimal getEValor() {
		return this.eValor;
	}

	public void setEValor(BigDecimal eValor) {
		this.eValor = eValor;
	}

	public int getIRango() {
		return this.iRango;
	}

	public void setIRango(int iRango) {
		this.iRango = iRango;
	}

}