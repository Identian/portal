package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_faq database table.
 * 
 */
@Entity
@Table(name="sp_faq")
@NamedQuery(name="SpFaq.findAll", query="SELECT s FROM SpFaq s")
public class SpFaq implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_faq")
	private int iFaq;

	@Column(name="c_imagenpath")
	private String cImagenpath;

	@Column(name="i_categfaq")
	private int iCategfaq;

	@Column(name="i_orden")
	private int iOrden;

	@Column(name="i_posicion")
	private int iPosicion;

	@Lob
	@Column(name="t_pregunta")
	private String tPregunta;

	@Lob
	@Column(name="t_respuesta")
	private String tRespuesta;

	public SpFaq() {
	}

	public int getIFaq() {
		return this.iFaq;
	}

	public void setIFaq(int iFaq) {
		this.iFaq = iFaq;
	}

	public String getCImagenpath() {
		return this.cImagenpath;
	}

	public void setCImagenpath(String cImagenpath) {
		this.cImagenpath = cImagenpath;
	}

	public int getICategfaq() {
		return this.iCategfaq;
	}

	public void setICategfaq(int iCategfaq) {
		this.iCategfaq = iCategfaq;
	}

	public int getIOrden() {
		return this.iOrden;
	}

	public void setIOrden(int iOrden) {
		this.iOrden = iOrden;
	}

	public int getIPosicion() {
		return this.iPosicion;
	}

	public void setIPosicion(int iPosicion) {
		this.iPosicion = iPosicion;
	}

	public String getTPregunta() {
		return this.tPregunta;
	}

	public void setTPregunta(String tPregunta) {
		this.tPregunta = tPregunta;
	}

	public String getTRespuesta() {
		return this.tRespuesta;
	}

	public void setTRespuesta(String tRespuesta) {
		this.tRespuesta = tRespuesta;
	}

}