package com.booking.booking_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.booking.booking_service.dto.MovieDTO;

@RestController
@RequestMapping("/v1/bookings")
public class BookingRestTemplateController {

	@GetMapping("/movie/{id}")
	public MovieDTO getMovie(@PathVariable Long id) {
		RestTemplate restTemplate = new RestTemplate();
		MovieDTO movie = restTemplate.getForObject("http://localhost:8081/movies/findById/" + id, MovieDTO.class);
		return movie;
	}

}
