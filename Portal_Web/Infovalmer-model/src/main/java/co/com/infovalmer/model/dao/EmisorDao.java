package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.EmisorDto;


public interface EmisorDao {
	
	public List<EmisorDto> consultaEmisor() throws Exception;
	
	public List<EmisorDto> consultaEmisorPorTipo(String tipoMercado) throws Exception;

}
