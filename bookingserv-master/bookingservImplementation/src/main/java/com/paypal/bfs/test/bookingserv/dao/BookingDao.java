package com.paypal.bfs.test.bookingserv.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.paypal.bfs.test.bookingserv.api.model.Booking;
import com.paypal.bfs.test.bookingserv.entity.BookingDetails;
import com.paypal.bfs.test.bookingserv.repository.BookingRepository;

@Component
public class BookingDao {
	@Autowired
	BookingRepository bookingRepository;

	public int save(BookingDetails bookingDetails) {
		bookingRepository.save(bookingDetails);
		return bookingDetails.getId();
	}

	public BookingDetails findBooking(int id) {
		Optional<BookingDetails> result = bookingRepository.findById(id);

		BookingDetails bookingDetails = new BookingDetails();
		if (result.isPresent()) {
			bookingDetails = result.get();
		}
		return bookingDetails;
	}
}