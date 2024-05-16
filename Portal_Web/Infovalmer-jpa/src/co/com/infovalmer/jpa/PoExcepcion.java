package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_excepcion database table.
 * 
 */
@Entity
@Table(name="po_excepcion")
@NamedQuery(name="PoExcepcion.findAll", query="SELECT p FROM PoExcepcion p")
public class PoExcepcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="I_CODIGO")
	private int iCodigo;

	@Column(name="C_IDIOMA")
	private String cIdioma;

	@Column(name="C_VALOR")
	private String cValor;

	public PoExcepcion() {
	}

	public int getICodigo() {
		return this.iCodigo;
	}

	public void setICodigo(int iCodigo) {
		this.iCodigo = iCodigo;
	}

	public String getCIdioma() {
		return this.cIdioma;
	}

	public void setCIdioma(String cIdioma) {
		this.cIdioma = cIdioma;
	}

	public String getCValor() {
		return this.cValor;
	}

	public void setCValor(String cValor) {
		this.cValor = cValor;
	}

}