package com.paypal.bfs.test.bookingserv.util;

import java.sql.Date;

import com.paypal.bfs.test.bookingserv.api.model.Booking;
import com.paypal.bfs.test.bookingserv.entity.Address;
import com.paypal.bfs.test.bookingserv.entity.BookingDetails;

public class Mapper {
	public static BookingDetails map(Booking booking) {
		BookingDetails bd = new BookingDetails();
		bd.setId(booking.getId());
		bd.setFirstName(booking.getFirstName());
		bd.setLastName(booking.getLastName());
		bd.setDateOfBirth((Date) booking.getDateOfBirth());
		bd.setCheckin((Date) booking.getCheckin());
		bd.setCheckout((Date) booking.getCheckout());
		bd.setTotalPrice(booking.getTotalPrice());
		bd.setDeposit(booking.getDeposit());

		Address address = new Address();
		com.paypal.bfs.test.bookingserv.api.model.Address addressInput = booking.getAddress();

		address.setLine1(addressInput.getLine1());
		address.setLine2(addressInput.getLine2());
		address.setCity(addressInput.getCity());
		address.setState(addressInput.getState());
		address.setCountry(addressInput.getCountry());
		address.setZipcode(addressInput.getZipCode());

		bd.setAddress(address);
		return bd;

	}

	public static Booking map(BookingDetails booking) {
		Booking bd = new Booking();
		bd.setId(booking.getId());
		bd.setFirstName(booking.getFirstName());
		bd.setLastName(booking.getLastName());
		bd.setDateOfBirth((Date) booking.getDateOfBirth());
		bd.setCheckin((Date) booking.getCheckin());
		bd.setCheckout((Date) booking.getCheckout());
		bd.setTotalPrice(booking.getTotalPrice());
		bd.setDeposit(booking.getDeposit());
		com.paypal.bfs.test.bookingserv.api.model.Address address = new com.paypal.bfs.test.bookingserv.api.model.Address();
		Address addressInput = booking.getAddress();

		address.setLine1(addressInput.getLine1());
		address.setLine2(addressInput.getLine2());
		address.setCity(addressInput.getCity());
		address.setState(addressInput.getState());
		address.setCountry(addressInput.getCountry());
		address.setZipCode(addressInput.getZipcode());

		bd.setAddress(address);
		return bd;

	}

}
