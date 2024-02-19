/**
 * 
 */
package com.mike.tiendadata.dao;

import java.sql.SQLException;
import java.util.List;

import com.mike.tiendaentities.entity.Empleado;
import com.mike.tiendadata.myexceptions.TiendaException;

/**
 * @author Michael Escobar
 *
 */
public interface EmpleadoDAO {
	
	
	int guardar(Empleado empleado) throws SQLException;
	
	int actualizar(Empleado empleado) throws SQLException;
	
	int eliminar(int idEmpleado) throws SQLException;
	
	List<Empleado> consultar() throws SQLException;
	
	Empleado consultarPorId(int idEmpleado) throws SQLException, TiendaException;
	
}
