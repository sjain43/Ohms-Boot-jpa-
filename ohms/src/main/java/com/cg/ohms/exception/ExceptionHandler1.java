package com.cg.ohms.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ExceptionHandler1 extends ResponseEntityExceptionHandler {
	// Exception handler class for handling all the exception
	@ExceptionHandler(value = HMSException.class)
	public ResponseEntity<ErrorInfo> AllExceptions(HMSException ex, WebRequest request) {
		ErrorInfo info = new ErrorInfo(ex.getMessage(), new Date());
		return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);
	}

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorInfo> AllException(Exception ex, WebRequest request) {
		ErrorInfo info = new ErrorInfo("Page do not exist", new Date());
		return new ResponseEntity<>(info, HttpStatus.NOT_FOUND);
	}

}
