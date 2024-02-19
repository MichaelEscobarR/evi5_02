/**
 * 
 */
package com.mike.tiendaentities.entity;

/**
 * @author Michael
 *
 */
public class Tienda {
	
	
	private int idTienda;
	private String nombre;
	private String imagen;
	private String slogan;
	private TipoTienda tipoTienda;
	private Menu menu;
	/**
	 * @return the idTienda
	 */
	public int getIdTienda() {
		return idTienda;
	}
	/**
	 * @param idTienda the idTienda to set
	 */
	public void setIdTienda(int idTienda) {
		this.idTienda = idTienda;
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
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}
	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	/**
	 * @return the slogan
	 */
	public String getSlogan() {
		return slogan;
	}
	/**
	 * @param slogan the slogan to set
	 */
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	/**
	 * @return the tipoTienda
	 */
	public TipoTienda getTipoTienda() {
		return tipoTienda;
	}
	/**
	 * @param tipoTienda the tipoTienda to set
	 */
	public void setTipoTienda(TipoTienda tipoTienda) {
		this.tipoTienda = tipoTienda;
	}
	/**
	 * @return the menu
	 */
	public Menu getMenu() {
		return menu;
	}
	/**
	 * @param menu the menu to set
	 */
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
}
