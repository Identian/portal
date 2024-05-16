package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the po_precios_curva database table.
 * 
 */
@Embeddable
public class PoPreciosCurvaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="i_id_rango")
	private int iIdRango;

	@Column(name="i_limite_inferior")
	private int iLimiteInferior;

	@Column(name="i_limite_superior")
	private int iLimiteSuperior;

	public PoPreciosCurvaPK() {
	}
	public int getIIdRango() {
		return this.iIdRango;
	}
	public void setIIdRango(int iIdRango) {
		this.iIdRango = iIdRango;
	}
	public int getILimiteInferior() {
		return this.iLimiteInferior;
	}
	public void setILimiteInferior(int iLimiteInferior) {
		this.iLimiteInferior = iLimiteInferior;
	}
	public int getILimiteSuperior() {
		return this.iLimiteSuperior;
	}
	public void setILimiteSuperior(int iLimiteSuperior) {
		this.iLimiteSuperior = iLimiteSuperior;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PoPreciosCurvaPK)) {
			return false;
		}
		PoPreciosCurvaPK castOther = (PoPreciosCurvaPK)other;
		return 
			(this.iIdRango == castOther.iIdRango)
			&& (this.iLimiteInferior == castOther.iLimiteInferior)
			&& (this.iLimiteSuperior == castOther.iLimiteSuperior);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.iIdRango;
		hash = hash * prime + this.iLimiteInferior;
		hash = hash * prime + this.iLimiteSuperior;
		
		return hash;
	}
}