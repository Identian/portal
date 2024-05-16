package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.MercadosDto;
import co.com.infovalmer.dto.RangoVencimientoDto;
import co.com.infovalmer.dto.SpClaseDto;
import co.com.infovalmer.dto.TipoMonedaDto;
import co.com.infovalmer.dto.TipoTasaDto;

public interface GeneralesDao {
	//public List<EspecieDto> listarNemotecnicos() throws Exception;

	public List<RangoVencimientoDto> listaRangoDiasVencimiento()
			throws Exception;

	public List<TipoMonedaDto> consultarTipoMoneda() throws Exception;

	public List<TipoTasaDto> consultaTipoTasa() throws Exception;

	public List<TipoTasaDto> consultartasaPorEmisor(String cEmisor)
			throws Exception;

	
	public List<MercadosDto> listaMercados() throws Exception;
	
	public List<SpClaseDto> listarClases() throws Exception;
}
