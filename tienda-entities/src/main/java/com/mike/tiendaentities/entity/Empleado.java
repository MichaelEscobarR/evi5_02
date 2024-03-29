/**
 * 
 */
package com.mike.tiendaentities.entity;

/**
 * @author Michael Escobar
 *
 */
public class Empleado extends CommonEntity {
	
	private int idEmpleado;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Rol rol;
	private Sucursal sucursal;
	private String usuario;
	private String password;
	private String email;
	private boolean superadmin;
	private boolean superadminGeneral;
	
	
	
	/**
	 * @return the idEmpleado
	 */
	public int getIdEmpleado() {
		return idEmpleado;
	}
	/**
	 * @param idEmpleado the idEmpleado to set
	 */
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
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
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}
	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}
	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	/**
	 * @return the rol
	 */
	public Rol getRol() {
		return rol;
	}
	/**
	 * @param rol the rol to set
	 */
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	/**
	 * @return the sucursal
	 */
	public Sucursal getSucursal() {
		return sucursal;
	}
	/**
	 * @param sucursal the sucursal to set
	 */
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the superadmin
	 */
	public boolean isSuperadmin() {
		return superadmin;
	}
	/**
	 * @param superadmin the superadmin to set
	 */
	public void setSuperadmin(boolean superadmin) {
		this.superadmin = superadmin;
	}
	/**
	 * @return the superadminGeneral
	 */
	public boolean isSuperadminGeneral() {
		return superadminGeneral;
	}
	/**
	 * @param superadminGeneral the superadminGeneral to set
	 */
	public void setSuperadminGeneral(boolean superadminGeneral) {
		this.superadminGeneral = superadminGeneral;
	}
	
	

}
