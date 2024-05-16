package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the po_hojasdevida database table.
 * 
 */
@Entity
@Table(name="po_hojasdevida")
@NamedQuery(name="PoHojasdevida.findAll", query="SELECT p FROM PoHojasdevida p")
public class PoHojasdevida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_identificador")
	private int iIdentificador;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_prefesion")
	private String cPrefesion;

	@Column(name="c_rutaarchivo")
	private String cRutaarchivo;

	@Temporal(TemporalType.DATE)
	@Column(name="d_fecharegistro")
	private Date dFecharegistro;

	public PoHojasdevida() {
	}

	public int getIIdentificador() {
		return this.iIdentificador;
	}

	public void setIIdentificador(int iIdentificador) {
		this.iIdentificador = iIdentificador;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getCPrefesion() {
		return this.cPrefesion;
	}

	public void setCPrefesion(String cPrefesion) {
		this.cPrefesion = cPrefesion;
	}

	public String getCRutaarchivo() {
		return this.cRutaarchivo;
	}

	public void setCRutaarchivo(String cRutaarchivo) {
		this.cRutaarchivo = cRutaarchivo;
	}

	public Date getDFecharegistro() {
		return this.dFecharegistro;
	}

	public void setDFecharegistro(Date dFecharegistro) {
		this.dFecharegistro = dFecharegistro;
	}

}