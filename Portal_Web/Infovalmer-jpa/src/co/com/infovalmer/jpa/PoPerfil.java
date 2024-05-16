package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the po_perfil database table.
 * 
 */
@Entity
@Table(name="po_perfil")
@NamedQuery(name="PoPerfil.findAll", query="SELECT p FROM PoPerfil p")
public class PoPerfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="I_PERFIL")
	private int iPerfil;

	@Column(name="c_curvas_otc")
	private String cCurvasOtc;

	@Lob
	@Column(name="c_descricpion")
	private String cDescricpion;

	@Lob
	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="C_NOMBRE")
	private String cNombre;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha_creacion")
	private Date dFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="d_vigencia")
	private Date dVigencia;

	@Column(name="i_costo")
	private int iCosto;

	public PoPerfil() {
	}

	public int getIPerfil() {
		return this.iPerfil;
	}

	public void setIPerfil(int iPerfil) {
		this.iPerfil = iPerfil;
	}

	public String getCCurvasOtc() {
		return this.cCurvasOtc;
	}

	public void setCCurvasOtc(String cCurvasOtc) {
		this.cCurvasOtc = cCurvasOtc;
	}

	public String getCDescricpion() {
		return this.cDescricpion;
	}

	public void setCDescricpion(String cDescricpion) {
		this.cDescricpion = cDescricpion;
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

	public Date getDFechaCreacion() {
		return this.dFechaCreacion;
	}

	public void setDFechaCreacion(Date dFechaCreacion) {
		this.dFechaCreacion = dFechaCreacion;
	}

	public Date getDVigencia() {
		return this.dVigencia;
	}

	public void setDVigencia(Date dVigencia) {
		this.dVigencia = dVigencia;
	}

	public int getICosto() {
		return this.iCosto;
	}

	public void setICosto(int iCosto) {
		this.iCosto = iCosto;
	}

}