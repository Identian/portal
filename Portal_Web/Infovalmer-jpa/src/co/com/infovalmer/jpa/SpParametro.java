package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_parametro database table.
 * 
 */
@Entity
@Table(name="sp_parametro")
@NamedQuery(name="SpParametro.findAll", query="SELECT s FROM SpParametro s")
public class SpParametro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_parametro")
	private int iParametro;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_valor")
	private String cValor;

	@Column(name="i_tipodato")
	private byte iTipodato;

	public SpParametro() {
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

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getCValor() {
		return this.cValor;
	}

	public void setCValor(String cValor) {
		this.cValor = cValor;
	}

	public byte getITipodato() {
		return this.iTipodato;
	}

	public void setITipodato(byte iTipodato) {
		this.iTipodato = iTipodato;
	}

}