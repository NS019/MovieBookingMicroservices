package com.booking.booking_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.booking.booking_service.dto.MovieDTO;

@RestController
@RequestMapping("/v2/bookings")
public class BookingWebClientController {

	@GetMapping("/movie/{id}")
	public MovieDTO getMovie(@PathVariable Long id) {
		WebClient webClient = WebClient.create("http://localhost:8081");

		MovieDTO movie = webClient.get().uri("/movies/findById/" + id).retrieve().bodyToMono(MovieDTO.class).block();

		return movie;
	}

}
