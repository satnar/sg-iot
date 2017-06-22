package com.ericsson.cino.assuredplus.singtel.voice;

/**
 * Generic Exception for Assured Plus north bound API exposed to partner systems integration.
 * 
 * @author esatnar
 */
public class ServiceException extends Exception {
	
	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(String message, Throwable error) {
		super(message, error);
	}
	
	
}
