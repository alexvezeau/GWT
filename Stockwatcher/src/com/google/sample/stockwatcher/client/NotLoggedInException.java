package com.google.sample.stockwatcher.client;

import java.io.Serializable;

public class NotLoggedInException extends Exception implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2100276133860151474L;

	public NotLoggedInException() {
		super();
	}

	public NotLoggedInException(String message) {
		super(message);
	}

}
