package com.linkedin.spring.learningspring;

import com.linkedin.spring.learningspring.controllers.AuthenticationController;
import com.linkedin.spring.learningspring.controllers.GuestController;
import com.linkedin.spring.learningspring.controllers.RoomController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class LearningSpringApplicationTests {

	@Autowired
	private GuestController guestController;

	@Test
	void guestControllerIsNotNull() {
		assertThat(guestController).isNotNull();
	}

	@Autowired
	private RoomController roomController;

	@Test
	void roomControllerIsNotNull() {
		assertThat(roomController).isNotNull();
	}

	@Autowired
	private AuthenticationController authenticationController;

	@Test
	void authenticationControllerIsNotNull() {
		assertThat(authenticationController).isNotNull();
	}

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void mockShouldReturnDefaultMessage() throws Exception {
		mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, World")));
	}

}
