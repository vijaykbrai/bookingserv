package com.paypal.bfs.test.bookingserv.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.paypal.bfs.test.bookingserv.entity.BookingDetails;

@Repository
public interface BookingRepository extends CrudRepository<BookingDetails, Integer> {
}
