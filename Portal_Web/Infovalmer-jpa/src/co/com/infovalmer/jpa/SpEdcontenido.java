package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_edcontenido database table.
 * 
 */
@Entity
@Table(name="sp_edcontenido")
@NamedQuery(name="SpEdcontenido.findAll", query="SELECT s FROM SpEdcontenido s")
public class SpEdcontenido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_paginaayuda")
	private int iPaginaayuda;

	@Lob
	@Column(name="c_contenido")
	private String cContenido;

	public SpEdcontenido() {
	}

	public int getIPaginaayuda() {
		return this.iPaginaayuda;
	}

	public void setIPaginaayuda(int iPaginaayuda) {
		this.iPaginaayuda = iPaginaayuda;
	}

	public String getCContenido() {
		return this.cContenido;
	}

	public void setCContenido(String cContenido) {
		this.cContenido = cContenido;
	}

}