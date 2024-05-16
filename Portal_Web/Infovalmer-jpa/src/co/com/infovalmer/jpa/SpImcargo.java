package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_imcargo database table.
 * 
 */
@Entity
@Table(name="sp_imcargo")
@NamedQuery(name="SpImcargo.findAll", query="SELECT s FROM SpImcargo s")
public class SpImcargo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_imcargo")
	private int iImcargo;

	@Column(name="c_nombre_imcargo")
	private String cNombreImcargo;

	public SpImcargo() {
	}

	public int getIImcargo() {
		return this.iImcargo;
	}

	public void setIImcargo(int iImcargo) {
		this.iImcargo = iImcargo;
	}

	public String getCNombreImcargo() {
		return this.cNombreImcargo;
	}

	public void setCNombreImcargo(String cNombreImcargo) {
		this.cNombreImcargo = cNombreImcargo;
	}

}