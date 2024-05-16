package co.com.infovalmer.utilities;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Utils {

	public Utils() {
		// TODO Auto-generated constructor stub
	}

	public static void addErrorMessage(Exception ex, String defaultMsg) {
		String msg = ex.getLocalizedMessage();
		if (msg != null && msg.length() > 0) {
			addErrorMessage(msg);
		} else {
			addErrorMessage(defaultMsg);
		}
	}

	public static void addErrorMessages(List<String> messages) {
		for (String message : messages) {
			addErrorMessage(message);
		}
	}

	public static void addErrorMessage(String msg) {
		FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR,msg, msg);
		FacesContext.getCurrentInstance().addMessage(null, facesMsg);
	}
	
	public static void adicionarMensajeErrorPorIdComponente(String idComponente, String mensaje) {
		FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR,mensaje,null);
		FacesContext.getCurrentInstance().addMessage(idComponente, facesMsg);
	}
	
	public static void adicionarMensajeDeAdventenciaPorIdComponente(String idComponente, String mensaje) {
		FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO,mensaje,null);
		FacesContext.getCurrentInstance().addMessage(idComponente, facesMsg);
	}
	
	public static void adicionarMensajeDeInformacionPorIdComponente(String idComponente, String mensaje) {
		FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO,mensaje,null);
		FacesContext.getCurrentInstance().addMessage(idComponente, facesMsg);
	}
	
	public static void adicionarMensajeDeErrorFatalPorIdComponente(String idComponente, String mensaje) {
		FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_FATAL,mensaje,null);
		FacesContext.getCurrentInstance().addMessage(idComponente, facesMsg);
	}

	public static void addSuccessMessage(String msg) {
		FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO,msg, msg);
		FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
	}

	public static void addWarnMessage(String msg) {
		FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_WARN,msg, msg);
		FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
	}

}
