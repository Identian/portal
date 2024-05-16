package co.com.infovalmer.validator;
 
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import org.primefaces.validate.ClientValidator;
 
/**
 * Custom JSF Validator for Email input
 */
@FacesValidator("custom.validadorCampos")
public class ValidadorCampos implements Validator, ClientValidator {
 
 
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {

    	if(component.getClientId().equals("formImpugnacionRVL:textTelefono") ){
    		  Pattern pat = Pattern.compile("[0-9]*");
    		  Matcher mat = pat.matcher((String)value);
    		if(!mat.matches()) {
            	throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error de validacion", 
                        value + " el campo telefono solo puede contener numeros. "));
            }
    		
    	}
		if (component.getClientId().equals("formImpugnacionRVMI:textTelefono")) {
			Pattern pat = Pattern.compile("[0-9]*");
			Matcher mat = pat.matcher((String) value);
			if (!mat.matches()) {
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error de validacion",
						value + " el campo telefono solo puede contener numeros. "));
			}

		}
    }
 
    public Map<String, Object> getMetadata() {
        return null;
    }
 
    public String getValidatorId() {
        return "custom.validadorCampos";
    }
     
}