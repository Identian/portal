package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SpSesionPK implements Serializable {

	@Column(name = "c_nombre")
	private String cNombre;

	@Column(name = "c_sistnegcion")
	private String cSistnegcion;

	public String getcNombre() {
		return cNombre;
	}

	public void setcNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getcSistnegcion() {
		return cSistnegcion;
	}

	public void setcSistnegcion(String cSistnegcion) {
		this.cSistnegcion = cSistnegcion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cNombre == null) ? 0 : cNombre.hashCode());
		result = prime * result
				+ ((cSistnegcion == null) ? 0 : cSistnegcion.hashCode());
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
		SpSesionPK other = (SpSesionPK) obj;
		if (cNombre == null) {
			if (other.cNombre != null)
				return false;
		} else if (!cNombre.equals(other.cNombre))
			return false;
		if (cSistnegcion == null) {
			if (other.cSistnegcion != null)
				return false;
		} else if (!cSistnegcion.equals(other.cSistnegcion))
			return false;
		return true;
	}

}
