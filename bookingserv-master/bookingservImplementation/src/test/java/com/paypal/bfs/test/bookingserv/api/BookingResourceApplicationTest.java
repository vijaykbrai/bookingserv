package com.paypal.bfs.test.bookingserv.api;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class BookingResourceApplicationTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getShouldReturnNoDataFounForMissingId() throws Exception {
		this.mockMvc.perform(get("/v1/bfs/booking/1")).andDo(print()).andExpect(status().isBadRequest())
				.andExpect(content().string(containsString("No data found for the id:1")));
	}

	@Test
	public void postShouldReturnId() throws Exception {
		String request = "{" + "\"id\":1," + "\"first_name\":\"Vijay\"," + "\"last_name\":\"Rai\","
				+ "\"total_price\":2.0," + "\"deposit\":2.0," + "\"address\":{" + "\"line1\":\"jpnagar\","
				+ "\"line2\":\"arakere\"," + "\"city\":\"bangalore\"," + "\"state\":\"karnataka\","
				+ "\"country\":\"india\"," + "\"zip_code\":\"574113\"" + "}" + "}";
		mockMvc.perform(post("/v1/bfs/booking").contentType(MediaType.APPLICATION_JSON).content(request)
				.characterEncoding("utf-8")).andExpect(status().isOk())
				.andExpect(content().string(containsString("1")));
	}

	@Test
	public void getShouldReturnData() throws Exception {
		String request = "{" + "\"id\":2," + "\"first_name\":\"Vijay\"," + "\"last_name\":\"Rai\","
				+ "\"total_price\":2.0," + "\"deposit\":2.0," + "\"address\":{" + "\"line1\":\"jpnagar\","
				+ "\"line2\":\"arakere\"," + "\"city\":\"bangalore\"," + "\"state\":\"karnataka\","
				+ "\"country\":\"india\"," + "\"zip_code\":\"574113\"" + "}" + "}";
		mockMvc.perform(post("/v1/bfs/booking").contentType(MediaType.APPLICATION_JSON).content(request)
				.characterEncoding("utf-8")).andExpect(status().isOk())
				.andExpect(content().string(containsString("2")));

		this.mockMvc.perform(get("/v1/bfs/booking/2")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString(request)));
	}
}
