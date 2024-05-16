package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.TiposubyacenteDto;


public interface TiposubyacenteDao {
	public List<TiposubyacenteDto> consultaTipSubyanceteDerivados(String table);
}
