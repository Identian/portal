package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_dgrupcalcion database table.
 * 
 */
@Entity
@Table(name="sp_dgrupcalcion")
@NamedQuery(name="SpDgrupcalcion.findAll", query="SELECT s FROM SpDgrupcalcion s")
public class SpDgrupcalcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpDgrupcalcionPK id;

	@Column(name="i_dgrupcal")
	private int iDgrupcal;

	public SpDgrupcalcion() {
	}

	public SpDgrupcalcionPK getId() {
		return this.id;
	}

	public void setId(SpDgrupcalcionPK id) {
		this.id = id;
	}

	public int getIDgrupcal() {
		return this.iDgrupcal;
	}

	public void setIDgrupcal(int iDgrupcal) {
		this.iDgrupcal = iDgrupcal;
	}

}