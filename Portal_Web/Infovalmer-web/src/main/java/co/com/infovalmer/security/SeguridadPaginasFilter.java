package co.com.infovalmer.security;

import java.io.IOException;

import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;

import co.com.infovalmer.dto.enums.PeticionesHtml;
import co.com.infovalmer.ejb.generales.GeneralesFacadeLocal;
import co.com.infovalmer.utilidades.LOGS;
import co.com.infovalmer.utilities.Common;

public class SeguridadPaginasFilter extends Common implements Filter {

	private static final long serialVersionUID = 1L;

	@EJB
	GeneralesFacadeLocal generalFacadelocal;

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		
		
		String validarPost = this.lecturaPropiedades("VALIDAR_POST");
		LOGS.LOG_DEBUG.info("INICIA VALIDACION USUARIO");
		try {
			this.url = httpServletRequest.getRequestURI()
					.split("/")[httpServletRequest.getRequestURI().split("/").length - 1];
			// Validacion de si las peticiones se realizar por metodo POST.
			String parametrosUser = httpServletRequest.getParameter("pu");
			if(parametrosUser != null) {//Imprimi el parámetro pu decodificado
				byte[] decoded = Base64.decodeBase64(parametrosUser.getBytes());//agregado
				String user = new String(decoded, "UTF-8");//agregado
				LOGS.LOG_DEBUG.info("1 EL PARAMETRO pu " + user + " usuario" + this.usuarioFinal);//agregado
			}else {
				LOGS.LOG_DEBUG.info("1 EL PARAMETRO pu " + parametrosUser + " usuario" + this.usuarioFinal);
				LOGS.LOG_DEBUG.info("URL: " + this.url) ;
			}
			
			if (validarPost.equals("S")) {
				if (httpServletRequest.getMethod().equalsIgnoreCase(PeticionesHtml.POST.getValor())) {
					this.lecturaParametrosUsuario(httpServletRequest);
					if (this.usuarioFinal != null) {
						if (generalFacadelocal.validarPermisoPagina(this.usuarioFinal, url)) {
							filterChain.doFilter(httpServletRequest, httpServletResponse);
						} else {
							LOGS.LOG_DEBUG.info("no entra 2");
							//httpServletRequest.getRequestDispatcher("../../error.xhtml").forward(request, response);
							httpServletResponse.sendRedirect("../../error.xhtml");
						}
					} else {
						
						LOGS.LOG_DEBUG.info("no entra 3");					
						httpServletResponse.sendRedirect("../../errorSession.xhtml");
						//httpServletRequest.getRequestDispatcher("../../error.xhtml").forward(request, response);
						//httpServletResponse.sendError(httpServletResponse.SC_UNAUTHORIZED,"https://pruebas.precia.com.co/Infovalmer-web/faces/errorSession.xhtml");
						//httpServletResponse.sendRedirect("https://pruebas.precia.com.co/Infovalmer-web/faces/errorSession.xhtml");
						return;						
						//LOGS.LOG_DEBUG.info("Re direcciona ok");
					}
				} else {
					if (generalFacadelocal.requiereAccesoPagina(url)) {
						// Se redirige a la pagina de Error.
						LOGS.LOG_DEBUG.debug(
								"SE ESTA REALIZANDO UN LLAMADO A LA PAGINA DE FORMA INCORRECTA, SE MOSTRARA LA PAGINA DE ERROR");
						//httpServletRequest.getRequestDispatcher("../../error.xhtml").forward(request, response);
						httpServletResponse.sendRedirect("../../error.xhtml");
						return;
					} else {
						LOGS.LOG_DEBUG.info("no Entra 5");
						filterChain.doFilter(httpServletRequest, httpServletResponse);
					}

				}
			} else if (validarPost.equals("N")) {
				filterChain.doFilter(httpServletRequest, httpServletResponse);
			} else {
				httpServletResponse.sendRedirect("../../error.xhtml");
				//httpServletRequest.getRequestDispatcher("../../error.xhtml").forward(request, response);
				return;

			}

		} catch (Exception e) {
			e.printStackTrace();
			LOGS.LOG_ERRORES.error("ERROR LA VALIDACION DENTRO DEL FILTER: " + e);
			httpServletRequest.getRequestDispatcher("../../error.xhtml").forward(request, response);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
