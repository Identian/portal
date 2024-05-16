package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vd_publicacion database table.
 * 
 */
@Entity
@Table(name="vd_publicacion")
@NamedQuery(name="VdPublicacion.findAll", query="SELECT v FROM VdPublicacion v")
public class VdPublicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horapublicacion")
	private Date dtHorapublicacion;

	@Column(name="c_usuario")
	private String cUsuario;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private Date dFecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horaimpugnacion")
	private Date dtHoraimpugnacion;

	@Column(name="i_tiempoimpugnacion")
	private int iTiempoimpugnacion;

	public VdPublicacion() {
	}

	public Date getDtHorapublicacion() {
		return this.dtHorapublicacion;
	}

	public void setDtHorapublicacion(Date dtHorapublicacion) {
		this.dtHorapublicacion = dtHorapublicacion;
	}

	public String getCUsuario() {
		return this.cUsuario;
	}

	public void setCUsuario(String cUsuario) {
		this.cUsuario = cUsuario;
	}

	public Date getDFecha() {
		return this.dFecha;
	}

	public void setDFecha(Date dFecha) {
		this.dFecha = dFecha;
	}

	public Date getDtHoraimpugnacion() {
		return this.dtHoraimpugnacion;
	}

	public void setDtHoraimpugnacion(Date dtHoraimpugnacion) {
		this.dtHoraimpugnacion = dtHoraimpugnacion;
	}

	public int getITiempoimpugnacion() {
		return this.iTiempoimpugnacion;
	}

	public void setITiempoimpugnacion(int iTiempoimpugnacion) {
		this.iTiempoimpugnacion = iTiempoimpugnacion;
	}

}