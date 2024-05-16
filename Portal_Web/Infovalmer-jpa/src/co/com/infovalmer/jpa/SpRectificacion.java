package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_rectificacion database table.
 * 
 */
@Entity
@Table(name="sp_rectificacion")
@NamedQuery(name="SpRectificacion.findAll", query="SELECT s FROM SpRectificacion s")
public class SpRectificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_rectificacion")
	private int iRectificacion;

	@Column(name="c_tipo")
	private String cTipo;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private Date dFecha;

	@Lob
	@Column(name="t_texto")
	private String tTexto;

	public SpRectificacion() {
	}

	public int getIRectificacion() {
		return this.iRectificacion;
	}

	public void setIRectificacion(int iRectificacion) {
		this.iRectificacion = iRectificacion;
	}

	public String getCTipo() {
		return this.cTipo;
	}

	public void setCTipo(String cTipo) {
		this.cTipo = cTipo;
	}

	public Date getDFecha() {
		return this.dFecha;
	}

	public void setDFecha(Date dFecha) {
		this.dFecha = dFecha;
	}

	public String getTTexto() {
		return this.tTexto;
	}

	public void setTTexto(String tTexto) {
		this.tTexto = tTexto;
	}

}