package com.paypal.bfs.test.bookingserv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypal.bfs.test.bookingserv.api.model.Booking;
import com.paypal.bfs.test.bookingserv.dao.BookingDao;
import com.paypal.bfs.test.bookingserv.entity.BookingDetails;
import com.paypal.bfs.test.bookingserv.util.Mapper;

@Service
public class BookingService {

	@Autowired
	BookingDao dao;

	public int book(Booking booking) {
		BookingDetails bd = Mapper.map(booking);
		dao.save(bd);
		return bd.getId();
	}

	public Booking findBookings(int id) {
		BookingDetails bd = dao.findBooking(id);
		Booking booking = Mapper.map(bd);

		return booking;
	}
}
