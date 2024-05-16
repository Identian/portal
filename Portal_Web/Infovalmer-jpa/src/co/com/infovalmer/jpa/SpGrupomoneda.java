package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_grupomoneda database table.
 * 
 */
@Entity
@Table(name="sp_grupomoneda")
@NamedQuery(name="SpGrupomoneda.findAll", query="SELECT s FROM SpGrupomoneda s")
public class SpGrupomoneda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_grupomoneda")
	private byte iGrupomoneda;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_estado")
	private String cEstado;

	@Column(name="c_nombre")
	private String cNombre;

	@Lob
	@Column(name="t_convencion")
	private String tConvencion;

	public SpGrupomoneda() {
	}

	public byte getIGrupomoneda() {
		return this.iGrupomoneda;
	}

	public void setIGrupomoneda(byte iGrupomoneda) {
		this.iGrupomoneda = iGrupomoneda;
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

	public String getTConvencion() {
		return this.tConvencion;
	}

	public void setTConvencion(String tConvencion) {
		this.tConvencion = tConvencion;
	}

}