package co.com.infovalmer.utilities;

import java.io.FileInputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.context.RequestContext;

import com.google.gson.Gson;

import co.com.infovalmer.dto.AccesoFechaUsuarioDto;
import co.com.infovalmer.dto.Usuario;
import co.com.infovalmer.dto.UsuarioOpcionDto;
import co.com.infovalmer.ejb.generales.GeneralesFacadeLocal;
import co.com.infovalmer.utilidades.LOGS;

public class Common implements Serializable {

	private static final long serialVersionUID = 1L;

	protected SimpleDateFormat formatoFechas = new SimpleDateFormat("yyyy-MM-dd");

	protected SimpleDateFormat formatoFechas2 = new SimpleDateFormat("yyyyMMdd");

	protected SimpleDateFormat formatoFechas3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	protected SimpleDateFormat formatoDia = new SimpleDateFormat("dd");

	protected Properties archivoConfiguracion;

	protected ResourceBundle resource;

	protected final String separadorCsv = ",";

	protected String ipAdminContenido;

	protected Usuario usuarioFinal;

	private Date minimoFechaInicial = null;

	protected String url;

	private List<AccesoFechaUsuarioDto> accesoFechaUsuario;

	private List<AccesoFechaUsuarioDto> listaAccesoFechaUsuario;

	private Integer limiteAcceso;

	public Common() {
		this.minimoFechaInicial = this.calcularMinimoFecha(-1 * this.consultarMinimoMesesConsulta());
		resource = ResourceBundle.getBundle("/Messages");
		this.cargarProperties();
		this.ipAdminContenido = this.lecturaPropiedades("IP_CMS");
	}

	public ResourceBundle getResource() {
		return resource;
	}

	public void setResource(ResourceBundle resource) {
		this.resource = resource;
	}

	public String getIpAdminContenido() {
		return ipAdminContenido;
	}

	public void setIpAdminContenido(String ipAdminContenido) {
		this.ipAdminContenido = ipAdminContenido;
	}

	public Usuario getUsuarioFinal() {
		return usuarioFinal;
	}

	public void setUsuarioFinal(Usuario usuarioFinal) {
		this.usuarioFinal = usuarioFinal;
	}

	public Date getMinimoFechaInicial() {
		return minimoFechaInicial;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Metodo que permite limpiar los filtros que tenga un datatable.
	 */
	public void limpiarFiltrosDataTable(String idDataTable) {
		DataTable dataTable = (DataTable) FacesContext.getCurrentInstance().getViewRoot().findComponent(idDataTable);
		if (!dataTable.getFilters().isEmpty()) {
			dataTable.reset();
		}
	}

	public void actualizarComponente(String idComponente) {
		RequestContext.getCurrentInstance().update(idComponente);
	}

	/**
	 * Metodo que retorna una fecha con el formato YYYY-MM-DD
	 * 
	 * @param fecha
	 */
	public String convertirFecha(Date fecha) {
		String fechaFinal = null;
		try {
			fechaFinal = formatoFechas.format(fecha);
		} catch (Exception e) {

		}
		return fechaFinal;
	}

	public SimpleDateFormat getFormatoFechas3() {
		return formatoFechas3;
	}

	public void setFormatoFechas3(SimpleDateFormat formatoFechas3) {
		this.formatoFechas3 = formatoFechas3;
	}

	/**
	 * Metodo que permite cargar el archivo de propiedades generales del aplicativo
	 * de infovalmer.
	 */
	public void cargarProperties() {
		this.archivoConfiguracion = new Properties();
		try {
			this.archivoConfiguracion.load(new FileInputStream(System.getProperty("propertyInfovalmer")));
		} catch (Exception e) {
			LOGS.LOG_ERRORES.error(
					"ERROR AL CONSULTAR EL ARCHIVO GENERAL DE PROPERTIES DE INFOVALMER: " + "DESCRIPCION ERROR: " + e);
		}
	}

	/**
	 * Metodo que permite leer la propiedad del archivo config.properties
	 * 
	 * @param idPropiedad
	 * @return
	 */
	public String lecturaPropiedades(String idPropiedad) {
		String descripcionPropiedad = null;
		try {
			this.cargarProperties();
			descripcionPropiedad = this.archivoConfiguracion.getProperty(idPropiedad);
		} catch (Exception e) {
			LOGS.LOG_DEBUG.error("ERROR AL CONSULTAR LA PROPIEDAD : " + idPropiedad + ", DESCRIPCION ERROR: " + e);
		}
		return descripcionPropiedad;
	}

	/**
	 * Metodo que permite realizar la lectura del parametreo "pu", el cual contiene
	 * informacion del usuario tambien realiza la decodificacion del parametros que
	 * llega en base 64 finalmente se realiza un transformacion de la trama JSON a
	 * un objeto Usuario.
	 */
	public void lecturaParametrosUsuario() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		Map<String, String> parametros = facesContext.getExternalContext().getRequestParameterMap();
		Gson gson = new Gson();
		try {
			if(this.usuarioFinal == null) {//agregado
				String parametrosUser = parametros.get("pu");
				// LOGS.LOG_DEBUG.info(parametrosUser);
				// String parametrosUser = null;
				// String parametrosUser =
				// "eyJub21icmVzIjoiIiwiYXBlbGxpZG9zIjoiIiwiZW50aWRhZCI6IiIsImNhcmdvIjoiIiwicGFpcyI6IiIsImNpdWRhZCI6IiIsIm5pdCI6IiIsInVzZXJJZCI6IjEiLCJVc2VyTG9naW4iOiJvY2FpY2Vkb0BwcmVjaWEuY28iLCJ1c2VyRW1haWwiOiJvY2FpY2Vkb0BwcmVjaWEuY28iLCJyb2wiOiJVc2VyIn0=";
				byte[] decoded = Base64.decodeBase64(parametrosUser.getBytes());
				String user = new String(decoded, "UTF-8");
				this.usuarioFinal = gson.fromJson(user, Usuario.class);
			}
		} catch (Exception e) {
			// ++e.printStackTrace();
			LOGS.LOG_ERRORES.error(
					"SE PRESENTO UN ERROR AL RECIBIR EL PARAMETRO pu EL CUAL CONTIENE INFORMACION DEL USUARIO: " + e);
		}
	}

