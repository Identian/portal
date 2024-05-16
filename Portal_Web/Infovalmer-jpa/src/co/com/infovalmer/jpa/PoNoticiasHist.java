package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the po_noticias_hist database table.
 * 
 */
@Entity
@Table(name="po_noticias_hist")
@NamedQuery(name="PoNoticiasHist.findAll", query="SELECT p FROM PoNoticiasHist p")
public class PoNoticiasHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_noticia")
	private int iNoticia;

	@Column(name="C_DESCRIPCION")
	private String cDescripcion;

	@Column(name="c_imagen")
	private String cImagen;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHA_FINAL")
	private Date dFechaFinal;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHA_INICIAL")
	private Date dFechaInicial;

	@Column(name="I_MERCADO")
	private int iMercado;

	public PoNoticiasHist() {
	}

	public int getINoticia() {
		return this.iNoticia;
	}

	public void setINoticia(int iNoticia) {
		this.iNoticia = iNoticia;
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

	public Date getDFechaFinal() {
		return this.dFechaFinal;
	}

	public void setDFechaFinal(Date dFechaFinal) {
		this.dFechaFinal = dFechaFinal;
	}

	public Date getDFechaInicial() {
		return this.dFechaInicial;
	}

	public void setDFechaInicial(Date dFechaInicial) {
		this.dFechaInicial = dFechaInicial;
	}

	public int getIMercado() {
		return this.iMercado;
	}

	public void setIMercado(int iMercado) {
		this.iMercado = iMercado;
	}

}