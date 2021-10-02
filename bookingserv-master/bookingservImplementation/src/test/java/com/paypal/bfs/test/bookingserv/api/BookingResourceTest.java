package com.paypal.bfs.test.bookingserv.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.paypal.bfs.test.bookingserv.impl.BookingResourceImpl;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class BookingResourceTest {

	public BookingResourceTest() {
	}

	@Autowired
	private BookingResourceImpl controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}
