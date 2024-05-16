package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.TipoCurvaAgrupadorDto;
import co.com.infovalmer.dto.TipoCurvaDto;;


public interface DerivadosDao {
	List<TipoCurvaDto> listaArchivos(Integer idAgrupador,Integer iUsuario) throws Exception;
	 public List<TipoCurvaAgrupadorDto> buscarAgrupadorPorDescripcion(String desc) throws Exception;
     public TipoCurvaAgrupadorDto buscarPorId(Integer id) throws Exception;

}
