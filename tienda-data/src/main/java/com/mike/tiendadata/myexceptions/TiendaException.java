/**
 * 
 */
package com.mike.tiendadata.myexceptions;

import com.mike.tiendadata.enums.CodigoEnum;

/**
 * @author Michael Escobar 
 *
 */
public class TiendaException extends Exception {
	
	private int errorCode;
	
	
	public TiendaException() {
		// TODO Auto-generated constructor stub
	}
	
	
	public TiendaException(String mensaje, CodigoEnum codigoEnum) {
		super(mensaje);
		this.errorCode = codigoEnum.getCode();
		
	}


	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}


	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	

}
