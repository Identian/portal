package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ad_log_accion database table.
 * 
 */
@Entity
@Table(name="ad_log_accion")
@NamedQuery(name="AdLogAccion.findAll", query="SELECT a FROM AdLogAccion a")
public class AdLogAccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_accion")
	private int iAccion;

	@Column(name="c_accion")
	private String cAccion;

	@Column(name="c_sql")
	private String cSql;

	public AdLogAccion() {
	}

	public int getIAccion() {
		return this.iAccion;
	}

	public void setIAccion(int iAccion) {
		this.iAccion = iAccion;
	}

	public String getCAccion() {
		return this.cAccion;
	}

	public void setCAccion(String cAccion) {
		this.cAccion = cAccion;
	}

	public String getCSql() {
		return this.cSql;
	}

	public void setCSql(String cSql) {
		this.cSql = cSql;
	}

}