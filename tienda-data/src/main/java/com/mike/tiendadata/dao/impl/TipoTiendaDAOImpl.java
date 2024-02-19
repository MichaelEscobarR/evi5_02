/**
 * 
 */
package com.mike.tiendadata.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mike.tiendadata.connection.ConnectionFactory;
import com.mike.tiendadata.dao.TipoTiendaDAO;
import com.mike.tiendaentities.entity.TipoTienda;
import com.mike.tiendadata.enums.CodigoEnum;
import com.mike.tiendadata.myexceptions.TiendaException;

/**
 * @author Michael Escobar
 *
 */
public class TipoTiendaDAOImpl implements TipoTiendaDAO{
	

	@Override
	public int guardar(TipoTienda tipoTienda) throws SQLException {
		
		String sql = "INSERT INTO restaurante.tipo_tienda(descripcion, fechaCreacion, estatus) VALUES('"+ tipoTienda.getDescripcion() +"', '"+ tipoTienda.getFechaCreacion()+"', "+tipoTienda.isEstatus()+");";
		int ejecutado = ConnectionFactory.ejecutarSQL(sql);
		
		return ejecutado;
	}

	@Override
	public int actualizar(TipoTienda tipoTienda) throws SQLException {
		
		String sql = "UPDATE restaurante.tipo_tienda SET descripcion = '"+tipoTienda.getDescripcion()+"',  fechaModificacion ='"+tipoTienda.getFechaModificacion()+"', estatus = "+tipoTienda.isEstatus()+
				" where idTipoTienda = "+tipoTienda.getIdTipoTienda()+";";
		int ejecutado = ConnectionFactory.ejecutarSQL(sql);
		
		return ejecutado;

	}

	@Override
	public int eliminar(int idTipoTienda) throws SQLException {
		String sql = "DELETE FROM restaurante.tipo_tienda where idTipoTienda = "+ idTipoTienda+ ";";
		
		int ejecutado = ConnectionFactory.ejecutarSQL(sql);
		
		return ejecutado;
	}

	@Override
	public List<TipoTienda> consultar() throws SQLException {
		String sql = "SELECT * FROM restaurante.tipo_tienda order by descripcion;";
		
		ResultSet rs = ConnectionFactory.ejecutarSQLSelect(sql);
		
		 
		List<TipoTienda> tiposTiendas = new ArrayList<TipoTienda>();
		 
		if (rs != null) {
			while (rs.next()) {
				TipoTienda tipoTienda = new TipoTienda();
				tipoTienda.setIdTipoTienda(rs.getInt("idTipoTienda"));
				tipoTienda.setDescripcion(rs.getString("descripcion"));
				tipoTienda.setFechaCreacion(rs.getTimestamp("fechaCreacion").toLocalDateTime());
				tipoTienda.setFechaModificacion(rs.getTimestamp("fechaModificacion") != null ? rs.getTimestamp("fechaModificacion").toLocalDateTime(): null);
				tipoTienda.setEstatus(rs.getBoolean("estatus"));
				
				tiposTiendas.add(tipoTienda);
			}
		} 
		 
		return tiposTiendas;
	}

	@Override
	public TipoTienda consultarPorId(int idTipoTienda) throws SQLException, TiendaException {
		String sql = "SELECT * ROM restaurante.tipo_tienda where idTipoTienda = "+idTipoTienda+";";
		
		ResultSet rs = null;
		
		
		try {
		 rs = ConnectionFactory.ejecutarSQLSelect(sql);
		} catch (Exception e) {
			
			if (e.getClass().getName().contains("SQLSyntaxErrorException")) {
				throw new TiendaException("Error de sintaxis en la sentencia " + sql, CodigoEnum.SINTAXYS_SQL_ERROR_CODE);
			} 
		}
		
		
		
		TipoTienda tipoTienda = null;
		 
		if (rs != null) {
			
			if (rs.next()) {
				tipoTienda = new TipoTienda();
				tipoTienda.setIdTipoTienda(rs.getInt("idTipoTienda"));
				tipoTienda.setDescripcion(rs.getString("descripcion"));
				tipoTienda.setFechaCreacion(rs.getTimestamp("fechaCreacion").toLocalDateTime());
				tipoTienda.setFechaModificacion(rs.getTimestamp("fechaModificacion") != null ? rs.getTimestamp("fechaModificacion").toLocalDateTime(): null);
				tipoTienda.setEstatus(rs.getBoolean("estatus"));
			}
			
					
		} 
		 
		return tipoTienda;
	}

	
	
}
