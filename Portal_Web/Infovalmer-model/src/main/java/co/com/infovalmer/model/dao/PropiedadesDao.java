package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.PropiedadesDto;

public interface PropiedadesDao {
	public List<PropiedadesDto> listPropiedadesSistema() throws Exception;
	public List<PropiedadesDto> listPropiedadesSistemaId(String idPropiedad) throws Exception;
}
