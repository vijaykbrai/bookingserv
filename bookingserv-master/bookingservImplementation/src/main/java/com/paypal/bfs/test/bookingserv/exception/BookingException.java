package com.paypal.bfs.test.bookingserv.exception;

public class BookingException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BookingException(String message) {
		super(message);
	}

	public BookingException() {
		super();
	}

	public BookingException(String message, Throwable cause) {
		super(message, cause);
	}

	public BookingException(Throwable cause) {
		super(cause);
	}
}
