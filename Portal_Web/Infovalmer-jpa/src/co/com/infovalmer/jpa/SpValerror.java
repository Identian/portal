package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_valerror database table.
 * 
 */
@Entity
@Table(name="sp_valerror")
@NamedQuery(name="SpValerror.findAll", query="SELECT s FROM SpValerror s")
public class SpValerror implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_numero")
	private byte iNumero;

	@Column(name="c_descripcion")
	private String cDescripcion;

	public SpValerror() {
	}

	public byte getINumero() {
		return this.iNumero;
	}

	public void setINumero(byte iNumero) {
		this.iNumero = iNumero;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

}