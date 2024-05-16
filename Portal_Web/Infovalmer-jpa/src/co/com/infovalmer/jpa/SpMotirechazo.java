package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_motirechazo database table.
 * 
 */
@Entity
@Table(name="sp_motirechazo")
@NamedQuery(name="SpMotirechazo.findAll", query="SELECT s FROM SpMotirechazo s")
public class SpMotirechazo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_motivorechazo")
	private byte iMotivorechazo;

	@Column(name="c_descripcion")
	private String cDescripcion;

	public SpMotirechazo() {
	}

	public byte getIMotivorechazo() {
		return this.iMotivorechazo;
	}

	public void setIMotivorechazo(byte iMotivorechazo) {
		this.iMotivorechazo = iMotivorechazo;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

}