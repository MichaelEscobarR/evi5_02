/**
 * 
 */
package com.mike.tiendaservice.services;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import com.mike.tiendadata.dao.impl.TipoTiendaDAOImpl;
import com.mike.tiendaentities.entity.TipoTienda;

/**
 * @author Michael Escobar
 *
 */
public class AdminGeneralService {
	
	private TipoTiendaDAOImpl tipoTiendaDAOImpl = new TipoTiendaDAOImpl();
	
	//:::::::TIPOS DE TIENDAS::::::://
	
	public List<TipoTienda> consultarTiposTiendas() throws SQLException{
		return this.tipoTiendaDAOImpl.consultar();
	}
	
	public int guardarTipoTienda(TipoTienda tipoTienda) throws SQLException {
		tipoTienda.setFechaCreacion(LocalDateTime.now());
		tipoTienda.setEstatus(true);
		
		return this.tipoTiendaDAOImpl.guardar(tipoTienda);
	}

}
