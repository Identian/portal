package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the va_parametro database table.
 * 
 */
@Entity
@Table(name="va_parametro")
@NamedQuery(name="VaParametro.findAll", query="SELECT v FROM VaParametro v")
public class VaParametro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_parametro")
	private int iParametro;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_valor")
	private String cValor;

	public VaParametro() {
	}

	public int getIParametro() {
		return this.iParametro;
	}

	public void setIParametro(int iParametro) {
		this.iParametro = iParametro;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCValor() {
		return this.cValor;
	}

	public void setCValor(String cValor) {
		this.cValor = cValor;
	}

}