package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_imtipoauditoria database table.
 * 
 */
@Entity
@Table(name="sp_imtipoauditoria")
@NamedQuery(name="SpImtipoauditoria.findAll", query="SELECT s FROM SpImtipoauditoria s")
public class SpImtipoauditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_imtipoauditoria")
	private int iImtipoauditoria;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre_imtipoauditoria")
	private String cNombreImtipoauditoria;

	public SpImtipoauditoria() {
	}

	public int getIImtipoauditoria() {
		return this.iImtipoauditoria;
	}

	public void setIImtipoauditoria(int iImtipoauditoria) {
		this.iImtipoauditoria = iImtipoauditoria;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCNombreImtipoauditoria() {
		return this.cNombreImtipoauditoria;
	}

	public void setCNombreImtipoauditoria(String cNombreImtipoauditoria) {
		this.cNombreImtipoauditoria = cNombreImtipoauditoria;
	}

}