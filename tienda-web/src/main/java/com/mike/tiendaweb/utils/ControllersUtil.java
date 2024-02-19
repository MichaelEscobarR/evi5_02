/**
 * 
 */
package com.mike.tiendaweb.utils;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Michael Escobar
 *
 */
public class ControllersUtil {
	
	public static void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		String contexPath = ec.getRequestContextPath();
//		ec.redirect(contexPath + pagina);
		ec.redirect(contexPath.concat(pagina));
	}
	
	public static void mostrarMensaje(Severity severity, String titulo, String mensaje) {

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, titulo, mensaje));
	}

}
