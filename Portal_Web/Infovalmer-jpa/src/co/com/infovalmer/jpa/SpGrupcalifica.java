package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_grupcalifica database table.
 * 
 */
@Entity
@Table(name="sp_grupcalifica")
@NamedQuery(name="SpGrupcalifica.findAll", query="SELECT s FROM SpGrupcalifica s")
public class SpGrupcalifica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_grupcalifica")
	private byte iGrupcalifica;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_estado")
	private String cEstado;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="i_escalavalor")
	private byte iEscalavalor;

	public SpGrupcalifica() {
	}

	public byte getIGrupcalifica() {
		return this.iGrupcalifica;
	}

	public void setIGrupcalifica(byte iGrupcalifica) {
		this.iGrupcalifica = iGrupcalifica;
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

	public byte getIEscalavalor() {
		return this.iEscalavalor;
	}

	public void setIEscalavalor(byte iEscalavalor) {
		this.iEscalavalor = iEscalavalor;
	}

}