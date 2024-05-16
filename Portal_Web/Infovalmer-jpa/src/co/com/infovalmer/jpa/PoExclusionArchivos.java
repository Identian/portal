package co.com.infovalmer.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="po_exclusion_archivos_codi")
@NamedQuery(name="PoExclusionArchivos.findAll", query="SELECT p FROM PoExclusionArchivos p")
public class PoExclusionArchivos {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_nombre_archivo")
	private String cNombreArchivo;
	
	@Column(name="c_extension")
	private String cExtension;
	
	public PoExclusionArchivos(){
	}

	public String getcNombreArchivo() {
		return cNombreArchivo;
	}

	public void setcNombreArchivo(String cNombreArchivo) {
		this.cNombreArchivo = cNombreArchivo;
	}

	public String getcExtension() {
		return cExtension;
	}

	public void setcExtension(String cExtension) {
		this.cExtension = cExtension;
	}

}
