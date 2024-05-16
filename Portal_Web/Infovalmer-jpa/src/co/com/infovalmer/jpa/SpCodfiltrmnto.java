package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sp_codfiltrmnto database table.
 * 
 */
@Entity
@Table(name="sp_codfiltrmnto")
@NamedQuery(name="SpCodfiltrmnto.findAll", query="SELECT s FROM SpCodfiltrmnto s")
public class SpCodfiltrmnto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_codigofiltro")
	private int iCodigofiltro;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="e_monto")
	private BigDecimal eMonto;

	public SpCodfiltrmnto() {
	}

	public int getICodigofiltro() {
		return this.iCodigofiltro;
	}

	public void setICodigofiltro(int iCodigofiltro) {
		this.iCodigofiltro = iCodigofiltro;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public BigDecimal getEMonto() {
		return this.eMonto;
	}

	public void setEMonto(BigDecimal eMonto) {
		this.eMonto = eMonto;
	}

}