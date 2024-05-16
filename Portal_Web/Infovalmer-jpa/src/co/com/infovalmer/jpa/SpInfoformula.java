package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_infoformula database table.
 * 
 */
@Entity
@Table(name="sp_infoformula")
@NamedQuery(name="SpInfoformula.findAll", query="SELECT s FROM SpInfoformula s")
public class SpInfoformula implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpInfoformulaPK id;

	@Column(name="c_tipaccionsbrereg")
	private String cTipaccionsbrereg;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaactlzacion")
	private Date dFechaactlzacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horaactlizacion")
	private Date dtHoraactlizacion;

	@Column(name="i_numregistro")
	private int iNumregistro;

	@Column(name="i_usuarioactualiza")
	private int iUsuarioactualiza;

	public SpInfoformula() {
	}

	public SpInfoformulaPK getId() {
		return this.id;
	}

	public void setId(SpInfoformulaPK id) {
		this.id = id;
	}

	public String getCTipaccionsbrereg() {
		return this.cTipaccionsbrereg;
	}

	public void setCTipaccionsbrereg(String cTipaccionsbrereg) {
		this.cTipaccionsbrereg = cTipaccionsbrereg;
	}

	public Date getDFechaactlzacion() {
		return this.dFechaactlzacion;
	}

	public void setDFechaactlzacion(Date dFechaactlzacion) {
		this.dFechaactlzacion = dFechaactlzacion;
	}

	public Date getDtHoraactlizacion() {
		return this.dtHoraactlizacion;
	}

	public void setDtHoraactlizacion(Date dtHoraactlizacion) {
		this.dtHoraactlizacion = dtHoraactlizacion;
	}

	public int getINumregistro() {
		return this.iNumregistro;
	}

	public void setINumregistro(int iNumregistro) {
		this.iNumregistro = iNumregistro;
	}

	public int getIUsuarioactualiza() {
		return this.iUsuarioactualiza;
	}

	public void setIUsuarioactualiza(int iUsuarioactualiza) {
		this.iUsuarioactualiza = iUsuarioactualiza;
	}

}