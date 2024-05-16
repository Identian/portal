package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the po_volumen_especie database table.
 * 
 */
@Entity
@Table(name="po_volumen_especie")
@NamedQuery(name="PoVolumenEspecie.findAll", query="SELECT p FROM PoVolumenEspecie p")
public class PoVolumenEspecie implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PoVolumenEspeciePK id;

	@Column(name="e_volumen")
	private BigDecimal eVolumen;

	public PoVolumenEspecie() {
	}

	public PoVolumenEspeciePK getId() {
		return this.id;
	}

	public void setId(PoVolumenEspeciePK id) {
		this.id = id;
	}

	public BigDecimal getEVolumen() {
		return this.eVolumen;
	}

	public void setEVolumen(BigDecimal eVolumen) {
		this.eVolumen = eVolumen;
	}

}