package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.ContratoDto;
import co.com.infovalmer.dto.DerivadoDto;


public interface ContratoDao {
	public List<ContratoDto> consultaContratosDerivados(String table, Object[] parametros);
	public List<ContratoDto> preciosValoracionContratos(String table, DerivadoDto derivadoDTO);
}
