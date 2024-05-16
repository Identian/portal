package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the po_eventos database table.
 * 
 */
@Entity
@Table(name="po_eventos")
@NamedQuery(name="PoEvento.findAll", query="SELECT p FROM PoEvento p")
public class PoEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_evento")
	private int iEvento;

	@Column(name="C_NOMBRE")
	private String cNombre;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHA")
	private Date dFecha;

	public PoEvento() {
	}

	public int getIEvento() {
		return this.iEvento;
	}

	public void setIEvento(int iEvento) {
		this.iEvento = iEvento;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public Date getDFecha() {
		return this.dFecha;
	}

	public void setDFecha(Date dFecha) {
		this.dFecha = dFecha;
	}

}