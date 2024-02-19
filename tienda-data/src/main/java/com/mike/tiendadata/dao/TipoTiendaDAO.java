/**
 * 
 */
package com.mike.tiendadata.dao;

import java.sql.SQLException;
import java.util.List;

import com.mike.tiendaentities.entity.TipoTienda;
import com.mike.tiendadata.myexceptions.TiendaException;

/**
 * @author Michael Escobar
 *
 */
public interface TipoTiendaDAO {
	
	
	int guardar(TipoTienda tipoTienda) throws SQLException;
	
	int actualizar(TipoTienda tipoTienda) throws SQLException;
	
	int eliminar(int idtipoTienda) throws SQLException;
	
	List<TipoTienda> consultar() throws SQLException;
	
	TipoTienda consultarPorId(int idTipoTienda) throws SQLException, TiendaException;
	
}
