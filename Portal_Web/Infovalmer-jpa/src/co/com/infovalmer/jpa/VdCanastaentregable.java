package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vd_canastaentregables database table.
 * 
 */
@Entity
@Table(name="vd_canastaentregables")
@NamedQuery(name="VdCanastaentregable.findAll", query="SELECT v FROM VdCanastaentregable v")
public class VdCanastaentregable implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VdCanastaentregablePK id;

	public VdCanastaentregable() {
	}

	public VdCanastaentregablePK getId() {
		return this.id;
	}

	public void setId(VdCanastaentregablePK id) {
		this.id = id;
	}

}