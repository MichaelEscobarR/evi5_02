/**
 * 
 */
package com.mike.tiendaservice.services;

import java.sql.SQLException;

import com.mike.tiendadata.dao.impl.EmpleadoDAOImpl;
import com.mike.tiendaentities.entity.Empleado;

/**
 * @author Michael Escobar
 *
 */
public class LoginService {
	
	private EmpleadoDAOImpl empleadoDAOImpl = new EmpleadoDAOImpl();
	
	public Empleado consultarPorUsuarioYPassword(String usuario, String password, boolean esSuperAdminGeneral) throws SQLException {
		return this.empleadoDAOImpl.consultarPorUsuarioYPassword(usuario, password, esSuperAdminGeneral);
	}

}
