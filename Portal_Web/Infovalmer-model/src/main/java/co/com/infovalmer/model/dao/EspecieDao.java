package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.EspecieDto;

public interface EspecieDao {
	public List<EspecieDto> listarNemotecnicosPorEmisorMercado(String emisor,
			String mercado) throws Exception;
	
	public List<EspecieDto> listarNemotecnicos() throws Exception;
}
