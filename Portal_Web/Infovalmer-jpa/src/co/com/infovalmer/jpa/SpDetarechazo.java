package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_detarechazo database table.
 * 
 */
@Entity
@Table(name="sp_detarechazo")
@NamedQuery(name="SpDetarechazo.findAll", query="SELECT s FROM SpDetarechazo s")
public class SpDetarechazo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpDetarechazoPK id;

	@Column(name="c_camporegistro")
	private String cCamporegistro;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="i_columnaerror")
	private byte iColumnaerror;

	@Column(name="i_tipoerror")
	private int iTipoerror;

	public SpDetarechazo() {
	}

	public SpDetarechazoPK getId() {
		return this.id;
	}

	public void setId(SpDetarechazoPK id) {
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

	public byte getIColumnaerror() {
		return this.iColumnaerror;
	}

	public void setIColumnaerror(byte iColumnaerror) {
		this.iColumnaerror = iColumnaerror;
	}

	public int getITipoerror() {
		return this.iTipoerror;
	}

	public void setITipoerror(int iTipoerror) {
		this.iTipoerror = iTipoerror;
	}

}