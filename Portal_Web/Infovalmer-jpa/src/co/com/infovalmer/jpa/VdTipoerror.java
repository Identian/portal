package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vd_tipoerror database table.
 * 
 */
@Entity
@Table(name="vd_tipoerror")
@NamedQuery(name="VdTipoerror.findAll", query="SELECT v FROM VdTipoerror v")
public class VdTipoerror implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int i_tipoError;

	private String descripcionError;

	public VdTipoerror() {
	}

	public int getI_tipoError() {
		return this.i_tipoError;
	}

	public void setI_tipoError(int i_tipoError) {
		this.i_tipoError = i_tipoError;
	}

	public String getDescripcionError() {
		return this.descripcionError;
	}

	public void setDescripcionError(String descripcionError) {
		this.descripcionError = descripcionError;
	}

}