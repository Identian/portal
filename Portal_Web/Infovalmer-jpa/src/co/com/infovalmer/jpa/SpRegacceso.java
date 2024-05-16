package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_regacceso database table.
 * 
 */
@Entity
@Table(name="sp_regacceso")
@NamedQuery(name="SpRegacceso.findAll", query="SELECT s FROM SpRegacceso s")
public class SpRegacceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_regacceso")
	private byte iRegacceso;

	@Column(name="c_estadoacceso")
	private String cEstadoacceso;

	@Column(name="c_ipmaquina")
	private String cIpmaquina;

	@Column(name="c_maquina")
	private String cMaquina;

	@Column(name="c_usudesbqueo")
	private String cUsudesbqueo;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private Date dFecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horadesbqueo")
	private Date dtHoradesbqueo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horafin")
	private Date dtHorafin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horainicio")
	private Date dtHorainicio;

	@Column(name="i_dispoautentica")
	private byte iDispoautentica;

	@Column(name="i_perfil")
	private byte iPerfil;

	@Column(name="i_usuario")
	private byte iUsuario;

	public SpRegacceso() {
	}

	public byte getIRegacceso() {
		return this.iRegacceso;
	}

	public void setIRegacceso(byte iRegacceso) {
		this.iRegacceso = iRegacceso;
	}

	public String getCEstadoacceso() {
		return this.cEstadoacceso;
	}

	public void setCEstadoacceso(String cEstadoacceso) {
		this.cEstadoacceso = cEstadoacceso;
	}

	public String getCIpmaquina() {
		return this.cIpmaquina;
	}

	public void setCIpmaquina(String cIpmaquina) {
		this.cIpmaquina = cIpmaquina;
	}

	public String getCMaquina() {
		return this.cMaquina;
	}

	public void setCMaquina(String cMaquina) {
		this.cMaquina = cMaquina;
	}

	public String getCUsudesbqueo() {
		return this.cUsudesbqueo;
	}

	public void setCUsudesbqueo(String cUsudesbqueo) {
		this.cUsudesbqueo = cUsudesbqueo;
	}

	public Date getDFecha() {
		return this.dFecha;
	}

	public void setDFecha(Date dFecha) {
		this.dFecha = dFecha;
	}

	public Date getDtHoradesbqueo() {
		return this.dtHoradesbqueo;
	}

	public void setDtHoradesbqueo(Date dtHoradesbqueo) {
		this.dtHoradesbqueo = dtHoradesbqueo;
	}

	public Date getDtHorafin() {
		return this.dtHorafin;
	}

	public void setDtHorafin(Date dtHorafin) {
		this.dtHorafin = dtHorafin;
	}

	public Date getDtHorainicio() {
		return this.dtHorainicio;
	}

	public void setDtHorainicio(Date dtHorainicio) {
		this.dtHorainicio = dtHorainicio;
	}

	public byte getIDispoautentica() {
		return this.iDispoautentica;
	}

	public void setIDispoautentica(byte iDispoautentica) {
		this.iDispoautentica = iDispoautentica;
	}

	public byte getIPerfil() {
		return this.iPerfil;
	}

	public void setIPerfil(byte iPerfil) {
		this.iPerfil = iPerfil;
	}

	public byte getIUsuario() {
		return this.iUsuario;
	}

	public void setIUsuario(byte iUsuario) {
		this.iUsuario = iUsuario;
	}

}