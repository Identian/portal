package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the po_curva database table.
 * 
 */
@Entity
@Table(name="po_curva")
@NamedQuery(name="PoCurva.findAll", query="SELECT p FROM PoCurva p")
public class PoCurva implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_curva")
	private int iCurva;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private Date dFecha;

	@Column(name="i_tipocurva")
	private int iTipocurva;

	public PoCurva() {
	}

	public int getICurva() {
		return this.iCurva;
	}

	public void setICurva(int iCurva) {
		this.iCurva = iCurva;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public Date getDFecha() {
		return this.dFecha;
	}

	public void setDFecha(Date dFecha) {
		this.dFecha = dFecha;
	}

	public int getITipocurva() {
		return this.iTipocurva;
	}

	public void setITipocurva(int iTipocurva) {
		this.iTipocurva = iTipocurva;
	}

}