package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.ParametriaArchivoDto;

public interface ParametrizacionDao {
	public void crearParametrizacionArchivos(ParametriaArchivoDto parametriaArchivoDto) throws Exception;

	public List<ParametriaArchivoDto> consultaParametriaArchivos(ParametriaArchivoDto filtroParametria)
			throws Exception;

	public Long totalParametria(String columna, String valor) throws Exception;
	
	public void modificarParametria(ParametriaArchivoDto parametriaArchivoDTO) throws Exception;
	
	public void eliminarParametria(ParametriaArchivoDto parametriaArchivoDTO)throws Exception;
}