package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_breves database table.
 * 
 */
@Entity
@Table(name="sp_breves")
@NamedQuery(name="SpBreve.findAll", query="SELECT s FROM SpBreve s")
public class SpBreve implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpBrevePK id;

	@Column(name="i_orden")
	private int iOrden;

	@Lob
	@Column(name="t_texto")
	private String tTexto;

	public SpBreve() {
	}

	public SpBrevePK getId() {
		return this.id;
	}

	public void setId(SpBrevePK id) {
		this.id = id;
	}

	public int getIOrden() {
		return this.iOrden;
	}

	public void setIOrden(int iOrden) {
		this.iOrden = iOrden;
	}

	public String getTTexto() {
		return this.tTexto;
	}

	public void setTTexto(String tTexto) {
		this.tTexto = tTexto;
	}

}