	public void consultarUrl() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		this.url = facesContext.getViewRoot().getViewId()
				.split("/")[facesContext.getViewRoot().getViewId().split("/").length - 1];

	}

	/**
	 * 
	 * @param httpServletRequest
	 */
	public void lecturaParametrosUsuario(HttpServletRequest httpServletRequest) {
		Gson gson = new Gson();
		try {
			//if(this.usuarioFinal == null) {
				String parametrosUser = httpServletRequest.getParameter("pu");
				byte[] decoded = Base64.decodeBase64(parametrosUser.getBytes());
				String user = new String(decoded, "UTF-8");
				this.usuarioFinal = gson.fromJson(user, Usuario.class);
			//}
		} catch (Exception e) {
			//Utils.addWarnMessage("Por Favor, Iniciar de nuevo sesión");
			LOGS.LOG_ERRORES.error(
					"SE PRESENTO UN ERROR AL RECIBIR EL PARAMETRO pu EL CUAL CONTIENE INFORMACION DEL USUARIO: " + e);
		}
	}

	/**
	 * Metodo que permite consultar la propiedad que retorna el tamaño de los
	 * caracteres minimos para ejecutar alguna consulta dentro de un campo
	 * autocomplete principalmente en nemotecnicos y isin
	 */
	public int consultaMinimoCaracteres() {
		int caracteresMinimoConsulta = 0;
		String propiedad = this.lecturaPropiedades("CARACTERES_MINIMOS_CONSULTA");
		if (propiedad == null)
			caracteresMinimoConsulta = 3;
		else {
			try {
				caracteresMinimoConsulta = Integer.parseInt(propiedad);
			} catch (Exception e) {
				caracteresMinimoConsulta = 3;
			}
		}
		return caracteresMinimoConsulta;
	}

	/**
	 * Maximo de resultados mostrados en un campo autocomplete
	 * 
	 * @return
	 */
	public String consultaMaximoResultados() {
		String maximoResultados = null;
		String propiedad = this.lecturaPropiedades("MAXIMO_RESULT_AUTOCOMPLETE");
		if (propiedad != null)
			maximoResultados = propiedad;
		return maximoResultados;
	}

	/**
	 * Metodo que retorna maximo de decimales en los campos numericos de tablas
	 * 
	 * @return
	 */
	public String consultaMaximoDecimales() {
		String maximoResultados = "5";
		String propiedad = this.lecturaPropiedades("MAXIMO_DECIMALES_TABLA");
		if (propiedad != null)
			maximoResultados = propiedad;
		return maximoResultados;
	}

	/**
	 * Metodo que permite consultar la propiedad MINIMO_MESES_CONSULTA para saber
	 * cuantos meses se pueden seleccionar desde la fecha Inicial
	 * 
	 * @return
	 */
	public int consultarMinimoMesesConsulta() {
		int maximoResultados = 6;
		String propiedad = this.lecturaPropiedades("MINIMO_MESES_CONSULTA");
		try {
			if (propiedad != null)
				maximoResultados = Integer.valueOf(propiedad);
		} catch (Exception e) {
			LOGS.LOG_ERRORES.error(
					"LA PROPIEDAD \"MINIMO_MESES_CONSULTA\" NO ENCUENTRA O ESTA DE MANERA INCORRECTA EN EL ARCHIVO CONFIG.PROPERTIES ");
		}
		return maximoResultados;
	}

	/**
	 * Metodo que permite consultar la maxima cantidad de registros que se pueden
	 * retornar en la consula de consulta historico de precios
	 * 
	 * @return
	 */
	public int consultarMaximoConsultaHistoricoPrecios() {
		int maximoResultados = 1000;
		String propiedad = this.lecturaPropiedades("MAXIMO_REGISTROS_CONSULTA_HISTORICO_PRECIOS");
		try {
			if (propiedad != null)
				maximoResultados = Integer.valueOf(propiedad);

		} catch (Exception e) {
			LOGS.LOG_ERRORES.error(
					"LA PROPIEDAD \"MAXIMO_REGISTROS_CONSULTA_HISTORICO_PRECIOS\" NO ENCUENTRA O ESTA DE MANERA INCORRECTA EN EL ARCHIVO CONFIG.PROPERTIES ");
		}
		return maximoResultados;
	}

	/**
	 * Metodo que permite limpiar los campos de las vistas.
	 * 
	 * @param controller
	 */
	public void limpiarCampos(String controller) {
		FacesContext.getCurrentInstance().getViewRoot().getViewMap().remove(controller);
	}

	/**
	 * Metodo que permite eliminar numero de dias a una fecha.
	 * 
	 * @param date
	 * @param days
	 * @return
	 */
	public static Date addRemoveDays(Date date, int days) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
		return cal.getTime();
	}

	/**
	 * Metodo que permite calcular el valor minimo en el filtro de fecha Inicial
	 * 
	 * @param cantidadMeses
	 * @return
	 */
	public Date calcularMinimoFecha(int cantidadMeses) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, cantidadMeses);
		return cal.getTime();
	}

	public boolean validarFechaAcceso() {

		return true;
	}

	public int obtenerDia(Date fecha) {
		if (null == fecha) {
			return 0;
		} else {
			return Integer.parseInt(formatoDia.format(fecha));
		}
	}

	public String replazarValor(String a, String viejo, String nuevo) {

		return a.replace(viejo, nuevo);
	}

	public boolean validarAccesoPorFechav1(Date fechaFinal, GeneralesFacadeLocal generalesFacadeLocal) {
		boolean acceso = false;
		String mensaje = null;
		AccesoFechaUsuarioDto objaccesoFechaU = new AccesoFechaUsuarioDto();
		UsuarioOpcionDto usuarioOpcion = null;
		LOGS.LOG_DEBUG.debug("INICIANDO VALIDACION ACCESO POR FECHA");
		try {
			listaAccesoFechaUsuario = generalesFacadeLocal.validarAccesoDescargaFecha(this.usuarioFinal, this.url);
			limiteAcceso = generalesFacadeLocal.limiteAccesoFecha(this.usuarioFinal, this.url);
			usuarioOpcion = generalesFacadeLocal.consultarPermisosPagina(this.usuarioFinal, this.url);
			objaccesoFechaU.setIdUsuarioOpcion(usuarioOpcion.getIdUsuarioOpcion());
			objaccesoFechaU.setFecha_permitida(fechaFinal);
			objaccesoFechaU.setDia_permitido(obtenerDia(fechaFinal));
			mensaje = replazarValor(resource.getString("VAUF"), "?1", String.valueOf(obtenerDia(fechaFinal)));
			mensaje = replazarValor(mensaje, "?2", String.valueOf(limiteAcceso - (listaAccesoFechaUsuario.size() - 1)));

			if (limiteAcceso != 0) {
				if (listaAccesoFechaUsuario.size() != 0) {
					for (AccesoFechaUsuarioDto accesoFechaUsuarioDto : listaAccesoFechaUsuario) {
						if (accesoFechaUsuarioDto.getDia_permitido() == obtenerDia(fechaFinal)) {
							acceso = true;
							break;
						}
					}

					if (listaAccesoFechaUsuario.size() < limiteAcceso && acceso == false) {
						generalesFacadeLocal.registrarFechaAccesoUsuario(objaccesoFechaU);
						Utils.addWarnMessage(mensaje);
						acceso = true;

					} else if (acceso == false) {
						mensaje = replazarValor(resource.getString("VAUF_ERROR"), "?1",
								String.valueOf(obtenerDia(fechaFinal)));
						mensaje = replazarValor(mensaje, "?2", String.valueOf(limiteAcceso));
						Utils.addWarnMessage(mensaje);
						LOGS.LOG_DEBUG.debug("NO CUENTA CON PERMISOS PARA ACCEDER " + this.usuarioFinal.getUserLogin()
								+ " , dia " + obtenerDia(fechaFinal));

					}
				} else {
					generalesFacadeLocal.registrarFechaAccesoUsuario(objaccesoFechaU);
					Utils.addWarnMessage(mensaje);
				}
			} else {
				acceso = true;
				// mensaje =replazarValor(resource.getString("VAUF_ERROR"), "?1",
				// String.valueOf(obtenerDia(fechaFinal)));
				//// mensaje = replazarValor(mensaje, "?2", String.valueOf( limiteAcceso));
				// Utils.addWarnMessage(mensaje);
			}
		} catch (Exception e) {
			LOGS.LOG_ERRORES.error("ERROR AL MOMENTO DE VALIDAR ACCESO POR FECHA DESCRIPCION ERROR: " + e);
		}
		return acceso;
	}

	public boolean validarAccesoPorFecha(Date fechaFinal, GeneralesFacadeLocal generalesFacadeLocal) {
		boolean acceso = false;
		String mensaje = null;
		AccesoFechaUsuarioDto objaccesoFechaU = new AccesoFechaUsuarioDto();
		UsuarioOpcionDto usuarioOpcion = null;
		LOGS.LOG_DEBUG.debug("INICIANDO VALIDACION ACCESO POR FECHA V1");
		try {
			accesoFechaUsuario = generalesFacadeLocal.validarAccesoDescargaFechav1(this.usuarioFinal, this.url,
					fechaFinal.getMonth());
			limiteAcceso = generalesFacadeLocal.limiteAccesoFecha(this.usuarioFinal, this.url);
			// generalesFacadeLocal.limiteAccesoFecha(this.usuarioFinal, this.url);
			usuarioOpcion = generalesFacadeLocal.consultarPermisosPagina(this.usuarioFinal, this.url);
			objaccesoFechaU.setIdUsuarioOpcion(usuarioOpcion.getIdUsuarioOpcion());
			objaccesoFechaU.setUltimo_mes(fechaFinal.getMonth());
			objaccesoFechaU.setUltimo_dia(fechaFinal.getDate());

			if (limiteAcceso != 0) {
				if (!accesoFechaUsuario.isEmpty()) {
					int i = 0;
					while (i < accesoFechaUsuario.size()) {
						if (fechaFinal.getDate() == accesoFechaUsuario.get(i).getUltimo_dia()) {
							acceso = true;
							LOGS.LOG_DEBUG.debug("fecha igual " + objaccesoFechaU);
							i = accesoFechaUsuario.size();
						}
						i++;
					}
					if (accesoFechaUsuario.size() < limiteAcceso && !acceso) {
						LOGS.LOG_DEBUG.debug("Update" + objaccesoFechaU);
						objaccesoFechaU.setId(accesoFechaUsuario.get(0).getId());
						update(generalesFacadeLocal, objaccesoFechaU);
						acceso = true;
					} else if (!acceso) {
						mensaje = replazarValor(resource.getString("VAUF_ERROR"), "?1",
								String.valueOf(obtenerDia(fechaFinal)));
						mensaje = replazarValor(mensaje, "?2", String.valueOf(limiteAcceso));
						Utils.addWarnMessage(mensaje);
						LOGS.LOG_DEBUG.debug("NO CUENTA CON PERMISOS PARA ACCEDER " + this.usuarioFinal.getUserLogin()
								+ " , dia " + obtenerDia(fechaFinal));
						acceso = false;
						LOGS.LOG_DEBUG.debug("No entra " + objaccesoFechaU);

					}

				} else {
					LOGS.LOG_DEBUG.debug("Update init " + objaccesoFechaU);
					init(generalesFacadeLocal, objaccesoFechaU);
					acceso = true;
				}
			} else {
				LOGS.LOG_DEBUG.debug("Limites 0 " + objaccesoFechaU);
				acceso = true;
			}
		} catch (Exception e) {
			LOGS.LOG_ERRORES.error("ERROR AL MOMENTO DE VALIDAR ACCESO POR FECHA DESCRIPCION ERROR: " + e);
		}
		LOGS.LOG_ERRORES.error("FINALIZA VALIDACION DESCARGA: ");
		return acceso;
	}

	private void init(GeneralesFacadeLocal generalesFacadeLocal, AccesoFechaUsuarioDto objaccesoFechaU)
			throws Exception {
		generalesFacadeLocal.registrarFechaAccesoUsuariov1(objaccesoFechaU);
	}

	private void update(GeneralesFacadeLocal generalesFacadeLocal, AccesoFechaUsuarioDto objaccesoFechaU)
			throws Exception {
		generalesFacadeLocal.updateFechaAccesoUsuario(objaccesoFechaU);
	}

}
