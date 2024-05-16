package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_grupotasa database table.
 * 
 */
@Entity
@Table(name="sp_grupotasa")
@NamedQuery(name="SpGrupotasa.findAll", query="SELECT s FROM SpGrupotasa s")
public class SpGrupotasa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_grupotasa")
	private byte iGrupotasa;

	@Lob
	@Column(name="c_convencion")
	private String cConvencion;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_estado")
	private String cEstado;

	@Column(name="c_nombre")
	private String cNombre;

	public SpGrupotasa() {
	}

	public byte getIGrupotasa() {
		return this.iGrupotasa;
	}

	public void setIGrupotasa(byte iGrupotasa) {
		this.iGrupotasa = iGrupotasa;
	}

	public String getCConvencion() {
		return this.cConvencion;
	}

	public void setCConvencion(String cConvencion) {
		this.cConvencion = cConvencion;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

}