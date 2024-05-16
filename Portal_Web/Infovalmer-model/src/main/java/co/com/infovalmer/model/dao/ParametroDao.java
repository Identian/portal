package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.ParametroDto;

public interface ParametroDao {
	public List<ParametroDto> consultarParametroId(Integer idParametro)
			throws Exception;
}
