package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the po_documento database table.
 * 
 */
@Entity
@Table(name="po_documento")
@NamedQuery(name="PoDocumento.findAll", query="SELECT p FROM PoDocumento p")
public class PoDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_documento")
	private int iDocumento;

	@Column(name="C_DESCRIPCION")
	private String cDescripcion;

	@Column(name="C_NOMBRE")
	private String cNombre;

	@Column(name="C_NUMERODECRETO")
	private String cNumerodecreto;

	@Column(name="C_TIPOARCHIVO")
	private String cTipoarchivo;

	@Column(name="C_URL")
	private String cUrl;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHACARGA")
	private Date dFechacarga;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHAEXPEDICION")
	private Date dFechaexpedicion;

	@Column(name="I_MERCADO")
	private int iMercado;

	@Column(name="i_regulacion")
	private int iRegulacion;

	public PoDocumento() {
	}

	public int getIDocumento() {
		return this.iDocumento;
	}

	public void setIDocumento(int iDocumento) {
		this.iDocumento = iDocumento;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getCNumerodecreto() {
		return this.cNumerodecreto;
	}

	public void setCNumerodecreto(String cNumerodecreto) {
		this.cNumerodecreto = cNumerodecreto;
	}

	public String getCTipoarchivo() {
		return this.cTipoarchivo;
	}

	public void setCTipoarchivo(String cTipoarchivo) {
		this.cTipoarchivo = cTipoarchivo;
	}

	public String getCUrl() {
		return this.cUrl;
	}

	public void setCUrl(String cUrl) {
		this.cUrl = cUrl;
	}

	public Date getDFechacarga() {
		return this.dFechacarga;
	}

	public void setDFechacarga(Date dFechacarga) {
		this.dFechacarga = dFechacarga;
	}

	public Date getDFechaexpedicion() {
		return this.dFechaexpedicion;
	}

	public void setDFechaexpedicion(Date dFechaexpedicion) {
		this.dFechaexpedicion = dFechaexpedicion;
	}

	public int getIMercado() {
		return this.iMercado;
	}

	public void setIMercado(int iMercado) {
		this.iMercado = iMercado;
	}

	public int getIRegulacion() {
		return this.iRegulacion;
	}

	public void setIRegulacion(int iRegulacion) {
		this.iRegulacion = iRegulacion;
	}

}