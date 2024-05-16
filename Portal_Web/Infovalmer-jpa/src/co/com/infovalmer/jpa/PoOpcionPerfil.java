package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_opcion_perfil database table.
 * 
 */
@Entity
@Table(name="po_opcion_perfil")
@NamedQuery(name="PoOpcionPerfil.findAll", query="SELECT p FROM PoOpcionPerfil p")
public class PoOpcionPerfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PoOpcionPerfilPK id;

	@Column(name="I_NUM_ACCESOS")
	private int iNumAccesos;

	public PoOpcionPerfil() {
	}

	public PoOpcionPerfilPK getId() {
		return this.id;
	}

	public void setId(PoOpcionPerfilPK id) {
		this.id = id;
	}

	public int getINumAccesos() {
		return this.iNumAccesos;
	}

	public void setINumAccesos(int iNumAccesos) {
		this.iNumAccesos = iNumAccesos;
	}

}