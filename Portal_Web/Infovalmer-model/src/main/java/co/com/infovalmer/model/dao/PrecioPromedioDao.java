package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.PrecioPromedioDto;
import co.com.infovalmer.dto.vistas.HistoricoPrecioVista;

public interface PrecioPromedioDao {
	
	public List<PrecioPromedioDto> consultarPrecioNemotecnico()
			throws Exception;

	public List<PrecioPromedioDto> consultarHistoricoPrecio(
			HistoricoPrecioVista historicoPrecioVista) throws Exception;

}
