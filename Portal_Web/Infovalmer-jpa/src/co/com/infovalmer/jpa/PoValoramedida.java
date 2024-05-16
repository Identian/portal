package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the po_valoramedida database table.
 * 
 */
@Entity
@Table(name="po_valoramedida")
@NamedQuery(name="PoValoramedida.findAll", query="SELECT p FROM PoValoramedida p")
public class PoValoramedida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="I_VALORAAMEDIDA")
	private int iValoraamedida;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHASOLICITUD")
	private Date dFechasolicitud;

	@Column(name="I_CODIGOSUSCRIPTOR")
	private int iCodigosuscriptor;

	public PoValoramedida() {
	}

	public int getIValoraamedida() {
		return this.iValoraamedida;
	}

	public void setIValoraamedida(int iValoraamedida) {
		this.iValoraamedida = iValoraamedida;
	}

	public Date getDFechasolicitud() {
		return this.dFechasolicitud;
	}

	public void setDFechasolicitud(Date dFechasolicitud) {
		this.dFechasolicitud = dFechasolicitud;
	}

	public int getICodigosuscriptor() {
		return this.iCodigosuscriptor;
	}

	public void setICodigosuscriptor(int iCodigosuscriptor) {
		this.iCodigosuscriptor = iCodigosuscriptor;
	}

}