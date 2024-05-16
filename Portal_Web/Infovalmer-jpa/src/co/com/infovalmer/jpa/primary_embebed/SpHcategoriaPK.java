package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SpHcategoriaPK
 *
 */
@Embeddable
public class SpHcategoriaPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "i_grupomoneda")
	private int iGrupomoneda;

	@Column(name="i_grupotasa")
	private int iGrupotasa;
	
	@Column(name="i_codigo")
	private int iCodigo;
	
	@Column(name="i_grupocalificador")
	private int iGrupocalificador;
	
	@Column(name="i_rangovencimiento")
	private int iRangovencimiento;

	@Column(name="c_clase")
	private String cClase;
	
	public SpHcategoriaPK() {
		super();
	}

	public int getiGrupomoneda() {
		return iGrupomoneda;
	}

	public void setiGrupomoneda(int iGrupomoneda) {
		this.iGrupomoneda = iGrupomoneda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iGrupomoneda;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpHcategoriaPK other = (SpHcategoriaPK) obj;
		if (iGrupomoneda != other.iGrupomoneda)
			return false;
		return true;
	}

}
