package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the va_detarechazo database table.
 * 
 */
@Entity
@Table(name="va_detarechazo")
@NamedQuery(name="VaDetarechazo.findAll", query="SELECT v FROM VaDetarechazo v")
public class VaDetarechazo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VaDetarechazoPK id;

	@Column(name="c_camporegistro")
	private String cCamporegistro;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="i_columnaerror")
	private int iColumnaerror;

	@Column(name="i_tipoerror")
	private int iTipoerror;

	public VaDetarechazo() {
	}

	public VaDetarechazoPK getId() {
		return this.id;
	}

	public void setId(VaDetarechazoPK id) {
		this.id = id;
	}

	public String getCCamporegistro() {
		return this.cCamporegistro;
	}

	public void setCCamporegistro(String cCamporegistro) {
		this.cCamporegistro = cCamporegistro;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public int getIColumnaerror() {
		return this.iColumnaerror;
	}

	public void setIColumnaerror(int iColumnaerror) {
		this.iColumnaerror = iColumnaerror;
	}

	public int getITipoerror() {
		return this.iTipoerror;
	}

	public void setITipoerror(int iTipoerror) {
		this.iTipoerror = iTipoerror;
	}

}