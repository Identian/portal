package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ve_errores database table.
 * 
 */
@Entity
@Table(name="ve_errores")
@NamedQuery(name="VeErrore.findAll", query="SELECT v FROM VeErrore v")
public class VeErrore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_coderror")
	private int iCoderror;

	@Column(name="c_descripcion")
	private String cDescripcion;

	public VeErrore() {
	}

	public int getICoderror() {
		return this.iCoderror;
	}

	public void setICoderror(int iCoderror) {
		this.iCoderror = iCoderror;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

}