package co.com.infovalmer.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import co.com.infovalmer.controller.derivados.DescargaArchivosOTCController;
import co.com.infovalmer.dto.TipoCurvaAgrupadorDto;
import co.com.infovalmer.utilidades.LOGS;

@FacesConverter(value = "agrupadorConverter")
public class AgrupadorConverter implements Converter{

	@Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0) {
                return null;
            } else {
                if (value != null && !value.equals("null")) {
                	DescargaArchivosOTCController controller = (DescargaArchivosOTCController) facesContext.getApplication().getELResolver().
                            getValue(facesContext.getELContext(), null, "descargaArchivosOTCController");

                    try {
                        return controller.getDerivadosFacadeLocal().buscarPorId(Integer.valueOf(value));
                    } catch (Exception e) {
                        LOGS.LOG_ERRORES.error("ERROR AL COVERTIR EL OBJETO DESCRIPCION ERROR: "+e);
                    }
                } else {
                    return null;
                }

            }
        return null;
    }
    
    String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object object) {
          if (object == null) {
                return null;
            }
            if (object instanceof TipoCurvaAgrupadorDto) {
                TipoCurvaAgrupadorDto tp = (TipoCurvaAgrupadorDto) object;
                if (tp.getIAgrupador() == null) {
                    return null;
                }
                return getStringKey(Long.valueOf(String.valueOf(tp.getIAgrupador())));
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + TipoCurvaAgrupadorDto.class.getName());
            }
        }

}
