package co.com.infovalmer.dto.vistas;

import java.io.Serializable;
import java.util.Date;

public class HistoricoPrecioVista implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nemotecnico;
	private Date fechaInicial;
	private Date fechaFinal;
	private String isin;
	private String emisor;
	private String tipoTasa;
	private int lazyDesde;
	private int lazyFilasPorQuery;
	private String campoOrden;
	private String formaOrden;

	public HistoricoPrecioVista() {

	}

	public HistoricoPrecioVista(String nemotecnico, Date fechaInicial,
			Date fechaFinal, String isin, String emisor, String tipoTasa,
			int lazyDesde, int lazyFilasPorQuery, String campoOrden,
			String formaOrden) {
		super();
		this.nemotecnico = nemotecnico;
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
		this.isin = isin;
		this.emisor = emisor;
		this.tipoTasa = tipoTasa;
		this.lazyDesde = lazyDesde;
		this.lazyFilasPorQuery = lazyFilasPorQuery;
		this.campoOrden = campoOrden;
		this.formaOrden = formaOrden;
	}

	public String getFormaOrden() {
		return formaOrden;
	}

	public void setFormaOrden(String formaOrden) {
		this.formaOrden = formaOrden;
	}

	public String getCampoOrden() {
		return campoOrden;
	}

	public void setCampoOrden(String campoOrden) {
		this.campoOrden = campoOrden;
	}

	public int getLazyDesde() {
		return lazyDesde;
	}

	public void setLazyDesde(int lazyDesde) {
		this.lazyDesde = lazyDesde;
	}

	public int getLazyFilasPorQuery() {
		return lazyFilasPorQuery;
	}

	public void setLazyFilasPorQuery(int lazyFilasPorQuery) {
		this.lazyFilasPorQuery = lazyFilasPorQuery;
	}

	public String getTipoTasa() {
		return tipoTasa;
	}

	public void setTipoTasa(String tipoTasa) {
		this.tipoTasa = tipoTasa;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public String getNemotecnico() {
		return nemotecnico;
	}

	public void setNemotecnico(String nemotecnico) {
		this.nemotecnico = nemotecnico;
	}

	public Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

}
