package com.example.spring.reactive.playground.hello

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.test.web.reactive.server.expectBody


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
internal class GreetingRouterTest {

  // Spring Boot will create a `WebTestClient` for you,
  // already configure and ready to issue requests against "localhost:RANDOM_PORT"
  @Autowired
  lateinit var webTestClient: WebTestClient

  @Test
  fun route() {
    webTestClient // Create a GET request to test an endpoint
        .get().uri("/hello")
        .accept(MediaType.TEXT_PLAIN)
        .exchange() // and use the dedicated DSL to test assertions against the response
        .expectStatus().isOk
        .expectBody<String>().isEqualTo("Hello, Spring!")
  }
}