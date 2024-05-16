package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sp_logusuarios database table.
 * 
 */
@Embeddable
public class SpLogusuarioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="c_usuario")
	private String cUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horaingreso")
	private java.util.Date dtHoraingreso;

	@Column(name="c_paginaingreso")
	private String cPaginaingreso;

	public SpLogusuarioPK() {
	}
	public String getCUsuario() {
		return this.cUsuario;
	}
	public void setCUsuario(String cUsuario) {
		this.cUsuario = cUsuario;
	}
	public java.util.Date getDtHoraingreso() {
		return this.dtHoraingreso;
	}
	public void setDtHoraingreso(java.util.Date dtHoraingreso) {
		this.dtHoraingreso = dtHoraingreso;
	}
	public String getCPaginaingreso() {
		return this.cPaginaingreso;
	}
	public void setCPaginaingreso(String cPaginaingreso) {
		this.cPaginaingreso = cPaginaingreso;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpLogusuarioPK)) {
			return false;
		}
		SpLogusuarioPK castOther = (SpLogusuarioPK)other;
		return 
			this.cUsuario.equals(castOther.cUsuario)
			&& this.dtHoraingreso.equals(castOther.dtHoraingreso)
			&& this.cPaginaingreso.equals(castOther.cPaginaingreso);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cUsuario.hashCode();
		hash = hash * prime + this.dtHoraingreso.hashCode();
		hash = hash * prime + this.cPaginaingreso.hashCode();
		
		return hash;
	}
}