package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_campauditad database table.
 * 
 */
@Entity
@Table(name="sp_campauditad")
@NamedQuery(name="SpCampauditad.findAll", query="SELECT s FROM SpCampauditad s")
public class SpCampauditad implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpCampauditadPK id;

	@Column(name="i_accionbd")
	private byte iAccionbd;

	public SpCampauditad() {
	}

	public SpCampauditadPK getId() {
		return this.id;
	}

	public void setId(SpCampauditadPK id) {
		this.id = id;
	}

	public byte getIAccionbd() {
		return this.iAccionbd;
	}

	public void setIAccionbd(byte iAccionbd) {
		this.iAccionbd = iAccionbd;
	}

}