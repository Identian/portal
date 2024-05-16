package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ad_log_descripcion database table.
 * 
 */
@Entity
@Table(name="ad_log_descripcion")
@NamedQuery(name="AdLogDescripcion.findAll", query="SELECT a FROM AdLogDescripcion a")
public class AdLogDescripcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_codigo")
	private int iCodigo;

	@Lob
	@Column(name="c_descripcion")
	private String cDescripcion;

	@Column(name="i_pagina")
	private int iPagina;

	@Column(name="i_tipo_acceso")
	private int iTipoAcceso;

	public AdLogDescripcion() {
	}

	public int getICodigo() {
		return this.iCodigo;
	}

	public void setICodigo(int iCodigo) {
		this.iCodigo = iCodigo;
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public int getIPagina() {
		return this.iPagina;
	}

	public void setIPagina(int iPagina) {
		this.iPagina = iPagina;
	}

	public int getITipoAcceso() {
		return this.iTipoAcceso;
	}

	public void setITipoAcceso(int iTipoAcceso) {
		this.iTipoAcceso = iTipoAcceso;
	}

}