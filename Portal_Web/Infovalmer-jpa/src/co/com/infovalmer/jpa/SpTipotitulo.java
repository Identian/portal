package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_tipotitulo database table.
 * 
 */
@Entity
@Table(name="sp_tipotitulo")
@NamedQuery(name="SpTipotitulo.findAll", query="SELECT s FROM SpTipotitulo s")
public class SpTipotitulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_tipotitulo")
	private String cTipotitulo;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_ixtit")
	private String cIxtit;

	@Column(name="c_nemonico")
	private String cNemonico;

	@Column(name="c_nombreindice")
	private String cNombreindice;

	@Column(name="c_rendimiento")
	private String cRendimiento;

	@Column(name="c_supension")
	private String cSupension;

	@Column(name="c_tiporentabilidad")
	private String cTiporentabilidad;

	public SpTipotitulo() {
	}

	public String getCTipotitulo() {
		return this.cTipotitulo;
	}

	public void setCTipotitulo(String cTipotitulo) {
		this.cTipotitulo = cTipotitulo;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCIxtit() {
		return this.cIxtit;
	}

	public void setCIxtit(String cIxtit) {
		this.cIxtit = cIxtit;
	}

	public String getCNemonico() {
		return this.cNemonico;
	}

	public void setCNemonico(String cNemonico) {
		this.cNemonico = cNemonico;
	}

	public String getCNombreindice() {
		return this.cNombreindice;
	}

	public void setCNombreindice(String cNombreindice) {
		this.cNombreindice = cNombreindice;
	}

	public String getCRendimiento() {
		return this.cRendimiento;
	}

	public void setCRendimiento(String cRendimiento) {
		this.cRendimiento = cRendimiento;
	}

	public String getCSupension() {
		return this.cSupension;
	}

	public void setCSupension(String cSupension) {
		this.cSupension = cSupension;
	}

	public String getCTiporentabilidad() {
		return this.cTiporentabilidad;
	}

	public void setCTiporentabilidad(String cTiporentabilidad) {
		this.cTiporentabilidad = cTiporentabilidad;
	}

}