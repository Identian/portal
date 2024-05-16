package co.com.infovalmer.model.dao;

import java.util.Date;
import java.util.List;

import co.com.infovalmer.dto.HistoricoAccionesDto;
import co.com.infovalmer.dto.VaPrecioValoracionDto;

public interface VaPrecioValoracionDao {
	public List<VaPrecioValoracionDto> consultaPrecioValoracion(
			String nemotecnico, Date fechaInicial, Date fechaFinal)
			throws Exception;

	public List<HistoricoAccionesDto> historicoAcciones(String nemotecnico,
			String emisor, String mercado, Date fechaInicial, Date fechaFinal)
			throws Exception;
	public List<HistoricoAccionesDto> historicoAccionesConFecha(String nemotecnico,
			String emisor, String mercado, Date fechaInicial, Date fechaFinal)
			throws Exception;
}
