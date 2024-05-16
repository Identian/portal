package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_proceso database table.
 * 
 */
@Entity
@Table(name="sp_proceso")
@NamedQuery(name="SpProceso.findAll", query="SELECT s FROM SpProceso s")
public class SpProceso implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="i_proceso")
	private int iProceso;
		
	@Column(name="c_nombre")
	private String cNombre;


	public SpProceso() {
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public int getIProceso() {
		return this.iProceso;
	}

	public void setIProceso(int iProceso) {
		this.iProceso = iProceso;
	}

}