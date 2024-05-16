package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_rangvencimi database table.
 * 
 */
@Entity
@Table(name="sp_rangvencimi")
@NamedQuery(name="SpRangvencimi.findAll", query="SELECT s FROM SpRangvencimi s")
public class SpRangvencimi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_rangvencimi")
	private byte iRangvencimi;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="i_rangofin")
	private int iRangofin;

	@Column(name="i_rangoinicio")
	private int iRangoinicio;

	public SpRangvencimi() {
	}

	public byte getIRangvencimi() {
		return this.iRangvencimi;
	}

	public void setIRangvencimi(byte iRangvencimi) {
		this.iRangvencimi = iRangvencimi;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public int getIRangofin() {
		return this.iRangofin;
	}

	public void setIRangofin(int iRangofin) {
		this.iRangofin = iRangofin;
	}

	public int getIRangoinicio() {
		return this.iRangoinicio;
	}

	public void setIRangoinicio(int iRangoinicio) {
		this.iRangoinicio = iRangoinicio;
	}

}