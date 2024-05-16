package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ve_paramgarantia database table.
 * 
 */
@Entity
@Table(name="ve_paramgarantia")
@NamedQuery(name="VeParamgarantia.findAll", query="SELECT v FROM VeParamgarantia v")
public class VeParamgarantia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_parametro")
	private int iParametro;

	@Lob
	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_valor")
	private String cValor;

	public VeParamgarantia() {
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