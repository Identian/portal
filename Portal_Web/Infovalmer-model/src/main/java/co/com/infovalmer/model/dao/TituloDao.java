package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.TituloDto;

public interface TituloDao {
	public List<TituloDto> consultaTitulosIndicadores() throws Exception;

	public void actulizarTitulo(TituloDto tituloDto) throws Exception;

	public List<TituloDto> listarNemos(String emisor, String tasa, String nemo) throws Exception;
	
	public List<TituloDto> listarTitulosPorEmisorPorTasa(String emisor,
			String tasa, String nemo, String isin, int limInicial,
			int limFinal,String campoOrden, String tipoOrden) throws Exception;
	
	public Long tamanoTitulosPorEmisorPorTasa(String emisor,
			String tasa, String nemo, String isin) throws Exception;
	


}
