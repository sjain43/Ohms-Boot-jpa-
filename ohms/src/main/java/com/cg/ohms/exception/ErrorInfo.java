package com.cg.ohms.exception;

import java.util.Date;

public class ErrorInfo {
	//Error class for passing necessary input to response entity
	private String message;
	private Date timestamp;

	public ErrorInfo(String message, Date date) {
		this.message = message;
		this.timestamp = date;
	}

	public String getMessage() {
		return message;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}
