package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the vd_operacionesporincluir database table.
 * 
 */
@Entity
@Table(name="vd_operacionesporincluir")
@NamedQuery(name="VdOperacionesporincluir.findAll", query="SELECT v FROM VdOperacionesporincluir v")
public class VdOperacionesporincluir implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VdOperacionesporincluirPK id;

	@Column(name="c_estado")
	private String cEstado;

	@Column(name="c_origen")
	private String cOrigen;

	@Column(name="c_sesion")
	private String cSesion;

	@Column(name="e_precioop")
	private BigDecimal ePrecioop;

	@Column(name="i_agentecompra")
	private int iAgentecompra;

	@Column(name="i_agenteventa")
	private int iAgenteventa;

	@Column(name="i_cantidad")
	private BigDecimal iCantidad;

	public VdOperacionesporincluir() {
	}

	public VdOperacionesporincluirPK getId() {
		return this.id;
	}

	public void setId(VdOperacionesporincluirPK id) {
		this.id = id;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getCOrigen() {
		return this.cOrigen;
	}

	public void setCOrigen(String cOrigen) {
		this.cOrigen = cOrigen;
	}

	public String getCSesion() {
		return this.cSesion;
	}

	public void setCSesion(String cSesion) {
		this.cSesion = cSesion;
	}

	public BigDecimal getEPrecioop() {
		return this.ePrecioop;
	}

	public void setEPrecioop(BigDecimal ePrecioop) {
		this.ePrecioop = ePrecioop;
	}

	public int getIAgentecompra() {
		return this.iAgentecompra;
	}

	public void setIAgentecompra(int iAgentecompra) {
		this.iAgentecompra = iAgentecompra;
	}

	public int getIAgenteventa() {
		return this.iAgenteventa;
	}

	public void setIAgenteventa(int iAgenteventa) {
		this.iAgenteventa = iAgenteventa;
	}

	public BigDecimal getICantidad() {
		return this.iCantidad;
	}

	public void setICantidad(BigDecimal iCantidad) {
		this.iCantidad = iCantidad;
	}

}