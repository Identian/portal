package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the po_informe database table.
 * 
 */
@Entity
@Table(name="po_informe")
@NamedQuery(name="PoInforme.findAll", query="SELECT p FROM PoInforme p")
public class PoInforme implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_informe")
	private int iInforme;

	@Column(name="C_ARCHIVORESPUESTA")
	private String cArchivorespuesta;

	@Column(name="C_ARCHIVOSOLICITUD")
	private String cArchivosolicitud;

	@Column(name="C_DESCRIPCION")
	private String cDescripcion;

	@Column(name="C_IMAGEN")
	private String cImagen;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHAPUBLICACION")
	private Date dFechapublicacion;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHASOLICITUD")
	private Date dFechasolicitud;

	@Column(name="i_codigosuscriptor")
	private int iCodigosuscriptor;

	@Column(name="I_MERCADO")
	private int iMercado;

	public PoInforme() {
	}

	public int getIInforme() {
		return this.iInforme;
	}

	public void setIInforme(int iInforme) {
		this.iInforme = iInforme;
	}

	public String getCArchivorespuesta() {
		return this.cArchivorespuesta;
	}

	public void setCArchivorespuesta(String cArchivorespuesta) {
		this.cArchivorespuesta = cArchivorespuesta;
	}

	public String getCArchivosolicitud() {
		return this.cArchivosolicitud;
	}

	public void setCArchivosolicitud(String cArchivosolicitud) {
		this.cArchivosolicitud = cArchivosolicitud;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCImagen() {
		return this.cImagen;
	}

	public void setCImagen(String cImagen) {
		this.cImagen = cImagen;
	}

	public Date getDFechapublicacion() {
		return this.dFechapublicacion;
	}

	public void setDFechapublicacion(Date dFechapublicacion) {
		this.dFechapublicacion = dFechapublicacion;
	}

	public Date getDFechasolicitud() {
		return this.dFechasolicitud;
	}

	public void setDFechasolicitud(Date dFechasolicitud) {
		this.dFechasolicitud = dFechasolicitud;
	}

	public int getICodigosuscriptor() {
		return this.iCodigosuscriptor;
	}

	public void setICodigosuscriptor(int iCodigosuscriptor) {
		this.iCodigosuscriptor = iCodigosuscriptor;
	}

	public int getIMercado() {
		return this.iMercado;
	}

	public void setIMercado(int iMercado) {
		this.iMercado = iMercado;
	}

}