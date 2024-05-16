package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ad_logauditoria database table.
 * 
 */
@Entity
@Table(name="ad_logauditoria")
@NamedQuery(name="AdLogauditoria.findAll", query="SELECT a FROM AdLogauditoria a")
public class AdLogauditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_logauditoria")
	private int iLogauditoria;

	@Column(name="c_canal")
	private String cCanal;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_equipo")
	private String cEquipo;

	@Column(name="c_paginaingreso")
	private String cPaginaingreso;

	@Column(name="c_usuario")
	private String cUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horaingreso")
	private Date dtHoraingreso;

	@Column(name="i_tipoafectacion")
	private int iTipoafectacion;

	@Column(name="i_tipousuario")
	private int iTipousuario;

	@Lob
	@Column(name="t_sql")
	private String tSql;

	public AdLogauditoria() {
	}

	public int getILogauditoria() {
		return this.iLogauditoria;
	}

	public void setILogauditoria(int iLogauditoria) {
		this.iLogauditoria = iLogauditoria;
	}

	public String getCCanal() {
		return this.cCanal;
	}

	public void setCCanal(String cCanal) {
		this.cCanal = cCanal;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCEquipo() {
		return this.cEquipo;
	}

	public void setCEquipo(String cEquipo) {
		this.cEquipo = cEquipo;
	}

	public String getCPaginaingreso() {
		return this.cPaginaingreso;
	}

	public void setCPaginaingreso(String cPaginaingreso) {
		this.cPaginaingreso = cPaginaingreso;
	}

	public String getCUsuario() {
		return this.cUsuario;
	}

	public void setCUsuario(String cUsuario) {
		this.cUsuario = cUsuario;
	}

	public Date getDtHoraingreso() {
		return this.dtHoraingreso;
	}

	public void setDtHoraingreso(Date dtHoraingreso) {
		this.dtHoraingreso = dtHoraingreso;
	}

	public int getITipoafectacion() {
		return this.iTipoafectacion;
	}

	public void setITipoafectacion(int iTipoafectacion) {
		this.iTipoafectacion = iTipoafectacion;
	}

	public int getITipousuario() {
		return this.iTipousuario;
	}

	public void setITipousuario(int iTipousuario) {
		this.iTipousuario = iTipousuario;
	}

	public String getTSql() {
		return this.tSql;
	}

	public void setTSql(String tSql) {
		this.tSql = tSql;
	}

}