package com.paypal.bfs.test.bookingserv.api;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.paypal.bfs.test.bookingserv.api.model.Booking;

public interface BookingResource {
    /**
     * Create {@link Booking} resource
     *
     * @param booking the booking object
     * @return the created booking
     */
    @RequestMapping(value="/v1/bfs/booking", method = RequestMethod.POST)
    ResponseEntity<Integer> create(@Valid @RequestBody Booking booking);

    // ----------------------------------------------------------
    // TODO - add a new operation for Get All the bookings resource.
    // ----------------------------------------------------------
    @RequestMapping(value="/v1/bfs/booking/{id}", method = RequestMethod.GET)
    ResponseEntity<Booking> bookings(@PathVariable int id);
}
