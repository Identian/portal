package co.com.infovalmer.model.dao;

import java.util.List;

import co.com.infovalmer.dto.TipoCurvaAgrupadorDto;

public interface TipoCurvaAgrupadorDao {
	public List<TipoCurvaAgrupadorDto> consultarTipoCurva() throws Exception;
	public void registrarAgrupador(TipoCurvaAgrupadorDto agrupadorDTO) throws Exception;
	public int consultaAgrupador (String descripcionAgrupador) throws Exception;
	public void actualizarAgrupador(TipoCurvaAgrupadorDto agrupadorDTO) throws Exception;
	public void eliminarAgrupador(int idAgrupador) throws Exception;
	public List<TipoCurvaAgrupadorDto> consultaAgrupadorPerfil(int iPerfil) throws Exception;
}
