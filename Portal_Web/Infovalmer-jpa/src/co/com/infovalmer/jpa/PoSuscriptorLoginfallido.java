package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_suscriptor_loginfallidos database table.
 * 
 */
@Entity
@Table(name="po_suscriptor_loginfallidos")
@NamedQuery(name="PoSuscriptorLoginfallido.findAll", query="SELECT p FROM PoSuscriptorLoginfallido p")
public class PoSuscriptorLoginfallido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="I_CODIGOSUSCRIPTOR")
	private int iCodigosuscriptor;

	@Column(name="i_intentos")
	private int iIntentos;

	public PoSuscriptorLoginfallido() {
	}

	public int getICodigosuscriptor() {
		return this.iCodigosuscriptor;
	}

	public void setICodigosuscriptor(int iCodigosuscriptor) {
		this.iCodigosuscriptor = iCodigosuscriptor;
	}

	public int getIIntentos() {
		return this.iIntentos;
	}

	public void setIIntentos(int iIntentos) {
		this.iIntentos = iIntentos;
	}

}