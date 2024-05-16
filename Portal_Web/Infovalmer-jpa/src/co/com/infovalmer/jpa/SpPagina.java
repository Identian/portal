package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_pagina database table.
 * 
 */
@Entity
@Table(name="sp_pagina")
@NamedQuery(name="SpPagina.findAll", query="SELECT s FROM SpPagina s")
public class SpPagina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_codigopagina")
	private int iCodigopagina;

	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_subtitulo")
	private String cSubtitulo;

	public SpPagina() {
	}

	public int getICodigopagina() {
		return this.iCodigopagina;
	}

	public void setICodigopagina(int iCodigopagina) {
		this.iCodigopagina = iCodigopagina;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getCSubtitulo() {
		return this.cSubtitulo;
	}

	public void setCSubtitulo(String cSubtitulo) {
		this.cSubtitulo = cSubtitulo;
	}

}