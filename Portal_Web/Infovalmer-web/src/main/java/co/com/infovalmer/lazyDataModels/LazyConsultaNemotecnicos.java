package co.com.infovalmer.lazyDataModels;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import co.com.infovalmer.dto.FiltroNemoDto;
import co.com.infovalmer.dto.PrecioPromedioDto;
import co.com.infovalmer.dto.TituloDto;
import co.com.infovalmer.ejb.generales.GeneralesFacadeLocal;
import co.com.infovalmer.utilidades.LOGS;

public class LazyConsultaNemotecnicos extends LazyDataModel<TituloDto> {

	private static final long serialVersionUID = 1L;
	@EJB
	GeneralesFacadeLocal generalesFacadeLocal;
	private FiltroNemoDto filtroNemoDto;
	
	
	public LazyConsultaNemotecnicos(GeneralesFacadeLocal generalesFacadeLocal,
			long tamanoLazy, FiltroNemoDto filtroNemoDto) {
		super();
		this.generalesFacadeLocal = generalesFacadeLocal;
		this.filtroNemoDto = filtroNemoDto;
		this.setRowCount(Integer.valueOf(String.valueOf(tamanoLazy)));
	}

	@Override
	public List<TituloDto> load(int first, int pageSize, String sortField,
			SortOrder sortOrder, Map<String, Object> filters) {
		List<TituloDto> listaTitulos = new ArrayList<TituloDto>();
		try {
			String tipoOrden = null;
			String nombreCampoBd = null;
			
			if (sortField != null) {
				tipoOrden = this.formaOrden(sortOrder);
				nombreCampoBd = this.nombreCampoOrden(sortField);
			}
			
			if (this.filtroNemoDto.getcEmisor() != null|| this.filtroNemoDto.getcTipoTasa() != null|| this.filtroNemoDto.getcNemotecnico() != null|| this.filtroNemoDto.getcIsin() != null) {
				listaTitulos = generalesFacadeLocal.listarTitulosPorEmisorPorTasa(
								this.filtroNemoDto.getcEmisor(),
								this.filtroNemoDto.getcTipoTasa(),
								this.filtroNemoDto.getcNemotecnico(),
								this.filtroNemoDto.getcIsin(), first, pageSize,nombreCampoBd,tipoOrden );
			}
		
		} catch (Exception e) {
			LOGS.LOG_ERRORES.error("ERROR AL REALIZAR LA CARGA LAZY EN LA CONSULTA DE NEMOTECNICOS, DESCRIPCION ERROR:  "+ e);
		}

		return listaTitulos;
	}

	
	/**
	 * Metodo que permite consultar el nombre del campo en base de datos por el cual se realiza el order by.
	 * @param sortField
	 * @return
	 */
	private String nombreCampoOrden(String sortField){
		String nombreCampoBd = null;
		try{
			Field campo = TituloDto.class.getDeclaredField(sortField);
			campo.setAccessible(true);
			Annotation[] anotaciones = campo.getAnnotations();
			for (Annotation anotacion : anotaciones) {
				Class<? extends Annotation> type = anotacion.annotationType();
				for (Method method : type.getDeclaredMethods()) {
					if (method.getName().equals("name")) {
						nombreCampoBd = method.invoke(anotacion,(Object[]) null).toString();
						break;
					}
				}
			}
		}catch(Exception e){
			LOGS.LOG_DEBUG.error("ERROR AL CONSULTAR LA ANOTACION DEL CAMPO: " + sortField + ", DESCRIPCION ERROR: "+ e );
		}
		
		return nombreCampoBd;
	}
	
	/**
	 * Metodo que permite saber si la consulta se realizar de forma ascendente o descentente
	 * @param sortOrder
	 * @return
	 */
	private String formaOrden(SortOrder sortOrder){
		return SortOrder.ASCENDING.equals(sortOrder) ? "ASC" : "DESC";	
	}
}
