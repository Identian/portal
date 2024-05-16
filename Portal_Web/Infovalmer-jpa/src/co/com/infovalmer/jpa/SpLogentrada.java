package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sp_logentrada database table.
 * 
 */
@Entity
@Table(name="sp_logentrada")
@NamedQuery(name="SpLogentrada.findAll", query="SELECT s FROM SpLogentrada s")
public class SpLogentrada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int i_logId;

	@Column(name="c_archivo")
	private String cArchivo;

	@Lob
	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="d_fechaproceso")
	private Timestamp dFechaproceso;

	public SpLogentrada() {
	}

	public int getI_logId() {
		return this.i_logId;
	}

	public void setI_logId(int i_logId) {
		this.i_logId = i_logId;
	}

	public String getCArchivo() {
		return this.cArchivo;
	}

	public void setCArchivo(String cArchivo) {
		this.cArchivo = cArchivo;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public Timestamp getDFechaproceso() {
		return this.dFechaproceso;
	}

	public void setDFechaproceso(Timestamp dFechaproceso) {
		this.dFechaproceso = dFechaproceso;
	}

}