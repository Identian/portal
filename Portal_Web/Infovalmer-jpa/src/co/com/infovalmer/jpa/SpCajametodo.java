package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_cajametodo database table.
 * 
 */
@Entity
@Table(name="sp_cajametodo")
@NamedQuery(name="SpCajametodo.findAll", query="SELECT s FROM SpCajametodo s")
public class SpCajametodo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpCajametodoPK id;

	@Column(name="i_curvafiltro")
	private byte iCurvafiltro;

	public SpCajametodo() {
	}

	public SpCajametodoPK getId() {
		return this.id;
	}

	public void setId(SpCajametodoPK id) {
		this.id = id;
	}

	public byte getICurvafiltro() {
		return this.iCurvafiltro;
	}

	public void setICurvafiltro(byte iCurvafiltro) {
		this.iCurvafiltro = iCurvafiltro;
	}

}