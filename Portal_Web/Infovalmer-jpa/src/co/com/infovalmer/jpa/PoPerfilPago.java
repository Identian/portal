package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the po_perfil_pago database table.
 * 
 */
@Entity
@Table(name="po_perfil_pago")
@NamedQuery(name="PoPerfilPago.findAll", query="SELECT p FROM PoPerfilPago p")
public class PoPerfilPago implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PoPerfilPagoPK id;

	@Column(name="c_estado")
	private String cEstado;

	@Column(name="c_forma_pago")
	private String cFormaPago;

	@Column(name="c_num_factura")
	private String cNumFactura;

	@Column(name="c_pago")
	private String cPago;

	@Column(name="c_tipo_identificacion")
	private String cTipoIdentificacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="d_fecha_maxima")
	private Date dFechaMaxima;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="d_fecha_transaccion")
	private Date dFechaTransaccion;

	@Column(name="i_descuento")
	private int iDescuento;

	@Column(name="i_idtransaccion")
	private int iIdtransaccion;

	@Column(name="i_impuesto")
	private int iImpuesto;

	@Column(name="i_retencion")
	private int iRetencion;

	@Column(name="i_valor")
	private int iValor;

	public PoPerfilPago() {
	}

	public PoPerfilPagoPK getId() {
		return this.id;
	}

	public void setId(PoPerfilPagoPK id) {
		this.id = id;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getCFormaPago() {
		return this.cFormaPago;
	}

	public void setCFormaPago(String cFormaPago) {
		this.cFormaPago = cFormaPago;
	}

	public String getCNumFactura() {
		return this.cNumFactura;
	}

	public void setCNumFactura(String cNumFactura) {
		this.cNumFactura = cNumFactura;
	}

	public String getCPago() {
		return this.cPago;
	}

	public void setCPago(String cPago) {
		this.cPago = cPago;
	}

	public String getCTipoIdentificacion() {
		return this.cTipoIdentificacion;
	}

	public void setCTipoIdentificacion(String cTipoIdentificacion) {
		this.cTipoIdentificacion = cTipoIdentificacion;
	}

	public Date getDFechaMaxima() {
		return this.dFechaMaxima;
	}

	public void setDFechaMaxima(Date dFechaMaxima) {
		this.dFechaMaxima = dFechaMaxima;
	}

	public Date getDFechaTransaccion() {
		return this.dFechaTransaccion;
	}

	public void setDFechaTransaccion(Date dFechaTransaccion) {
		this.dFechaTransaccion = dFechaTransaccion;
	}

	public int getIDescuento() {
		return this.iDescuento;
	}

	public void setIDescuento(int iDescuento) {
		this.iDescuento = iDescuento;
	}

	public int getIIdtransaccion() {
		return this.iIdtransaccion;
	}

	public void setIIdtransaccion(int iIdtransaccion) {
		this.iIdtransaccion = iIdtransaccion;
	}

	public int getIImpuesto() {
		return this.iImpuesto;
	}

	public void setIImpuesto(int iImpuesto) {
		this.iImpuesto = iImpuesto;
	}

	public int getIRetencion() {
		return this.iRetencion;
	}

	public void setIRetencion(int iRetencion) {
		this.iRetencion = iRetencion;
	}

	public int getIValor() {
		return this.iValor;
	}

	public void setIValor(int iValor) {
		this.iValor = iValor;
	}

}