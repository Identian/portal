package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the va_nemoportafolio database table.
 * 
 */
@Entity
@Table(name="va_nemoportafolio")
@NamedQuery(name="VaNemoportafolio.findAll", query="SELECT v FROM VaNemoportafolio v")
public class VaNemoportafolio implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VaNemoportafolioPK id;

	@Column(name="i_numacciones")
	private int iNumacciones;

	public VaNemoportafolio() {
	}

	public VaNemoportafolioPK getId() {
		return this.id;
	}

	public void setId(VaNemoportafolioPK id) {
		this.id = id;
	}

	public int getINumacciones() {
		return this.iNumacciones;
	}

	public void setINumacciones(int iNumacciones) {
		this.iNumacciones = iNumacciones;
	}

}