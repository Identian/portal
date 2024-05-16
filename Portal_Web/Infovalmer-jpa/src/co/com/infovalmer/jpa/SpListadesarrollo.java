package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_listadesarrollo database table.
 * 
 */
@Entity
@Table(name="sp_listadesarrollo")
@NamedQuery(name="SpListadesarrollo.findAll", query="SELECT s FROM SpListadesarrollo s")
public class SpListadesarrollo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Column(name="c_opcion")
	private String cOpcion;

	public SpListadesarrollo() {
	}

	public String getCNemotecnico() {
		return this.cNemotecnico;
	}

	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public String getCOpcion() {
		return this.cOpcion;
	}

	public void setCOpcion(String cOpcion) {
		this.cOpcion = cOpcion;
	}

}