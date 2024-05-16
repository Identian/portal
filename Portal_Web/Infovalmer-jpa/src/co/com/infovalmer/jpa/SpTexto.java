package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_texto database table.
 * 
 */
@Entity
@Table(name="sp_texto")
@NamedQuery(name="SpTexto.findAll", query="SELECT s FROM SpTexto s")
public class SpTexto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpTextoPK id;

	@Column(name="c_nombretexto")
	private String cNombretexto;

	@Column(name="i_posicion")
	private int iPosicion;

	@Lob
	@Column(name="t_text")
	private String tText;

	public SpTexto() {
	}

	public SpTextoPK getId() {
		return this.id;
	}

	public void setId(SpTextoPK id) {
		this.id = id;
	}

	public String getCNombretexto() {
		return this.cNombretexto;
	}

	public void setCNombretexto(String cNombretexto) {
		this.cNombretexto = cNombretexto;
	}

	public int getIPosicion() {
		return this.iPosicion;
	}

	public void setIPosicion(int iPosicion) {
		this.iPosicion = iPosicion;
	}

	public String getTText() {
		return this.tText;
	}

	public void setTText(String tText) {
		this.tText = tText;
	}

}