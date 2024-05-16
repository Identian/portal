package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_tipomoneda database table.
 * 
 */
@Entity
@Table(name="sp_tipomoneda")
@NamedQuery(name="SpTipomoneda.findAll", query="SELECT s FROM SpTipomoneda s")
public class SpTipomoneda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_tipomoneda")
	private String cTipomoneda;

	@Column(name="c_casoespecial")
	private String cCasoespecial;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_estado")
	private String cEstado;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_vigencia")
	private String cVigencia;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechafin")
	private Date dFechafin;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaini")
	private Date dFechaini;

	@Column(name="i_grupomoneda")
	private byte iGrupomoneda;

	public SpTipomoneda() {
	}

	public String getCTipomoneda() {
		return this.cTipomoneda;
	}

	public void setCTipomoneda(String cTipomoneda) {
		this.cTipomoneda = cTipomoneda;
	}

	public String getCCasoespecial() {
		return this.cCasoespecial;
	}

	public void setCCasoespecial(String cCasoespecial) {
		this.cCasoespecial = cCasoespecial;
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

	public String getCVigencia() {
		return this.cVigencia;
	}

	public void setCVigencia(String cVigencia) {
		this.cVigencia = cVigencia;
	}

	public Date getDFechafin() {
		return this.dFechafin;
	}

	public void setDFechafin(Date dFechafin) {
		this.dFechafin = dFechafin;
	}

	public Date getDFechaini() {
		return this.dFechaini;
	}

	public void setDFechaini(Date dFechaini) {
		this.dFechaini = dFechaini;
	}

	public byte getIGrupomoneda() {
		return this.iGrupomoneda;
	}

	public void setIGrupomoneda(byte iGrupomoneda) {
		this.iGrupomoneda = iGrupomoneda;
	}

}