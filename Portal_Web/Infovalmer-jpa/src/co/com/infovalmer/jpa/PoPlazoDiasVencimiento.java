package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_plazo_dias_vencimiento database table.
 * 
 */
@Entity
@Table(name="po_plazo_dias_vencimiento")
@NamedQuery(name="PoPlazoDiasVencimiento.findAll", query="SELECT p FROM PoPlazoDiasVencimiento p")
public class PoPlazoDiasVencimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PoPlazoDiasVencimientoPK id;

	@Column(name="c_descripcion_titulos")
	private String cDescripcionTitulos;

	@Column(name="i_grupo_codigo")
	private int iGrupoCodigo;

	public PoPlazoDiasVencimiento() {
	}

	public PoPlazoDiasVencimientoPK getId() {
		return this.id;
	}

	public void setId(PoPlazoDiasVencimientoPK id) {
		this.id = id;
	}

	public String getCDescripcionTitulos() {
		return this.cDescripcionTitulos;
	}

	public void setCDescripcionTitulos(String cDescripcionTitulos) {
		this.cDescripcionTitulos = cDescripcionTitulos;
	}

	public int getIGrupoCodigo() {
		return this.iGrupoCodigo;
	}

	public void setIGrupoCodigo(int iGrupoCodigo) {
		this.iGrupoCodigo = iGrupoCodigo;
	}

}