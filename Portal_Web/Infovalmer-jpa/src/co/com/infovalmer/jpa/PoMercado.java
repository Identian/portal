package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_mercado database table.
 * 
 */
@Entity
@Table(name="po_mercado")
@NamedQuery(name="PoMercado.findAll", query="SELECT p FROM PoMercado p")
public class PoMercado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="I_MERCADO")
	private int iMercado;

	@Column(name="C_NOMBRE")
	private String cNombre;

	public PoMercado() {
	}

	public int getIMercado() {
		return this.iMercado;
	}

	public void setIMercado(int iMercado) {
		this.iMercado = iMercado;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

}