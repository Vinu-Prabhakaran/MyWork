/**
 * 
 */
package com.vinu.jaxrs.messenger.exceptions;

/**
 * @author Vinu Prabhakaran
 *         on Jul 13, 2020
 *
 */
public class DataNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DataNotFoundException(String message) {
		super(message);
	}
}
