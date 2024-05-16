package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_festivo database table.
 * 
 */
@Entity
@Table(name="sp_festivo")
@NamedQuery(name="SpFestivo.findAll", query="SELECT s FROM SpFestivo s")
public class SpFestivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private Date dFecha;

	public SpFestivo() {
	}

	public Date getDFecha() {
		return this.dFecha;
	}

	public void setDFecha(Date dFecha) {
		this.dFecha = dFecha;
	}

}