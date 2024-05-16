package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sp_indipc database table.
 * 
 */
@Entity
@Table(name="sp_indipc")
@NamedQuery(name="SpIndipc.findAll", query="SELECT s FROM SpIndipc s")
public class SpIndipc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private Date dFecha;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecpub")
	private Date dFecpub;

	@Column(name="e_valor")
	private BigDecimal eValor;

	public SpIndipc() {
	}

	public Date getDFecha() {
		return this.dFecha;
	}

	public void setDFecha(Date dFecha) {
		this.dFecha = dFecha;
	}

	public Date getDFecpub() {
		return this.dFecpub;
	}

	public void setDFecpub(Date dFecpub) {
		this.dFecpub = dFecpub;
	}

	public BigDecimal getEValor() {
		return this.eValor;
	}

	public void setEValor(BigDecimal eValor) {
		this.eValor = eValor;
	}

}