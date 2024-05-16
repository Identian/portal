package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_email_publicacion database table.
 * 
 */
@Entity
@Table(name="po_email_publicacion")
@NamedQuery(name="PoEmailPublicacion.findAll", query="SELECT p FROM PoEmailPublicacion p")
public class PoEmailPublicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_email")
	private String cEmail;

	@Lob
	@Column(name="c_descripcion")
	private String cDescripcion;

	public PoEmailPublicacion() {
	}

	public String getCEmail() {
		return this.cEmail;
	}

	public void setCEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

}