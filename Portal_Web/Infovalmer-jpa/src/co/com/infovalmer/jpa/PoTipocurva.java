package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_tipocurva database table.
 * 
 */
@Entity
@Table(name="po_tipocurva")
@NamedQuery(name="PoTipocurva.findAll", query="SELECT p FROM PoTipocurva p")
public class PoTipocurva implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_tipocurva")
	private int iTipocurva;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_ejex")
	private String cEjex;

	@Column(name="c_ejey")
	private String cEjey;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_prefijo_archivo")
	private String cPrefijoArchivo;

	@Column(name="i_agrupador")
	private int iAgrupador;

	@Column(name="i_orden")
	private int iOrden;

	public PoTipocurva() {
	}

	public int getITipocurva() {
		return this.iTipocurva;
	}

	public void setITipocurva(int iTipocurva) {
		this.iTipocurva = iTipocurva;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCEjex() {
		return this.cEjex;
	}

	public void setCEjex(String cEjex) {
		this.cEjex = cEjex;
	}

	public String getCEjey() {
		return this.cEjey;
	}

	public void setCEjey(String cEjey) {
		this.cEjey = cEjey;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getCPrefijoArchivo() {
		return this.cPrefijoArchivo;
	}

	public void setCPrefijoArchivo(String cPrefijoArchivo) {
		this.cPrefijoArchivo = cPrefijoArchivo;
	}

	public int getIAgrupador() {
		return this.iAgrupador;
	}

	public void setIAgrupador(int iAgrupador) {
		this.iAgrupador = iAgrupador;
	}

	public int getIOrden() {
		return this.iOrden;
	}

	public void setIOrden(int iOrden) {
		this.iOrden = iOrden;
	}

}