package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_calificacion database table.
 * 
 */
@Entity
@Table(name="sp_calificacion")
@NamedQuery(name="SpCalificacion.findAll", query="SELECT s FROM SpCalificacion s")
public class SpCalificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpCalificacionPK id;

	public SpCalificacion() {
	}

	public SpCalificacionPK getId() {
		return this.id;
	}

	public void setId(SpCalificacionPK id) {
		this.id = id;
	}

}