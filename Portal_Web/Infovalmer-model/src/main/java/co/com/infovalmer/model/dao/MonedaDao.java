package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.TipoMonedaDto;
import co.com.infovalmer.dto.ValorMonedaDto;
import co.com.infovalmer.dto.vistas.HistoricoMonedasVista;

public interface MonedaDao {
	public List<TipoMonedaDto> consultarTipoMoneda() throws Exception;

	public void actulizarTipoMoneda(TipoMonedaDto tipoMonedaDto)
			throws Exception;

	public List<ValorMonedaDto> consultarValorMoneda() throws Exception;

	public List<ValorMonedaDto> consultarValorMonedaPorId(
			HistoricoMonedasVista monedasVista) throws Exception;
}
