package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.HistoricoPuntosDto;
import co.com.infovalmer.dto.PuntosDto;
import co.com.infovalmer.dto.vistas.HistoricoPuntosVista;

public interface PuntosDao {
	public List<HistoricoPuntosDto> consultarHistoricoPuntosGrafica(
			HistoricoPuntosVista historicoPuntosVista) throws Exception;

	public List<PuntosDto> consultarHistoricoPuntos(
			HistoricoPuntosVista historicoPuntosVista) throws Exception;
}
