package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_acceso_opcion database table.
 * 
 */
@Entity
@Table(name="po_acceso_opcion")
@NamedQuery(name="PoAccesoOpcion.findAll", query="SELECT p FROM PoAccesoOpcion p")
public class PoAccesoOpcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PoAccesoOpcionPK id;

	public PoAccesoOpcion() {
	}

	public PoAccesoOpcionPK getId() {
		return this.id;
	}

	public void setId(PoAccesoOpcionPK id) {
		this.id = id;
	}

}