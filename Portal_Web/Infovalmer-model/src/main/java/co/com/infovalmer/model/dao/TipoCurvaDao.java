package co.com.infovalmer.model.dao;


import java.util.List;

import co.com.infovalmer.dto.TipoCurvaDto;


public interface TipoCurvaDao {
	
public List<TipoCurvaDto> consultaTipoCurvaPorAgrupador(int i_Agrupador) throws Exception;
public int cuentaTipoCurvaPorAgrupador(int i_Agrupador) throws Exception;
public List<TipoCurvaDto> consultaTipoCurvaPorPerfil (int i_Agrupador,int i_perfil) throws Exception;
public List<TipoCurvaDto> consultarTipoCurva(Integer iAgrupador,Integer tipoConsulta) throws Exception;
public int existeTipoCurva(String cNombre) throws Exception ;
public void registrarCurva (TipoCurvaDto curvaDto) throws Exception;
public void modificarCurva (TipoCurvaDto curvaDto) throws Exception;
public void eliminarCurva(TipoCurvaDto tCurvaDto) throws Exception;
public void asociarCurvaAgrupador(List<TipoCurvaDto> listCurvaDto,Integer iAgrupador)throws Exception;
public List<TipoCurvaDto> consultarCurvasPorAgrupador(Integer iAgrupadorDto) throws Exception;
}
