package com.linkedin.spring.learningspring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void localHostShouldReturnMessageTest() throws Exception {
        assertThat(restTemplate.getForObject("http://localhost:" + port , String.class)).contains("Welcome to my hotel!");
    }

    @Test
    public void loginPageShouldReturnTest() throws Exception {
        assertThat(restTemplate.getForObject("http://localhost:" + port + "/login", String.class)).contains("Welcome to Login Page!");
    }

    //Test Auth
    //Test adding new guest

}