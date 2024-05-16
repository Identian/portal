package co.com.infovalmer.converter;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import org.primefaces.component.picklist.PickList;
import org.primefaces.model.DualListModel;

import co.com.infovalmer.dto.TipoCurvaDto;
import co.com.infovalmer.dto.TipoTasaDto;

public class TipoCurvaConverterDualList implements Converter {
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return getObjectFromUIPickListComponent(component,value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null)
			return ((TipoCurvaDto) value).getcNombre().toString();
		else
			return null;
	}
	
	private TipoCurvaDto getObjectFromUIPickListComponent(UIComponent component, String value) {
		final DualListModel<TipoCurvaDto> dualList;
		try{
			dualList = (DualListModel<TipoCurvaDto>) ((PickList)component).getValue();
			TipoCurvaDto tipoCurvaDto = getObjectFromList(dualList.getSource(),value);
			if(tipoCurvaDto==null){
				tipoCurvaDto = getObjectFromList(dualList.getTarget(),value);
			}
			return tipoCurvaDto;
		}catch(ClassCastException cce){
			throw new ConverterException();
		}catch(NumberFormatException nfe){
			throw new ConverterException();
		}
	}
	
	private TipoCurvaDto getObjectFromList(final List<?> list, final String identifier) {
		for(final Object object:list){
			final TipoCurvaDto tipoCurvaDto = (TipoCurvaDto) object;
			if(tipoCurvaDto.getcNombre().equals(identifier)){
				return tipoCurvaDto;
			}
		}
		return null;
	}
}
