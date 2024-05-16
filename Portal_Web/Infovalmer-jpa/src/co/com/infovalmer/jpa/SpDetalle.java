package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_detalle database table.
 * 
 */
@Entity
@Table(name="sp_detalle")
@NamedQuery(name="SpDetalle.findAll", query="SELECT s FROM SpDetalle s")
public class SpDetalle implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="i_sincronizador")
	private int iSincronizador;

	
	@Column(name="c_campo")
	private String cCampo;

	@Column(name="c_filtro")
	private String cFiltro;

	@Column(name="i_tipo")
	private int iTipo;

	public SpDetalle() {
	}

	public String getCCampo() {
		return this.cCampo;
	}

	public void setCCampo(String cCampo) {
		this.cCampo = cCampo;
	}

	public String getCFiltro() {
		return this.cFiltro;
	}

	public void setCFiltro(String cFiltro) {
		this.cFiltro = cFiltro;
	}

	public int getISincronizador() {
		return this.iSincronizador;
	}

	public void setISincronizador(int iSincronizador) {
		this.iSincronizador = iSincronizador;
	}

	public int getITipo() {
		return this.iTipo;
	}

	public void setITipo(int iTipo) {
		this.iTipo = iTipo;
	}

}