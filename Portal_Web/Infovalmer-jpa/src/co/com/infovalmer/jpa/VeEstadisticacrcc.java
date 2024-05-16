package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the ve_estadisticacrcc database table.
 * 
 */
@Entity
@Table(name="ve_estadisticacrcc")
@NamedQuery(name="VeEstadisticacrcc.findAll", query="SELECT v FROM VeEstadisticacrcc v")
public class VeEstadisticacrcc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_codigo")
	private int iCodigo;

	@Column(name="c_nombrearchivo")
	private String cNombrearchivo;

	@Column(name="d_fechafin")
	private Timestamp dFechafin;

	@Column(name="d_fechafinarchivo")
	private Timestamp dFechafinarchivo;

	@Column(name="d_fechainiarchivo")
	private Timestamp dFechainiarchivo;

	@Column(name="d_fechainicio")
	private Timestamp dFechainicio;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechavaloracion")
	private Date dFechavaloracion;

	@Column(name="i_numlineas")
	private int iNumlineas;

	public VeEstadisticacrcc() {
	}

	public int getICodigo() {
		return this.iCodigo;
	}

	public void setICodigo(int iCodigo) {
		this.iCodigo = iCodigo;
	}

	public String getCNombrearchivo() {
		return this.cNombrearchivo;
	}

	public void setCNombrearchivo(String cNombrearchivo) {
		this.cNombrearchivo = cNombrearchivo;
	}

	public Timestamp getDFechafin() {
		return this.dFechafin;
	}

	public void setDFechafin(Timestamp dFechafin) {
		this.dFechafin = dFechafin;
	}

	public Timestamp getDFechafinarchivo() {
		return this.dFechafinarchivo;
	}

	public void setDFechafinarchivo(Timestamp dFechafinarchivo) {
		this.dFechafinarchivo = dFechafinarchivo;
	}

	public Timestamp getDFechainiarchivo() {
		return this.dFechainiarchivo;
	}

	public void setDFechainiarchivo(Timestamp dFechainiarchivo) {
		this.dFechainiarchivo = dFechainiarchivo;
	}

	public Timestamp getDFechainicio() {
		return this.dFechainicio;
	}

	public void setDFechainicio(Timestamp dFechainicio) {
		this.dFechainicio = dFechainicio;
	}

	public Date getDFechavaloracion() {
		return this.dFechavaloracion;
	}

	public void setDFechavaloracion(Date dFechavaloracion) {
		this.dFechavaloracion = dFechavaloracion;
	}

	public int getINumlineas() {
		return this.iNumlineas;
	}

	public void setINumlineas(int iNumlineas) {
		this.iNumlineas = iNumlineas;
	}

}