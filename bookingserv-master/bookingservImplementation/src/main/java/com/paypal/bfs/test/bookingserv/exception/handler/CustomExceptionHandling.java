package com.paypal.bfs.test.bookingserv.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.paypal.bfs.test.bookingserv.exception.BookingException;

@RestControllerAdvice
public class CustomExceptionHandling extends ResponseEntityExceptionHandler {

	@ExceptionHandler(BookingException.class)
	public ResponseEntity<Object> handleExceptions(BookingException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse();
		response.setMessage(exception.getMessage());
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}
}