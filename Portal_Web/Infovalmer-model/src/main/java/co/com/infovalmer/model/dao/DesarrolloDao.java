package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.DesarrolloDto;
import co.com.infovalmer.dto.vistas.TablaAmortizacionVista;

public interface DesarrolloDao {
	public List<DesarrolloDto> consultarTablaAmortizacion(
			TablaAmortizacionVista tablaAmortizacionVista) throws Exception;

	public List<DesarrolloDto> consultarTotalesTablaAmortizacion(
			TablaAmortizacionVista tablaAmortizacionVista) throws Exception;
}
