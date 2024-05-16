package co.com.infovalmer.converter;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import org.primefaces.component.picklist.PickList;
import org.primefaces.model.DualListModel;

import co.com.infovalmer.dto.TipoMonedaDto;


public class TipoMonedaConverter implements Converter {
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return getObjectFromUIPickListComponent(component,value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null)
			return ((TipoMonedaDto) value).getcTipomoneda().toString();
		else
			return null;
	}
	
	private TipoMonedaDto getObjectFromUIPickListComponent(UIComponent component, String value) {
		final DualListModel<TipoMonedaDto> dualList;
		try{
			dualList = (DualListModel<TipoMonedaDto>) ((PickList)component).getValue();
			TipoMonedaDto TipoMonedaDto = getObjectFromList(dualList.getSource(),value);
			if(TipoMonedaDto==null){
				TipoMonedaDto = getObjectFromList(dualList.getTarget(),value);
			}
			return TipoMonedaDto;
		}catch(ClassCastException cce){
			throw new ConverterException();
		}catch(NumberFormatException nfe){
			throw new ConverterException();
		}
	}
	
	private TipoMonedaDto getObjectFromList(final List<?> list, final String identifier) {
		for(final Object object:list){
			final TipoMonedaDto TipoMonedaDto = (TipoMonedaDto) object;
			if(TipoMonedaDto.getcTipomoneda().equals(identifier)){
				return TipoMonedaDto;
			}
		}
		return null;
	}
}
