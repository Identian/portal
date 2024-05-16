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

import co.com.infovalmer.dto.PrecioPromedioDto;
import co.com.infovalmer.dto.TituloDto;
import co.com.infovalmer.dto.vistas.HistoricoPrecioVista;
import co.com.infovalmer.ejb.rentaFija.RentaFijaFacadeLocal;
import co.com.infovalmer.utilidades.LOGS;

public class LazyHistoricoPrecios extends LazyDataModel<PrecioPromedioDto> {

	private static final long serialVersionUID = 1L;

	@EJB
	RentaFijaFacadeLocal ejbRentaFija;
	private HistoricoPrecioVista histPrecioVista;
	private int totalRegistros;

	public LazyHistoricoPrecios(HistoricoPrecioVista histPrecioVista,
			RentaFijaFacadeLocal ejbRentaFija, int totalRegistros) {
		this.histPrecioVista = histPrecioVista;
		this.ejbRentaFija = ejbRentaFija;
		this.totalRegistros = totalRegistros;
	}
	
	@Override
	public List<PrecioPromedioDto> load(int first, int pageSize,String sortField, SortOrder sortOrder, Map<String, Object> filters) {
		List<PrecioPromedioDto> data = new ArrayList<PrecioPromedioDto>();
		this.histPrecioVista.setLazyDesde(first);
		this.histPrecioVista.setLazyFilasPorQuery(pageSize);
		
		if (sortField != null) {
			this.histPrecioVista.setCampoOrden(nombreCampoOrden(sortField));
			this.histPrecioVista.setFormaOrden(formaOrden(sortOrder));
		}
		
		try {
			if (this.histPrecioVista.getFechaFinal() != null&& this.histPrecioVista.getFechaInicial() != null) {
				data = ejbRentaFija.consultarHistoricoPrecio(this.histPrecioVista);
			}
		} catch (Exception e) {
			LOGS.LOG_ERRORES.error("ERROR AL CONSULTAR DE FORMA LAZY EL HISTORICO DE PRECIOS, DESCRIPCION ERROR: " + e);
		}

		this.setRowCount(totalRegistros);
		return data;
	}
	
	/**
	 * Metodo que permite consultar el nombre del campo en base de datos por el cual se realiza el order by.
	 * @param sortField
	 * @return
	 */
	private String nombreCampoOrden(String sortField){
		String nombreCampoBd = null;
		try{
			Field campo = PrecioPromedioDto.class.getDeclaredField(sortField);
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
			LOGS.LOG_ERRORES.error("SE PRESENTO UN ERROR AL CONSULTAR LA ANOTACION DEL CAMPO: " + sortField + ", DESCRIPCION ERROR: "+ e );
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
