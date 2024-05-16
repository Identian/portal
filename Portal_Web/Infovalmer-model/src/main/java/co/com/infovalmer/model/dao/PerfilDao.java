package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.PerfilDto;

public interface PerfilDao {
public List<PerfilDto> consultaPerfiles() throws Exception;
}
