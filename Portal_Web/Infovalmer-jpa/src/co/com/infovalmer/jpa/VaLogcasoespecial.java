package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the va_logcasoespecial database table.
 * 
 */
@Entity
@Table(name="va_logcasoespecial")
@NamedQuery(name="VaLogcasoespecial.findAll", query="SELECT v FROM VaLogcasoespecial v")
public class VaLogcasoespecial implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VaLogcasoespecialPK id;

	@Lob
	@Column(name="c_causal")
	private String cCausal;

	@Column(name="c_usuario")
	private String cUsuario;

	@Column(name="dt_fechahora")
	private Timestamp dtFechahora;

	@Column(name="e_precioanterior")
	private BigDecimal ePrecioanterior;

	@Column(name="e_precionuevo")
	private BigDecimal ePrecionuevo;

	public VaLogcasoespecial() {
	}

	public VaLogcasoespecialPK getId() {
		return this.id;
	}

	public void setId(VaLogcasoespecialPK id) {
		this.id = id;
	}

	public String getCCausal() {
		return this.cCausal;
	}

	public void setCCausal(String cCausal) {
		this.cCausal = cCausal;
	}

	public String getCUsuario() {
		return this.cUsuario;
	}

	public void setCUsuario(String cUsuario) {
		this.cUsuario = cUsuario;
	}

	public Timestamp getDtFechahora() {
		return this.dtFechahora;
	}

	public void setDtFechahora(Timestamp dtFechahora) {
		this.dtFechahora = dtFechahora;
	}

	public BigDecimal getEPrecioanterior() {
		return this.ePrecioanterior;
	}

	public void setEPrecioanterior(BigDecimal ePrecioanterior) {
		this.ePrecioanterior = ePrecioanterior;
	}

	public BigDecimal getEPrecionuevo() {
		return this.ePrecionuevo;
	}

	public void setEPrecionuevo(BigDecimal ePrecionuevo) {
		this.ePrecionuevo = ePrecionuevo;
	}

}