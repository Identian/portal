package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_dusuaservic database table.
 * 
 */
@Entity
@Table(name="sp_dusuaservic")
@NamedQuery(name="SpDusuaservic.findAll", query="SELECT s FROM SpDusuaservic s")
public class SpDusuaservic implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpDusuaservicPK id;

	@Column(name="c_descripcionuso")
	private String cDescripcionuso;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horafinuso")
	private Date dtHorafinuso;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horainiciouso")
	private Date dtHorainiciouso;

	public SpDusuaservic() {
	}

	public SpDusuaservicPK getId() {
		return this.id;
	}

	public void setId(SpDusuaservicPK id) {
		this.id = id;
	}

	public String getCDescripcionuso() {
		return this.cDescripcionuso;
	}

	public void setCDescripcionuso(String cDescripcionuso) {
		this.cDescripcionuso = cDescripcionuso;
	}

	public Date getDtHorafinuso() {
		return this.dtHorafinuso;
	}

	public void setDtHorafinuso(Date dtHorafinuso) {
		this.dtHorafinuso = dtHorafinuso;
	}

	public Date getDtHorainiciouso() {
		return this.dtHorainiciouso;
	}

	public void setDtHorainiciouso(Date dtHorainiciouso) {
		this.dtHorainiciouso = dtHorainiciouso;
	}

}