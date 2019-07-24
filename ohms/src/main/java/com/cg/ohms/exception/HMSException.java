package com.cg.ohms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class HMSException extends Exception {
	//custom exception class

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HMSException(String message) {
		super(message);
	}

}
