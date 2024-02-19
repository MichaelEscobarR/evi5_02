/**
 * 
 */
package com.mike.tiendadata.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mike.tiendadata.connection.ConnectionFactory;
import com.mike.tiendadata.dao.EmpleadoDAO;
import com.mike.tiendadata.myexceptions.TiendaException;
import com.mike.tiendaentities.entity.Empleado;
import com.mike.tiendaentities.entity.Rol;

/**
 * @author Michael Escobar
 *
 */
public class EmpleadoDAOImpl implements EmpleadoDAO {
	
	static {
		try {
			ConnectionFactory.conectar();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int guardar(Empleado empleado) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualizar(Empleado empleado) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(int idEmpleado) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Empleado> consultar() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado consultarPorId(int idEmpleado) throws SQLException, TiendaException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Empleado consultarPorUsuarioYPassword(String usuario, String password, boolean esSuperAdminGeneral) throws SQLException {
		
		Empleado empleado = null;
		String sql = "";
		
		if (esSuperAdminGeneral) {
			sql = "SELECT e.*, r.nombre AS nombreRol " + 
					"FROM restaurante.empleado e, rol r " + 
					"WHERE e.idRol = r.idRol " + 
					"AND (e.usuario = '"+usuario+"' OR e.email = '"+usuario+"') " + 
					"AND e.password = '"+password+"' " + 
					"AND e.idSucursal IS NULL;";
		} else {
			
		}
		
		ResultSet rs = ConnectionFactory.ejecutarSQLSelect(sql);
		
		if (rs != null) {
			if (rs.next()) {
				empleado = new Empleado();
				empleado.setIdEmpleado(rs.getInt("idEmpleado"));
				empleado.setNombre(rs.getString("nombre"));
				empleado.setPrimerApellido(rs.getString("primerApellido"));
				empleado.setSegundoApellido(rs.getString("segundoApellido"));
				empleado.setUsuario(rs.getString("usuario"));
				empleado.setPassword(rs.getString("password"));
				empleado.setEmail(rs.getString("email"));
				empleado.setEstatus(rs.getBoolean("estatus"));
				empleado.setSuperadmin(rs.getBoolean("superadmin"));
				empleado.setSuperadminGeneral(rs.getBoolean("superadmingeneral"));
				
				Rol rol = new Rol();
				rol.setIdRol(rs.getInt("idRol"));
				rol.setNombre(rs.getString("nombreRol"));
				empleado.setRol(rol);
				
				
				if (!empleado.isSuperadminGeneral()) {
					
				}
			}
		} 
		
		return empleado;
		
	}

}
