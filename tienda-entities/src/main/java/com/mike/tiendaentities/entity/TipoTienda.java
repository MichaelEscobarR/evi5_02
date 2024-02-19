/**
 * 
 */
package com.mike.tiendaentities.entity;


import java.util.List;

/**
 * @author Michael Escobar
 *
 */
public class TipoTienda extends CommonEntity {

	private int idTipoTienda;
	private String descripcion;
	private List<Tienda> tiendas;
	
	
	/**
	 * @return the idTipoTienda
	 */
	public int getIdTipoTienda() {
		return idTipoTienda;
	}
	/**
	 * @return the tiendas
	 */
	public List<Tienda> getTiendas() {
		return tiendas;
	}
	/**
	 * @param tiendas the tiendas to set
	 */
	public void setTiendas(List<Tienda> tiendas) {
		this.tiendas = tiendas;
	}
	/**
	 * @param idTipoTienda the idTipoTienda to set
	 */
	public void setIdTipoTienda(int idTipoTienda) {
		this.idTipoTienda = idTipoTienda;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
