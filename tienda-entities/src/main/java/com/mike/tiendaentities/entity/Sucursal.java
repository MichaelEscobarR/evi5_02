/**
 * 
 */
package com.mike.tiendaentities.entity;

/**
 * @author Michael Escobar
 *
 */
public class Sucursal {
	
	private int idSucursal;
	private String nombre;
	private Tienda tienda;
	
	
	
	
	
	/**
	 * @return the idSucursal
	 */
	public int getIdSucursal() {
		return idSucursal;
	}
	/**
	 * @param idSucursal the idSucursal to set
	 */
	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the tienda
	 */
	public Tienda getTienda() {
		return tienda;
	}
	/**
	 * @param tienda the tienda to set
	 */
	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

	
	
}
