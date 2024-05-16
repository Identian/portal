package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sp_servicio database table.
 * 
 */
@Entity
@Table(name="sp_servicio")
@NamedQuery(name="SpServicio.findAll", query="SELECT s FROM SpServicio s")
public class SpServicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_servicio")
	private byte iServicio;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_ubicacion")
	private String cUbicacion;

	@Column(name="e_cantexistente")
	private BigDecimal eCantexistente;

	@Column(name="i_tiposervicio")
	private byte iTiposervicio;

	public SpServicio() {
	}

	public byte getIServicio() {
		return this.iServicio;
	}

	public void setIServicio(byte iServicio) {
		this.iServicio = iServicio;
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

	public String getCUbicacion() {
		return this.cUbicacion;
	}

	public void setCUbicacion(String cUbicacion) {
		this.cUbicacion = cUbicacion;
	}

	public BigDecimal getECantexistente() {
		return this.eCantexistente;
	}

	public void setECantexistente(BigDecimal eCantexistente) {
		this.eCantexistente = eCantexistente;
	}

	public byte getITiposervicio() {
		return this.iTiposervicio;
	}

	public void setITiposervicio(byte iTiposervicio) {
		this.iTiposervicio = iTiposervicio;
	}

}