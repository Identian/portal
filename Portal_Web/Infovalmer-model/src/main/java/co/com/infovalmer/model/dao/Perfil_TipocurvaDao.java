package co.com.infovalmer.model.dao;

import co.com.infovalmer.dto.Perfil_TipocurvaDto;

public interface Perfil_TipocurvaDao {
public void registrarPerfil_TipoCurva (Perfil_TipocurvaDto perfil_TipoCurva) throws Exception;
public void eliminarPerfil_TipoCurvaPorPerfil (int i_Perfil) throws Exception;
}
