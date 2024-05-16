package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_tipoindice database table.
 * 
 */
@Entity
@Table(name="sp_tipoindice")
@NamedQuery(name="SpTipoindice.findAll", query="SELECT s FROM SpTipoindice s")
public class SpTipoindice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_indice")
	private String cIndice;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	public SpTipoindice() {
	}

	public String getCIndice() {
		return this.cIndice;
	}

	public void setCIndice(String cIndice) {
		this.cIndice = cIndice;
	}

	public String getCNemotecnico() {
		return this.cNemotecnico;
	}

	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

}