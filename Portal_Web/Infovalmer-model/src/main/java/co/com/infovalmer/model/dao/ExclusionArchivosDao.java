package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.ExclusionArchivosDto;


public interface ExclusionArchivosDao {
	public List<ExclusionArchivosDto> listArchivosExcluir() throws Exception;

}
