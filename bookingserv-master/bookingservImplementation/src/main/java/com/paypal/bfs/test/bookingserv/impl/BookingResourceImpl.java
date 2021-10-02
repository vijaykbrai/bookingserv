package com.paypal.bfs.test.bookingserv.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.bfs.test.bookingserv.api.BookingResource;
import com.paypal.bfs.test.bookingserv.api.model.Booking;
import com.paypal.bfs.test.bookingserv.exception.BookingException;
import com.paypal.bfs.test.bookingserv.service.BookingService;

@RestController
public class BookingResourceImpl implements BookingResource {
	@Autowired
	BookingService service;

	@Override
	public ResponseEntity<Integer> create(Booking booking) {
		try {
			int id = service.book(booking);
			return new ResponseEntity<Integer>(id, HttpStatus.OK);
		} catch (Exception e) {
			throw new BookingException("Invalid request");
		}
	}

	@Override
	public ResponseEntity<Booking> bookings(int id) {
		try {
			Booking booking = service.findBookings(id);
			return new ResponseEntity<Booking>(booking, HttpStatus.OK);
		} catch (Exception e) {
			throw new BookingException("No data found for the id:" + id);
		}
	}
}
