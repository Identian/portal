package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ve_canastaentregables database table.
 * 
 */
@Entity
@Table(name="ve_canastaentregables")
@NamedQuery(name="VeCanastaentregable.findAll", query="SELECT v FROM VeCanastaentregable v")
public class VeCanastaentregable implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VeCanastaentregablePK id;

	public VeCanastaentregable() {
	}

	public VeCanastaentregablePK getId() {
		return this.id;
	}

	public void setId(VeCanastaentregablePK id) {
		this.id = id;
	}

}