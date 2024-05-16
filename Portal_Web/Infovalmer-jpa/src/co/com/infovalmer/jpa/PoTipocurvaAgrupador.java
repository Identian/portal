package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the po_tipocurva_agrupador database table.
 * 
 */
@Entity
@Table(name="po_tipocurva_agrupador")
@NamedQuery(name="PoTipocurvaAgrupador.findAll", query="SELECT p FROM PoTipocurvaAgrupador p")
public class PoTipocurvaAgrupador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_agrupador")
	private int iAgrupador;

	@Column(name="c_directorio")
	private String cDirectorio;

	@Lob
	@Column(name="c_etiqueta")
	private String cEtiqueta;

	@Column(name="c_nombre")
	private String cNombre;

	public PoTipocurvaAgrupador() {
	}

	public int getIAgrupador() {
		return this.iAgrupador;
	}

	public void setIAgrupador(int iAgrupador) {
		this.iAgrupador = iAgrupador;
	}

	public String getCDirectorio() {
		return this.cDirectorio;
	}

	public void setCDirectorio(String cDirectorio) {
		this.cDirectorio = cDirectorio;
	}

	public String getCEtiqueta() {
		return this.cEtiqueta;
	}

	public void setCEtiqueta(String cEtiqueta) {
		this.cEtiqueta = cEtiqueta;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

}