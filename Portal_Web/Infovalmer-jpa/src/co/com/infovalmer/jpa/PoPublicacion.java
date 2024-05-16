package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the po_publicacion database table.
 * 
 */
@Entity
@Table(name="po_publicacion")
@NamedQuery(name="PoPublicacion.findAll", query="SELECT p FROM PoPublicacion p")
public class PoPublicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_mercado")
	private int iMercado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="d_fecha_publicacion")
	private Date dFechaPublicacion;

	public PoPublicacion() {
	}

	public int getIMercado() {
		return this.iMercado;
	}

	public void setIMercado(int iMercado) {
		this.iMercado = iMercado;
	}

	public Date getDFechaPublicacion() {
		return this.dFechaPublicacion;
	}

	public void setDFechaPublicacion(Date dFechaPublicacion) {
		this.dFechaPublicacion = dFechaPublicacion;
	}

}