package co.com.infovalmer.service;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import co.com.infovalmer.ejb.derivados.DerivadosFacadeLocal;
import co.com.infovalmer.utilidades.LOGS;
import co.com.infovalmer.dto.TipoCurvaAgrupadorDto;
import co.com.infovalmer.dto.TipoCurvaDto;

@ManagedBean(name = "tipoCurvaService")
@ViewScoped
public class TipoCurvaService implements Serializable {

	@EJB
	DerivadosFacadeLocal derivadosFacade;

	public TipoCurvaService() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo que permite crear la estructura de arbol en los agrupadores.
	 * @param i_perfil
	 * @return
	 */
	public TreeNode arbolAgrupadores(int i_perfil) {
		TreeNode root = new DefaultTreeNode(new Object(), null);
		List<TipoCurvaAgrupadorDto> AgrupadorList = null;
		List<TipoCurvaAgrupadorDto> AgrupadorPerfilList = null;
		LOGS.LOG_DEBUG.debug("INICIA LA CREACION DEL ARBOL");
		try {
			AgrupadorList = derivadosFacade.consultaAgrupador();
			AgrupadorPerfilList = derivadosFacade.consultaAgrupadorPorPerfil(i_perfil);
		} catch (Exception e) {
			LOGS.LOG_ERRORES.error("ERROR AL CONSULTAR AGRUPADOR POR PERFIL: " +  e);
		}
		
		LOGS.LOG_DEBUG.debug("INICIO PARA CREAR LA ESTRUCTURA DE ARBOL DE LOS AGRUPADORES SEGUN PERFIL: ");
		for (TipoCurvaAgrupadorDto tipoCurvaAgrupadorDto : AgrupadorList) {
			TreeNode nodoPadre = new DefaultTreeNode("Agrupador", tipoCurvaAgrupadorDto, root);
			for (TipoCurvaAgrupadorDto tipoCurvaAgrupadorDtoPerfil : AgrupadorPerfilList) {
				if (tipoCurvaAgrupadorDtoPerfil.getIAgrupador() == tipoCurvaAgrupadorDto.getIAgrupador()) {
					nodoPadre.setSelected(true);
				}
			}
			crearSubNodo(tipoCurvaAgrupadorDto.getIAgrupador(), nodoPadre, i_perfil);
		}
		
		LOGS.LOG_DEBUG.debug("FINALIZO LA CREACION DE LA ESTRUCTURA DE ARBOL EN LOS AGRUPADORES");
		return root;
	}

	/**
	 * Metodo que permite crear los nodos hijos del nodo superior en la estructura de arbol.
	 * @param iAgrupador
	 * @param nodoPadre
	 * @param iPerfil
	 */
	public void crearSubNodo(int iAgrupador, TreeNode nodoPadre, int iPerfil) {
		List<TipoCurvaDto> tipoCurvaList = null;
		List<TipoCurvaDto> tipoCurvaPerfilList = null;
		try {
			tipoCurvaList = derivadosFacade.consultarArchivos(iAgrupador,0);
			tipoCurvaPerfilList = derivadosFacade.consultaTipoCurvaPorPerfil(iAgrupador, iPerfil);
		} catch (Exception e) {
			LOGS.LOG_ERRORES.error("ERROR AL CREAR SUB NODO EL LA CONSULTA AGRUPADOR: DESCRIPCION ERROR: " +  e);
		}
		
		for (TipoCurvaDto tipoCurvaDto : tipoCurvaList) {
			TreeNode subNodo = new DefaultTreeNode("tipoCurva", tipoCurvaDto, nodoPadre);
			for (TipoCurvaDto tipoCurvaDtoPerfil : tipoCurvaPerfilList) {
				if (tipoCurvaDtoPerfil.getiTipocurva() == tipoCurvaDto.getiTipocurva()) {
					subNodo.setSelected(true);
				}
			}
		}
	}
}
