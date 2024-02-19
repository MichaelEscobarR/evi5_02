/**
 * 
 */
package com.mike.tiendaweb.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.mike.tiendaentities.entity.Empleado;
import com.mike.tiendaservice.services.LoginService;
import com.mike.tiendaweb.utils.ControllersUtil;

/**
 * @author Michael Escobar
 *
 */
@ManagedBean
@ViewScoped
public class LoginController {

	private String username;
	private String password;
	private boolean esSuperAdminGeneral;
	
	
	private LoginService loginService = new LoginService();
	
	
	
	/**
	 * @return the esSuperAdminGeneral
	 */
	public boolean isEsSuperAdminGeneral() {
		return esSuperAdminGeneral;
	}


	/**
	 * @param esSuperAdminGeneral the esSuperAdminGeneral to set
	 */
	public void setEsSuperAdminGeneral(boolean esSuperAdminGeneral) {
		this.esSuperAdminGeneral = esSuperAdminGeneral;
	}


	public void entrar() {
		
		try {
			Empleado empleadoConsultado = this.loginService.consultarPorUsuarioYPassword(this.username, this.password, this.esSuperAdminGeneral);
			
			if (empleadoConsultado != null) {
				if (empleadoConsultado.isEstatus()) {
					if (empleadoConsultado.isSuperadminGeneral()) {
						ControllersUtil.redireccionar("/admintiendas.xhtml");
					}
				} else {
					ControllersUtil.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "ERROR", "El usuario está deshabilitado del sistema");
				}
			} else {
				ControllersUtil.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "ERROR", "El usuario y/o contraseña son incorrectos");
			}
			
		} catch (SQLException e) {
			ControllersUtil.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "ERROR", "Hubo un problema al procesar solicitud");
			e.printStackTrace();
		} catch (IOException e) {
			ControllersUtil.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "ERROR", "Hubo un problema al acceder a tu pantalla de incio");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
}
