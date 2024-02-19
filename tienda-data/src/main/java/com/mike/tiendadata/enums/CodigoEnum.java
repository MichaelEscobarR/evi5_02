/**
 * 
 */
package com.mike.tiendadata.enums;

/**
 * @author Michael Escobar
 *
 */
public enum CodigoEnum {

	SINTAXYS_SQL_ERROR_CODE(100);
	
	private int code;

	
	
	CodigoEnum(int code) {
		this.code = code;
	}

	
	
	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
	
}
