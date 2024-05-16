package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sp_metodofiltro database table.
 * 
 */
@Entity
@Table(name="sp_metodofiltro")
@NamedQuery(name="SpMetodofiltro.findAll", query="SELECT s FROM SpMetodofiltro s")
public class SpMetodofiltro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_metodofiltro")
	private byte iMetodofiltro;

	@Column(name="c_amplitud")
	private String cAmplitud;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="e_preciocurva")
	private BigDecimal ePreciocurva;

	@Column(name="i_maxdiasmstra")
	private int iMaxdiasmstra;

	@Column(name="i_minfechamstra")
	private int iMinfechamstra;

	@Column(name="i_minoperamstra")
	private int iMinoperamstra;

	public SpMetodofiltro() {
	}

	public byte getIMetodofiltro() {
		return this.iMetodofiltro;
	}

	public void setIMetodofiltro(byte iMetodofiltro) {
		this.iMetodofiltro = iMetodofiltro;
	}

	public String getCAmplitud() {
		return this.cAmplitud;
	}

	public void setCAmplitud(String cAmplitud) {
		this.cAmplitud = cAmplitud;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public BigDecimal getEPreciocurva() {
		return this.ePreciocurva;
	}

	public void setEPreciocurva(BigDecimal ePreciocurva) {
		this.ePreciocurva = ePreciocurva;
	}

	public int getIMaxdiasmstra() {
		return this.iMaxdiasmstra;
	}

	public void setIMaxdiasmstra(int iMaxdiasmstra) {
		this.iMaxdiasmstra = iMaxdiasmstra;
	}

	public int getIMinfechamstra() {
		return this.iMinfechamstra;
	}

	public void setIMinfechamstra(int iMinfechamstra) {
		this.iMinfechamstra = iMinfechamstra;
	}

	public int getIMinoperamstra() {
		return this.iMinoperamstra;
	}

	public void setIMinoperamstra(int iMinoperamstra) {
		this.iMinoperamstra = iMinoperamstra;
	}

}