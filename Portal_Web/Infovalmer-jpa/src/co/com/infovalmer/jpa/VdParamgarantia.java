package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vd_paramgarantia database table.
 * 
 */
@Entity
@Table(name="vd_paramgarantia")
@NamedQuery(name="VdParamgarantia.findAll", query="SELECT v FROM VdParamgarantia v")
public class VdParamgarantia implements Serializable {
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

	public VdParamgarantia() {
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