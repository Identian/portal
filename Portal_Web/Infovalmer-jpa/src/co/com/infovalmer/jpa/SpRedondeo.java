package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_redondeo database table.
 * 
 */
@Entity
@Table(name="sp_redondeo")
@NamedQuery(name="SpRedondeo.findAll", query="SELECT s FROM SpRedondeo s")
public class SpRedondeo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_tipo")
	private String cTipo;

	@Column(name="i_redcan")
	private int iRedcan;

	@Column(name="i_redmar")
	private int iRedmar;

	@Column(name="i_redmon")
	private int iRedmon;

	@Column(name="i_redpre")
	private int iRedpre;

	@Column(name="i_redtas")
	private int iRedtas;

	public SpRedondeo() {
	}

	public String getCTipo() {
		return this.cTipo;
	}

	public void setCTipo(String cTipo) {
		this.cTipo = cTipo;
	}

	public int getIRedcan() {
		return this.iRedcan;
	}

	public void setIRedcan(int iRedcan) {
		this.iRedcan = iRedcan;
	}

	public int getIRedmar() {
		return this.iRedmar;
	}

	public void setIRedmar(int iRedmar) {
		this.iRedmar = iRedmar;
	}

	public int getIRedmon() {
		return this.iRedmon;
	}

	public void setIRedmon(int iRedmon) {
		this.iRedmon = iRedmon;
	}

	public int getIRedpre() {
		return this.iRedpre;
	}

	public void setIRedpre(int iRedpre) {
		this.iRedpre = iRedpre;
	}

	public int getIRedtas() {
		return this.iRedtas;
	}

	public void setIRedtas(int iRedtas) {
		this.iRedtas = iRedtas;
	}

}