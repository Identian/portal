package co.com.infovalmer.converter;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import org.primefaces.component.picklist.PickList;
import org.primefaces.model.DualListModel;

import co.com.infovalmer.dto.TipoTasaDto;

public class TipoTasaConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return getObjectFromUIPickListComponent(component,value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null)
			return ((TipoTasaDto) value).getcTipotasa().toString();
		else
			return null;
	}
	
	private TipoTasaDto getObjectFromUIPickListComponent(UIComponent component, String value) {
		final DualListModel<TipoTasaDto> dualList;
		try{
			dualList = (DualListModel<TipoTasaDto>) ((PickList)component).getValue();
			TipoTasaDto tipoTasaDto = getObjectFromList(dualList.getSource(),value);
			if(tipoTasaDto==null){
				tipoTasaDto = getObjectFromList(dualList.getTarget(),value);
			}
			return tipoTasaDto;
		}catch(ClassCastException cce){
			throw new ConverterException();
		}catch(NumberFormatException nfe){
			throw new ConverterException();
		}
	}
	
	private TipoTasaDto getObjectFromList(final List<?> list, final String identifier) {
		for(final Object object:list){
			final TipoTasaDto tipoTasaDto = (TipoTasaDto) object;
			if(tipoTasaDto.getcTipotasa().equals(identifier)){
				return tipoTasaDto;
			}
		}
		return null;
	}
}
