package co.com.infovalmer.dto;

import java.io.Serializable;

public class ParametroDto implements Serializable {

	private static final long serialVersionUID = 7904911673289113808L;

	private int iParametro;

	private String cDescripcion;

	private String cNombre;

	private String cValor;

	private int iTipodato;

	public ParametroDto() {
		// TODO Auto-generated constructor stub
	}

	public int getiParametro() {
		return iParametro;
	}

	public void setiParametro(int iParametro) {
		this.iParametro = iParametro;
	}

	public String getcDescripcion() {
		return cDescripcion;
	}

	public void setcDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getcNombre() {
		return cNombre;
	}

	public void setcNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getcValor() {
		return cValor;
	}

	public void setcValor(String cValor) {
		this.cValor = cValor;
	}

	public int getiTipodato() {
		return iTipodato;
	}

	public void setiTipodato(int iTipodato) {
		this.iTipodato = iTipodato;
	}
}
