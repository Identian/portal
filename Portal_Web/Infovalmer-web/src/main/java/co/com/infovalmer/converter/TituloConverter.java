package co.com.infovalmer.converter;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import org.primefaces.component.picklist.PickList;
import org.primefaces.model.DualListModel;

import co.com.infovalmer.dto.TituloDto;


public class TituloConverter implements Converter {
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return getObjectFromUIPickListComponent(component,value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null)
			return ((TituloDto) value).getcNemotecnico().toString();
		else
			return null;
	}
	
	private TituloDto getObjectFromUIPickListComponent(UIComponent component, String value) {
		final DualListModel<TituloDto> dualList;
		try{
			dualList = (DualListModel<TituloDto>) ((PickList)component).getValue();
			TituloDto tituloDto = getObjectFromList(dualList.getSource(),value);
			if(tituloDto==null){
				tituloDto = getObjectFromList(dualList.getTarget(),value);
			}
			return tituloDto;
		}catch(ClassCastException cce){
			throw new ConverterException();
		}catch(NumberFormatException nfe){
			throw new ConverterException();
		}
	}
	
	private TituloDto getObjectFromList(final List<?> list, final String identifier) {
		for(final Object object:list){
			final TituloDto tituloDto = (TituloDto) object;
			if(tituloDto.getcNemotecnico().equals(identifier)){
				return tituloDto;
			}
		}
		return null;
	}
}
