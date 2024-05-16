package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ve_errorgarantia database table.
 * 
 */
@Entity
@Table(name="ve_errorgarantia")
@NamedQuery(name="VeErrorgarantia.findAll", query="SELECT v FROM VeErrorgarantia v")
public class VeErrorgarantia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_codigo")
	private int iCodigo;

	@Lob
	@Column(name="c_archivo")
	private String cArchivo;

	@Column(name="c_campo")
	private String cCampo;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fechavaloracion")
	private Date dFechavaloracion;

	@Column(name="i_coderror")
	private int iCoderror;

	@Column(name="i_codlinea")
	private int iCodlinea;

	public VeErrorgarantia() {
	}

	public int getICodigo() {
		return this.iCodigo;
	}

	public void setICodigo(int iCodigo) {
		this.iCodigo = iCodigo;
	}

	public String getCArchivo() {
		return this.cArchivo;
	}

	public void setCArchivo(String cArchivo) {
		this.cArchivo = cArchivo;
	}

	public String getCCampo() {
		return this.cCampo;
	}

	public void setCCampo(String cCampo) {
		this.cCampo = cCampo;
	}

	public Date getDFechavaloracion() {
		return this.dFechavaloracion;
	}

	public void setDFechavaloracion(Date dFechavaloracion) {
		this.dFechavaloracion = dFechavaloracion;
	}

	public int getICoderror() {
		return this.iCoderror;
	}

	public void setICoderror(int iCoderror) {
		this.iCoderror = iCoderror;
	}

	public int getICodlinea() {
		return this.iCodlinea;
	}

	public void setICodlinea(int iCodlinea) {
		this.iCodlinea = iCodlinea;
	}

}