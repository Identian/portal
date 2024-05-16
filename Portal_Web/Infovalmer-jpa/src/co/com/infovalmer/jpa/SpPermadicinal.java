package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_permadicinal database table.
 * 
 */
@Entity
@Table(name="sp_permadicinal")
@NamedQuery(name="SpPermadicinal.findAll", query="SELECT s FROM SpPermadicinal s")
public class SpPermadicinal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_permadicional")
	private byte iPermadicional;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private Date dFecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horafin")
	private Date dtHorafin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horainicio")
	private Date dtHorainicio;

	@Column(name="i_accionbd")
	private byte iAccionbd;

	@Column(name="i_modulosistema")
	private byte iModulosistema;

	@Column(name="i_opcionmodulo")
	private byte iOpcionmodulo;

	@Column(name="i_perfil")
	private byte iPerfil;

	@Column(name="i_tablafuncion")
	private byte iTablafuncion;

	@Column(name="i_usuario")
	private byte iUsuario;

	public SpPermadicinal() {
	}

	public byte getIPermadicional() {
		return this.iPermadicional;
	}

	public void setIPermadicional(byte iPermadicional) {
		this.iPermadicional = iPermadicional;
	}

	public Date getDFecha() {
		return this.dFecha;
	}

	public void setDFecha(Date dFecha) {
		this.dFecha = dFecha;
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

	public byte getIAccionbd() {
		return this.iAccionbd;
	}

	public void setIAccionbd(byte iAccionbd) {
		this.iAccionbd = iAccionbd;
	}

	public byte getIModulosistema() {
		return this.iModulosistema;
	}

	public void setIModulosistema(byte iModulosistema) {
		this.iModulosistema = iModulosistema;
	}

	public byte getIOpcionmodulo() {
		return this.iOpcionmodulo;
	}

	public void setIOpcionmodulo(byte iOpcionmodulo) {
		this.iOpcionmodulo = iOpcionmodulo;
	}

	public byte getIPerfil() {
		return this.iPerfil;
	}

	public void setIPerfil(byte iPerfil) {
		this.iPerfil = iPerfil;
	}

	public byte getITablafuncion() {
		return this.iTablafuncion;
	}

	public void setITablafuncion(byte iTablafuncion) {
		this.iTablafuncion = iTablafuncion;
	}

	public byte getIUsuario() {
		return this.iUsuario;
	}

	public void setIUsuario(byte iUsuario) {
		this.iUsuario = iUsuario;
	}

}