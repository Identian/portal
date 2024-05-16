package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the va_indice database table.
 * 
 */
@Entity
@Table(name="va_indice")
@NamedQuery(name="VaIndice.findAll", query="SELECT v FROM VaIndice v")
public class VaIndice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_indice")
	private String cIndice;

	@Column(name="c_nombre")
	private String cNombre;

	public VaIndice() {
	}

	public String getCIndice() {
		return this.cIndice;
	}

	public void setCIndice(String cIndice) {
		this.cIndice = cIndice;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

}