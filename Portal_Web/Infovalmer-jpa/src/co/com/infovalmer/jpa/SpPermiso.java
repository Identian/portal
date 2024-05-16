package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_permiso database table.
 * 
 */
@Entity
@Table(name="sp_permiso")
@NamedQuery(name="SpPermiso.findAll", query="SELECT s FROM SpPermiso s")
public class SpPermiso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_permiso")
	private int iPermiso;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horafinpermiso")
	private Date dtHorafinpermiso;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horainipermiso")
	private Date dtHorainipermiso;

	@Column(name="i_accionbd")
	private int iAccionbd;

	@Column(name="i_modulosistema")
	private int iModulosistema;

	@Column(name="i_opcionmodulo")
	private int iOpcionmodulo;

	@Column(name="i_perfil")
	private int iPerfil;

	public SpPermiso() {
	}

	public int getIPermiso() {
		return this.iPermiso;
	}

	public void setIPermiso(int iPermiso) {
		this.iPermiso = iPermiso;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public Date getDtHorafinpermiso() {
		return this.dtHorafinpermiso;
	}

	public void setDtHorafinpermiso(Date dtHorafinpermiso) {
		this.dtHorafinpermiso = dtHorafinpermiso;
	}

	public Date getDtHorainipermiso() {
		return this.dtHorainipermiso;
	}

	public void setDtHorainipermiso(Date dtHorainipermiso) {
		this.dtHorainipermiso = dtHorainipermiso;
	}

	public int getIAccionbd() {
		return this.iAccionbd;
	}

	public void setIAccionbd(int iAccionbd) {
		this.iAccionbd = iAccionbd;
	}

	public int getIModulosistema() {
		return this.iModulosistema;
	}

	public void setIModulosistema(int iModulosistema) {
		this.iModulosistema = iModulosistema;
	}

	public int getIOpcionmodulo() {
		return this.iOpcionmodulo;
	}

	public void setIOpcionmodulo(int iOpcionmodulo) {
		this.iOpcionmodulo = iOpcionmodulo;
	}

	public int getIPerfil() {
		return this.iPerfil;
	}

	public void setIPerfil(int iPerfil) {
		this.iPerfil = iPerfil;
	}

}