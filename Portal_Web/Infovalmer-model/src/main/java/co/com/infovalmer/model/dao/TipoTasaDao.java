package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.TasasVistaDto;
import co.com.infovalmer.dto.TipoTasaDto;
import co.com.infovalmer.dto.ValorTasaDto;

public interface TipoTasaDao {
	public List<TipoTasaDto> consultaTipoTasa() throws Exception;

	public void actualizarTasas(TipoTasaDto tipoTasaDto) throws Exception;

	public List<ValorTasaDto> consultarValorTasas() throws Exception;

	public List<ValorTasaDto> consultarValorTasaPorId(
			TasasVistaDto tasasVistaDto) throws Exception;
}
