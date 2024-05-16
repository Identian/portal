package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_infoarchivo database table.
 * 
 */
@Entity
@Table(name="sp_infoarchivo")
@NamedQuery(name="SpInfoarchivo.findAll", query="SELECT s FROM SpInfoarchivo s")
public class SpInfoarchivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpInfoarchivoPK id;

	@Column(name="c_textolinea")
	private String cTextolinea;

	@Column(name="c_textolinea2")
	private String cTextolinea2;

	@Column(name="c_tiporegistro")
	private String cTiporegistro;

	public SpInfoarchivo() {
	}

	public SpInfoarchivoPK getId() {
		return this.id;
	}

	public void setId(SpInfoarchivoPK id) {
		this.id = id;
	}

	public String getCTextolinea() {
		return this.cTextolinea;
	}

	public void setCTextolinea(String cTextolinea) {
		this.cTextolinea = cTextolinea;
	}

	public String getCTextolinea2() {
		return this.cTextolinea2;
	}

	public void setCTextolinea2(String cTextolinea2) {
		this.cTextolinea2 = cTextolinea2;
	}

	public String getCTiporegistro() {
		return this.cTiporegistro;
	}

	public void setCTiporegistro(String cTiporegistro) {
		this.cTiporegistro = cTiporegistro;
	}

}