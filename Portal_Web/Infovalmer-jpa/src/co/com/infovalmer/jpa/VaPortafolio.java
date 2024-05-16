package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the va_portafolio database table.
 * 
 */
@Entity
@Table(name="va_portafolio")
@NamedQuery(name="VaPortafolio.findAll", query="SELECT v FROM VaPortafolio v")
public class VaPortafolio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_usuario")
	private String cUsuario;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechaportafolio")
	private Date dFechaportafolio;

	public VaPortafolio() {
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getCUsuario() {
		return this.cUsuario;
	}

	public void setCUsuario(String cUsuario) {
		this.cUsuario = cUsuario;
	}

	public Date getDFechaportafolio() {
		return this.dFechaportafolio;
	}

	public void setDFechaportafolio(Date dFechaportafolio) {
		this.dFechaportafolio = dFechaportafolio;
	}

}