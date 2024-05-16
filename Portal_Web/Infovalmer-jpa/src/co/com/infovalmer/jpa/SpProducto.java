package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sp_producto database table.
 * 
 */
@Entity
@Table(name="sp_producto")
@NamedQuery(name="SpProducto.findAll", query="SELECT s FROM SpProducto s")
public class SpProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_codproducto")
	private byte iCodproducto;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="e_precio")
	private BigDecimal ePrecio;

	public SpProducto() {
	}

	public byte getICodproducto() {
		return this.iCodproducto;
	}

	public void setICodproducto(byte iCodproducto) {
		this.iCodproducto = iCodproducto;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public BigDecimal getEPrecio() {
		return this.ePrecio;
	}

	public void setEPrecio(BigDecimal ePrecio) {
		this.ePrecio = ePrecio;
	}

}