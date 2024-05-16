package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the po_tipocurva_suscriptores database table.
 * 
 */
@Entity
@Table(name="po_tipocurva_suscriptores")
@NamedQuery(name="PoTipocurvaSuscriptore.findAll", query="SELECT p FROM PoTipocurvaSuscriptore p")
public class PoTipocurvaSuscriptore implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PoTipocurvaSuscriptorePK id;

	@Column(name="c_estado")
	private String cEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="d_fecha_adicion")
	private Date dFechaAdicion;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha_fin_vigencia")
	private Date dFechaFinVigencia;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha_inicio_vigencia")
	private Date dFechaInicioVigencia;

	@Column(name="i_costo")
	private int iCosto;

	public PoTipocurvaSuscriptore() {
	}

	public PoTipocurvaSuscriptorePK getId() {
		return this.id;
	}

	public void setId(PoTipocurvaSuscriptorePK id) {
		this.id = id;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public Date getDFechaAdicion() {
		return this.dFechaAdicion;
	}

	public void setDFechaAdicion(Date dFechaAdicion) {
		this.dFechaAdicion = dFechaAdicion;
	}

	public Date getDFechaFinVigencia() {
		return this.dFechaFinVigencia;
	}

	public void setDFechaFinVigencia(Date dFechaFinVigencia) {
		this.dFechaFinVigencia = dFechaFinVigencia;
	}

	public Date getDFechaInicioVigencia() {
		return this.dFechaInicioVigencia;
	}

	public void setDFechaInicioVigencia(Date dFechaInicioVigencia) {
		this.dFechaInicioVigencia = dFechaInicioVigencia;
	}

	public int getICosto() {
		return this.iCosto;
	}

	public void setICosto(int iCosto) {
		this.iCosto = iCosto;
	}

}